package hw.third.scenario;

public class RedactorScript {
    static StringBuilder groupLinesByRoles(String[] rolesArray, String[] scriptArray) {
        StringBuilder resultScriptBuilder = new StringBuilder();
        for (int i = 0; i < rolesArray.length; i++) {
            resultScriptBuilder.append(rolesArray[i]).append(":\n");
            for (int j = 0; j < scriptArray.length; j++) {
                if (scriptArray[j].startsWith(rolesArray[i] + ":")) {
                    String strToAppend = scriptArray[j].substring(rolesArray[i].length() + 1);
                    resultScriptBuilder.append(j+1).append(")").append(strToAppend).append('\n');
                }
            }
            resultScriptBuilder.append('\n');
        }

        return resultScriptBuilder;
    }

    public static void main(String[] args) {
        String[] rolesArray = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] scriptArray = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(groupLinesByRoles(rolesArray, scriptArray));

    }
}
