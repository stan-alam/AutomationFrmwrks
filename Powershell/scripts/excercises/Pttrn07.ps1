# n_height = 12

# for i in range(n_height, 0, -1):
#     for j in range(n_height - 1, i-1, -1):
#         print(" ", end="")
#     for k in range(i, 0, -1):
#         print(" * ", end="")
#     print()

$N_Height = 12

for($i -lt $N_Height -and $i -gt -1)
{
    for($j -lt $N_Height -1 -and $i-1 -and -1)
    {
        Write-Host(" ")
    }
    for($k -lt 0 -and $k -gt -1)
    {
        Write-Host(" * ")
    }
}