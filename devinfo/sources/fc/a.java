package fc;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import nb.f;
import nb.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24000a = f.f29899b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f24001b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f24002c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f24003d = false;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d4, B:41:0x00e4, B:42:0x00e9, B:44:0x00eb, B:45:0x00f7), top: B:48:0x0054, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d4, B:41:0x00e4, B:42:0x00e9, B:44:0x00eb, B:45:0x00f7), top: B:48:0x0054, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r12) throws android.content.pm.PackageManager.NameNotFoundException, nb.h, nb.g {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.a.a(android.content.Context):void");
    }

    public static void b(Context context, String str) throws IllegalAccessException, IllegalArgumentException, g, InvocationTargetException {
        try {
            if (f24002c == null) {
                f24002c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f24002c.invoke(null, context);
        } catch (Exception e2) {
            Throwable cause = e2.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e2.toString() : cause.toString())));
            }
            throw new g();
        }
    }
}
