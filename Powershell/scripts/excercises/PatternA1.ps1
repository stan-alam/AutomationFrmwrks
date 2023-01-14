$totalRows = 10

for ( $row = 1; $row -le $totalRows; $row++)
{
    for( $col = 1; $col -le $row; $col++)
    {
        Write-Host -NoNewline "*"

    }

Write-Host("`r")
}