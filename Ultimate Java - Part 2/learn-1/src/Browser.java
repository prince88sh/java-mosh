public class Browser {
    public void naviagte(String address){
       String ip=findIpAdress(address);
       String html=sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAdress(String address) {
        return "12.1.2.1";
    }
}
