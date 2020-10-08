import string

n = int(input())

a = string.ascii_lowercase
List = []

for i in range(n):

    s = "-".join(a[i:n])

    List.append(s[::-1]+s[1:])

width = len(List[0])

for i in range(n-1, 0, -1):

    print(List[i].center(width, "-"))

for i in range(n):

    print(List[i].center(width, "-"))
if __name__ == '__main__':
