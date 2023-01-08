# Proyecto_FerreteriaCoinco_JavaCode
Este es el Proyecto Final de la asignatura Diseño y Programación Orientada a Objetos del segundo semestre de la carrera Ingenieria Informatica en la 
Universidad de Matanzas Camilo Cienfuegos. El objetivo de este Proyecto es dessarrollar un Software que permita la gestión de la Ferreteria Coinco. Los metodos 
que lleva un cabo para la gestión de informacion es ambiguo y obsoleto, por lo que se genera una mala organizacion en los registros. Con la aplicacion de este 
Software en el funcionamiento de la Ferreteria se evitaran la perdida de registros y agilizará la búsqueda de información relacionada con los productos, 
proveedores, usuarios, etc.
***
- ESTRUCTURA Y FUNCIONALIDADES:
***
El sistema está desarrollado por módulos, teniendo un módulo para el control de acceso que permite registrar la información correspondiente a cada 
intermediario mediante sus características, al igual que posee una sección para la gestión de los Clientes, Proveedores, Productos, Stock, etc. Además, posee 
interfaces gráficas atractivas y fáciles de operar para todos los Usuarios que utilicen la App.
***
- LENGUAJE, ARQUITECTURA Y METODOLOGÍA:
***
El lenguaje utilizado fue Java(7.51).

En la realización de este proyecto se obtuvo el Patrón de Arquitectura de Softwere (Modelo, Vista, Controlador) desarrollando la aplicación de forma modular, 
separando los datos y principalmente lo que es la lógica del negocio, su representación y su visualización.

También se utiliza la Metodología Agil ya que esta busca proporcionar en poco tiempo pequeñas piezas de software en funcionamiento para aumentar la 
satisfacción del cliente. Estas metodologías utilizan enfoques flexibles y el trabajo en equipo para ofrecer mejoras constantes basadas en el desarrollo 
iterativo e incremental, donde los requisitos y soluciones evolucionan con el tiempo según la necesidad del proyecto.
***
- INSTALACIÓN:
***
Para poder ejecutar esta aplicacion solo es nesesario la instalacion de JRE 7.51 o superior.El ejecutable se encuentra en la carpeta Ferreteria_Coinco/dist/
***
- USO Y GUÍA BÁSICA:
***
Al inicializar el programa se necesita comprobar su identidad con un Usuario y Contraseña previamente acordado en el negocio, luego de iniciar sesion entramos 
a la ventana correspondiente a tu usuario donde se podra comenzar a optar por distintas opciones dependiendo de su rol, ya sea Gerente, Administrador o 
Cliente, registrado previamente en la App por el Gerente.
***
- COLABORADORES:
***
Luis Alberto Albalat Junco

Lázaro Ariel Macías

Thalía Palomino

Darián Apechehce
***
- LUIS ALBERTO ALBALAT JUNCO:
***
Daré una explicación detallada de mi parte del negocio y del negocio en general, en la ferretería trabja un gerente, es el encargado de utilizar y gestionar la información que se encuentra en el Menú correspondiente a su persona. Además de esto, se encuentra un Administrador y Usuarios que pueden acceder a su respectivo Menú y seleccionar distintas opciones de gestión u observación de distintos productos, un stock, ademas de informes.

En el Módulo que yo desarrollé, se pueden apreciar las interfaces gráficas de gestión de Informe, Proveedores, Usuarios. Ademas de implementar la clase Proveedor, desarrollé el Trabajo con Archivos correspondiente a la clase Proveedor, con el fin de guardar y cargar los datos de esta clase en una tabla formulario. 
***
- MENÚ DE ADMINISTRADOR:
***
![Screenshot](https://github.com/luisalbalat/Proyecto_FerreteriaCoinco_JavaCode/blob/main/2.PNG)
***
- MENÚ DE CLIENTE:
***
![Screenshot](https://github.com/luisalbalat/Proyecto_FerreteriaCoinco_JavaCode/blob/main/3.PNG)
***
- INICIAR COMO INVITADO:
***
![Screenshot](https://github.com/luisalbalat/Proyecto_FerreteriaCoinco_JavaCode/blob/main/4.PNG)
***
- LAZARO ARIEL MACIAS GONZALEZ:
***
A mi me corresponde en mi parte del trabajo abarcar todo lo relacionado con la clase informe, clase Gerente y el login de la aplicacion, ademas de apoyar en el trabajo y gestion de archivos.
En el modulo que me dieron a desarrollar se observan las interfaces correspondientes al menu de Gerente asi como al login ademas de implementar y realizar el trabajo con archivos de la clase informe y de la clase usuario
***
Menu de Gerente: El gerente puede acceder a la gestion de usuarios, proveedores y acceder a la informacion de los usuarios.

Clase Informe: El administrador almacena los datos relacionados a la ferreteria.

Clase Usuario: Tiene como atributos nombre de usuario y contraseña lo cual exige el login para poder iniciar en la aplicacion.

Login:Desde este se da la posibilidad de acceder al menu deseado dependiendo de la relacion de la persona con el negocio ya sea gerente, administrador o usuario, ademas de tener informacion promocional relacionada con la ferreteria.
***
- LOGIN:
***
![Screenshot](https://github.com/luisalbalat/Proyecto_FerreteriaCoinco_JavaCode/blob/main/Captura.PNG)
***
- MENÚ DE GERENTE:
***
![Screenshot](https://github.com/luisalbalat/Proyecto_FerreteriaCoinco_JavaCode/blob/main/1.PNG)
***
- DARIAN APECHECHE LEON:
***
Dentro del módulo de esta aplicación que me corresponde implemento la clase Administrador, Producto y Stock Producto. La clase Administrador posee como atributos el nombre y carnet de identidad, con su respectivo constructor vacío y a su vez llama a los constructores de la clase Usuario de la que hereda, cada uno con sus respectivos setters y getters. La clase Producto contiene como atributos: nombre, marca, categoría y precio, además contiene su respectivo constructor vacío Producto y uno con sus constructores, así como sus setters y getters. La clase StockProducto contiene los atributos nombre, ingreso y egreso, sus constructores, setters y getters al igual que las anteriores. Como parte del contenido desarrollo también interfaces gráficas para la Gestión de Productos, el Menú del Administrador, la visión de las Ofertas y como elegir el Producto. A través de Gestión de Productos yo puedo acceder a guardar los datos de los productos que implemento en mi Ferretería. La persona que quiera acceder a estos productos debe inscribir datos como: nombre, carnet de identidad, dirección o el precio de los mismos. Dentro de la gestión de Gestor de Productos donde también registro los ingresos y los egresos de los productos que presento, así como los productos que están en existencia. En Productos los datos que puedo modificar son el nombre, la marca, categoría y el precio de estos productos.
***
