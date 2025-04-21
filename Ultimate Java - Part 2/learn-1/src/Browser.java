public class Browser {
    public void naviagte(String address){
       String ip=findIpAdress(address);
       String html=sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }   //using private basically hide it from the other class so less coupling
    // so we're isolting the changes with this method
    private String findIpAdress(String address) {
        return "12.1.2.1";
    }
}
