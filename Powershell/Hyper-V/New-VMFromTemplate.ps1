Function New-VMFromTemplate {
<#
.Synopsis
Provision a new Hyper-V virtual machine based on a template
.Description
This script will create a new Hyper-V virtual machine based on a template or hardware
profile. You can create a Small, Medium or Large virtual machine. You can specify the virtual
switch and paths for the virtual machine and VHDX files.
All virtual machines will be created with dynamic VHDX files and dynamic memory. The virtual
machine will mount the specified ISO file so that you can start the virtual machine and load
an operating system.
VM Types
Small (default)
	MemoryStartup=512MB
	 VHDSize=10GB
	 ProcCount=1
	 MemoryMinimum=512MBA
	 MemoryMaximum=1GB
Medium
	 MemoryStartup=512MB
	 VHDSize=20GB
	 ProcCount=2
	 MemoryMinimum=512MB
	 MemoryMaximum=2GB
Large
	 MemoryStartup=1GB
	 VHDSize=40GB
	 ProcCount=4
	 MemoryMinimum=512MB
	 MemoryMaximum=4GB

.Parameter Path
#The path for the virtual machine.
.Parameter VHDRoot
#The folder for the VHDX file.
.Parameter ISO
The path to an install ISO file.
.Parameter VMSwitch
#The name of the Hyper-V switch to connect the virtual machine to.
.Parameter Computername
#The name of the Hyper-V server. If you specify a remote server, the command will attempt
to make a remote PSSession and use that. Any paths will be relative to the remote computer.
Parameter Start
