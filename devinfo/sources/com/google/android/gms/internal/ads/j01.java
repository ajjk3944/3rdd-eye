package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12562a;

    /* renamed from: b, reason: collision with root package name */
    public final g21 f12563b;

    /* renamed from: c, reason: collision with root package name */
    public final lz0 f12564c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12565d;

    public j01(Context context, g21 g21Var, lz0 lz0Var, sx0 sx0Var) {
        this.f12562a = context;
        this.f12563b = g21Var;
        this.f12564c = lz0Var;
        this.f12565d = sx0Var.G();
    }

    public final String a(long j) {
        String string;
        f21 f21VarA = this.f12563b.a(55);
        try {
            try {
                f21VarA.a();
                rd rdVarA = sd.A();
                String str = this.f12565d;
                rdVarA.b();
                ((sd) rdVarA.f14755b).C(str);
                rdVarA.b();
                ((sd) rdVarA.f14755b).B("0.825731049");
                Context context = this.f12562a;
                String packageName = context.getPackageName();
                rdVarA.b();
                ((sd) rdVarA.f14755b).E(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                rdVarA.b();
                ((sd) rdVarA.f14755b).D(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                rdVarA.b();
                ((sd) rdVarA.f14755b).G(jCurrentTimeMillis2);
                try {
                    long j8 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    rdVarA.b();
                    ((sd) rdVarA.f14755b).F(j8);
                } catch (PackageManager.NameNotFoundException unused) {
                    rdVarA.b();
                    ((sd) rdVarA.f14755b).F(-1L);
                }
                lz0 lz0Var = this.f12564c;
                if (!lz0Var.b()) {
                    lz0Var.a();
                }
                vd vdVarE = lz0Var.e(null, ((sd) rdVarA.e()).b());
                vdVarE.b();
                ((wd) vdVarE.f14755b).D(5);
                vdVarE.b();
                ((wd) vdVarE.f14755b).E(2);
                byte[] bArrB = ((wd) vdVarE.e()).b();
                k61 k61Var = m61.f13778e;
                if (k61Var.f13781b != null) {
                    k61Var = new k61(k61Var.f13780a, (Character) null);
                }
                string = k61Var.g(bArrB.length, bArrB);
            } catch (UnsupportedEncodingException e2) {
                f21VarA.b(e2);
                string = Integer.toString(7);
            } catch (Throwable th2) {
                f21VarA.b(th2);
                throw th2;
            }
            f21VarA.c();
            return string;
        } catch (Throwable th3) {
            f21VarA.c();
            throw th3;
        }
    }
}
