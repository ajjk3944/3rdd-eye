package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t01 {

    /* renamed from: a, reason: collision with root package name */
    public final s11 f16626a;

    /* renamed from: b, reason: collision with root package name */
    public final f11 f16627b;

    /* renamed from: c, reason: collision with root package name */
    public final i11 f16628c;

    /* renamed from: d, reason: collision with root package name */
    public final g21 f16629d;

    /* renamed from: e, reason: collision with root package name */
    public final dy0 f16630e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16631f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16632h;

    public t01(s11 s11Var, f11 f11Var, i11 i11Var, g21 g21Var, dy0 dy0Var, boolean z3, long j, long j8) {
        this.f16626a = s11Var;
        this.f16627b = f11Var;
        this.f16628c = i11Var;
        this.f16629d = g21Var;
        this.f16630e = dy0Var;
        this.f16631f = z3;
        this.g = j;
        this.f16632h = j8;
    }

    public final n81 a() {
        n81 n81VarS = n81.s(this.f16628c.a());
        o5 o5Var = o5.f14561x;
        k81 k81Var = k81.f13081a;
        d71 d71VarC = yo0.C(n81VarS, Throwable.class, o5Var, k81Var);
        s11 s11Var = this.f16626a;
        Objects.requireNonNull(s11Var);
        return yo0.F(yo0.G(d71VarC, new hu(10, s11Var), k81Var), new q01(this, 0), k81Var);
    }

    public final n81 b(final int i4) {
        d71 d71VarC;
        int i10;
        final f11 f11Var = this.f16627b;
        int i11 = f11Var.f10957a;
        final int i12 = 0;
        final int i13 = 1;
        k81 k81Var = k81.f13081a;
        switch (i11) {
            case 0:
                cs1 cs1Var = (cs1) f11Var.f10961e;
                Objects.requireNonNull(cs1Var);
                go0 go0Var = new go0(6, cs1Var);
                ExecutorService executorService = f11Var.f10959c;
                d71 d71VarC2 = yo0.C(yo0.G(yo0.F(yo0.G(n81.s(yo0.z(executorService, go0Var)), new z21() { // from class: com.google.android.gms.internal.ads.e11
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i13) {
                            case 0:
                                zy0 zy0Var = (zy0) obj;
                                f11 f11Var2 = f11Var;
                                cs1 cs1Var2 = (cs1) f11Var2.f10961e;
                                String strA = zy0Var.A().A();
                                String strB = zy0Var.A().B();
                                g21 g21Var = f11Var2.f10960d;
                                f21 f21VarA = g21Var.a(15203);
                                try {
                                    f21VarA.a();
                                    zv0 zv0VarC = yo0.c(f11Var2.f10958b, (fg) cs1Var2.a(), strA, strB, (gv0) f11Var2.f10963h);
                                    int i14 = zv0VarC.f19191c;
                                    f21VarA.c();
                                    int i15 = 2;
                                    if (i14 == 2) {
                                        g21Var.b(15208);
                                        return f11.b(4);
                                    }
                                    byte[] bArr = zv0VarC.f19190b;
                                    if (bArr == null || bArr.length == 0) {
                                        g21Var.b(5010);
                                        return f11.b(8);
                                    }
                                    try {
                                        gg ggVarE = gg.E(bArr, jn1.a());
                                        if (ggVarE.A().A().isEmpty() || ggVarE.A().B().isEmpty() || ggVarE.C().y().length == 0) {
                                            g21Var.b(15207);
                                        } else {
                                            if (zy0Var.equals(zy0.F()) || !TextUtils.equals(zy0Var.A().A(), ggVarE.A().A()) || !TextUtils.equals(zy0Var.A().B(), ggVarE.A().B())) {
                                                if (i14 == 4) {
                                                    x01 x01Var = (x01) f11Var2.g;
                                                    byte[] bArrY = ggVarE.B().y();
                                                    File file = x01Var.f18255a;
                                                    try {
                                                        mq0.x(file);
                                                        mq0.l(file, bArrY);
                                                        x01Var.f18256b.getClass();
                                                        zA = fv0.a(file);
                                                    } catch (IOException | GeneralSecurityException e2) {
                                                        x01Var.f18257c.d(2027, e2);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        g21Var.b(15206);
                                                        return f11.b(12);
                                                    }
                                                    i14 = 4;
                                                }
                                                wy0 wy0VarD = xy0.D();
                                                if (i14 == 2) {
                                                    i15 = 4;
                                                } else if (i14 != 3) {
                                                    i15 = i14 != 4 ? i14 != 6 ? 1 : 5 : 3;
                                                }
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).I(i15);
                                                yy0 yy0VarE = zy0.E();
                                                kg kgVarA = ggVarE.A();
                                                yy0VarE.b();
                                                ((zy0) yy0VarE.f14755b).G(kgVarA);
                                                fg fgVar = (fg) cs1Var2.a();
                                                yy0VarE.b();
                                                ((zy0) yy0VarE.f14755b).I(fgVar);
                                                zy0 zy0Var2 = (zy0) yy0VarE.e();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).E(zy0Var2);
                                                bn1 bn1VarB = ggVarE.B();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).G(bn1VarB);
                                                bn1 bn1VarC = ggVarE.C();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).F(bn1VarC);
                                                return (xy0) wy0VarD.e();
                                            }
                                            g21Var.b(15209);
                                        }
                                        return f11.b(11);
                                    } catch (ao1 e10) {
                                        g21Var.d(15205, e10);
                                        return f11.b(9);
                                    } catch (NullPointerException unused2) {
                                        g21Var.b(15210);
                                        return f11.b(10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        f21VarA.b(th2);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        f21VarA.c();
                                        throw th3;
                                    }
                                }
                            default:
                                fg fgVar2 = (fg) obj;
                                f11 f11Var3 = f11Var;
                                f11Var3.getClass();
                                if (yr1.j(fgVar2)) {
                                    return new Integer(0);
                                }
                                f11Var3.f10960d.c(15204, fgVar2.name());
                                throw new d11();
                        }
                    }
                }, k81Var), new fp(18, f11Var), k81Var), new z21() { // from class: com.google.android.gms.internal.ads.e11
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i12) {
                            case 0:
                                zy0 zy0Var = (zy0) obj;
                                f11 f11Var2 = f11Var;
                                cs1 cs1Var2 = (cs1) f11Var2.f10961e;
                                String strA = zy0Var.A().A();
                                String strB = zy0Var.A().B();
                                g21 g21Var = f11Var2.f10960d;
                                f21 f21VarA = g21Var.a(15203);
                                try {
                                    f21VarA.a();
                                    zv0 zv0VarC = yo0.c(f11Var2.f10958b, (fg) cs1Var2.a(), strA, strB, (gv0) f11Var2.f10963h);
                                    int i14 = zv0VarC.f19191c;
                                    f21VarA.c();
                                    int i15 = 2;
                                    if (i14 == 2) {
                                        g21Var.b(15208);
                                        return f11.b(4);
                                    }
                                    byte[] bArr = zv0VarC.f19190b;
                                    if (bArr == null || bArr.length == 0) {
                                        g21Var.b(5010);
                                        return f11.b(8);
                                    }
                                    try {
                                        gg ggVarE = gg.E(bArr, jn1.a());
                                        if (ggVarE.A().A().isEmpty() || ggVarE.A().B().isEmpty() || ggVarE.C().y().length == 0) {
                                            g21Var.b(15207);
                                        } else {
                                            if (zy0Var.equals(zy0.F()) || !TextUtils.equals(zy0Var.A().A(), ggVarE.A().A()) || !TextUtils.equals(zy0Var.A().B(), ggVarE.A().B())) {
                                                if (i14 == 4) {
                                                    x01 x01Var = (x01) f11Var2.g;
                                                    byte[] bArrY = ggVarE.B().y();
                                                    File file = x01Var.f18255a;
                                                    try {
                                                        mq0.x(file);
                                                        mq0.l(file, bArrY);
                                                        x01Var.f18256b.getClass();
                                                        zA = fv0.a(file);
                                                    } catch (IOException | GeneralSecurityException e2) {
                                                        x01Var.f18257c.d(2027, e2);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        g21Var.b(15206);
                                                        return f11.b(12);
                                                    }
                                                    i14 = 4;
                                                }
                                                wy0 wy0VarD = xy0.D();
                                                if (i14 == 2) {
                                                    i15 = 4;
                                                } else if (i14 != 3) {
                                                    i15 = i14 != 4 ? i14 != 6 ? 1 : 5 : 3;
                                                }
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).I(i15);
                                                yy0 yy0VarE = zy0.E();
                                                kg kgVarA = ggVarE.A();
                                                yy0VarE.b();
                                                ((zy0) yy0VarE.f14755b).G(kgVarA);
                                                fg fgVar = (fg) cs1Var2.a();
                                                yy0VarE.b();
                                                ((zy0) yy0VarE.f14755b).I(fgVar);
                                                zy0 zy0Var2 = (zy0) yy0VarE.e();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).E(zy0Var2);
                                                bn1 bn1VarB = ggVarE.B();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).G(bn1VarB);
                                                bn1 bn1VarC = ggVarE.C();
                                                wy0VarD.b();
                                                ((xy0) wy0VarD.f14755b).F(bn1VarC);
                                                return (xy0) wy0VarD.e();
                                            }
                                            g21Var.b(15209);
                                        }
                                        return f11.b(11);
                                    } catch (ao1 e10) {
                                        g21Var.d(15205, e10);
                                        return f11.b(9);
                                    } catch (NullPointerException unused2) {
                                        g21Var.b(15210);
                                        return f11.b(10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        f21VarA.b(th2);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        f21VarA.c();
                                        throw th3;
                                    }
                                }
                            default:
                                fg fgVar2 = (fg) obj;
                                f11 f11Var3 = f11Var;
                                f11Var3.getClass();
                                if (yr1.j(fgVar2)) {
                                    return new Integer(0);
                                }
                                f11Var3.f10960d.c(15204, fgVar2.name());
                                throw new d11();
                        }
                    }
                }, executorService), d11.class, b11.f9545c, k81Var);
                f11Var.f10960d.e(15202, d71VarC2);
                d71VarC = d71VarC2;
                break;
            default:
                cg cgVarA = dg.A();
                byte[] bArrJ = a80.j();
                zm1 zm1Var = bn1.f9729b;
                boolean z3 = false;
                zm1 zm1VarV = bn1.v(0, bArrJ.length, bArrJ);
                cgVarA.b();
                ((dg) cgVarA.f14755b).B(zm1VarV);
                long j = Build.VERSION.SDK_INT;
                cgVarA.b();
                ((dg) cgVarA.f14755b).C(j);
                String str = Build.MODEL;
                cgVarA.b();
                ((dg) cgVarA.f14755b).D(str);
                Context context = f11Var.f10958b;
                String packageName = context.getPackageName();
                cgVarA.b();
                ((dg) cgVarA.f14755b).E(packageName);
                try {
                    i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i10 = -1;
                }
                cy0 cy0Var = (cy0) f11Var.f10961e;
                g21 g21Var = f11Var.f10960d;
                cgVarA.b();
                ((dg) cgVarA.f14755b).F(i10);
                String str2 = (String) f11Var.f10962f;
                cgVarA.b();
                ((dg) cgVarA.f14755b).G(str2);
                byte[] bArrB = ((dg) cgVarA.e()).b();
                k61 k61Var = m61.f13778e;
                if (k61Var.f13781b != null) {
                    k61Var = new k61(k61Var.f13780a, (Character) null);
                }
                String strG = k61Var.g(bArrB.length, bArrB);
                cy0Var.getClass();
                final int i14 = 2;
                d71VarC = yo0.C(yo0.C(yo0.G(n81.s(jm.a.n(new aw0(cy0Var, Uri.parse((String) f11Var.g).buildUpon().appendQueryParameter("aspq", strG).build().toString(), z3, (String) null, new byte[0]))), new z21() { // from class: com.google.android.gms.internal.ads.g11
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj) {
                        xy0 xy0VarA;
                        switch (i14) {
                            case 0:
                                f11Var.f10960d.b(20007);
                                return f11.a(13);
                            case 1:
                                f11Var.f10960d.b(20008);
                                return f11.a(13);
                            default:
                                by0 by0Var = (by0) obj;
                                f11 f11Var2 = f11Var;
                                g21 g21Var2 = f11Var2.f10960d;
                                if (by0Var.f9848a != 200) {
                                    g21Var2.c(20003, new String(a80.j(), StandardCharsets.UTF_8));
                                    return f11.a(7);
                                }
                                try {
                                    String str3 = new String(by0Var.f9849b);
                                    if (TextUtils.isEmpty(str3)) {
                                        g21Var2.b(20004);
                                        xy0VarA = f11.a(8);
                                    } else {
                                        eg egVarB = eg.B(yo0.v(str3, true), jn1.a());
                                        if (!egVarB.A().C() || !egVarB.A().A()) {
                                            g21Var2.b(20004);
                                            xy0VarA = f11.a(8);
                                        } else if (((h11) f11Var2.f10963h).a(egVarB)) {
                                            wy0 wy0VarD = xy0.D();
                                            yy0 yy0VarE = zy0.E();
                                            ig igVarB = egVarB.A().B();
                                            yy0VarE.b();
                                            ((zy0) yy0VarE.f14755b).H(igVarB);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).E((zy0) yy0VarE.e());
                                            bn1 bn1VarD = egVarB.A().D();
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).F(bn1VarD);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).I(2);
                                            xy0VarA = (xy0) wy0VarD.e();
                                        } else {
                                            g21Var2.b(20006);
                                            xy0VarA = f11.a(12);
                                        }
                                    }
                                    return xy0VarA;
                                } catch (Throwable th2) {
                                    g21Var2.d(20005, th2);
                                    return f11.a(6);
                                }
                        }
                    }
                }, f11Var.f10959c), UnknownHostException.class, new z21() { // from class: com.google.android.gms.internal.ads.g11
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj) {
                        xy0 xy0VarA;
                        switch (i12) {
                            case 0:
                                f11Var.f10960d.b(20007);
                                return f11.a(13);
                            case 1:
                                f11Var.f10960d.b(20008);
                                return f11.a(13);
                            default:
                                by0 by0Var = (by0) obj;
                                f11 f11Var2 = f11Var;
                                g21 g21Var2 = f11Var2.f10960d;
                                if (by0Var.f9848a != 200) {
                                    g21Var2.c(20003, new String(a80.j(), StandardCharsets.UTF_8));
                                    return f11.a(7);
                                }
                                try {
                                    String str3 = new String(by0Var.f9849b);
                                    if (TextUtils.isEmpty(str3)) {
                                        g21Var2.b(20004);
                                        xy0VarA = f11.a(8);
                                    } else {
                                        eg egVarB = eg.B(yo0.v(str3, true), jn1.a());
                                        if (!egVarB.A().C() || !egVarB.A().A()) {
                                            g21Var2.b(20004);
                                            xy0VarA = f11.a(8);
                                        } else if (((h11) f11Var2.f10963h).a(egVarB)) {
                                            wy0 wy0VarD = xy0.D();
                                            yy0 yy0VarE = zy0.E();
                                            ig igVarB = egVarB.A().B();
                                            yy0VarE.b();
                                            ((zy0) yy0VarE.f14755b).H(igVarB);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).E((zy0) yy0VarE.e());
                                            bn1 bn1VarD = egVarB.A().D();
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).F(bn1VarD);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).I(2);
                                            xy0VarA = (xy0) wy0VarD.e();
                                        } else {
                                            g21Var2.b(20006);
                                            xy0VarA = f11.a(12);
                                        }
                                    }
                                    return xy0VarA;
                                } catch (Throwable th2) {
                                    g21Var2.d(20005, th2);
                                    return f11.a(6);
                                }
                        }
                    }
                }, k81Var), SocketException.class, new z21() { // from class: com.google.android.gms.internal.ads.g11
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj) {
                        xy0 xy0VarA;
                        switch (i13) {
                            case 0:
                                f11Var.f10960d.b(20007);
                                return f11.a(13);
                            case 1:
                                f11Var.f10960d.b(20008);
                                return f11.a(13);
                            default:
                                by0 by0Var = (by0) obj;
                                f11 f11Var2 = f11Var;
                                g21 g21Var2 = f11Var2.f10960d;
                                if (by0Var.f9848a != 200) {
                                    g21Var2.c(20003, new String(a80.j(), StandardCharsets.UTF_8));
                                    return f11.a(7);
                                }
                                try {
                                    String str3 = new String(by0Var.f9849b);
                                    if (TextUtils.isEmpty(str3)) {
                                        g21Var2.b(20004);
                                        xy0VarA = f11.a(8);
                                    } else {
                                        eg egVarB = eg.B(yo0.v(str3, true), jn1.a());
                                        if (!egVarB.A().C() || !egVarB.A().A()) {
                                            g21Var2.b(20004);
                                            xy0VarA = f11.a(8);
                                        } else if (((h11) f11Var2.f10963h).a(egVarB)) {
                                            wy0 wy0VarD = xy0.D();
                                            yy0 yy0VarE = zy0.E();
                                            ig igVarB = egVarB.A().B();
                                            yy0VarE.b();
                                            ((zy0) yy0VarE.f14755b).H(igVarB);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).E((zy0) yy0VarE.e());
                                            bn1 bn1VarD = egVarB.A().D();
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).F(bn1VarD);
                                            wy0VarD.b();
                                            ((xy0) wy0VarD.f14755b).I(2);
                                            xy0VarA = (xy0) wy0VarD.e();
                                        } else {
                                            g21Var2.b(20006);
                                            xy0VarA = f11.a(12);
                                        }
                                    }
                                    return xy0VarA;
                                } catch (Throwable th2) {
                                    g21Var2.d(20005, th2);
                                    return f11.a(6);
                                }
                        }
                    }
                }, k81Var);
                g21Var.e(20002, d71VarC);
                break;
        }
        d71 d71VarC3 = yo0.C(yo0.C(yo0.C(yo0.G(yo0.F(yo0.G(n81.s(d71VarC), new hu(11, this), k81Var), new q01(this, i13), k81Var), o5.f14562y, k81Var), o01.class, o5.f14563z, k81Var), p01.class, o5.A, k81Var), n01.class, new z21() { // from class: com.google.android.gms.internal.ads.r01
            @Override // com.google.android.gms.internal.ads.z21
            public final /* synthetic */ Object apply(Object obj) {
                t01 t01Var = this.f15495a;
                if (t01Var.f16631f) {
                    int i15 = i4;
                    if (i15 < t01Var.g) {
                        t01Var.f16630e.b(new b4.a(t01Var, i15, 7), t01Var.f16632h * ((long) Math.pow(2.0d, i15)));
                    }
                }
                return s01.f15827f;
            }
        }, k81Var);
        this.f16629d.e(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, d71VarC3);
        return d71VarC3;
    }
}
