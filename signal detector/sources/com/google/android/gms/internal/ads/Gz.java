package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Gz {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1195gA f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final Sz f8490b;

    /* renamed from: c, reason: collision with root package name */
    public final Vz f8491c;

    /* renamed from: d, reason: collision with root package name */
    public final C1948uA f8492d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1666oy f8493e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8494f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8495g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8496h;

    public Gz(InterfaceC1195gA interfaceC1195gA, Sz sz, Vz vz, C1948uA c1948uA, InterfaceC1666oy interfaceC1666oy, boolean z6, long j6, long j7) {
        this.f8489a = interfaceC1195gA;
        this.f8490b = sz;
        this.f8491c = vz;
        this.f8492d = c1948uA;
        this.f8493e = interfaceC1666oy;
        this.f8494f = z6;
        this.f8495g = j6;
        this.f8496h = j7;
    }

    public final AbstractC2221zD a() {
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(this.f8491c.c());
        C1563n2 c1563n2 = C1563n2.f15731x;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        PC pcC = AbstractC1984ut.C(abstractC2221zDR, Throwable.class, c1563n2, enumC2059wD);
        InterfaceC1195gA interfaceC1195gA = this.f8489a;
        Objects.requireNonNull(interfaceC1195gA);
        return AbstractC1984ut.F(AbstractC1984ut.G(pcC, new C1754qe(10, interfaceC1195gA), enumC2059wD), new Dz(this, 0), enumC2059wD);
    }

    public final AbstractC2221zD b(final int i) {
        PC pcC;
        int i3;
        final Sz sz = this.f8490b;
        int i6 = sz.f11300a;
        final int i7 = 0;
        final int i8 = 1;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        switch (i6) {
            case 0:
                InterfaceC1692pN interfaceC1692pN = (InterfaceC1692pN) sz.f11304e;
                Objects.requireNonNull(interfaceC1692pN);
                Zs zs = new Zs(6, interfaceC1692pN);
                ExecutorService executorService = sz.f11302c;
                PC pcC2 = AbstractC1984ut.C(AbstractC1984ut.G(AbstractC1984ut.F(AbstractC1984ut.G(AbstractC2221zD.r(AbstractC1984ut.z(zs, executorService)), new NA() { // from class: com.google.android.gms.internal.ads.Rz
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i8) {
                            case 0:
                                Ly ly = (Ly) obj;
                                Sz sz2 = sz;
                                InterfaceC1692pN interfaceC1692pN2 = (InterfaceC1692pN) sz2.f11304e;
                                String strA = ly.A().A();
                                String strB = ly.A().B();
                                C1948uA c1948uA = sz2.f11303d;
                                C1894tA c1894tAA = c1948uA.a(15203);
                                try {
                                    c1894tAA.a();
                                    Vw vwC = AbstractC1984ut.c(sz2.f11301b, (EnumC1945u7) interfaceC1692pN2.c(), strA, strB, (Cw) sz2.f11307h);
                                    int i9 = vwC.f12114c;
                                    c1894tAA.c();
                                    int i10 = 2;
                                    if (i9 == 2) {
                                        c1948uA.b(15208);
                                        return Sz.b(4);
                                    }
                                    byte[] bArr = vwC.f12113b;
                                    if (bArr == null || bArr.length == 0) {
                                        c1948uA.b(5010);
                                        return Sz.b(8);
                                    }
                                    try {
                                        C1999v7 c1999v7E = C1999v7.E(bArr, XK.a());
                                        if (c1999v7E.A().A().isEmpty() || c1999v7E.A().B().isEmpty() || c1999v7E.C().u().length == 0) {
                                            c1948uA.b(15207);
                                        } else {
                                            if (ly.equals(Ly.F()) || !TextUtils.equals(ly.A().A(), c1999v7E.A().A()) || !TextUtils.equals(ly.A().B(), c1999v7E.A().B())) {
                                                if (i9 == 4) {
                                                    Kz kz = (Kz) sz2.f11306g;
                                                    byte[] bArrU = c1999v7E.B().u();
                                                    File file = kz.f9587a;
                                                    try {
                                                        AbstractC0582Jp.x(file);
                                                        AbstractC0582Jp.l(file, bArrU);
                                                        kz.f9588b.getClass();
                                                        zA = Bw.a(file);
                                                    } catch (IOException | GeneralSecurityException e6) {
                                                        kz.f9589c.d(2027, e6);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        c1948uA.b(15206);
                                                        return Sz.b(12);
                                                    }
                                                    i9 = 4;
                                                }
                                                Iy iyD = Jy.D();
                                                if (i9 == 2) {
                                                    i10 = 4;
                                                } else if (i9 != 3) {
                                                    i10 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                                }
                                                iyD.b();
                                                ((Jy) iyD.f13551b).I(i10);
                                                Ky kyE = Ly.E();
                                                C2215z7 c2215z7A = c1999v7E.A();
                                                kyE.b();
                                                ((Ly) kyE.f13551b).G(c2215z7A);
                                                EnumC1945u7 enumC1945u7 = (EnumC1945u7) interfaceC1692pN2.c();
                                                kyE.b();
                                                ((Ly) kyE.f13551b).I(enumC1945u7);
                                                Ly ly2 = (Ly) kyE.d();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).E(ly2);
                                                QK qkB = c1999v7E.B();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).G(qkB);
                                                QK qkC = c1999v7E.C();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).F(qkC);
                                                return (Jy) iyD.d();
                                            }
                                            c1948uA.b(15209);
                                        }
                                        return Sz.b(11);
                                    } catch (C1636oL e7) {
                                        c1948uA.d(15205, e7);
                                        return Sz.b(9);
                                    } catch (NullPointerException unused2) {
                                        c1948uA.b(15210);
                                        return Sz.b(10);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        c1894tAA.b(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        c1894tAA.c();
                                        throw th2;
                                    }
                                }
                            default:
                                EnumC1945u7 enumC1945u72 = (EnumC1945u7) obj;
                                Sz sz3 = sz;
                                sz3.getClass();
                                if (C1476lN.i(enumC1945u72)) {
                                    return new Integer(0);
                                }
                                sz3.f11303d.c(15204, enumC1945u72.name());
                                throw new Qz();
                        }
                    }
                }, enumC2059wD), new C0738Tb(18, sz), enumC2059wD), new NA() { // from class: com.google.android.gms.internal.ads.Rz
                    /* JADX WARN: Finally extract failed */
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj) {
                        boolean zA;
                        switch (i7) {
                            case 0:
                                Ly ly = (Ly) obj;
                                Sz sz2 = sz;
                                InterfaceC1692pN interfaceC1692pN2 = (InterfaceC1692pN) sz2.f11304e;
                                String strA = ly.A().A();
                                String strB = ly.A().B();
                                C1948uA c1948uA = sz2.f11303d;
                                C1894tA c1894tAA = c1948uA.a(15203);
                                try {
                                    c1894tAA.a();
                                    Vw vwC = AbstractC1984ut.c(sz2.f11301b, (EnumC1945u7) interfaceC1692pN2.c(), strA, strB, (Cw) sz2.f11307h);
                                    int i9 = vwC.f12114c;
                                    c1894tAA.c();
                                    int i10 = 2;
                                    if (i9 == 2) {
                                        c1948uA.b(15208);
                                        return Sz.b(4);
                                    }
                                    byte[] bArr = vwC.f12113b;
                                    if (bArr == null || bArr.length == 0) {
                                        c1948uA.b(5010);
                                        return Sz.b(8);
                                    }
                                    try {
                                        C1999v7 c1999v7E = C1999v7.E(bArr, XK.a());
                                        if (c1999v7E.A().A().isEmpty() || c1999v7E.A().B().isEmpty() || c1999v7E.C().u().length == 0) {
                                            c1948uA.b(15207);
                                        } else {
                                            if (ly.equals(Ly.F()) || !TextUtils.equals(ly.A().A(), c1999v7E.A().A()) || !TextUtils.equals(ly.A().B(), c1999v7E.A().B())) {
                                                if (i9 == 4) {
                                                    Kz kz = (Kz) sz2.f11306g;
                                                    byte[] bArrU = c1999v7E.B().u();
                                                    File file = kz.f9587a;
                                                    try {
                                                        AbstractC0582Jp.x(file);
                                                        AbstractC0582Jp.l(file, bArrU);
                                                        kz.f9588b.getClass();
                                                        zA = Bw.a(file);
                                                    } catch (IOException | GeneralSecurityException e6) {
                                                        kz.f9589c.d(2027, e6);
                                                        zA = false;
                                                    }
                                                    try {
                                                        file.delete();
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (!zA) {
                                                        c1948uA.b(15206);
                                                        return Sz.b(12);
                                                    }
                                                    i9 = 4;
                                                }
                                                Iy iyD = Jy.D();
                                                if (i9 == 2) {
                                                    i10 = 4;
                                                } else if (i9 != 3) {
                                                    i10 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                                }
                                                iyD.b();
                                                ((Jy) iyD.f13551b).I(i10);
                                                Ky kyE = Ly.E();
                                                C2215z7 c2215z7A = c1999v7E.A();
                                                kyE.b();
                                                ((Ly) kyE.f13551b).G(c2215z7A);
                                                EnumC1945u7 enumC1945u7 = (EnumC1945u7) interfaceC1692pN2.c();
                                                kyE.b();
                                                ((Ly) kyE.f13551b).I(enumC1945u7);
                                                Ly ly2 = (Ly) kyE.d();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).E(ly2);
                                                QK qkB = c1999v7E.B();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).G(qkB);
                                                QK qkC = c1999v7E.C();
                                                iyD.b();
                                                ((Jy) iyD.f13551b).F(qkC);
                                                return (Jy) iyD.d();
                                            }
                                            c1948uA.b(15209);
                                        }
                                        return Sz.b(11);
                                    } catch (C1636oL e7) {
                                        c1948uA.d(15205, e7);
                                        return Sz.b(9);
                                    } catch (NullPointerException unused2) {
                                        c1948uA.b(15210);
                                        return Sz.b(10);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        c1894tAA.b(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        c1894tAA.c();
                                        throw th2;
                                    }
                                }
                            default:
                                EnumC1945u7 enumC1945u72 = (EnumC1945u7) obj;
                                Sz sz3 = sz;
                                sz3.getClass();
                                if (C1476lN.i(enumC1945u72)) {
                                    return new Integer(0);
                                }
                                sz3.f11303d.c(15204, enumC1945u72.name());
                                throw new Qz();
                        }
                    }
                }, executorService), Qz.class, Oz.f10288c, enumC2059wD);
                sz.f11303d.e(15202, pcC2);
                pcC = pcC2;
                break;
            default:
                C1783r7 c1783r7A = C1837s7.A();
                byte[] bArrJ = AbstractC1114el.j();
                OK ok = QK.f10609b;
                boolean z6 = false;
                OK okR = QK.r(0, bArrJ.length, bArrJ);
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).B(okR);
                long j6 = Build.VERSION.SDK_INT;
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).C(j6);
                String str = Build.MODEL;
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).D(str);
                Context context = sz.f11301b;
                String packageName = context.getPackageName();
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).E(packageName);
                try {
                    i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i3 = -1;
                }
                C1612ny c1612ny = (C1612ny) sz.f11304e;
                C1948uA c1948uA = sz.f11303d;
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).F(i3);
                String str2 = (String) sz.f11305f;
                c1783r7A.b();
                ((C1837s7) c1783r7A.f13551b).G(str2);
                byte[] bArrB = ((C1837s7) c1783r7A.d()).b();
                C2058wC c2058wC = C2166yC.f17692e;
                if (c2058wC.f17695b != null) {
                    c2058wC = new C2058wC(c2058wC.f17694a, (Character) null);
                }
                String strG = c2058wC.g(bArrB.length, bArrB);
                c1612ny.getClass();
                final int i9 = 2;
                pcC = AbstractC1984ut.C(AbstractC1984ut.C(AbstractC1984ut.G(AbstractC2221zD.r(R3.b.m(new Ww(c1612ny, Uri.parse((String) sz.f11306g).buildUpon().appendQueryParameter("aspq", strG).build().toString(), z6, (String) null, new byte[0]))), new NA() { // from class: com.google.android.gms.internal.ads.Tz
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj) {
                        Jy jyA;
                        switch (i9) {
                            case 0:
                                sz.f11303d.b(20007);
                                return Sz.a(13);
                            case 1:
                                sz.f11303d.b(20008);
                                return Sz.a(13);
                            default:
                                C1558my c1558my = (C1558my) obj;
                                Sz sz2 = sz;
                                C1948uA c1948uA2 = sz2.f11303d;
                                if (c1558my.f15690a != 200) {
                                    c1948uA2.c(20003, new String(AbstractC1114el.j(), StandardCharsets.UTF_8));
                                    return Sz.a(7);
                                }
                                try {
                                    String str3 = new String(c1558my.f15691b);
                                    if (TextUtils.isEmpty(str3)) {
                                        c1948uA2.b(20004);
                                        jyA = Sz.a(8);
                                    } else {
                                        C1891t7 c1891t7B = C1891t7.B(AbstractC1984ut.v(str3, true), XK.a());
                                        if (!c1891t7B.A().C() || !c1891t7B.A().A()) {
                                            c1948uA2.b(20004);
                                            jyA = Sz.a(8);
                                        } else if (((Uz) sz2.f11307h).a(c1891t7B)) {
                                            Iy iyD = Jy.D();
                                            Ky kyE = Ly.E();
                                            C2107x7 c2107x7B = c1891t7B.A().B();
                                            kyE.b();
                                            ((Ly) kyE.f13551b).H(c2107x7B);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).E((Ly) kyE.d());
                                            QK qkD = c1891t7B.A().D();
                                            iyD.b();
                                            ((Jy) iyD.f13551b).F(qkD);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).I(2);
                                            jyA = (Jy) iyD.d();
                                        } else {
                                            c1948uA2.b(20006);
                                            jyA = Sz.a(12);
                                        }
                                    }
                                    return jyA;
                                } catch (Throwable th) {
                                    c1948uA2.d(20005, th);
                                    return Sz.a(6);
                                }
                        }
                    }
                }, sz.f11302c), UnknownHostException.class, new NA() { // from class: com.google.android.gms.internal.ads.Tz
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj) {
                        Jy jyA;
                        switch (i7) {
                            case 0:
                                sz.f11303d.b(20007);
                                return Sz.a(13);
                            case 1:
                                sz.f11303d.b(20008);
                                return Sz.a(13);
                            default:
                                C1558my c1558my = (C1558my) obj;
                                Sz sz2 = sz;
                                C1948uA c1948uA2 = sz2.f11303d;
                                if (c1558my.f15690a != 200) {
                                    c1948uA2.c(20003, new String(AbstractC1114el.j(), StandardCharsets.UTF_8));
                                    return Sz.a(7);
                                }
                                try {
                                    String str3 = new String(c1558my.f15691b);
                                    if (TextUtils.isEmpty(str3)) {
                                        c1948uA2.b(20004);
                                        jyA = Sz.a(8);
                                    } else {
                                        C1891t7 c1891t7B = C1891t7.B(AbstractC1984ut.v(str3, true), XK.a());
                                        if (!c1891t7B.A().C() || !c1891t7B.A().A()) {
                                            c1948uA2.b(20004);
                                            jyA = Sz.a(8);
                                        } else if (((Uz) sz2.f11307h).a(c1891t7B)) {
                                            Iy iyD = Jy.D();
                                            Ky kyE = Ly.E();
                                            C2107x7 c2107x7B = c1891t7B.A().B();
                                            kyE.b();
                                            ((Ly) kyE.f13551b).H(c2107x7B);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).E((Ly) kyE.d());
                                            QK qkD = c1891t7B.A().D();
                                            iyD.b();
                                            ((Jy) iyD.f13551b).F(qkD);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).I(2);
                                            jyA = (Jy) iyD.d();
                                        } else {
                                            c1948uA2.b(20006);
                                            jyA = Sz.a(12);
                                        }
                                    }
                                    return jyA;
                                } catch (Throwable th) {
                                    c1948uA2.d(20005, th);
                                    return Sz.a(6);
                                }
                        }
                    }
                }, enumC2059wD), SocketException.class, new NA() { // from class: com.google.android.gms.internal.ads.Tz
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj) {
                        Jy jyA;
                        switch (i8) {
                            case 0:
                                sz.f11303d.b(20007);
                                return Sz.a(13);
                            case 1:
                                sz.f11303d.b(20008);
                                return Sz.a(13);
                            default:
                                C1558my c1558my = (C1558my) obj;
                                Sz sz2 = sz;
                                C1948uA c1948uA2 = sz2.f11303d;
                                if (c1558my.f15690a != 200) {
                                    c1948uA2.c(20003, new String(AbstractC1114el.j(), StandardCharsets.UTF_8));
                                    return Sz.a(7);
                                }
                                try {
                                    String str3 = new String(c1558my.f15691b);
                                    if (TextUtils.isEmpty(str3)) {
                                        c1948uA2.b(20004);
                                        jyA = Sz.a(8);
                                    } else {
                                        C1891t7 c1891t7B = C1891t7.B(AbstractC1984ut.v(str3, true), XK.a());
                                        if (!c1891t7B.A().C() || !c1891t7B.A().A()) {
                                            c1948uA2.b(20004);
                                            jyA = Sz.a(8);
                                        } else if (((Uz) sz2.f11307h).a(c1891t7B)) {
                                            Iy iyD = Jy.D();
                                            Ky kyE = Ly.E();
                                            C2107x7 c2107x7B = c1891t7B.A().B();
                                            kyE.b();
                                            ((Ly) kyE.f13551b).H(c2107x7B);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).E((Ly) kyE.d());
                                            QK qkD = c1891t7B.A().D();
                                            iyD.b();
                                            ((Jy) iyD.f13551b).F(qkD);
                                            iyD.b();
                                            ((Jy) iyD.f13551b).I(2);
                                            jyA = (Jy) iyD.d();
                                        } else {
                                            c1948uA2.b(20006);
                                            jyA = Sz.a(12);
                                        }
                                    }
                                    return jyA;
                                } catch (Throwable th) {
                                    c1948uA2.d(20005, th);
                                    return Sz.a(6);
                                }
                        }
                    }
                }, enumC2059wD);
                c1948uA.e(20002, pcC);
                break;
        }
        PC pcC3 = AbstractC1984ut.C(AbstractC1984ut.C(AbstractC1984ut.C(AbstractC1984ut.G(AbstractC1984ut.F(AbstractC1984ut.G(AbstractC2221zD.r(pcC), new C1754qe(11, this), enumC2059wD), new Dz(this, i8), enumC2059wD), C1563n2.f15732y, enumC2059wD), Bz.class, C1563n2.f15733z, enumC2059wD), Cz.class, C1563n2.f15707A, enumC2059wD), Az.class, new NA() { // from class: com.google.android.gms.internal.ads.Ez
            @Override // com.google.android.gms.internal.ads.NA
            public final /* synthetic */ Object apply(Object obj) {
                Gz gz = this.f8053a;
                if (gz.f8494f) {
                    int i10 = i;
                    if (i10 < gz.f8495g) {
                        gz.f8493e.a(new A3.h(i10, 10, gz), gz.f8496h * ((long) Math.pow(2.0d, i10)));
                    }
                }
                return Fz.f8248f;
            }
        }, enumC2059wD);
        this.f8492d.e(BackupConstant.SCENE_BACKUP_RENDER_FAIL, pcC3);
        return pcC3;
    }
}
