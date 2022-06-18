/**
 * Función ocultarMenu
 * Oculta o muestra el menú de navegación
 */
function ocultarMenu() {
    // Para mostrar el menú tendremos que cambiar el margen de este.
    // Como tenemos dos tipos de menú en función del ancho de la ventana, 
    // obtenemos este valor para establecer el margen que tendrá
    if ($(window).width() <= 768) {
        leftMenu = "-100vw";
    } else {
        leftMenu = "-15em";
    }

    // Creamos o eliminamos la clase 'open' del botón para que cambie de aspecto
    $('#botonMenu').toggleClass('open');

    // Si el margen de la barra es 0, se estará mostrando, por lo que cambiamos
    // su margen al calculado para ocultarla
    if ($("nav").css("left") == '0px') {
        $("nav").css({ "left": leftMenu });
    } else { // Si la barra está oculta
        // Cambiamos su margen a 0 para mostrarla
        $("nav").css({ "left": "0" });
    }
}