/*buscar no html*/
const menu = document.querySelector('.menu');
const NavMenu = document.querySelector('.navi-menu');


menu.addEventListener('click', () =>{
    menu.classList.toggle('ativo');
    NavMenu.classList.toggle('ativo');
})