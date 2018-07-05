var remetente= {
    nome:"Messias lixo",
    id: "lixo",
    getNome:function(){
        return this.nome;
    },
    
    getId:function(){
        return this.id;
    }
};
                
            
var mensagem1 = {
    assunto: "Problema no PC",
    remetente: remetente,
    mensagem: "TESTE TESTE TESTE TESTE TESTE SERA!",
    data:"23/1/1998",
    hora:"12:59",
    
    getAssunto:function(){
        return this.assunto;
    },
    
    
    
    getMensagem:function(){
        return this.mensagem;
    },
    
    getData:function(){
        return this.data;
    },
    
    getHorario: function(){
        return this.hora;
    },
    
    getRemetente: function(){
        return this.remetente;
        
    }
};


var mensagem2 = {
    assunto: "Problema no TABLET",
    remetente: remetente,
    mensagem: "TESTE TESTE TESTE TESTE TESTE SERA!",
    data:"23/1/2018",
    hora:"15:59"
};

var listaMensagens=[mensagem1,mensagem2];




function carregarMensagens(){
    
    lista= document.getElementById("idListaMensagens");
    
    
    for(x=0;x< 4;x++){
        
        itemLista= document.createElement('li');
        itemLista.id='idItem'+x;
        itemLista.innerHTML= "De: " + listaMensagens[0].getRemetente().getNome() + "<br>" +
                             "sobre: " + listaMensagens[0].getAssunto(); + "<br>" ;
        
    
        lista.appendChild(itemLista);
                            
                                     
    }
    
    
}

function abrirJanelaMensagens(id){
    
    alert("mostarChat");
    //window.open('historicoMensagens.html');
    
    
}


function eventos(){
    
     item = document.getElementsByTagName("li");
     for(var x=0; x<item.length;x++){     
     item[x].addEventListener('click',function(){abrirJanelaMensagens(this.id);},false);
     
     }
     
       
}
window.onload=function(){
    carregarMensagens();
    eventos();
};