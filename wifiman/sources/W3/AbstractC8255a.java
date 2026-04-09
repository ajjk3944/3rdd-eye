package w3;

import android.content.Context;
import com.google.android.gms.common.util.k;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8255a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f64362a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f64363b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f64362a;
        if (context2 != null && (bool = f64363b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f64363b = null;
        if (k.d()) {
            f64363b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f64363b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f64363b = Boolean.FALSE;
            }
        }
        f64362a = applicationContext;
        return f64363b.booleanValue();
    }
}
