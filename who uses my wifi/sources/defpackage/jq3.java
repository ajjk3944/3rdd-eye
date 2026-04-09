package defpackage;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jq3 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public final Object h;

    public /* synthetic */ jq3(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    private final void a() {
        Application application;
        yv1 yv1Var = (yv1) this.h;
        View view = (View) this.g;
        yv1Var.getClass();
        try {
            uv1 uv1Var = new uv1(yv1Var.k, yv1Var.l, yv1Var.m, yv1Var.n, yv1Var.o, yv1Var.p, yv1Var.q, yv1Var.t);
            wy0 wy0Var = hg4.C.g;
            synchronized (wy0Var.g) {
                try {
                    vv1 vv1Var = (vv1) wy0Var.h;
                    application = vv1Var != null ? vv1Var.g : null;
                } finally {
                }
            }
            if (application != null) {
                String str = yv1Var.r;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(application.getResources().getIdentifier((String) tw1.e.c.a(mz1.h0), "id", application.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            tg0 tg0VarA = yv1Var.a(view, uv1Var);
            uv1Var.b();
            if (tg0VarA.a == 0 && tg0VarA.b == 0) {
                return;
            }
            int i = tg0VarA.b;
            if (i != 0) {
                if (i == 0) {
                }
                yv1Var.i.v(uv1Var);
            } else if (uv1Var.k == 0) {
                return;
            }
            so1 so1Var = yv1Var.i;
            synchronized (so1Var.g) {
                try {
                    if (((LinkedList) so1Var.h).contains(uv1Var)) {
                        return;
                    }
                    yv1Var.i.v(uv1Var);
                } finally {
                }
            }
        } catch (Exception e) {
            gi2.c0("Exception in fetchContentOnUIThread", e);
            hg4.C.h.d("ContentFetchTask.fetchContent", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() throws org.json.JSONException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.g
            q32 r0 = (defpackage.q32) r0
            java.lang.Object r1 = r8.h
            l22 r1 = (defpackage.l22) r1
            lu1 r2 = r0.f
            java.lang.String r0 = r0.h
            r2.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto La5
            boolean r3 = r2.a()
            if (r3 == 0) goto L1d
            goto La5
        L1d:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4d
            r4.<init>()     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "params"
            java.lang.String r6 = r1.a     // Catch: org.json.JSONException -> L4d
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "signal_dictionary"
            sv1 r6 = defpackage.sv1.f     // Catch: org.json.JSONException -> L4d
            j63 r6 = r6.a     // Catch: org.json.JSONException -> L4d
            android.os.Bundle r7 = r1.f     // Catch: org.json.JSONException -> L4d
            org.json.JSONObject r6 = r6.j(r7)     // Catch: org.json.JSONException -> L4d
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "sr"
            r3.put(r5, r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = r1.c     // Catch: org.json.JSONException -> L4d
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L4d
            if (r4 == 0) goto L4f
            java.lang.String r1 = ""
            goto L89
        L4d:
            r1 = move-exception
            goto L7c
        L4f:
            if (r1 != 0) goto L54
            java.lang.String r1 = ""
            goto L5a
        L54:
            java.lang.String r4 = "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2"
            java.lang.String r1 = defpackage.lf4.H(r1, r4)     // Catch: org.json.JSONException -> L4d
        L5a:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L4d
            byte[] r1 = r1.getBytes(r4)     // Catch: org.json.JSONException -> L4d
            r4 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r4 = "rs"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = "ts_ms"
            hg4 r4 = defpackage.hg4.C     // Catch: org.json.JSONException -> L4d
            ym r4 = r4.k     // Catch: org.json.JSONException -> L4d
            r4.getClass()     // Catch: org.json.JSONException -> L4d
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L4d
            r3.put(r1, r4)     // Catch: org.json.JSONException -> L4d
            goto L85
        L7c:
            java.lang.String r4 = "DiskCachingManager.createStringToWrite"
            hg4 r5 = defpackage.hg4.C
            gd2 r5 = r5.h
            r5.d(r4, r1)
        L85:
            java.lang.String r1 = r3.toString()
        L89:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto La5
            nn2 r2 = r2.b
            r2.e()
            java.lang.Object r3 = r2.d
            monitor-enter(r3)
            android.content.SharedPreferences$Editor r2 = r2.b     // Catch: java.lang.Throwable -> La2
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> La2
            r0.commit()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            goto La5
        La2:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            throw r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq3.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [he0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.InterruptedException, defpackage.ze4, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 2418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq3.run():void");
    }

    public String toString() {
        switch (this.f) {
            case 0:
                pb3 pb3Var = new pb3(jq3.class.getSimpleName());
                iq3 iq3Var = (iq3) this.h;
                wt2 wt2Var = new wt2(5);
                ((wt2) pb3Var.i).h = wt2Var;
                pb3Var.i = wt2Var;
                wt2Var.g = iq3Var;
                return pb3Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jq3(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public jq3(tn tnVar, ArrayList arrayList, lx0 lx0Var) {
        this.f = 9;
        this.g = arrayList;
        this.h = lx0Var;
    }

    public jq3(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f = 16;
        this.h = swipeDismissBehavior;
        this.g = view;
    }
}
