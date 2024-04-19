$res = "`n"
$i
$j

for ($i = 1; $i -le 7; $i++)
{
    for ($j = 1; $j -le 15; $j++)
    {

        $res += ($i * $j) % 8 ? ' ' : '*'

    }

    $res += "`n"
    Write-Host($res)
}