import numpy as np

def create_stochastic_matrix(adj_matrix):
    """ Convert adjacency matrix to a stochastic matrix. """
    n = adj_matrix.shape[0]
    stochastic_matrix = np.zeros((n, n))
    
    for j in range(n):
        col_sum = np.sum(adj_matrix[:, j])
        if col_sum > 0:
            stochastic_matrix[:, j] = adj_matrix[:, j] / col_sum
        else:
            stochastic_matrix[:, j] = 1.0 / n  # Handle dangling nodes
    
    return stochastic_matrix

def pagerank(adj_matrix, alpha=0.85, tol=1e-6, max_iter=100):
    """ Computes PageRank using power iteration. """
    n = adj_matrix.shape[0]
    M = create_stochastic_matrix(adj_matrix)
    G = alpha * M + (1 - alpha) * (np.ones((n, n)) / n)  # Google matrix
    
    r = np.ones(n) / n  # Initial rank vector
    
    for _ in range(max_iter):
        new_r = np.dot(G, r)  # Matrix-vector multiplication
        if np.linalg.norm(new_r - r, ord=1) < tol:  # Convergence check
            break
        r = new_r
    
    return r

# Example: Creating a random adjacency matrix for 5 pages
np.random.seed(42)
adj_matrix = np.random.randint(0, 2, (5, 5))  # Random 0/1 matrix
np.fill_diagonal(adj_matrix, 0)  # No self-links

# Compute PageRank scores
page_ranks = pagerank(adj_matrix)

# Print results
print("Adjacency Matrix:")
print(adj_matrix)
print("\nPageRank Scores:")
print(page_ranks)
