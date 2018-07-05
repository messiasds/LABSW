


servlet = "principal";


function logar(){
    
var sel= document.getElementById('idTipoLogin');
var senha= document.getElementById('idSenha');
var usuario = document.getElementById('idUsuario');
var opcao= sel.options[sel.selectedIndex].text;

switch(opcao){
    
    case "Cliente":
        
        if(usuario.value === "cliente" && senha.value === "123"){
           window.location.href="princial";
           
        }
            else {
                alert("senha errada");
                
            }
            
        break;
        
    case 'Técnico':
        if(usuario.value === "tecnico" && senha.value === "123"){
            window.location.href=servlet;
            
        }
            else
                alert("senha errada");   
        break;
        
    case 'Administrador':
        if(usuario.value === "adm" && senha.value === "123"){
            alert("Administrador logado");
            window.location.href=servlet;
        }
            else
                alert("senha errada");

        
        
}

}

window.onload=function(){
    
    botao=document.getElementById('btnLogar');
    botao.onclick=function(){
        
    logar();
    return false;
    };
};

