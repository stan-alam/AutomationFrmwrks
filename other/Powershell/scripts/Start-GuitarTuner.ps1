##Guitar Tuner
#Version 2.0
<#
  this was copied and pasted with some minor improvements by me. Still don't know how to expose
 MS .NET framework System.dll classes and methods.
#>

Clear-Host

Import-Module "C:\git\net\system.dll"

$GuitarString = New-Object System   # does not work

While($UserSelection -ne 'Q'){

  Write-Host 'Guitar Tuner'

  Write-Host 'e|-------------------------------------||
  Write-Host 'B|-------------------------------------||
  Write-Host 'G|-------------------------------------||
  Write-Host 'D|-------------------------------------||
  Write-Host 'A|-------------------------------------||
  Write-Host 'E|-------------------------------------||

  $UserSelection = Read-Host -Prompt 'Enter a string or type Q to exit.'



    Switch ("$UserSelection"){

    e {$GuitarString.Beep(659.26,4000)   #does not work

          Clear-Host

         }

     B {[Console]::Beep(493.88,4000)

        Clear-Host

        }

      G {[Console]::Beep(392,4000)

            Clear-Host

           }

      D {[Console]::Beep(293.66,4000)

            Clear-Host

           }

      A {[Console]::Beep(220,4000)   #A is 440hz

            Clear-Host

           }

      E {[Console]::Beep(164.81,4000)

        Clear-Host

       }

      Q {$UserSelection = Q

         Clear-Host

        }

        Default{
          Clear-Host
          Write-Host 'Invalid Selection'

        }
    }
}
