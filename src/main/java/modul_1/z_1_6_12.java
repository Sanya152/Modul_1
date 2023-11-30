package modul_1;

public class z_1_6_12 {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"},
                new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"})
        );
    }


    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder stringBuilderOut = new StringBuilder();
        for (int v = 0; v < roles.length; v++) {
            String[] name = roles[v].split(" ");
            stringBuilderOut.append(roles[v]).append(":").append('\n');
            for (int z = 0; z < textLines.length; z++) {
                String string = textLines[z];
                if (string.startsWith(roles[v])) {
                    string = string.replaceFirst(roles[v] + ":", String.valueOf(z + 1) + ")");
                    stringBuilderOut.append(string).append('\n');
                } else if (string.startsWith(name[0])) {
                    string = string.replaceFirst(name[0] + ":", String.valueOf(z + 1) + ")");
                    stringBuilderOut.append(string).append('\n');
                }
            }
            stringBuilderOut.append('\n');
        }

        return String.valueOf(stringBuilderOut);
    }
}