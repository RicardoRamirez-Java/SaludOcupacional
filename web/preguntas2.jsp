<%@page import="Clases.BeanPreguntas"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String usuario = (String) session.getAttribute("usuario");
    String m = request.getParameter("msj");
    if (usuario != null) {
        Vector vp = (Vector) session.getAttribute("vectorPreguntas");//recupero ell vetor lleno con lso datos de la base de datos
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="estilosCss/estiloPreguntas.css">
        <title>Preguntas</title>
    </head>
    <body>    
        <!-- Modal -->
        <div  class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">Atención</h5>                       
                    </div>
                    <div class="modal-body">
                        <p>
                            Autorizo a COGESCORP S.A. y a mi empleador el tratamiento de mis datos personales, incluyendo los de salud que son sensibles, con la finalidad de desarrollar acciones de promoción, prevención, tratamiento para la gestión de riesgo en salud y/o frente a la propagación, contagio y control de COVID-19, acorde con lo normado por el Ministerio de Salud y las demás autoridades competentes.
                            Será posible compartir información con distintas entidades públicas, para tomar acciones frente a la propagación, contagio y control de COVID19.
                            Se entiende por tratamiento de datos, la facultad que tendrán COGESCORP S.A. y el empleador de almacenar, compartir, utilizar, procesar, recolectar, divulgar, transferir, transmitir, información relacionada con el estado de salud, en cumplimiento de las disposiciones legales.

                            Debe responder "NO" a todas las preguntas de este cuestionario para poder iniciar su rutina laboral o ingresar a la ubicación física de la oficina. Si su respuesta es “SI” a cualquiera de las preguntas, por favor NO dirigirse a la empresa.
                            Si experimenta algún síntoma o responde "SÍ" a cualquiera de estas preguntas, debe comunicarse de inmediato con su profesional de la salud para conocer los próximos pasos recomendados y notificar a su jefe inmediato y Recursos Humanos.

                        </p>
                        <p> 
                            Si esta list@ por favor presione el botón "Comenzar el Test"
                        </p>
                    </div>
                    <div class="modal-footer">
                        <a href="Login.jsp" type="button" class="btn btn-primary">Cancelar</a>
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Comenzar el Test</button>

                    </div>
                </div>
            </div>
        </div>
        <div  class="modal fade" id="staticBackdrop2" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">ENCUESTA ENVIADA!</h5>                       
                    </div>
                    <div class="modal-body">
                        <p>
                            Recuerda que COGESCORP se preocupa por tu salud y la de todos.
                        </p>                      
                    </div>
                    <div class="modal-footer">
                        <a href="Login.jsp" type="button" class="btn btn-primary">Aceptar</a>                      
                    </div>
                </div>
            </div>
        </div>

        <header class="fixed-top " style="background:#FCEBDA;"  >
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-8 mb-3">
                        <!-- 
                                mx-auto
                                rounded
                        -->
                        <img class="float-left " width="350" src="Imagenes/logo2.png" alt="">
                    </div>                 
                </div>   
            </div>           
        </header> 
        <div class="container" style="width:70%;">          
            <div class="row ">
                <div class="col">
                    <form name="test" action="Guarda_Servlet">
                        <div class="card text-white bg-primary mb-3" style="max-width: 540px;">

                            <div class="card-body">
                                <h5 class="card-title">¿Que sintomas tiene?</h5>

                            </div>
                        </div>

                        <%
                            for (int i = 0; i < vp.size(); i++) {
                                BeanPreguntas re = (BeanPreguntas) vp.elementAt(i);// se recore el vector "v" y se va llenando la clase "Reporte"
                                if (i < 9) {
                        %> 
                        <div id="<%=re.nPregunta%>" class="row contenedor " > 
                            <div class="col-12 col-md-12 ">
                                <p class="preguntas"><%=re.nPregunta%></p><p style="font-weight:700;"><%=re.pregunta%></p>
                            </div> 

                            <div  class="col-12 col-md-12 mb-3">                                 
                                <div class="form-check" >    
                                    <label class="form-check-label">
                                        <%=re.opcion1%><input type="radio" name="<%=re.nPregunta%>" value="<%=re.opcion1%>"  class="form-check-input mr-2  "  onclick="siguiente('<%=re.nPregunta + 1%>')" required>
                                    </label>
                                </div>
                                <div class="form-check ">
                                    <label class="form-check-label">
                                        <%=re.opcion2%><input type="radio" name="<%=re.nPregunta%>" value="<%=re.opcion2%>"  class="form-check-input mr-2  " onclick="siguiente('<%=re.nPregunta + 1%>')" required>
                                    </label>
                                </div>                                                             
                            </div>
                        </div>
                        <%  } else if (i == 9) {

                        %>
                        <div id="<%=re.nPregunta%>" class="row contenedor " > 
                            <div class="col-12 col-md-12 ">
                                <p class="preguntas"><%=re.nPregunta%></p><p style="font-weight:700;"><%=re.pregunta%></p>
                            </div> 

                            <div  class="col-12 col-md-12 mb-3">                                 
                                <div class="form-check" >    
                                    <label class="form-check-label">
                                        <%=re.opcion1%><input type="radio" name="<%=re.nPregunta%>" value="<%=re.opcion1%>"  class="form-check-input mr-2  " onclick="siguiente('div1')" required>
                                    </label>
                                </div>
                                <div class="form-check ">
                                    <label class="form-check-label">
                                        <%=re.opcion2%><input type="radio" name="<%=re.nPregunta%>" value="<%=re.opcion2%>"  class="form-check-input mr-2  " onclick="siguiente('div1')" required>
                                    </label>
                                </div>                                                             
                            </div>
                        </div>
                        <%  }%> 
                        <%  }%>   
                        <div id="div1" class="card text-white bg-primary mb-3" style="max-width: 540px;">

                            <div class="card-body">
                                <h5 class="card-title">¿Cuáles de los siguientes síntomas ha presentado en las últimas 24 horas? </h5>

                            </div>
                        </div>


                        <%
                            for (int j = 10; j < vp.size() - 4; j++) {
                                BeanPreguntas r = (BeanPreguntas) vp.elementAt(j);// se recore el vector "v" y se va llenando la clase "Reporte"   
                                if (j < 15) {
                        %> 
                        <div id="<%=r.nPregunta%>" class="row contenedor " > 
                            <div class="col-12 col-md-12 ">
                                <p class="preguntas"><%=r.nPregunta%></p><p style="font-weight:700;"><%=r.pregunta%></p>
                            </div> 

                            <div  class="col-12 col-md-12 mb-3">                                 
                                <div class="form-check" >    
                                    <label class="form-check-label">
                                        <%=r.opcion1%><input type="radio" name="<%=r.nPregunta%>" value="<%=r.opcion1%>"  class="form-check-input mr-2  "  onclick="siguiente('<%=r.nPregunta + 1%>')" required>
                                    </label>
                                </div>
                                <div class="form-check ">
                                    <label class="form-check-label">
                                        <%=r.opcion2%><input type="radio" name="<%=r.nPregunta%>" value="<%=r.opcion2%>"  class="form-check-input mr-2  " onclick="siguiente('<%=r.nPregunta + 1%>')" required>
                                    </label>
                                </div>                                                             
                            </div>
                        </div>                         
                        <% } else if (j == 15) {%>

                        <div id="<%=r.nPregunta%>" class="row contenedor " > 
                            <div class="col-12 col-md-12 ">
                                <p class="preguntas"><%=r.nPregunta%></p><p style="font-weight:700;"><%=r.pregunta%></p>
                            </div> 

                            <div  class="col-12 col-md-12 mb-3">                                 
                                <div class="form-check" >    
                                    <label class="form-check-label">
                                        <%=r.opcion1%><input type="radio" name="<%=r.nPregunta%>" value="<%=r.opcion1%>"  class="form-check-input mr-2  " onclick="siguiente('div2')" required>
                                    </label>
                                </div>
                                <div class="form-check ">
                                    <label class="form-check-label">
                                        <%=r.opcion2%><input type="radio" name="<%=r.nPregunta%>" value="<%=r.opcion2%>"  class="form-check-input mr-2  " onclick="siguiente('div2')" required>
                                    </label>
                                </div>                                                             
                            </div>
                        </div>
                        <%  }%> 
                        <%  }%>  
                        <div id="div2" class="card text-white bg-primary mb-3" style="max-width: 540px;">

                            <div class="card-body">
                                <h5 class="card-title">En los últimos 14 días: </h5>

                            </div>
                        </div>                      
                        <%
                            for (int k = 16; k < vp.size(); k++) {
                                BeanPreguntas s = (BeanPreguntas) vp.elementAt(k);// se recore el vector "v" y se va llenando la clase "Reporte"   

                        %> 
                        <div id="<%=s.nPregunta%>" class="row contenedor " > 
                            <div class="col-12 col-md-12 ">
                                <p class="preguntas"><%=s.nPregunta%></p><p style="font-weight:700;"><%=s.pregunta%></p>
                            </div> 

                            <div  class="col-12 col-md-12 mb-3">                                 
                                <div class="form-check" >    
                                    <label class="form-check-label">
                                        <%=s.opcion1%><input type="radio" name="<%=s.nPregunta%>" value="<%=s.opcion1%>"  class="form-check-input mr-2  "  onclick="siguiente('<%=s.nPregunta + 1%>')" required>
                                    </label>
                                </div>
                                <div class="form-check ">
                                    <label class="form-check-label">
                                        <%=s.opcion2%><input type="radio" name="<%=s.nPregunta%>" value="<%=s.opcion2%>"  class="form-check-input mr-2  " onclick="siguiente('<%=s.nPregunta + 1%>')" required>
                                    </label>
                                </div>                                                             
                            </div>
                        </div>                           
                        <%  }%> 

                        <div class=" row row-cols-3" >
                            <input type="submit" class="btn btn-success btn-lg" value="Enviar"> 
                        </div>
                    </form>
                </div>
            </div>
        </div> 
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
        <script src="countdown.js"></script>       

    </body>
</html>
<%
} else {
%>
No se puede acceder a la información si no ingresa al sistema
<%
    }
%>