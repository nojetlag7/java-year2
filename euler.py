def sum_odd_square(n):
    """Return the sum of the squares of all odd numbers from 1 to n (inclusive).

    Args:
        n (int): The upper limit of the range.
    """
    n = (n + 1) // 2
    arg1 = (n * (n + 1) * (2 * n + 1) ) // 6
    arg2 = (n * (n + 1) ) // 2
    arg3 = n
    return 4*arg1 - 4*arg2 + arg3


def even_fib(limit=4000000):
    """Return the sum of even Fibonacci numbers not exceeding the limit.

    Args:
        limit (int): The upper limit for Fibonacci numbers.
    """
    a, b = 1, 2
    total = 0
    while a <= limit:
        if a % 2 == 0:
            total += a
        a, b = b, a + b
    return total


def sum_even_square(n):
    """Return the sum of the squares of all even numbers from 1 to n (inclusive).

    Args:
        n (int): The upper limit of the range.
    """
    n = n // 2
    arg1 = (n * (n + 1) * (2 * n + 1) ) // 6
    return 4 * arg1

print(sum_odd_square(472000))
print(even_fib(4000000))
print(sum_even_square(472000))