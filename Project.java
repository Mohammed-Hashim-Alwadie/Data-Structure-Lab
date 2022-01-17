import java.util.Scanner;

/**
 * Created by MBH on 30/11/21.
 */
public class Project {
    public static void main(String[] args) {


    Scanner keyboard = new Scanner(System.in);
    String usernew = "mohammed";
    String ues;
    int password = 123456;
    int Passworrd;
    double surplus = 100000;
    boolean flag = true;
        System.out.println("للدخول الا حسابك أضغط الرقم :1");
    int y = keyboard.nextInt();
        for (int i = 0; i < 3; i++) {
        System.out.println("أدخل أسم المستخدم ");
        ues = keyboard.next();
        System.out.println("أدخل كلمة المرور");
        Passworrd = keyboard.nextInt();
        if (ues.equals(usernew) && password == Passworrd) {
            flag = true;
            break;
        } else
            flag = false;
        if (i <= 2)
            System.out.println("عذرا ، كلمة المرور غير صحيحة ، لا يزال لديك" + (3 - i) + "الفرصة الثانية!");
        else {
            System.out.println("عذرا ، لقد أدخلت بشكل خطا!");
            break;
        }
        flag = false;
    }

        if (flag) {
        char answer = 'y';
        while (answer == 'y') {
            System.out.println(" أدخل نوع الخيار");
            System.out.println("للسحب أغط الرقم :1");
            System.out.println("للايداع أضغط الرقم :2");
            System.out.println("للاستعلام أضغط الرقم :3");
            y = keyboard.nextInt();
            switch (y) {
                case 1:
                    System.out.println("أختار عملة السحب :  ");
                    System.out.println(" 1-ريال سعودي           ");
                    System.out.println(" 2-دولار أمريكي       ");
                    System.out.println(" 3-جنيه مصريه        ");
                    System.out.println(" 4-يورو أسترالي      ");
                    y = keyboard.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("أدخل المبلغ المراد سحبه بالسعودي:");
                            double aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa <= surplus) {
                                    surplus = surplus / 150;
                                    aaa = aaa / 150;
                                    System.out.println("الرجاء سحب المبلغ الخارج :--> ريال سعودي" + (surplus + aaa - surplus));
                                } else
                                    System.out.println("عذرا حسابك اقل من ذلك");
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                        case 2:
                            System.out.println("أدخل المبلغ المراد سحبه بالدولار :");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa <= surplus) {
                                    surplus = surplus / 600;
                                    aaa = aaa / 600;
                                    System.out.println("الرجاء سحب المبلغ الخارج :--> ]دولار أمريكي $" + (surplus + aaa - surplus));
                                } else
                                    System.out.println("عذرا رصيد أقل من ذلك ");
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                        case 3:
                            System.out.println("أدخل المبلغ المراد سحبه بالجنيه  :");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa <= surplus) {
                                    surplus = surplus / 110;
                                    aaa = aaa / 110;
                                    System.out.println("الرجاء سحب المبلغ الخارج :--> جينيه مصري " + (surplus + aaa - surplus));
                                }
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                        case 4:
                            System.out.println("أدخل المبلغ المراد سحبه باليورو  :");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa <= surplus) {
                                    surplus = surplus / 770;
                                    aaa = aaa / 770;
                                    System.out.println("الرجاء سحب المبلغ الخارج :--> يورو " + (surplus + aaa - surplus));
                                }
                            }
                            System.out.println("");
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                    }
                case 2:
                    System.out.println("أختار عملة الايداع :  ");
                    System.out.println(" 1-ريال سعودي           ");
                    System.out.println(" 2-دولار أمريكي       ");
                    System.out.println(" 3-جنيه مصريه        ");
                    System.out.println(" 4-يورو أسترالي      ");
                    y = keyboard.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("أدخل المبلغ المراد أيداعه بالسعودي:    ");
                            double aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa > surplus || aaa <= surplus) {
                                    System.out.println("تم أيداع ريال سعودي         " + aaa);
                                    aaa = aaa * 150;
                                    surplus = surplus + aaa;
                                    System.out.println(" رصيد حسابك : ريال يمني     " + surplus);
                                } else
                                    System.out.println("عذرا الرجاء أدخل المبلغ بشكل صحيح");
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                        case 2:
                            System.out.println("أدخل المبلغ المراد أيداعه بالدولار الامريكي :");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa > surplus || aaa <= surplus) {
                                    System.out.println("تم أيداع دولار أمريكي $       " + aaa);
                                    aaa = aaa * 600;
                                    surplus = surplus + aaa;
                                    System.out.println(" رصيد حسابك :  دريال يمني        " + surplus);
                                } else
                                    System.out.println("عذرا الرجاء أدخل المبلغ بشكل صحيح  ");
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                        case 3:
                            System.out.println("أدخل المبلغ المراد أيداعه بالجنيه المصري:  ");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa > surplus || aaa <= surplus) {
                                    System.out.println("تم أيداع جنيه مصري           " + aaa);
                                    aaa = aaa * 120;
                                    surplus = surplus + aaa;
                                    System.out.println(" رصيد حسابك :  ريال يمني        " + surplus);
                                } else
                                    System.out.println("عذرا الرجاء أدخل المبلغ بشكل صحيح  ");
                            }
                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                        case 4:
                            System.out.println("أدخل المبلغ المراد أيداعه باليورو الاسترالي");
                            aaa = keyboard.nextDouble();
                            if (aaa > 0) {
                                if (aaa > surplus || aaa <= surplus) {
                                    System.out.println("تم أيداع يورو أسترالي         " + aaa);
                                    aaa = aaa * 770;
                                    surplus = surplus + aaa;
                                    System.out.println(" رصيد حسابك : ريال" + surplus);

                                } else
                                    System.out.println("عذرا الرجاء أدخل المبلغ بشكل صحيح   ");
                            }

                            System.out.println("متابعة؟ Y / n");
                            answer = keyboard.next().charAt(0);
                            break;
                    }
                case 3:
                    System.out.println("للاستعلام على رصيد المتبقي أضغط الرقم 3");
                    y = keyboard.nextInt();
                    switch (y) {
                        case 3:
                            System.out.println("رصيدك الحالي هو :" + surplus);

                    }
            }
            System.out.println("عذرا الخيار الذي أدخلته خطا !! ");
            System.out.println(" هل تريد المتابعة ؟ Y / n");
            answer = keyboard.next().charAt(0);
        } // while end
        System.out.println("شكرا لك على استخدامك!");
        System.out.println("هل تريد أنشاء حساب بنك ");

    }

}
}


