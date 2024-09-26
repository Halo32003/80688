const validar= false
var usuario= false
var password= false
var formulario= document.getElementById("formulario")
formulario.addEventListener("submit",e =>{
    e.preventDefault()
    console.log("Se presiono el boton enviar")
    if(usuario&&password)
        console.log("Enviando")
    formulario.submit()
})

const x = document.getElementById("x")
x.addEventListener("focusout", () =>{
    if(x.value.length == 0)
        //alert("El campo esta vacio")
    document.getElementById("mensaje1").innerHTML = "El campo esta vacio"

})

const enviar= document.getElementById("xx")

const y= document.getElementById("y")
y.addEventListener("keypress", e=>{
console.log(e.key)
if(y.value.length >=5){

    enviar.focus()
    password= true
}

function limpiar(){
    x.value = ""
    y.value = ""
}

})