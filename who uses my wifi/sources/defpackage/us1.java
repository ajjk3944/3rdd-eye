package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class us1 {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public zw2 g;

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", hg4.C.c.D(context, str2));
        t12 t12VarA = new p32(context).a(0, str, map, null);
        try {
            return (String) t12VarA.f.get(((Integer) tw1.e.c.a(mz1.s5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            gi2.c0("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            t12VarA.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            gi2.c0("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            t12VarA.cancel(true);
            return null;
        } catch (Exception e3) {
            gi2.c0("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    public final void a(Context context) {
        zw2 zw2Var;
        if (!((Boolean) tw1.e.c.a(mz1.X9)).booleanValue() || (zw2Var = this.g) == null) {
            return;
        }
        zw2Var.e(new br1(this, context), yw2.i);
    }

    public final boolean b(Context context, String str, String str2) {
        iz1 iz1Var = mz1.q5;
        tw1 tw1Var = tw1.e;
        String strJ = j(context, k(context, (String) tw1Var.c.a(iz1Var), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            gi2.U("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) tw1Var.c.a(mz1.X9)).booleanValue()) {
                ra4 ra4VarG = hg4.C.h.g();
                if (true != zEquals) {
                    str = "";
                }
                ra4VarG.f(str);
            }
            return zEquals;
        } catch (JSONException unused) {
            gi2.q0(5);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        lf4 lf4Var = hg4.C.c;
        lf4.u(context, k(context, (String) tw1.e.c.a(mz1.o5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        gi2.U("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) tw1.e.c.a(mz1.r5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        lf4 lf4Var = hg4.C.c;
        new w72(context, str, builderBuildUpon.build().toString(), null).r1();
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
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            r3.e = r4     // Catch: java.lang.Throwable -> L45
            iz1 r1 = defpackage.mz1.X9     // Catch: java.lang.Throwable -> L45
            tw1 r2 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L45
            kz1 r2 = r2.c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            hg4 r1 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L45
            gd2 r1 = r1.h     // Catch: java.lang.Throwable -> L45
            ra4 r1 = r1.g()     // Catch: java.lang.Throwable -> L45
            r1.e(r4)     // Catch: java.lang.Throwable -> L45
            zw2 r1 = r3.g     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r1.u     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3b
            r1.j()     // Catch: java.lang.Throwable -> L45
            goto L32
        L30:
            if (r4 == 0) goto L3b
        L32:
            boolean r4 = r1.s     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            goto L3b
        L37:
            r1.k()     // Catch: java.lang.Throwable -> L45
            goto L47
        L3b:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            r1.l()     // Catch: java.lang.Throwable -> L45
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us1.f(boolean):void");
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            lf4.l.post(new is1(this, context, str, z, z2));
        } else {
            gi2.f0("Can not create dialog without Activity Context");
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
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            hg4 r1 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L32
            lf4 r1 = r1.c     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4 = 1
            defpackage.g82.e(r1, r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3b
        L32:
            r6 = move-exception
            goto L82
        L34:
            java.lang.String r1 = "Error reading from internal storage."
            defpackage.gi2.U(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ""
        L3b:
            r5.b = r2     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            hg4 r1 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L32
            lf4 r1 = r1.c     // Catch: java.lang.Throwable -> L32
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r5.b = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.write(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.close()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            goto L6b
        L65:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            defpackage.gi2.c0(r1, r6)     // Catch: java.lang.Throwable -> L32
        L6b:
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L32
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us1.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
