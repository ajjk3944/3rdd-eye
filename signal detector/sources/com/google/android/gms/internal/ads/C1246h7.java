package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246h7 extends AbstractCallableC1676p7 {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f14450k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f14452m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f14454o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f14456q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14458h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f14449j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f14451l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f14453n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f14455p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f14457r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1246h7(X6 x6, String str, String str2, S5 s5, int i3, int i6, int i7) {
        super(x6, str, str2, s5, i3, i6);
        this.f14458h = i7;
    }

    private final void b() {
        String str = (String) this.f16134e.invoke(null, null);
        S5 s5 = this.f16133d;
        synchronized (s5) {
            s5.b();
            ((C1136f6) s5.f13551b).l0(str);
        }
    }

    private final void c() {
        S5 s5 = this.f16133d;
        s5.b();
        ((C1136f6) s5.f13551b).H0(-1L);
        s5.b();
        ((C1136f6) s5.f13551b).I0(-1L);
        int[] iArr = (int[]) this.f16134e.invoke(null, this.f16130a.f12375a);
        synchronized (s5) {
            long j6 = iArr[0];
            s5.b();
            ((C1136f6) s5.f13551b).H0(j6);
            long j7 = iArr[1];
            s5.b();
            ((C1136f6) s5.f13551b).I0(j7);
            int i3 = iArr[2];
            if (i3 != Integer.MIN_VALUE) {
                s5.b();
                ((C1136f6) s5.f13551b).Y(i3);
            }
        }
    }

    private final void d() {
        if (i == null) {
            synchronized (f14449j) {
                try {
                    if (i == null) {
                        i = (Long) this.f16134e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        S5 s5 = this.f16133d;
        synchronized (s5) {
            long jLongValue = i.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).M(jLongValue);
        }
    }

    private final void e() {
        if (f14450k == null) {
            synchronized (f14451l) {
                try {
                    if (f14450k == null) {
                        f14450k = (String) this.f16134e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        S5 s5 = this.f16133d;
        synchronized (s5) {
            String str = f14450k;
            s5.b();
            ((C1136f6) s5.f13551b).g0(str);
        }
    }

    private final void f() {
        if (f14452m == null) {
            synchronized (f14453n) {
                try {
                    if (f14452m == null) {
                        f14452m = (Long) this.f16134e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        S5 s5 = this.f16133d;
        synchronized (s5) {
            long jLongValue = f14452m.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).Q0(jLongValue);
        }
    }

    private final void g() {
        S5 s5 = this.f16133d;
        s5.b();
        ((C1136f6) s5.f13551b).E0("E");
        if (f14454o == null) {
            synchronized (f14455p) {
                try {
                    if (f14454o == null) {
                        f14454o = (String) this.f16134e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        S5 s52 = this.f16133d;
        synchronized (s52) {
            String str = f14454o;
            s52.b();
            ((C1136f6) s52.f13551b).E0(str);
        }
    }

    private final void h() {
        Boolean bool = (Boolean) C2841s.f23267e.f23270c.a(H9.f8869z3);
        bool.getClass();
        String str = (String) this.f16134e.invoke(null, this.f16130a.f12375a, bool);
        N6 n6 = new N6();
        n6.f9957H = -1L;
        n6.f9958I = -1L;
        HashMap mapO = AbstractC2022vd.o(str);
        if (mapO != null) {
            n6.f9957H = ((Long) mapO.get(0)).longValue();
            n6.f9958I = ((Long) mapO.get(1)).longValue();
        }
        S5 s5 = this.f16133d;
        synchronized (s5) {
            long j6 = n6.f9957H;
            s5.b();
            ((C1136f6) s5.f13551b).G0(j6);
            long j7 = n6.f9958I;
            s5.b();
            ((C1136f6) s5.f13551b).Z(j7);
        }
    }

    private final void i() {
        S5 s5 = this.f16133d;
        synchronized (s5) {
            String str = (String) this.f16134e.invoke(null, null);
            U6 u6 = new U6();
            HashMap mapO = AbstractC2022vd.o(str);
            if (mapO != null) {
                u6.f11599H = (Long) mapO.get(0);
                u6.f11600I = (Long) mapO.get(1);
            }
            long jLongValue = u6.f11599H.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).Q(jLongValue);
            long jLongValue2 = u6.f11600I.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).R(jLongValue2);
        }
    }

    private final void j() {
        if (f14456q == null) {
            synchronized (f14457r) {
                try {
                    if (f14456q == null) {
                        f14456q = (Long) this.f16134e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        S5 s5 = this.f16133d;
        synchronized (s5) {
            long jLongValue = f14456q.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).D(jLongValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() throws InvocationTargetException {
        int i3;
        switch (this.f14458h) {
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
                S5 s5 = this.f16133d;
                s5.b();
                ((C1136f6) s5.f13551b).q0(3);
                try {
                    i3 = true != ((Boolean) this.f16134e.invoke(null, this.f16130a.f12375a)).booleanValue() ? 1 : 2;
                    s5.b();
                    ((C1136f6) s5.f13551b).q0(i3);
                    return;
                } catch (InvocationTargetException e6) {
                    if (!(e6.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e6;
                    }
                    return;
                }
            case 7:
                c();
                return;
            case 8:
                i3 = true != ((Boolean) this.f16134e.invoke(null, this.f16130a.f12375a)).booleanValue() ? 1 : 2;
                S5 s52 = this.f16133d;
                s52.b();
                ((C1136f6) s52.f13551b).t0(i3);
                return;
            case 9:
                S5 s53 = this.f16133d;
                s53.b();
                ((C1136f6) s53.f13551b).K0(-1L);
                long jLongValue = ((Long) this.f16134e.invoke(null, this.f16130a.f12375a)).longValue();
                s53.b();
                ((C1136f6) s53.f13551b).K0(jLongValue);
                return;
            case 10:
                h();
                return;
            case 11:
                S5 s54 = this.f16133d;
                try {
                    i3 = true != ((Boolean) this.f16134e.invoke(null, this.f16130a.f12375a)).booleanValue() ? 1 : 2;
                    s54.b();
                    ((C1136f6) s54.f13551b).s0(i3);
                    return;
                } catch (InvocationTargetException unused) {
                    s54.b();
                    ((C1136f6) s54.f13551b).s0(3);
                    return;
                }
            case 12:
                i();
                return;
            default:
                S5 s55 = this.f16133d;
                s55.g(3);
                boolean zBooleanValue = ((Boolean) this.f16134e.invoke(null, this.f16130a.f12375a)).booleanValue();
                synchronized (s55) {
                    try {
                        if (zBooleanValue) {
                            s55.g(2);
                        } else {
                            s55.g(1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246h7(X6 x6, S5 s5, int i3, int i6) {
        super(x6, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", s5, i3, 44);
        this.f14458h = i6;
        switch (i6) {
            case 2:
                super(x6, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", s5, i3, 22);
                break;
            case 3:
                super(x6, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", s5, i3, 1);
                break;
            case 4:
                super(x6, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", s5, i3, 33);
                break;
            case 5:
                super(x6, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", s5, i3, 89);
                break;
            case 6:
                super(x6, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", s5, i3, 49);
                break;
            case 7:
                super(x6, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", s5, i3, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(x6, "KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", s5, i3, 12);
                break;
            case 10:
                super(x6, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", s5, i3, 3);
                break;
            case 11:
                super(x6, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", s5, i3, 73);
                break;
            case 12:
                super(x6, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", s5, i3, 51);
                break;
            case 13:
                super(x6, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", s5, i3, 48);
                break;
        }
    }
}
