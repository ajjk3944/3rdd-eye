package s3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f61196a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f61197b;

    /* renamed from: c, reason: collision with root package name */
    private static String f61198c;

    /* renamed from: d, reason: collision with root package name */
    private static int f61199d;

    public static int a(Context context) {
        b(context);
        return f61199d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f61196a) {
            try {
                if (f61197b) {
                    return;
                }
                f61197b = true;
                try {
                    bundle = w3.c.a(context).b(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f61198c = bundle.getString("com.google.app.id");
                f61199d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
