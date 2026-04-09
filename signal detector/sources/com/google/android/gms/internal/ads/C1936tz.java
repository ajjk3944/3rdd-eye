package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936tz extends AbstractC2098wz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17014f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Map f17015g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f17016h;
    public final Object i;

    public C1936tz(S5 s5, C1291hz c1291hz, EnumC1450ky enumC1450ky, Context context, Map map, C1948uA c1948uA) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", s5, c1291hz, c1948uA.a(121));
        this.f17016h = enumC1450ky;
        this.i = context;
        this.f17015g = map;
    }

    private final void b(Method method, S5 s5) {
        EnumC1450ky enumC1450ky = (EnumC1450ky) this.f17016h;
        Integer numValueOf = Integer.valueOf(enumC1450ky.ordinal());
        Context context = (Context) this.i;
        Object obj = this.f17015g.get("up");
        Boolean bool = Boolean.TRUE;
        if (obj == null) {
            obj = bool;
        }
        Object[] objArr = (Object[]) method.invoke("", numValueOf, context, obj);
        objArr.getClass();
        synchronized (s5) {
            try {
                if (enumC1450ky == EnumC1450ky.f15315a) {
                    Object obj2 = objArr[0];
                    if (obj2 == null) {
                        obj2 = obj;
                    }
                    long jLongValue = ((Long) obj2).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).B(jLongValue);
                    Object obj3 = objArr[1];
                    long jLongValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).C(jLongValue2);
                }
                long jLongValue3 = ((Long) objArr[2]).longValue();
                s5.b();
                ((C1136f6) s5.f13551b).K0(jLongValue3);
                long jLongValue4 = ((Long) objArr[3]).longValue();
                s5.b();
                ((C1136f6) s5.f13551b).b0(jLongValue4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) {
        Object[] objArr;
        switch (this.f17014f) {
            case 0:
                b(method, s5);
                return;
            default:
                Map map = this.f17015g;
                Object obj = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", obj, displayMetrics);
                objArr2.getClass();
                C0918b6 c0918b6A = C0972c6.A();
                Object obj2 = objArr2[0];
                if (obj2 != null && objArr2[1] != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).B(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).C(jLongValue2);
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    long jLongValue3 = ((Long) obj3).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).I(jLongValue3);
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    long jLongValue4 = ((Long) obj4).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).G(jLongValue4);
                }
                Object obj5 = objArr2[4];
                if (obj5 != null) {
                    long jLongValue5 = ((Long) obj5).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).D(jLongValue5);
                }
                Object obj6 = objArr2[5];
                if (obj6 != null) {
                    int i = ((Long) obj6).longValue() != 0 ? 2 : 1;
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).T(i);
                }
                Object obj7 = objArr2[6];
                if (obj7 != null) {
                    long jLongValue6 = ((Long) obj7).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).K(jLongValue6);
                }
                Object obj8 = objArr2[7];
                if (obj8 != null) {
                    long jLongValue7 = ((Long) obj8).longValue();
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).J(jLongValue7);
                }
                Object obj9 = objArr2[8];
                if (obj9 != null) {
                    int i3 = ((Long) obj9).longValue() != 0 ? 2 : 1;
                    c0918b6A.b();
                    ((C0972c6) c0918b6A.f13551b).U(i3);
                }
                synchronized (s5) {
                    try {
                        Method methodB = ((C1291hz) this.f17016h).b("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj10 = objArr[0];
                        if (obj10 != null) {
                            long jLongValue8 = ((Long) obj10).longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).L0(jLongValue8);
                        }
                        Object obj11 = objArr[1];
                        if (obj11 != null) {
                            long jLongValue9 = ((Long) obj11).longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).M0(jLongValue9);
                        }
                        Object obj12 = objArr[2];
                        if (obj12 != null) {
                            long jLongValue10 = ((Long) obj12).longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).N0(jLongValue10);
                        }
                        Object obj13 = objArr[3];
                        if (obj13 != null) {
                            long jLongValue11 = ((Long) obj13).longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).G(jLongValue11);
                        }
                        Object obj14 = objArr[4];
                        if (obj14 != null) {
                            long jLongValue12 = ((Long) obj14).longValue();
                            s5.b();
                            ((C1136f6) s5.f13551b).H(jLongValue12);
                        }
                        Ty ty = (Ty) map.get("oe");
                        if (ty != null) {
                            long j6 = ty.f11515a;
                            if (j6 > 0) {
                                s5.b();
                                ((C1136f6) s5.f13551b).K(j6);
                            }
                            long j7 = ty.f11516b;
                            if (j7 > 0) {
                                s5.b();
                                ((C1136f6) s5.f13551b).J(j7);
                            }
                            long j8 = ty.f11517c;
                            if (j8 > 0) {
                                s5.b();
                                ((C1136f6) s5.f13551b).I(j8);
                            }
                            long j9 = ty.f11518d;
                            if (j9 > 0) {
                                s5.b();
                                ((C1136f6) s5.f13551b).L(j9);
                            }
                        }
                        Ty ty2 = (Ty) map.get("oe");
                        if (ty2 != null && ty2.f11515a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d6 = ty2.f11521g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d6 / displayMetrics.density);
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).M(jRound);
                                long jRound2 = Math.round((ty2.f11523j - ty2.f11522h) / displayMetrics.density);
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).N(jRound2);
                                long jRound3 = Math.round((ty2.f11524k - ty2.i) / displayMetrics.density);
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).O(jRound3);
                                long jRound4 = Math.round(ty2.f11522h / displayMetrics.density);
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).R(jRound4);
                                long jRound5 = Math.round(ty2.i / displayMetrics.density);
                                c0918b6A.b();
                                ((C0972c6) c0918b6A.f13551b).S(jRound5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long jRound6 = Math.round((((ty2.f11522h - ty2.f11523j) + r6.getRawX()) - r6.getX()) / displayMetrics.density);
                                    if (jRound6 != 0) {
                                        c0918b6A.b();
                                        ((C0972c6) c0918b6A.f13551b).P(jRound6);
                                    }
                                    long jRound7 = Math.round((((ty2.i - ty2.f11524k) + r6.getRawY()) - r6.getY()) / displayMetrics.density);
                                    if (jRound7 != 0) {
                                        c0918b6A.b();
                                        ((C0972c6) c0918b6A.f13551b).Q(jRound7);
                                    }
                                }
                            }
                        }
                        s5.b();
                        ((C1136f6) s5.f13551b).T((C0972c6) c0918b6A.d());
                        Uy[] uyArr = (Uy[]) map.get("ro");
                        if (uyArr != null) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                for (int i6 = 0; i6 <= uyArr.length - 2; i6++) {
                                    Uy uy = uyArr[i6];
                                    C0918b6 c0918b6A2 = C0972c6.A();
                                    double d7 = uy.f11850a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d7 / displayMetrics.density);
                                    c0918b6A2.b();
                                    ((C0972c6) c0918b6A2.f13551b).B(jRound8);
                                    long jRound9 = Math.round(uy.f11851b / displayMetrics.density);
                                    c0918b6A2.b();
                                    ((C0972c6) c0918b6A2.f13551b).C(jRound9);
                                    C0972c6 c0972c6 = (C0972c6) c0918b6A2.d();
                                    s5.b();
                                    ((C1136f6) s5.f13551b).U(c0972c6);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public C1936tz(S5 s5, C1291hz c1291hz, Map map, DisplayMetrics displayMetrics, C1948uA c1948uA) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", s5, c1291hz, c1948uA.a(123));
        this.f17016h = c1291hz;
        this.f17015g = map;
        this.i = displayMetrics;
    }
}
