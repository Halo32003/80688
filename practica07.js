const app= document.getElementById("app")
const fieldset = (p1, p2, p3) => {
    return `
    <fieldset>
            <legend>${p1}</legend>
            <label for="">${p2}p</label>
            <input class="form-control" type="text">
            <label for="">${p3}p</label>
            <input class="form-control" type="text">
        </fieldset>
        `
}
app.innerHTML =fieldset("soy yo", nombre, correo)
app.innerHTML =fieldset("soy otro", direccion, c.p)