
const menuToggle = document.getElementById("menu-toggle");
const navMenu = document.getElementById("nav-menu");
const dropdown = document.querySelector(".dropdown");
const dropdownLink = dropdown?.querySelector(":scope > a");

// Abrir y cerrar el menú principal
menuToggle.addEventListener("click", () => {
    const isOpen = navMenu.classList.toggle("active");

    menuToggle.classList.toggle("active", isOpen);
    menuToggle.setAttribute("aria-expanded", String(isOpen));
    menuToggle.setAttribute(
        "aria-label",
        isOpen ? "Cerrar menú" : "Abrir menú"
    );
});

// Desplegar Servicios al tocarlo en móvil y tableta
dropdownLink?.addEventListener("click", (event) => {
    if (window.matchMedia("(max-width: 1024px)").matches) {
        event.preventDefault();
        dropdown.classList.toggle("open");
    }
});

// Cerrar al seleccionar un enlace
navMenu.querySelectorAll("a").forEach((link) => {
    link.addEventListener("click", () => {
        if (
            window.matchMedia("(max-width: 1024px)").matches &&
            link !== dropdownLink
        ) {
            navMenu.classList.remove("active");
            menuToggle.classList.remove("active");
            menuToggle.setAttribute("aria-expanded", "false");
            menuToggle.setAttribute("aria-label", "Abrir menú");
            dropdown.classList.remove("open");
        }
    });
});

// Restablecer el menú al pasar a escritorio
window.matchMedia("(min-width: 1025px)").addEventListener("change", () => {
    navMenu.classList.remove("active");
    menuToggle.classList.remove("active");
    menuToggle.setAttribute("aria-expanded", "false");
    menuToggle.setAttribute("aria-label", "Abrir menú");
    dropdown.classList.remove("open");
});
