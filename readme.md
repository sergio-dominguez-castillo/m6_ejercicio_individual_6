### Backend MovieDB App

Vamos a poner en práctica conocimientos claves aprendidos hasta ahora. 
Es por eso por lo que lo principal será conseguir la llave de la API que usaremos en el proyecto.
Crea una cuenta en https://www.themoviedb.org . Accede a la sección API del menú superior y completa 
los pasos que la web te pedirá.
Una vez aceptes la licencia y llenes los campos, te darán acceso a la Clave de la API.
Con la llave en tu poder ya puedes acceder a la Documentación de la API y utilizar 
sus datos: https://developer.themoviedb.org/docs/getting-started

1. Dentro de la documentación, accede a “Api Reference” y selecciona la ruta que más te acomode de “Movie lists”, entre ellas: Now Playing – Popular – Top Rated – Upcoming.

2. Es importante que el Endpoint que selecciones te permita realizar un model con los siguientes datos:
- original_title
- poster_path
- release_date
- vote_average

3. Ten en cuenta que la respuesta del “poster_path” no es la url completa de la imagen, revisa la sección “Images” de la documentación para descubrir como completar la ruta.

4. Realiza las configuraciones necesarias para recibir los datos de la API, y también tener una base de datos SQLite que permita almacenarlos de manera local.

5. Una vez tengas lista las configuraciones, sube tu proyecto a GitHub y copia el enlace dentro de un archivo .txt para subirlo al nodo.