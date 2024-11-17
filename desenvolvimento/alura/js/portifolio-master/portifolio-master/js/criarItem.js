import { conectaApi } from "./conectaApi.js";

const formulario = document.querySelector('[data-formulario]')

async function criarItem(evento){

    evento.preventDefault();
    const titulo = document.querySelector('[data-nome-titulo]').value;
    const valor = document.querySelector('[data-valor]').value;
    const imagem = document.querySelector('[data-imagem]').value;

    await conectaApi.criarItem(titulo, valor, imagem);

}

formulario.addEventListener("submit", evento => criarItem(evento))