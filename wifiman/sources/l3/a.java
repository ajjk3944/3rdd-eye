package L3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r3.C7568f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final C7568f f11214a = C7568f.f();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11215b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Method f11216c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f11217d = false;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r11) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            r0 = 1
            java.lang.String r1 = "Context must not be null"
            s3.AbstractC7901p.m(r11, r1)
            r3.f r1 = L3.a.f11214a
            r2 = 11925000(0xb5f608, float:1.6710484E-38)
            r1.k(r11, r2)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r3 = L3.a.f11215b
            monitor-enter(r3)
            boolean r4 = L3.a.f11217d     // Catch: java.lang.Throwable -> L27
            r5 = 0
            if (r4 != 0) goto L48
            com.google.android.gms.dynamite.DynamiteModule$a r4 = com.google.android.gms.dynamite.DynamiteModule.f34900f     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            java.lang.String r6 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r4 = com.google.android.gms.dynamite.DynamiteModule.e(r11, r4, r6)     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            android.content.Context r4 = r4.b()     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            goto L3f
        L27:
            r11 = move-exception
            goto La7
        L2a:
            r4 = move-exception
            java.lang.String r6 = "ProviderInstaller"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "Failed to load providerinstaller module: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r7.concat(r4)     // Catch: java.lang.Throwable -> L27
            android.util.Log.w(r6, r4)     // Catch: java.lang.Throwable -> L27
            r4 = r5
        L3f:
            if (r4 == 0) goto L48
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r4, r11, r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        L48:
            boolean r4 = L3.a.f11217d     // Catch: java.lang.Throwable -> L27
            android.content.Context r6 = r3.AbstractC7570h.d(r11)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L51
            goto L8f
        L51:
            L3.a.f11217d = r0     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L8e
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            java.lang.String r7 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r8 = "reportRequestStats2"
            java.lang.ClassLoader r9 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            B3.g r10 = B3.g.a(r10, r11)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            B3.f r1 = B3.f.d(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            B3.f r2 = B3.f.d(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r4 = 3
            B3.g[] r4 = new B3.g[r4]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r5 = 0
            r4[r5] = r10     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r4[r0] = r1     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r0 = 2
            r4[r0] = r2     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            B3.i.b(r7, r8, r9, r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            goto L8e
        L7e:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Failed to report request stats: "
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L27
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L27
        L8e:
            r5 = r6
        L8f:
            if (r5 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r5, r11, r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        L98:
            java.lang.String r11 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r11, r0)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r11 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L27
            r0 = 8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r11     // Catch: java.lang.Throwable -> L27
        La7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.a.a(android.content.Context):void");
    }

    private static void b(Context context, Context context2, String str) throws IllegalAccessException, GooglePlayServicesNotAvailableException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f11216c == null) {
                f11216c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f11216c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
