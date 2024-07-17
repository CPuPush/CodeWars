package codewars.SixKyu;

public class WriteNumberInExpandedForm {
    public static void main(String[] args) {

//        System.out.println(expandedForm(10));
        System.out.println(expandedForm(1001));
    }
    public static String expandedForm(int num) {
        String nums = String.valueOf(num);
        String container = "";
        for(int i = 0; i < nums.length();i++){
//            System.out.println(nums.charAt(i));
//            System.out.println(newNums);
            if(nums.charAt(i) != '0'){
                // mengcopy string dari its index ke last index. berguna untuk menciptakan angka nol pada puluhan ratusan atau ribuan yang nantinya akan ditambahkan angka didepan
//                System.out.println(newNums);
                //mengambil angka didepannya dan menambahkan 0 sesuai dengan jumlah angka dibelakangnya yang diambil dari newNums dan menngubah menjadi nol
                String newNums = nums.substring(i, nums.length()-1);
                String divided = nums.charAt(i) + newNums.replaceAll("([0-9])", "0");
                /*
                ! Cara Kerjanya sebagai berikut
                nums => 1234
                ? String newNums = nums.substring(i, nums.length()-1);
                => 123
                ? String divided = nums.charAt(i)
                => 1
                ? newNums.replaceAll("([0-9])", "0")
                => 123 diubah menjadi 000
                => 1000
                => begitu seterusnya looping

                * */

                container += divided;
                if(divided.length()!=1){
                    container += " + ";
                }
            }
        }
        // terdapat bug jika diakhiri 0 maka untuk saat ini saya mereturn jika string ada + diakhir maka dihapus
        if (container.endsWith("+ ")){
            return container.substring(0,container.length()-3);
        }
        return container;
    }
}
