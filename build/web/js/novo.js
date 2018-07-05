
document.onload = function () {

    var botaoEnviar = document.getElementById("btnEnviar");
    botaoEnviar.onclick = function () {
        alert("enviado");
        document.location.href = "inicial.html";

    };

    var areaTxt = document.getElementById('txtProblema');
    var botaoLimpar = document.getElementById("btnLimpar");

    botaoEnviar.onclick = function () {
        areaTxt.value = "";
    };

};
