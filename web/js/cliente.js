

// funcao de prenchimento da lista de chamados abertos pelo cliente


//chamados abertos pelo cliente


//JSON

var objJson= {
    "titulo":"Computador trava ao iniciar!me ajuda!", 
    "categoria": "Hardware", 
    "subCategoria": "desktop", 
    "descricao": "notebook ruim travando, qualquer dia explode", 
    "situacao": "aberta" 
};




chamado1 = {

    titulo: "Computador trava ao iniciar!me ajuda!",
    categoria: "Hardware",
    subCategoria: "desktop",
    descricao: "notebook ruim travando, qualquer dia explode",
    situacao: "aberta",

    getNome: function () {
        return this.titulo;

    },

    getCategoria: function () {
        return this.categoria;
    },

    getDescricao: function () {

        return this.categoria;
    },

    getSubCategoria: function () {
        return this.subCategoria;
    },

    getSituacao: function () {
        return this.situacao;
    }


};

chamado2 = {

    titulo: "Notebook esquetando muito! SOCORRO",
    categoria: "Hardware",
    subCategoria: "Notebook",
    descricao: "notebook da sansumg " +
            "notebook ruim travando, qualquer dia explode",
    situacao: "fechada",

    getNome: function () {
        return this.titulo;

    },

    getCategoria: function () {
        return this.categoria;
    },

    getDescricao: function () {

        return this.descricao;
    },

    getSubCategoria: function () {
        return this.subCategoria;
    },

    getSituacao: function () {
        return this.situacao;
    }


};


var listaChamados = [objJson, chamado2];

function mostrarDetalhe(objeto) {

    detalhe = document.getElementById('detalhes');
    categoria = document.getElementById('idCategoria');
    categoria.innerHTML = objJson["categoria"];
    subCategoria = document.getElementById('idSubCategoria');
    subCategoria.innerHTML = objJson["subCategoria"];

    descricao = document.getElementById('idConteudo');
    descricao.innerHTML = objJson["descricao"];
    detalhe.classList.remove('naoMostrar');
    detalhe.classList.add("mostrar");

}


/***
function mostrarDetalhe(objeto) {

    detalhe = document.getElementById('detalhes');
    categoria = document.getElementById('idCategoria');
    categoria.innerHTML = listaChamados[1].getCategoria();
    subCategoria = document.getElementById('idSubCategoria');
    subCategoria.innerHTML = listaChamados[1].getSubCategoria();

    descricao = document.getElementById('idConteudo');
    descricao.innerHTML = listaChamados[1].getDescricao();
    detalhe.classList.remove('naoMostrar');
    detalhe.classList.add("mostrar");

}
 ***/

function fecharDetalhe() {

    detalhe = document.getElementById('detalhes');
    detalhe.classList.remove('mostrar');
    detalhe.classList.add("naoMostrar");

}

/**

function carregarListaChamado() {

    for (x = 0; x < 3; x++) {

        //for(x=0;x<listaChamados.length;x++){

        lista = document.getElementById('listaChamados');

        item = document.createElement('li');
        item.id = lista.getAttribute("id") + "itemTeste" + x;
        item.innerHTML = "solicitao ";
        item.innerHTML = listaChamados[1].getNome() + "<br>" +
                listaChamados[1].getCategoria() + "<br>" +
                listaChamados[1].getSituacao();


        barraBotoes = document.createElement("div");
        barraBotoes.class = "barraBotoes";


        botao2 = document.createElement("button");
        botao2.id = "btnEncerrar";
        botao2.innerHTML = "Encerrar";
        botao2.class = "MUDAR";


        botao4 = document.createElement("button");
        botao4.id = "btnDetalhes";
        botao4.innerHTML = "Detalhes";
        botao4.class = "MUDAR";
        botao4.onclick = function () {
            mostrarDetalhe(detalhe);

        };


        barraBotoes.appendChild(botao2);
        barraBotoes.appendChild(botao4);
        item.appendChild(barraBotoes);


        lista.appendChild(item);


    }




}

**/

function filtar(){
    
    alert("filtar");
    
    
}


function eventos() {

    popDetalhe = document.getElementById('detalhes');
    popDetalhe.classList.add('naoMostrar');

    btnDetalhe = document.getElementById('btnDetalhes');
    btnDetalhe.addEventListener('click', function () {
        mostrarDetalhe();
    }, false);

    botaoOk = document.getElementById('btnOk');
    botaoOk.addEventListener('click', function () {
        fecharDetalhe();
    }, false);

    botaoNovo = document.getElementById("novoChamado");
    botaoNovo.addEventListener('click', function () {
        document.location.href = "cadastrarProblema.html";
    });
    
    radioA=document.getElementById("abertoRadrio");
    radioA.onchange=function(){
        alert("mostar abertos");
    };
    
    radioB=document.getElementById("fechadoRadio");
    radioB.onchange=function(){
        alert("mostar fechados");
    };

}

//com json

function carregarListaChamado() {

    for (x = 0; x < 3; x++) {

        //for(x=0;x<listaChamados.length;x++){

        lista = document.getElementById('listaChamados');

        item = document.createElement('li');
        item.id = lista.getAttribute("id") + "itemTeste" + x;
        item.innerHTML = "solicitao ";
        item.innerHTML = objJson["titulo"] + "<br>" +
                objJson["categoria"] + "<br>" +
                objJson["situacao"];


        barraBotoes = document.createElement("div");
        barraBotoes.class = "barraBotoes";


        botao2 = document.createElement("button");
        botao2.id = "btnEncerrar";
        botao2.innerHTML = "Encerrar";
        botao2.class = "MUDAR";


        botao4 = document.createElement("button");
        botao4.id = "btnDetalhes";
        botao4.innerHTML = "Detalhes";
        botao4.class = "MUDAR";
        botao4.onclick = function () {
            mostrarDetalhe(detalhe);

        };


        barraBotoes.appendChild(botao2);
        barraBotoes.appendChild(botao4);
        item.appendChild(barraBotoes);


        lista.appendChild(item);


    }




}



window.onload = function () {
    carregarListaChamado();
    eventos();
};


