/**
 * 
 */
"use strict"
function Employee(empid)
{
	this.empid = empid;
}
function initialize()
{
var objEmployee1 = new Employee(71);
Object.defineProperty(objEmployee1, "empid", {writable: false });
alert(objEmployee1.empid);
objEmployee1.empid = 17;
var valid = document.getElementById("valid");
valid.value = objEmployee1.empid;
alert(objEmployee1.empid);
}