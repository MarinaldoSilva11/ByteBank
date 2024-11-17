import { conectaApi } from './conectaApi.js';

const lista = document.querySelector('[data-lista-produto-itens]');

function constroiCard(titulo, valor, imagem){
    const itemCard = document.createElement('li');
    itemCard.className ="card-produto";
    itemCard.innerHTML = `
                            <img class="img-lista-produtos" src="${imagem}" alt="">
                            <h5>${titulo}</h5>

                            <div class="card-produto-desc">
                                <span >${valor}</span>
                                <span>excluir</span>
                             </div>`
    return itemCard;
}

async function listaCards() {
    const listaDeItensCard = await conectaApi.listaCards();
    listaDeItensCard.forEach(elemento =>lista.appendChild(
        constroiCard(elemento.titulo, elemento.valor,elemento.imagem)
    ));
} 

listaCards();