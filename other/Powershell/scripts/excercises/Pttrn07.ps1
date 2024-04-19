n_height = 12

for i in range(n_height, 0, -1):
    for j in range(n_height - 1, i-1, -1):
        print(" ", end="")
    for k in range(i, 0, -1):
        print(" * ", end="")
    print()
