package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class cj3 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj3 b;

    public /* synthetic */ cj3(fj3 fj3Var, int i) {
        this.a = i;
        this.b = fj3Var;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) {
        n70 n70VarP;
        int i;
        int i2 = this.a;
        final int i3 = 0;
        final fj3 fj3Var = this.b;
        final int i4 = 1;
        dq3 dq3Var = dq3.f;
        switch (i2) {
            case 0:
                final pj3 pj3Var = fj3Var.b;
                switch (pj3Var.a) {
                    case 0:
                        z94 z94Var = (z94) pj3Var.e;
                        Objects.requireNonNull(z94Var);
                        w53 w53Var = new w53(8, z94Var);
                        ExecutorService executorService = pj3Var.c;
                        xo3 xo3VarJ = pu1.J(pu1.P(pu1.O(pu1.P(gq3.r(pu1.D(w53Var, executorService)), new zk3() { // from class: oj3
                            /* JADX WARN: Finally extract failed */
                            @Override // defpackage.zk3
                            public final Object apply(Object obj2) {
                                boolean zA;
                                switch (i4) {
                                    case 0:
                                        jh3 jh3Var = (jh3) obj2;
                                        pj3 pj3Var2 = pj3Var;
                                        z94 z94Var2 = (z94) pj3Var2.e;
                                        String strA = jh3Var.A().A();
                                        String strB = jh3Var.A().B();
                                        gk3 gk3Var = pj3Var2.d;
                                        fk3 fk3VarA = gk3Var.a(15203);
                                        try {
                                            fk3VarA.a();
                                            ce3 ce3VarG = bd2.G(pj3Var2.b, (av1) z94Var2.d(), strA, strB, (gd3) pj3Var2.h);
                                            int i5 = ce3VarG.h;
                                            fk3VarA.c();
                                            int i6 = 2;
                                            if (i5 == 2) {
                                                gk3Var.b(15208);
                                                return pj3.b(4);
                                            }
                                            byte[] bArr = ce3VarG.g;
                                            if (bArr == null || bArr.length == 0) {
                                                gk3Var.b(5010);
                                                return pj3.b(8);
                                            }
                                            try {
                                                bv1 bv1VarE = bv1.E(bArr, h54.a());
                                                if (bv1VarE.A().A().isEmpty() || bv1VarE.A().B().isEmpty() || bv1VarE.C().p().length == 0) {
                                                    gk3Var.b(15207);
                                                } else {
                                                    if (jh3Var.equals(jh3.E()) || !TextUtils.equals(jh3Var.A().A(), bv1VarE.A().A()) || !TextUtils.equals(jh3Var.A().B(), bv1VarE.A().B())) {
                                                        if (i5 == 4) {
                                                            jj3 jj3Var = (jj3) pj3Var2.g;
                                                            byte[] bArrP = bv1VarE.B().p();
                                                            File file = jj3Var.a;
                                                            try {
                                                                yb.A(file);
                                                                yb.v(file, bArrP);
                                                                jj3Var.b.getClass();
                                                                zA = fd3.a(file);
                                                            } catch (IOException | GeneralSecurityException e) {
                                                                jj3Var.c.c(2027, e);
                                                                zA = false;
                                                            }
                                                            try {
                                                                file.delete();
                                                            } catch (SecurityException unused) {
                                                            }
                                                            if (!zA) {
                                                                gk3Var.b(15206);
                                                                return pj3.b(12);
                                                            }
                                                            i5 = 4;
                                                        }
                                                        xg3 xg3VarD = yg3.D();
                                                        if (i5 == 2) {
                                                            i6 = 4;
                                                        } else if (i5 != 3) {
                                                            i6 = i5 != 4 ? i5 != 6 ? 1 : 5 : 3;
                                                        }
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).I(i6);
                                                        zg3 zg3VarD = jh3.D();
                                                        fv1 fv1VarA = bv1VarE.A();
                                                        zg3VarD.b();
                                                        ((jh3) zg3VarD.g).F(fv1VarA);
                                                        av1 av1Var = (av1) z94Var2.d();
                                                        zg3VarD.b();
                                                        ((jh3) zg3VarD.g).H(av1Var);
                                                        jh3 jh3Var2 = (jh3) zg3VarD.d();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).E(jh3Var2);
                                                        a54 a54VarB = bv1VarE.B();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).G(a54VarB);
                                                        a54 a54VarC = bv1VarE.C();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).F(a54VarC);
                                                        return (yg3) xg3VarD.d();
                                                    }
                                                    gk3Var.b(15209);
                                                }
                                                return pj3.b(11);
                                            } catch (a64 e2) {
                                                gk3Var.c(15205, e2);
                                                return pj3.b(9);
                                            } catch (NullPointerException unused2) {
                                                gk3Var.b(15210);
                                                return pj3.b(10);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                fk3VarA.b(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                fk3VarA.c();
                                                throw th2;
                                            }
                                        }
                                    default:
                                        av1 av1Var2 = (av1) obj2;
                                        if (gi2.H(av1Var2)) {
                                            return new Integer(0);
                                        }
                                        ((wg3) pj3Var.d.a).b(15203, -1L, null, av1Var2.name());
                                        throw new nj3();
                                }
                            }
                        }, dq3Var), new u42(18, pj3Var), dq3Var), new zk3() { // from class: oj3
                            /* JADX WARN: Finally extract failed */
                            @Override // defpackage.zk3
                            public final Object apply(Object obj2) {
                                boolean zA;
                                switch (i3) {
                                    case 0:
                                        jh3 jh3Var = (jh3) obj2;
                                        pj3 pj3Var2 = pj3Var;
                                        z94 z94Var2 = (z94) pj3Var2.e;
                                        String strA = jh3Var.A().A();
                                        String strB = jh3Var.A().B();
                                        gk3 gk3Var = pj3Var2.d;
                                        fk3 fk3VarA = gk3Var.a(15203);
                                        try {
                                            fk3VarA.a();
                                            ce3 ce3VarG = bd2.G(pj3Var2.b, (av1) z94Var2.d(), strA, strB, (gd3) pj3Var2.h);
                                            int i5 = ce3VarG.h;
                                            fk3VarA.c();
                                            int i6 = 2;
                                            if (i5 == 2) {
                                                gk3Var.b(15208);
                                                return pj3.b(4);
                                            }
                                            byte[] bArr = ce3VarG.g;
                                            if (bArr == null || bArr.length == 0) {
                                                gk3Var.b(5010);
                                                return pj3.b(8);
                                            }
                                            try {
                                                bv1 bv1VarE = bv1.E(bArr, h54.a());
                                                if (bv1VarE.A().A().isEmpty() || bv1VarE.A().B().isEmpty() || bv1VarE.C().p().length == 0) {
                                                    gk3Var.b(15207);
                                                } else {
                                                    if (jh3Var.equals(jh3.E()) || !TextUtils.equals(jh3Var.A().A(), bv1VarE.A().A()) || !TextUtils.equals(jh3Var.A().B(), bv1VarE.A().B())) {
                                                        if (i5 == 4) {
                                                            jj3 jj3Var = (jj3) pj3Var2.g;
                                                            byte[] bArrP = bv1VarE.B().p();
                                                            File file = jj3Var.a;
                                                            try {
                                                                yb.A(file);
                                                                yb.v(file, bArrP);
                                                                jj3Var.b.getClass();
                                                                zA = fd3.a(file);
                                                            } catch (IOException | GeneralSecurityException e) {
                                                                jj3Var.c.c(2027, e);
                                                                zA = false;
                                                            }
                                                            try {
                                                                file.delete();
                                                            } catch (SecurityException unused) {
                                                            }
                                                            if (!zA) {
                                                                gk3Var.b(15206);
                                                                return pj3.b(12);
                                                            }
                                                            i5 = 4;
                                                        }
                                                        xg3 xg3VarD = yg3.D();
                                                        if (i5 == 2) {
                                                            i6 = 4;
                                                        } else if (i5 != 3) {
                                                            i6 = i5 != 4 ? i5 != 6 ? 1 : 5 : 3;
                                                        }
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).I(i6);
                                                        zg3 zg3VarD = jh3.D();
                                                        fv1 fv1VarA = bv1VarE.A();
                                                        zg3VarD.b();
                                                        ((jh3) zg3VarD.g).F(fv1VarA);
                                                        av1 av1Var = (av1) z94Var2.d();
                                                        zg3VarD.b();
                                                        ((jh3) zg3VarD.g).H(av1Var);
                                                        jh3 jh3Var2 = (jh3) zg3VarD.d();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).E(jh3Var2);
                                                        a54 a54VarB = bv1VarE.B();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).G(a54VarB);
                                                        a54 a54VarC = bv1VarE.C();
                                                        xg3VarD.b();
                                                        ((yg3) xg3VarD.g).F(a54VarC);
                                                        return (yg3) xg3VarD.d();
                                                    }
                                                    gk3Var.b(15209);
                                                }
                                                return pj3.b(11);
                                            } catch (a64 e2) {
                                                gk3Var.c(15205, e2);
                                                return pj3.b(9);
                                            } catch (NullPointerException unused2) {
                                                gk3Var.b(15210);
                                                return pj3.b(10);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                fk3VarA.b(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                fk3VarA.c();
                                                throw th2;
                                            }
                                        }
                                    default:
                                        av1 av1Var2 = (av1) obj2;
                                        if (gi2.H(av1Var2)) {
                                            return new Integer(0);
                                        }
                                        ((wg3) pj3Var.d.a).b(15203, -1L, null, av1Var2.name());
                                        throw new nj3();
                                }
                            }
                        }, executorService), nj3.class, dj3.e, dq3Var);
                        pj3Var.d.d(15202, xo3VarJ);
                        n70VarP = xo3VarJ;
                        break;
                    default:
                        iu1 iu1VarA = ju1.A();
                        byte[] bArrZ = yb.z();
                        y44 y44Var = a54.g;
                        boolean z = false;
                        y44 y44VarN = a54.n(bArrZ, 0, bArrZ.length);
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).B(y44VarN);
                        long j = Build.VERSION.SDK_INT;
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).C(j);
                        String str = Build.MODEL;
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).D(str);
                        Context context = pj3Var.b;
                        String packageName = context.getPackageName();
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).E(packageName);
                        try {
                            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = -1;
                        }
                        hg3 hg3Var = (hg3) pj3Var.e;
                        gk3 gk3Var = pj3Var.d;
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).F(i);
                        String str2 = (String) pj3Var.f;
                        iu1VarA.b();
                        ((ju1) iu1VarA.g).G(str2);
                        byte[] bArrB = ((ju1) iu1VarA.d()).b();
                        ho3 ho3Var = jo3.e;
                        if (ho3Var.b != null) {
                            ho3Var = new ho3(ho3Var.a, (Character) null);
                        }
                        String strG = ho3Var.g(bArrB.length, bArrB);
                        hg3Var.getClass();
                        n70VarP = pu1.P(wl2.h(new de3(hg3Var, Uri.parse((String) pj3Var.g).buildUpon().appendQueryParameter("aspq", strG).build().toString(), z, (String) null, new byte[0])), new vn1(14, pj3Var), pj3Var.c);
                        gk3Var.d(20002, n70VarP);
                        break;
                }
                rp3 rp3VarP = pu1.P(pu1.O(pu1.P(gq3.r(n70VarP), new gj1(28), dq3Var), new cj3(fj3Var, i4), dq3Var), gj1.B, dq3Var);
                fj3Var.d.d(1002, rp3VarP);
                return rp3VarP;
            default:
                final yg3 yg3Var = (yg3) obj;
                rj3 rj3Var = fj3Var.c;
                final int i5 = 2;
                if (yg3Var.H() == 2) {
                    return pu1.O(gq3.r(rj3Var.c(yg3Var.B().p())), new yp3() { // from class: bj3
                        @Override // defpackage.yp3
                        public final n70 c(Object obj2) {
                            ar3 ar3VarA;
                            int i6 = i4;
                            yg3 yg3Var2 = yg3Var;
                            fj3 fj3Var2 = fj3Var;
                            switch (i6) {
                                case 0:
                                    return fj3Var2.c.b(yg3Var2.A());
                                case 1:
                                    return fj3Var2.c.b(yg3Var2.A());
                                default:
                                    byte[] bArrP = yg3Var2.B().p();
                                    rj3 rj3Var2 = fj3Var2.c;
                                    ar3 ar3VarC = rj3Var2.c(bArrP);
                                    byte[] bArrP2 = yg3Var2.C().p();
                                    switch (rj3Var2.a) {
                                        case 0:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(15307, ar3VarA);
                                            break;
                                        default:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(20307, ar3VarA);
                                            break;
                                    }
                                    return new zp3(xm3.n(new n70[]{ar3VarC, ar3VarA}), true);
                            }
                        }
                    }, dq3Var);
                }
                if (yg3Var.H() == 3) {
                    return pu1.O(pu1.O(gq3.r(rj3Var.b(jh3.E())), new yp3() { // from class: bj3
                        @Override // defpackage.yp3
                        public final n70 c(Object obj2) {
                            ar3 ar3VarA;
                            int i6 = i5;
                            yg3 yg3Var2 = yg3Var;
                            fj3 fj3Var2 = fj3Var;
                            switch (i6) {
                                case 0:
                                    return fj3Var2.c.b(yg3Var2.A());
                                case 1:
                                    return fj3Var2.c.b(yg3Var2.A());
                                default:
                                    byte[] bArrP = yg3Var2.B().p();
                                    rj3 rj3Var2 = fj3Var2.c;
                                    ar3 ar3VarC = rj3Var2.c(bArrP);
                                    byte[] bArrP2 = yg3Var2.C().p();
                                    switch (rj3Var2.a) {
                                        case 0:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(15307, ar3VarA);
                                            break;
                                        default:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(20307, ar3VarA);
                                            break;
                                    }
                                    return new zp3(xm3.n(new n70[]{ar3VarC, ar3VarA}), true);
                            }
                        }
                    }, dq3Var), new yp3() { // from class: bj3
                        @Override // defpackage.yp3
                        public final n70 c(Object obj2) {
                            ar3 ar3VarA;
                            int i6 = i3;
                            yg3 yg3Var2 = yg3Var;
                            fj3 fj3Var2 = fj3Var;
                            switch (i6) {
                                case 0:
                                    return fj3Var2.c.b(yg3Var2.A());
                                case 1:
                                    return fj3Var2.c.b(yg3Var2.A());
                                default:
                                    byte[] bArrP = yg3Var2.B().p();
                                    rj3 rj3Var2 = fj3Var2.c;
                                    ar3 ar3VarC = rj3Var2.c(bArrP);
                                    byte[] bArrP2 = yg3Var2.C().p();
                                    switch (rj3Var2.a) {
                                        case 0:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(15307, ar3VarA);
                                            break;
                                        default:
                                            ar3VarA = ((lg3) rj3Var2.d.d()).a(bArrP2);
                                            rj3Var2.e.d(20307, ar3VarA);
                                            break;
                                    }
                                    return new zp3(xm3.n(new n70[]{ar3VarC, ar3VarA}), true);
                            }
                        }
                    }, dq3Var);
                }
                throw new AssertionError("Unreachable");
        }
    }
}
