package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rf extends zf {

    /* renamed from: i, reason: collision with root package name */
    public static volatile Long f15638i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f15639k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f15641m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f15643o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f15645q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15647h;
    public static final Object j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f15640l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f15642n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f15644p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f15646r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf(ff ffVar, String str, String str2, zc zcVar, int i4, int i10, int i11) {
        super(ffVar, str, str2, zcVar, i4, i10);
        this.f15647h = i11;
    }

    private final void b() {
        String str = (String) this.f19076e.invoke(null, null);
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            zcVar.b();
            ((md) zcVar.f14755b).l0(str);
        }
    }

    private final void c() {
        zc zcVar = this.f19075d;
        zcVar.b();
        ((md) zcVar.f14755b).H0(-1L);
        zcVar.b();
        ((md) zcVar.f14755b).I0(-1L);
        int[] iArr = (int[]) this.f19076e.invoke(null, this.f19072a.f11116a);
        synchronized (zcVar) {
            long j8 = iArr[0];
            zcVar.b();
            ((md) zcVar.f14755b).H0(j8);
            long j9 = iArr[1];
            zcVar.b();
            ((md) zcVar.f14755b).I0(j9);
            int i4 = iArr[2];
            if (i4 != Integer.MIN_VALUE) {
                zcVar.b();
                ((md) zcVar.f14755b).Y(i4);
            }
        }
    }

    private final void d() {
        if (f15638i == null) {
            synchronized (j) {
                try {
                    if (f15638i == null) {
                        f15638i = (Long) this.f19076e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            long jLongValue = f15638i.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).M(jLongValue);
        }
    }

    private final void e() {
        if (f15639k == null) {
            synchronized (f15640l) {
                try {
                    if (f15639k == null) {
                        f15639k = (String) this.f19076e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            String str = f15639k;
            zcVar.b();
            ((md) zcVar.f14755b).g0(str);
        }
    }

    private final void f() {
        if (f15641m == null) {
            synchronized (f15642n) {
                try {
                    if (f15641m == null) {
                        f15641m = (Long) this.f19076e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            long jLongValue = f15641m.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).Q0(jLongValue);
        }
    }

    private final void g() {
        zc zcVar = this.f19075d;
        zcVar.b();
        ((md) zcVar.f14755b).E0("E");
        if (f15643o == null) {
            synchronized (f15644p) {
                try {
                    if (f15643o == null) {
                        f15643o = (String) this.f19076e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zc zcVar2 = this.f19075d;
        synchronized (zcVar2) {
            String str = f15643o;
            zcVar2.b();
            ((md) zcVar2.f14755b).E0(str);
        }
    }

    private final void h() {
        Boolean bool = (Boolean) va.s.f36163e.f36166c.a(sk.z3);
        bool.getClass();
        String str = (String) this.f19076e.invoke(null, this.f19072a.f11116a, bool);
        ve veVar = new ve(25);
        veVar.H = -1L;
        veVar.I = -1L;
        HashMap mapM = ls.m(str);
        if (mapM != null) {
            veVar.H = ((Long) mapM.get(0)).longValue();
            veVar.I = ((Long) mapM.get(1)).longValue();
        }
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            long j8 = veVar.H;
            zcVar.b();
            ((md) zcVar.f14755b).G0(j8);
            long j9 = veVar.I;
            zcVar.b();
            ((md) zcVar.f14755b).Z(j9);
        }
    }

    private final void i() {
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            String str = (String) this.f19076e.invoke(null, null);
            cf cfVar = new cf(25);
            HashMap mapM = ls.m(str);
            if (mapM != null) {
                cfVar.H = (Long) mapM.get(0);
                cfVar.I = (Long) mapM.get(1);
            }
            long jLongValue = cfVar.H.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).Q(jLongValue);
            long jLongValue2 = cfVar.I.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).R(jLongValue2);
        }
    }

    private final void j() {
        if (f15645q == null) {
            synchronized (f15646r) {
                try {
                    if (f15645q == null) {
                        f15645q = (Long) this.f19076e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            long jLongValue = f15645q.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).D(jLongValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() throws InvocationTargetException {
        int i4;
        switch (this.f15647h) {
            case 0:
                d();
                return;
            case 1:
                e();
                return;
            case 2:
                f();
                return;
            case 3:
                g();
                return;
            case 4:
                j();
                return;
            case 5:
                b();
                return;
            case 6:
                zc zcVar = this.f19075d;
                zcVar.b();
                ((md) zcVar.f14755b).q0(3);
                try {
                    i4 = true != ((Boolean) this.f19076e.invoke(null, this.f19072a.f11116a)).booleanValue() ? 1 : 2;
                    zcVar.b();
                    ((md) zcVar.f14755b).q0(i4);
                    return;
                } catch (InvocationTargetException e2) {
                    if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e2;
                    }
                    return;
                }
            case 7:
                c();
                return;
            case 8:
                i4 = true != ((Boolean) this.f19076e.invoke(null, this.f19072a.f11116a)).booleanValue() ? 1 : 2;
                zc zcVar2 = this.f19075d;
                zcVar2.b();
                ((md) zcVar2.f14755b).t0(i4);
                return;
            case 9:
                zc zcVar3 = this.f19075d;
                zcVar3.b();
                ((md) zcVar3.f14755b).K0(-1L);
                long jLongValue = ((Long) this.f19076e.invoke(null, this.f19072a.f11116a)).longValue();
                zcVar3.b();
                ((md) zcVar3.f14755b).K0(jLongValue);
                return;
            case 10:
                h();
                return;
            case 11:
                zc zcVar4 = this.f19075d;
                try {
                    i4 = true != ((Boolean) this.f19076e.invoke(null, this.f19072a.f11116a)).booleanValue() ? 1 : 2;
                    zcVar4.b();
                    ((md) zcVar4.f14755b).s0(i4);
                    return;
                } catch (InvocationTargetException unused) {
                    zcVar4.b();
                    ((md) zcVar4.f14755b).s0(3);
                    return;
                }
            case 12:
                i();
                return;
            default:
                zc zcVar5 = this.f19075d;
                zcVar5.h(3);
                boolean zBooleanValue = ((Boolean) this.f19076e.invoke(null, this.f19072a.f11116a)).booleanValue();
                synchronized (zcVar5) {
                    try {
                        if (zBooleanValue) {
                            zcVar5.h(2);
                        } else {
                            zcVar5.h(1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(ff ffVar, zc zcVar, int i4, int i10) {
        super(ffVar, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", zcVar, i4, 44);
        this.f15647h = i10;
        switch (i10) {
            case 2:
                super(ffVar, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", zcVar, i4, 22);
                break;
            case 3:
                super(ffVar, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", zcVar, i4, 1);
                break;
            case 4:
                super(ffVar, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", zcVar, i4, 33);
                break;
            case 5:
                super(ffVar, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", zcVar, i4, 89);
                break;
            case 6:
                super(ffVar, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", zcVar, i4, 49);
                break;
            case 7:
                super(ffVar, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", zcVar, i4, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(ffVar, "KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", zcVar, i4, 12);
                break;
            case 10:
                super(ffVar, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", zcVar, i4, 3);
                break;
            case 11:
                super(ffVar, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", zcVar, i4, 73);
                break;
            case 12:
                super(ffVar, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", zcVar, i4, 51);
                break;
            case 13:
                super(ffVar, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", zcVar, i4, 48);
                break;
        }
    }
}
