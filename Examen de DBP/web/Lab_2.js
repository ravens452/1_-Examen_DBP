function validarFormulario() {
    var cui = document.miFormulario.cui.value;
    var pass = document.miFormulario.pass.value;

    if(pass=="" ){alert("Porfavor escriba su Contrasenia");return false }
}

function comprobar() {
    var comprobarCUI = document.getElementById('CUI');

    var soloNumero = /^[1-9]+$/i;

    var respuesta = soloNumero.test(comprobarCUI.value);

    if (respuesta==false){alert('El CUI debe tener solo caracteres numericos'); return false}
}