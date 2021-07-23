public class MyRange {

    private static final char ASCII_VALUE = 48;
    public String request;
    public MyRange(String request) {
        this.request = request;
    }

    public boolean isStartWithInclude() {
        return this.request.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.request.endsWith("]");
    }

    public int getStartNumber() {
        int response = this.request.charAt(1) - ASCII_VALUE;
        if(isStartWithInclude()){
            return response;
        }
        return response + 1;
    }

    public int getEndNumber() {
        int response = this.request.charAt(3) - ASCII_VALUE;
        if(isEndWithInclude()){
            return response;
        }
        return response - 1;
    }


    public String genarateResponse() {
        String response = "";
        int start = getStartNumber();
        int end = getEndNumber();
        for (int i = start ; i <= end ; i++){
            String result = i + "";
            if(i != end){
                result += ",";
            }
            response += result;
        }
        return response;
    }
}
