def fibonacci(n, a=0, b=1, count=0):
    if count >= n:
        return
    
    print(a, end=" ")
    
    fibonacci(n, b, a+b, count+1)

def main():
    n = int(input("Enter a number: "))
    fibonacci(n)

if __name__ == "__main__":
    main()