function excluir(idLinha, idTab) {

    var tabela = document.getElementById(idTab);
    var linha = document.getElementById(idLinha);
    tabela.removeChild(linha);

}



function eventos() {



    var cadastro = document.getElementById('cadastroUsuario');
    cadastro.onclick = function () {
        alert('cadastro');

    };

    var remover = document.getElementById('removerUsuario');
    remover.onclick = function () {
        alert('remover usuario');

    };

    var mensagem = document.getElementById("mensagem");
    mensagem.onclick = alert('mensagem');


}


function botoesTabUsuario(idLinha, idTab) {
   
    var botaoCad = document.createElement('input');
    botaoCad.type = 'button';
    botaoCad.id = "cadastroUsuario";
    botaoCad.value = "cadastro";
    botaoCad.onclick = function () {
        alert('cadastro');
    };

    var botaoRem = document.createElement('input');
    botaoRem.type = "button";
    botaoRem.id = "removerUsuario";
    botaoRem.value = "remover";
    botaoRem.onclick = function () {
        excluir(idLinha, idTab);
    };

    var botaoMsg = document.createElement('input');
    botaoMsg.type = "button";
    botaoMsg.id = "mensagem";
    botaoMsg.value = "mensagem";
    botaoMsg.onclick = function () {
        alert('mensagem');
    };
    
    return botoes=[botaoCad,botaoRem,botaoMsg];
    
    }


    function botoesTabChamados(idLinha, idTab) {


        var botaoRem = document.createElement('input');
        botaoRem.type = "button";
        botaoRem.id = "removerUsuario";
        botaoRem.value = "apagar";
        botaoRem.onclick = function () {
            excluir(idLinha, idTab);
        };



        var botoes = [botaoRem];

        return botoes;

    }

    function buscarUsuarios() {


        var numBotoes=3;
        var tabelaUsuario, linha;

        tabelaUsuario = document.getElementById('tabelaUsuario');
       



        for (var l = 0; l < 2; l++) {
            linha = document.createElement('tr');
            linha.id = 'linha' + l;


            for (var num = 0; num < 4; num++) {
                var coluna = document.createElement('td');
                coluna.innerHTML = "coluna " + num;
                linha.appendChild(coluna);
            }

            for (var x = 0; x < numBotoes; x++) {
                var btn = botoesTabUsuario(linha.id, tabelaUsuario.id);
                var coluna = document.createElement('td');
                coluna.appendChild(btn[x]);
                linha.appendChild(coluna);


            }

            tabelaUsuario.appendChild(linha);

        }




    }

    function buscarChamados() {
        var numBotoes=1;
        var numColunas = 7;
        var numLinhas = 4;
        var tabela, linha;

        tabela = document.getElementById('tabelaChamado');
     
        for (var l = 0; l < numLinhas; l++) {
            linha = document.createElement('tr');
            linha.id = 'linha' + l;
            
            for (var num = 0; num < numColunas; num++) {
                var coluna = document.createElement('td');
                coluna.innerHTML = "coluna " + num;
                linha.appendChild(coluna);
            }

            for (var x = 0; x < numBotoes; x++) {
                var btn = botoesTabChamados(linha.id, tabela.id);
                var coluna = document.createElement('td');
                coluna.appendChild(btn[x]);
                linha.appendChild(coluna);

            }

            tabela.appendChild(linha);
            
        }

        }




window.onload = function () {
    b01 = document.getElementById('b01');
    b02 = document.getElementById('b02');
    t01 = document.getElementById('c01');
    t02 = document.getElementById('c02');
    t02.classList.add('invisivel');
    b01.onclick = function () {
        t01.classList.remove('invisivel');
        t01.classList.add('visivel');
        t02.classList.remove('visivel');
        t02.classList.add('invisivel');
    };
    b02.onclick = function () {
        t02.classList.remove('invisivel');
        t02.classList.add('visivel');
        t01.classList.remove('visivel');
        t01.classList.add('invisivel');
    };

    buscarUsuarios();
    buscarChamados();

};
