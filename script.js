function startServer(){

let edition=document.getElementById("edition").value;
let type=document.getElementById("type").value;
let version=document.getElementById("version").value;
let players=document.getElementById("players").value;

alert(
"Server Starting\n"+
"Edition: "+edition+
"\nType: "+type+
"\nVersion: "+version+
"\nSlots: "+players
);

}
