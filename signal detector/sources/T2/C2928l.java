package t2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0581Jo;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.EnumC0564Io;
import com.google.android.gms.internal.ads.H9;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: t2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2928l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23631a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f23632b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f23633c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f23634d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23635e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f23636f = "";

    /* renamed from: g, reason: collision with root package name */
    public C0581Jo f23637g;

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", p2.j.f22785C.f22790c.F(context, str2));
        s sVarA = new u(context).a(0, str, map, null);
        try {
            return (String) sVarA.f10212a.get(((Integer) C2841s.f23267e.f23270c.a(H9.M5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            u2.k.f("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e6);
            sVarA.cancel(true);
            return null;
        } catch (TimeoutException e7) {
            u2.k.f("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e7);
            sVarA.cancel(true);
            return null;
        } catch (Exception e8) {
            u2.k.f("Error retrieving a response from: ".concat(String.valueOf(str)), e8);
            return null;
        }
    }

    public final void a(Context context) {
        C0581Jo c0581Jo;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.ua)).booleanValue() || (c0581Jo = this.f23637g) == null) {
            return;
        }
        c0581Jo.f(new BinderC2926j(this, context), EnumC0564Io.f9168d);
    }

    public final boolean b(Context context, String str, String str2) {
        E9 e9 = H9.K5;
        C2841s c2841s = C2841s.f23267e;
        String strJ = j(context, k(context, (String) c2841s.f23270c.a(e9), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            u2.k.c("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) c2841s.f23270c.a(H9.ua)).booleanValue()) {
                C2909E c2909eI = p2.j.f22785C.f22795h.i();
                if (true != zEquals) {
                    str = "";
                }
                c2909eI.i(str);
            }
            return zEquals;
        } catch (JSONException e6) {
            u2.k.i("Fail to get debug mode response json.", e6);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        C2911G c2911g = p2.j.f22785C.f22790c;
        C2911G.v(context, k(context, (String) C2841s.f23267e.f23270c.a(H9.f8613I5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        u2.k.c("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) C2841s.f23267e.f23270c.a(H9.L5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        C2911G c2911g = p2.j.f22785C.f22790c;
        new x(context, str, builderBuildUpon.build().toString(), null).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f23631a
            monitor-enter(r0)
            r3.f23635e = r4     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.ua     // Catch: java.lang.Throwable -> L45
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            p2.j r1 = p2.j.f22785C     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.Hf r1 = r1.f22795h     // Catch: java.lang.Throwable -> L45
            t2.E r1 = r1.i()     // Catch: java.lang.Throwable -> L45
            r1.h(r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.Jo r1 = r3.f23637g     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r1.f9368u     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3b
            r1.k()     // Catch: java.lang.Throwable -> L45
            goto L32
        L30:
            if (r4 == 0) goto L3b
        L32:
            boolean r4 = r1.f9366s     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            goto L3b
        L37:
            r1.l()     // Catch: java.lang.Throwable -> L45
            goto L47
        L3b:
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            r1.m()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r4 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2928l.f(boolean):void");
    }

    public final boolean g() {
        boolean z6;
        synchronized (this.f23631a) {
            z6 = this.f23635e;
        }
        return z6;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f23631a) {
            z6 = this.f23634d;
        }
        return z6;
    }

    public final void i(Context context, String str, boolean z6, boolean z7) {
        if (context instanceof Activity) {
            C2911G.f23576l.post(new RunnableC2927k(this, context, str, z6, z7));
        } else {
            u2.k.g("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003b, B:14:0x0043, B:16:0x0054, B:19:0x0066, B:11:0x0034, B:20:0x006b, B:21:0x006d), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri k(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f23631a
            monitor-enter(r0)
            java.lang.String r1 = r5.f23632b     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            p2.j r1 = p2.j.f22785C     // Catch: java.lang.Throwable -> L32
            t2.G r1 = r1.f22790c     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4 = 1
            Q2.b.d(r1, r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3b
        L32:
            r6 = move-exception
            goto L82
        L34:
            java.lang.String r1 = "Error reading from internal storage."
            u2.k.c(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ""
        L3b:
            r5.f23632b = r2     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            p2.j r1 = p2.j.f22785C     // Catch: java.lang.Throwable -> L32
            t2.G r1 = r1.f22790c     // Catch: java.lang.Throwable -> L32
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r5.f23632b = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.write(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.close()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            goto L6b
        L65:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            u2.k.f(r1, r6)     // Catch: java.lang.Throwable -> L32
        L6b:
            java.lang.String r6 = r5.f23632b     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2928l.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
