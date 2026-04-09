package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ri3 extends ti3 {
    public final /* synthetic */ int f = 0;
    public final Map g;
    public final Object h;
    public final Object i;

    public ri3(fr1 fr1Var, gi3 gi3Var, Map map, DisplayMetrics displayMetrics, gk3 gk3Var) {
        super("gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z", "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA=", fr1Var, gi3Var, gk3Var.a(123));
        this.h = gi3Var;
        this.g = map;
        this.i = displayMetrics;
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) {
        Object[] objArr;
        switch (this.f) {
            case 0:
                eg3 eg3Var = (eg3) this.h;
                Integer numValueOf = Integer.valueOf(eg3Var.ordinal());
                Context context = (Context) this.i;
                Object obj = this.g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr2 = (Object[]) method.invoke("", numValueOf, context, obj);
                objArr2.getClass();
                synchronized (fr1Var) {
                    try {
                        if (eg3Var == eg3.f) {
                            Object obj2 = objArr2[0];
                            if (obj2 == null) {
                                obj2 = obj;
                            }
                            long jLongValue = ((Long) obj2).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).B(jLongValue);
                            Object obj3 = objArr2[1];
                            long jLongValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).C(jLongValue2);
                        }
                        long jLongValue3 = ((Long) objArr2[2]).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).K0(jLongValue3);
                        long jLongValue4 = ((Long) objArr2[3]).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).b0(jLongValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr3 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr3.getClass();
                mr1 mr1VarA = nr1.A();
                Object obj4 = objArr3[0];
                boolean z = true;
                if (obj4 != null && objArr3[1] != null) {
                    long jLongValue5 = ((Long) obj4).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).B(jLongValue5);
                    long jLongValue6 = ((Long) objArr3[1]).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).C(jLongValue6);
                }
                Object obj5 = objArr3[2];
                if (obj5 != null) {
                    long jLongValue7 = ((Long) obj5).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).I(jLongValue7);
                }
                Object obj6 = objArr3[3];
                if (obj6 != null) {
                    long jLongValue8 = ((Long) obj6).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).G(jLongValue8);
                }
                Object obj7 = objArr3[4];
                if (obj7 != null) {
                    long jLongValue9 = ((Long) obj7).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).D(jLongValue9);
                }
                Object obj8 = objArr3[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).T(i);
                }
                Object obj9 = objArr3[6];
                if (obj9 != null) {
                    long jLongValue10 = ((Long) obj9).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).K(jLongValue10);
                }
                Object obj10 = objArr3[7];
                if (obj10 != null) {
                    long jLongValue11 = ((Long) obj10).longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).J(jLongValue11);
                }
                Object obj11 = objArr3[8];
                if (obj11 != null) {
                    int i2 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).U(i2);
                }
                synchronized (fr1Var) {
                    try {
                        Method methodB = ((gi3) this.h).b("TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v", "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj12 = objArr[0];
                        if (obj12 != null) {
                            long jLongValue12 = ((Long) obj12).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).L0(jLongValue12);
                        }
                        Object obj13 = objArr[1];
                        if (obj13 != null) {
                            long jLongValue13 = ((Long) obj13).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).M0(jLongValue13);
                        }
                        Object obj14 = objArr[2];
                        if (obj14 != null) {
                            long jLongValue14 = ((Long) obj14).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).N0(jLongValue14);
                        }
                        Object obj15 = objArr[3];
                        if (obj15 != null) {
                            long jLongValue15 = ((Long) obj15).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).G(jLongValue15);
                        }
                        Object obj16 = objArr[4];
                        if (obj16 != null) {
                            long jLongValue16 = ((Long) obj16).longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).H(jLongValue16);
                        }
                        qh3 qh3Var = (qh3) map.get("oe");
                        if (qh3Var != null) {
                            long j = qh3Var.a;
                            if (j > 0) {
                                fr1Var.b();
                                ((qr1) fr1Var.g).K(j);
                            }
                            long j2 = qh3Var.b;
                            if (j2 > 0) {
                                fr1Var.b();
                                ((qr1) fr1Var.g).J(j2);
                            }
                            long j3 = qh3Var.c;
                            if (j3 > 0) {
                                fr1Var.b();
                                ((qr1) fr1Var.g).I(j3);
                            }
                            long j4 = qh3Var.d;
                            if (j4 > 0) {
                                fr1Var.b();
                                ((qr1) fr1Var.g).L(j4);
                            }
                        }
                        qh3 qh3Var2 = (qh3) map.get("oe");
                        if (qh3Var2 != null && qh3Var2.a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d = qh3Var2.g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d / displayMetrics.density);
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).M(jRound);
                                long jRound2 = Math.round((qh3Var2.j - qh3Var2.h) / displayMetrics.density);
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).N(jRound2);
                                long jRound3 = Math.round((qh3Var2.k - qh3Var2.i) / displayMetrics.density);
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).O(jRound3);
                                long jRound4 = Math.round(qh3Var2.h / displayMetrics.density);
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).R(jRound4);
                                long jRound5 = Math.round(qh3Var2.i / displayMetrics.density);
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).S(jRound5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long jRound6 = Math.round((((qh3Var2.h - qh3Var2.j) + r7.getRawX()) - r7.getX()) / displayMetrics.density);
                                    if (jRound6 != 0) {
                                        mr1VarA.b();
                                        ((nr1) mr1VarA.g).P(jRound6);
                                    }
                                    long jRound7 = Math.round((((qh3Var2.i - qh3Var2.k) + r7.getRawY()) - r7.getY()) / displayMetrics.density);
                                    if (jRound7 != 0) {
                                        mr1VarA.b();
                                        ((nr1) mr1VarA.g).Q(jRound7);
                                    }
                                }
                            }
                        }
                        fr1Var.b();
                        ((qr1) fr1Var.g).T((nr1) mr1VarA.d());
                        rh3[] rh3VarArr = (rh3[]) map.get("ro");
                        if (rh3VarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z = false;
                            }
                            if (z) {
                                for (int i3 = 0; i3 <= rh3VarArr.length - 2; i3++) {
                                    rh3 rh3Var = rh3VarArr[i3];
                                    mr1 mr1VarA2 = nr1.A();
                                    double d2 = rh3Var.a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d2 / displayMetrics.density);
                                    mr1VarA2.b();
                                    ((nr1) mr1VarA2.g).B(jRound8);
                                    long jRound9 = Math.round(rh3Var.b / displayMetrics.density);
                                    mr1VarA2.b();
                                    ((nr1) mr1VarA2.g).C(jRound9);
                                    nr1 nr1Var = (nr1) mr1VarA2.d();
                                    fr1Var.b();
                                    ((qr1) fr1Var.g).U(nr1Var);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public ri3(fr1 fr1Var, gi3 gi3Var, eg3 eg3Var, Context context, Map map, gk3 gk3Var) {
        super("3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ", "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I=", fr1Var, gi3Var, gk3Var.a(121));
        this.h = eg3Var;
        this.i = context;
        this.g = map;
    }
}
