package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class el0 implements kk0, x9, v40 {
    public final String e;
    public final i90 f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final pu j;
    public final ba k;
    public final pu l;
    public final pu m;
    public final pu n;
    public final pu o;
    public final pu p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final ih q = new ih();

    public el0(i90 i90Var, da daVar, fl0 fl0Var) {
        this.f = i90Var;
        this.e = fl0Var.a;
        int i = fl0Var.b;
        this.g = i;
        this.h = fl0Var.j;
        this.i = fl0Var.k;
        pu puVarQ0 = fl0Var.c.Q0();
        this.j = puVarQ0;
        ba baVarQ0 = fl0Var.d.Q0();
        this.k = baVarQ0;
        pu puVarQ02 = fl0Var.e.Q0();
        this.l = puVarQ02;
        pu puVarQ03 = fl0Var.g.Q0();
        this.n = puVarQ03;
        pu puVarQ04 = fl0Var.i.Q0();
        this.p = puVarQ04;
        if (i == 1) {
            this.m = fl0Var.f.Q0();
            this.o = fl0Var.h.Q0();
        } else {
            this.m = null;
            this.o = null;
        }
        daVar.e(puVarQ0);
        daVar.e(baVarQ0);
        daVar.e(puVarQ02);
        daVar.e(puVarQ03);
        daVar.e(puVarQ04);
        if (i == 1) {
            daVar.e(this.m);
            daVar.e(this.o);
        }
        puVarQ0.a(this);
        baVarQ0.a(this);
        puVarQ02.a(this);
        puVarQ03.a(this);
        puVarQ04.a(this);
        if (i == 1) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        pu puVar;
        pu puVar2;
        if (obj == n90.r) {
            this.j.j(vq2Var);
            return;
        }
        if (obj == n90.s) {
            this.l.j(vq2Var);
            return;
        }
        if (obj == n90.i) {
            this.k.j(vq2Var);
            return;
        }
        if (obj == n90.t && (puVar2 = this.m) != null) {
            puVar2.j(vq2Var);
            return;
        }
        if (obj == n90.u) {
            this.n.j(vq2Var);
            return;
        }
        if (obj == n90.v && (puVar = this.o) != null) {
            puVar.j(vq2Var);
        } else if (obj == n90.w) {
            this.p.j(vq2Var);
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            vi viVar = (vi) arrayList.get(i);
            if (viVar instanceof e31) {
                e31 e31Var = (e31) viVar;
                if (e31Var.c == 1) {
                    this.q.a.add(e31Var);
                    e31Var.a(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.kk0
    public final Path f() {
        boolean z;
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        double d2;
        boolean z2 = this.r;
        Path path = this.a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int iS = ex0.s(this.g);
        ba baVar = this.k;
        pu puVar = this.n;
        pu puVar2 = this.p;
        pu puVar3 = this.l;
        pu puVar4 = this.j;
        if (iS == 0) {
            z = true;
            float fFloatValue = ((Float) puVar4.e()).floatValue();
            double radians = Math.toRadians((puVar3 != null ? ((Float) puVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f7 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f7 *= -1.0f;
            }
            float f8 = f7;
            float f9 = f8 / 2.0f;
            float f10 = fFloatValue - ((int) fFloatValue);
            if (f10 != 0.0f) {
                f = 2.0f;
                radians += (1.0f - f10) * f9;
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) puVar.e()).floatValue();
            float fFloatValue3 = ((Float) this.m.e()).floatValue();
            pu puVar5 = this.o;
            float fFloatValue4 = puVar5 != null ? ((Float) puVar5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = puVar2 != null ? ((Float) puVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float fD = ex0.d(fFloatValue2, fFloatValue3, f10, fFloatValue3);
                double d4 = fD;
                f4 = fD;
                float fCos = (float) (Math.cos(radians) * d4);
                float fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((f8 * f10) / f);
                f2 = fCos;
                f3 = fSin;
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (Math.sin(radians) * d5);
                path.moveTo(fCos2, fSin2);
                d = radians + f9;
                f2 = fCos2;
                f3 = fSin2;
                f4 = 0.0f;
            }
            double dCeil = Math.ceil(d3) * 2.0d;
            double d6 = d;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                double d7 = i2;
                if (d7 >= dCeil) {
                    break;
                }
                float f11 = z3 ? fFloatValue2 : fFloatValue3;
                float f12 = (f4 == 0.0f || d7 != dCeil - 2.0d) ? f9 : (f8 * f10) / f;
                if (f4 != 0.0f && d7 == dCeil - 1.0d) {
                    f11 = f4;
                }
                double d8 = f11;
                float fCos3 = (float) (Math.cos(d6) * d8);
                float fSin3 = (float) (Math.sin(d6) * d8);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f5 = f10;
                    f6 = fCos3;
                } else {
                    f5 = f10;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f13 = f2;
                    float f14 = f3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f15 = z3 ? fFloatValue4 : fFloatValue5;
                    float f16 = z3 ? fFloatValue5 : fFloatValue4;
                    float f17 = (z3 ? fFloatValue3 : fFloatValue2) * f15 * 0.47829f;
                    float f18 = fCos4 * f17;
                    float f19 = f17 * fSin4;
                    float f20 = (z3 ? fFloatValue2 : fFloatValue3) * f16 * 0.47829f;
                    float f21 = fCos5 * f20;
                    float f22 = f20 * fSin5;
                    if (f10 != 0.0f) {
                        if (i2 == 0) {
                            f18 *= f5;
                            f19 *= f5;
                        } else if (d7 == dCeil - 1.0d) {
                            f21 *= f5;
                            f22 *= f5;
                        }
                    }
                    f6 = fCos3;
                    path = path2;
                    path.cubicTo(f13 - f18, f14 - f19, f21 + fCos3, fSin3 + f22, f6, fSin3);
                }
                d6 += f12;
                z3 = !z3;
                i2++;
                f2 = f6;
                f3 = fSin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF pointF = (PointF) baVar.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iS != 1) {
            z = true;
        } else {
            int iFloor = (int) Math.floor(((Float) puVar4.e()).floatValue());
            double radians2 = Math.toRadians((puVar3 != null ? ((Float) puVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d9 = iFloor;
            float fFloatValue6 = ((Float) puVar2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) puVar.e()).floatValue();
            double d10 = fFloatValue7;
            z = true;
            float fCos6 = (float) (Math.cos(radians2) * d10);
            float fSin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(fCos6, fSin6);
            double d11 = (float) (6.283185307179586d / d9);
            double dCeil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i3 = 0;
            while (true) {
                double d13 = i3;
                if (d13 >= dCeil2) {
                    break;
                }
                double d14 = dCeil2;
                float fCos7 = (float) (Math.cos(d12) * d10);
                float fSin7 = (float) (Math.sin(d12) * d10);
                if (fFloatValue6 != 0.0f) {
                    i = i3;
                    Path path3 = path;
                    d2 = d10;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f23 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f24 = f23 * fCos8;
                    float f25 = f23 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f23;
                    float fSin9 = f23 * ((float) Math.sin(dAtan24));
                    if (d13 == d14 - 1.0d) {
                        Path path4 = this.b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f26 = fCos6 - f24;
                        float f27 = fSin6 - f25;
                        float f28 = fCos7 + fCos9;
                        float f29 = fSin7 + fSin9;
                        path4.cubicTo(f26, f27, f28, f29, fCos7, fSin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f26, f27, f28, f29, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f30 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f24, fSin6 - f25, fCos7 + fCos9, f30, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i3;
                    d2 = d10;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d13 == d14 - 1.0d) {
                        i3 = i + 1;
                        dCeil2 = d14;
                        d10 = d2;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d12 += d11;
                i3 = i + 1;
                dCeil2 = d14;
                d10 = d2;
            }
            PointF pointF2 = (PointF) baVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.a(path);
        this.r = z;
        return path;
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }
}
