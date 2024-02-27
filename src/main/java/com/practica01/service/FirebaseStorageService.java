package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(
            MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica1-k-88307.appspot.com";

    //Esta es la ruta básica de este proyecto  
    final String rutaSuperiorStorage = "practica1";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "practica1-k-88307-firebase-adminsdk-e8hk2-b112f66e34.json";
}