// menu em todas as paginas
window.onload= function(){
    

var menu= document.getElementById("idMenu");
linkCad= document.createElement("a");
linkCad.src="#";
linkCad.innerHTML= "C@dastro";
linkCham = document.createElement("a");
linkCham.src="#";
linkCham.innerHTML="Solicitacoes";
linkMsg = document.createElement("a");
linkMsg.src="#";
linkMsg.innerHTML="Mensagens";
linkSair = document.createElement("a");
linkSair.src="#";
linkSair.innerHTML="sair";

divPai= document.getElementById("idMenu");
divPai.appendChild(linkCad);
divPai.appendChild(linkCham);
divPai.appendChild(linkMsg);
divPai.appendChild(linkSair);

};