package p0;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d {
    public static void a(Context context) throws SecurityException {
        try {
            Method[] methods = Class.forName(((TelephonyManager) context.getSystemService("phone")).getClass().getName()).getMethods();
            for (int i2 = 0; i2 < methods.length; i2++) {
                System.out.println("\n" + methods[i2] + " declared by " + methods[i2].getDeclaringClass());
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }
}
