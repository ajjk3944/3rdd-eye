package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e01 extends h01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10658f = 0;
    public final Map g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10659h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10660i;

    public e01(zc zcVar, sz0 sz0Var, zx0 zx0Var, Context context, Map map, g21 g21Var) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", zcVar, sz0Var, g21Var.a(121));
        this.f10659h = zx0Var;
        this.f10660i = context;
        this.g = map;
    }

    private final void b(Method method, zc zcVar) {
        zx0 zx0Var = (zx0) this.f10659h;
        Integer numValueOf = Integer.valueOf(zx0Var.ordinal());
        Context context = (Context) this.f10660i;
        Object obj = this.g.get("up");
        Boolean bool = Boolean.TRUE;
        if (obj == null) {
            obj = bool;
        }
        Object[] objArr = (Object[]) method.invoke("", numValueOf, context, obj);
        objArr.getClass();
        synchronized (zcVar) {
            try {
                if (zx0Var == zx0.f19228a) {
                    Object obj2 = objArr[0];
                    if (obj2 == null) {
                        obj2 = obj;
                    }
                    long jLongValue = ((Long) obj2).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).B(jLongValue);
                    Object obj3 = objArr[1];
                    long jLongValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).C(jLongValue2);
                }
                long jLongValue3 = ((Long) objArr[2]).longValue();
                zcVar.b();
                ((md) zcVar.f14755b).K0(jLongValue3);
                long jLongValue4 = ((Long) objArr[3]).longValue();
                zcVar.b();
                ((md) zcVar.f14755b).b0(jLongValue4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) {
        Object[] objArr;
        switch (this.f10658f) {
            case 0:
                b(method, zcVar);
                return;
            default:
                Map map = this.g;
                Object obj = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.f10660i;
                Object[] objArr2 = (Object[]) method.invoke("", obj, displayMetrics);
                objArr2.getClass();
                id idVarA = jd.A();
                Object obj2 = objArr2[0];
                if (obj2 != null && objArr2[1] != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).B(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).C(jLongValue2);
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    long jLongValue3 = ((Long) obj3).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).I(jLongValue3);
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    long jLongValue4 = ((Long) obj4).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).G(jLongValue4);
                }
                Object obj5 = objArr2[4];
                if (obj5 != null) {
                    long jLongValue5 = ((Long) obj5).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).D(jLongValue5);
                }
                Object obj6 = objArr2[5];
                if (obj6 != null) {
                    int i4 = ((Long) obj6).longValue() != 0 ? 2 : 1;
                    idVarA.b();
                    ((jd) idVarA.f14755b).T(i4);
                }
                Object obj7 = objArr2[6];
                if (obj7 != null) {
                    long jLongValue6 = ((Long) obj7).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).K(jLongValue6);
                }
                Object obj8 = objArr2[7];
                if (obj8 != null) {
                    long jLongValue7 = ((Long) obj8).longValue();
                    idVarA.b();
                    ((jd) idVarA.f14755b).J(jLongValue7);
                }
                Object obj9 = objArr2[8];
                if (obj9 != null) {
                    int i10 = ((Long) obj9).longValue() != 0 ? 2 : 1;
                    idVarA.b();
                    ((jd) idVarA.f14755b).U(i10);
                }
                synchronized (zcVar) {
                    try {
                        Method methodB = ((sz0) this.f10659h).b("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj10 = objArr[0];
                        if (obj10 != null) {
                            long jLongValue8 = ((Long) obj10).longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).L0(jLongValue8);
                        }
                        Object obj11 = objArr[1];
                        if (obj11 != null) {
                            long jLongValue9 = ((Long) obj11).longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).M0(jLongValue9);
                        }
                        Object obj12 = objArr[2];
                        if (obj12 != null) {
                            long jLongValue10 = ((Long) obj12).longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).N0(jLongValue10);
                        }
                        Object obj13 = objArr[3];
                        if (obj13 != null) {
                            long jLongValue11 = ((Long) obj13).longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).G(jLongValue11);
                        }
                        Object obj14 = objArr[4];
                        if (obj14 != null) {
                            long jLongValue12 = ((Long) obj14).longValue();
                            zcVar.b();
                            ((md) zcVar.f14755b).H(jLongValue12);
                        }
                        gz0 gz0Var = (gz0) map.get("oe");
                        if (gz0Var != null) {
                            long j = gz0Var.f11660a;
                            if (j > 0) {
                                zcVar.b();
                                ((md) zcVar.f14755b).K(j);
                            }
                            long j8 = gz0Var.f11661b;
                            if (j8 > 0) {
                                zcVar.b();
                                ((md) zcVar.f14755b).J(j8);
                            }
                            long j9 = gz0Var.f11662c;
                            if (j9 > 0) {
                                zcVar.b();
                                ((md) zcVar.f14755b).I(j9);
                            }
                            long j10 = gz0Var.f11663d;
                            if (j10 > 0) {
                                zcVar.b();
                                ((md) zcVar.f14755b).L(j10);
                            }
                        }
                        gz0 gz0Var2 = (gz0) map.get("oe");
                        if (gz0Var2 != null && gz0Var2.f11660a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d10 = gz0Var2.g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d10 / displayMetrics.density);
                                idVarA.b();
                                ((jd) idVarA.f14755b).M(jRound);
                                long jRound2 = Math.round((gz0Var2.j - gz0Var2.f11666h) / displayMetrics.density);
                                idVarA.b();
                                ((jd) idVarA.f14755b).N(jRound2);
                                long jRound3 = Math.round((gz0Var2.f11668k - gz0Var2.f11667i) / displayMetrics.density);
                                idVarA.b();
                                ((jd) idVarA.f14755b).O(jRound3);
                                long jRound4 = Math.round(gz0Var2.f11666h / displayMetrics.density);
                                idVarA.b();
                                ((jd) idVarA.f14755b).R(jRound4);
                                long jRound5 = Math.round(gz0Var2.f11667i / displayMetrics.density);
                                idVarA.b();
                                ((jd) idVarA.f14755b).S(jRound5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long jRound6 = Math.round((((gz0Var2.f11666h - gz0Var2.j) + r6.getRawX()) - r6.getX()) / displayMetrics.density);
                                    if (jRound6 != 0) {
                                        idVarA.b();
                                        ((jd) idVarA.f14755b).P(jRound6);
                                    }
                                    long jRound7 = Math.round((((gz0Var2.f11667i - gz0Var2.f11668k) + r6.getRawY()) - r6.getY()) / displayMetrics.density);
                                    if (jRound7 != 0) {
                                        idVarA.b();
                                        ((jd) idVarA.f14755b).Q(jRound7);
                                    }
                                }
                            }
                        }
                        zcVar.b();
                        ((md) zcVar.f14755b).T((jd) idVarA.e());
                        hz0[] hz0VarArr = (hz0[]) map.get("ro");
                        if (hz0VarArr != null) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                for (int i11 = 0; i11 <= hz0VarArr.length - 2; i11++) {
                                    hz0 hz0Var = hz0VarArr[i11];
                                    id idVarA2 = jd.A();
                                    double d11 = hz0Var.f12039a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d11 / displayMetrics.density);
                                    idVarA2.b();
                                    ((jd) idVarA2.f14755b).B(jRound8);
                                    long jRound9 = Math.round(hz0Var.f12040b / displayMetrics.density);
                                    idVarA2.b();
                                    ((jd) idVarA2.f14755b).C(jRound9);
                                    jd jdVar = (jd) idVarA2.e();
                                    zcVar.b();
                                    ((md) zcVar.f14755b).U(jdVar);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public e01(zc zcVar, sz0 sz0Var, Map map, DisplayMetrics displayMetrics, g21 g21Var) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", zcVar, sz0Var, g21Var.a(123));
        this.f10659h = sz0Var;
        this.g = map;
        this.f10660i = displayMetrics;
    }
}
