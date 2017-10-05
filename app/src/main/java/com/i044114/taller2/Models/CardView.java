package com.i044114.taller2.Models;

/**
 * Created by aula7 on 3/10/17.
 */

public class CardView {


    private String titulo;
    private  String url;
    private  String urltext;
    private String[] arreglo;

    public String ArregloImages(){
        arreglo= new String[10];
        arreglo[0]= "https://i.pinimg.com/originals/86/05/73/8605736bfdf8b5968ae9e30ffadd6299.jpg";
        arreglo[1]= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6llIrwSaO7ZShQRqD9UjC-VeP-vdCEIKYP5ulc57bBE1dTMPy";
        arreglo[2]= "http://flashwallpapers.com/wp-content/uploads/2015/10/Lovely-Garden-1440x900.jpg";
        arreglo[3]=   "http://paisajesylugaresmashermososdelmundo.com/wp-content/uploads/2015/12/imagenes-de-bellos-paisajes-1.jpg";
        arreglo[4]= "http://imagenesdepaisajes.net/wp-content/uploads/2016/07/fondos-de-paisajes-naturales-floridos.jpg";
        arreglo[5]= "https://i.pinimg.com/736x/1d/44/5c/1d445c7407aeb501daaa7febe7c8cea5--sunset-art-fantasy-landscape.jpg";
        arreglo[6]= "http://1.bp.blogspot.com/-SdMhMi16P-w/Ukt8Hv-McKI/AAAAAAAAG-Q/4pPMZjXpAMQ/s1600/paisajes-hermosos-cascada.jpg";
        arreglo[7]= "https://i.pinimg.com/736x/a3/2a/78/a32a7848823def9a01fc0060641ed324--stone-cottages-country-cottages.jpg";
        arreglo[8]= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvRaXZ2Iq4hKBD5d4mfEW47tINNsrEcBCDEmmPDq04ePbTGYM3";
        arreglo[9]= "https://k03.kn3.net/1A5AFE466.jpg";

        int  ran = (int) (Math.random()*9);
        return arreglo[ran];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrltext() {
        return urltext;
    }

    public void setUrltext(String urltext) {
        this.urltext = urltext;
    }
}
