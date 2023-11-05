## System Security
Dado que se está haciendo una auditoria por la seguridad de la infraestructura. Es adecuado revisar el OWASP Top 10 punto por punto como una guía para identificar cuáles podrían ser los problemas de seguridad de la infraestructura tecnológica de la empresa. 
Haciendo una revisión de nuestra infraestructura como son los contenedores de kubernetes en AWS se tiene una aplicación móvil Android y iOS, el frontend web escrito en Javascript y Next.js, una base de datos MySQL que guarda información sensible de los clientes como contraseñas, direcciones y números de teléfono, y el backend escrito en Python con el microframework FastAPI que se utiliza con el web frontend y la base de datos. 
Además, se tienen 12 Ingenieros de software con acceso entero al sistema, 3 empleados de atención al cliente que pueden ver la información del cliente y realizar cambios en pedidos y cuentas.
Estas son algunas de las recomendaciones a tener en cuanta con respecto a OWASP TOP 10 de nuestro caso:


•	OWASP A10-Broken Access Control: Asegurarse de que los controles de acceso estén correctamente implementados y funcionales. Esto quiere decir que los usuarios solo deben acceder a las funciones a las que están autorizados a usar. Especialmente en los casos en los que hay usuarios como los Ingenieros de software que tienen acceso completo y los empleados de atención al cliente que pueden hacer cambios en cuentas.


•	OWASP A02-Cryptographic failures: Qué todos los datos confidenciales estén cifrados. Especialmente las contraseñas de los clientes y direcciones en la base de datos.


•	OWASP A03- Injection: Se debe asegurar que todas las entradas del usuario estén validadas para evitar una inyección SQL esto más aun teniendo en cuenta que tenemos un frontent web conectado a una base de datos MySQL.


•	OWASP A04-Insecure Design: Se debe asegurar que todo el sistema este diseñado con centro en la seguridad desde el inicio. Con protocolos web y puertos adecuados, autenticación, autorización etc.


•	OWASP A05-Security Misconfiguration: Qué todos los componentes del sistema estén configurados de forma segura. Esto incluye sus contenedores de Kubernetes, base de datos MySQL y el backend de Python.


•	OWASP A06- Vulnerable and Outdated Components: Qué todos los componentes dle sistema estén actualizados y libres de vulnerabilidades conocidas. Los paquetes del backend en FastAPI, los contenedores en Kubernetes etc.
