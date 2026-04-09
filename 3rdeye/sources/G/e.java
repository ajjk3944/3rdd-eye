package G;

import android.content.Context;
import android.os.Build;
import java.util.Objects;

/* compiled from: ContextUtil.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: ContextUtil.java */
    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* compiled from: ContextUtil.java */
    public static class b {
        public static Context a(Context context, int i) {
            return context.createDeviceContext(i);
        }

        public static int b(Context context) {
            return context.getDeviceId();
        }
    }

    public static Context a(Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iB = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(applicationContext, iB);
        }
        if (i >= 30) {
            String strB = a.b(context);
            if (!Objects.equals(strB, a.b(applicationContext))) {
                return a.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }
}
