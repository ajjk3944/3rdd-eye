package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vl2 implements jo2, dq2 {
    public g4 f;
    public final Context h;
    public final ea3 i;
    public final e51 j;
    public final Executor k;
    public boolean l = false;
    public boolean m = false;
    public final AtomicBoolean g = new AtomicBoolean();

    public vl2(Context context, ea3 ea3Var, e51 e51Var, ld2 ld2Var) {
        this.h = context;
        this.i = ea3Var;
        this.j = e51Var;
        this.k = ld2Var;
    }

    @Override // defpackage.dq2
    public final void G(String str) {
        b();
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
        b();
    }

    @Override // defpackage.dq2
    public final void a(l22 l22Var) {
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.g
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto L9d
        Lb:
            so1 r0 = defpackage.s02.l
            java.lang.Object r0 = r0.w()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L66
        L1c:
            so1 r0 = defpackage.s02.m
            java.lang.Object r0 = r0.w()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L66
        L2c:
            so1 r0 = defpackage.s02.k
            java.lang.Object r0 = r0.w()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L66
        L3c:
            hg4 r0 = defpackage.hg4.C
            gd2 r0 = r0.h
            ra4 r0 = r0.g()
            ed2 r0 = r0.m()
            java.lang.String r0 = r0.e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L5e
            goto L1a
        L5e:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L66:
            int r3 = r3 + (-1)
            ea3 r0 = r5.i
            android.content.Context r4 = r5.h
            if (r3 == r1) goto L7e
            if (r3 == r2) goto L71
            goto L9d
        L71:
            hg4 r2 = defpackage.hg4.C
            p21 r2 = r2.r
            e51 r3 = defpackage.e51.a()
            i62 r0 = r2.z(r4, r3, r0)
            goto L8a
        L7e:
            hg4 r2 = defpackage.hg4.C
            p21 r2 = r2.r
            e51 r3 = defpackage.e51.a()
            i62 r0 = r2.C(r4, r3, r0)
        L8a:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            us0 r3 = defpackage.h62.b
            k62 r0 = r0.a(r2, r3, r3)
            g4 r2 = new g4
            e51 r3 = r5.j
            r2.<init>(r4, r0, r3)
            r5.f = r2
            r5.l = r1
        L9d:
            boolean r0 = r5.l
            if (r0 != 0) goto La2
            goto Lcd
        La2:
            g4 r0 = r5.f
            if (r0 == 0) goto Lcd
            n70 r0 = r0.f()
            boolean r1 = r5.m
            if (r1 != 0) goto Lc8
            so1 r1 = defpackage.m02.i
            java.lang.Object r1 = r1.w()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc8
            fu1 r1 = new fu1
            r2 = 25
            r1.<init>(r2, r5)
            java.util.concurrent.Executor r2 = r5.k
            r0.c(r1, r2)
        Lc8:
            java.lang.String r1 = "persistFlagsClient"
            defpackage.um.F(r0, r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl2.b():void");
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
    }
}
