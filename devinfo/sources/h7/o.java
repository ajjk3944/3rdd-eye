package h7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements n, i7.a, l {

    /* renamed from: e, reason: collision with root package name */
    public final String f24967e;

    /* renamed from: f, reason: collision with root package name */
    public final x f24968f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24969h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24970i;
    public final i7.i j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.e f24971k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.i f24972l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.i f24973m;

    /* renamed from: n, reason: collision with root package name */
    public final i7.i f24974n;

    /* renamed from: o, reason: collision with root package name */
    public final i7.i f24975o;

    /* renamed from: p, reason: collision with root package name */
    public final i7.i f24976p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24978r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24963a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24964b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f24965c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f24966d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final c f24977q = new c(0);

    public o(x xVar, n7.a aVar, m7.h hVar) {
        this.f24968f = xVar;
        this.f24967e = hVar.f28908a;
        int i4 = hVar.f28909b;
        this.g = i4;
        this.f24969h = hVar.j;
        this.f24970i = hVar.f28916k;
        i7.i iVarG = hVar.f28910c.g();
        this.j = iVarG;
        i7.e eVarG = hVar.f28911d.g();
        this.f24971k = eVarG;
        i7.i iVarG2 = hVar.f28912e.g();
        this.f24972l = iVarG2;
        i7.i iVarG3 = hVar.g.g();
        this.f24974n = iVarG3;
        i7.i iVarG4 = hVar.f28915i.g();
        this.f24976p = iVarG4;
        if (i4 == 1) {
            this.f24973m = hVar.f28913f.g();
            this.f24975o = hVar.f28914h.g();
        } else {
            this.f24973m = null;
            this.f24975o = null;
        }
        aVar.e(iVarG);
        aVar.e(eVarG);
        aVar.e(iVarG2);
        aVar.e(iVarG3);
        aVar.e(iVarG4);
        if (i4 == 1) {
            aVar.e(this.f24973m);
            aVar.e(this.f24975o);
        }
        iVarG.a(this);
        eVarG.a(this);
        iVarG2.a(this);
        iVarG3.a(this);
        iVarG4.a(this);
        if (i4 == 1) {
            this.f24973m.a(this);
            this.f24975o.a(this);
        }
    }

    @Override // i7.a
    public final void a() {
        this.f24978r = false;
        this.f24968f.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        boolean z3;
        float f10;
        double d10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i4;
        double d11;
        boolean z10 = this.f24978r;
        Path path = this.f24963a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f24969h) {
            this.f24978r = true;
            return path;
        }
        int iC = i3.e.c(this.g);
        i7.e eVar = this.f24971k;
        i7.i iVar = this.f24974n;
        i7.i iVar2 = this.f24976p;
        i7.i iVar3 = this.f24972l;
        i7.i iVar4 = this.j;
        if (iC == 0) {
            z3 = true;
            float fFloatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d12 = fFloatValue;
            float f16 = (float) (6.283185307179586d / d12);
            if (this.f24970i) {
                f16 *= -1.0f;
            }
            float f17 = f16;
            float f18 = f17 / 2.0f;
            float f19 = fFloatValue - ((int) fFloatValue);
            if (f19 != 0.0f) {
                f10 = 2.0f;
                radians += (1.0f - f19) * f18;
            } else {
                f10 = 2.0f;
            }
            float fFloatValue2 = ((Float) iVar.e()).floatValue();
            float fFloatValue3 = ((Float) this.f24973m.e()).floatValue();
            i7.i iVar5 = this.f24975o;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fC = r5.c.c(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d13 = fC;
                f13 = fC;
                float fCos = (float) (Math.cos(radians) * d13);
                float fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                d10 = radians + ((f17 * f19) / f10);
                f11 = fCos;
                f12 = fSin;
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (Math.sin(radians) * d14);
                path.moveTo(fCos2, fSin2);
                d10 = radians + f18;
                f11 = fCos2;
                f12 = fSin2;
                f13 = 0.0f;
            }
            double dCeil = Math.ceil(d12) * 2.0d;
            double d15 = d10;
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                double d16 = i10;
                if (d16 >= dCeil) {
                    break;
                }
                float f20 = z11 ? fFloatValue2 : fFloatValue3;
                float f21 = (f13 == 0.0f || d16 != dCeil - 2.0d) ? f18 : (f17 * f19) / f10;
                if (f13 != 0.0f && d16 == dCeil - 1.0d) {
                    f20 = f13;
                }
                double d17 = f20;
                float fCos3 = (float) (Math.cos(d15) * d17);
                float fSin3 = (float) (Math.sin(d15) * d17);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f14 = f19;
                    f15 = fCos3;
                } else {
                    f14 = f19;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f22 = f11;
                    float f23 = f12;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f24 = z11 ? fFloatValue4 : fFloatValue5;
                    float f25 = z11 ? fFloatValue5 : fFloatValue4;
                    float f26 = (z11 ? fFloatValue3 : fFloatValue2) * f24 * 0.47829f;
                    float f27 = fCos4 * f26;
                    float f28 = f26 * fSin4;
                    float f29 = (z11 ? fFloatValue2 : fFloatValue3) * f25 * 0.47829f;
                    float f30 = fCos5 * f29;
                    float f31 = f29 * fSin5;
                    if (f19 != 0.0f) {
                        if (i10 == 0) {
                            f27 *= f14;
                            f28 *= f14;
                        } else if (d16 == dCeil - 1.0d) {
                            f30 *= f14;
                            f31 *= f14;
                        }
                    }
                    f15 = fCos3;
                    path = path2;
                    path.cubicTo(f22 - f27, f23 - f28, f30 + fCos3, fSin3 + f31, f15, fSin3);
                }
                d15 += f21;
                z11 = !z11;
                i10++;
                f11 = f15;
                f12 = fSin3;
                f19 = f14;
                f10 = 2.0f;
            }
            PointF pointF = (PointF) eVar.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iC != 1) {
            z3 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d18 = iFloor;
            float fFloatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.e()).floatValue();
            double d19 = fFloatValue7;
            z3 = true;
            float fCos6 = (float) (Math.cos(radians2) * d19);
            float fSin6 = (float) (Math.sin(radians2) * d19);
            path.moveTo(fCos6, fSin6);
            double d20 = (float) (6.283185307179586d / d18);
            double dCeil2 = Math.ceil(d18);
            double d21 = radians2 + d20;
            int i11 = 0;
            while (true) {
                double d22 = i11;
                if (d22 >= dCeil2) {
                    break;
                }
                double d23 = dCeil2;
                float fCos7 = (float) (Math.cos(d21) * d19);
                float fSin7 = (float) (Math.sin(d21) * d19);
                if (fFloatValue6 != 0.0f) {
                    i4 = i11;
                    Path path3 = path;
                    d11 = d19;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f33 = f32 * fCos8;
                    float f34 = f32 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f32;
                    float fSin9 = f32 * ((float) Math.sin(dAtan24));
                    if (d22 == d23 - 1.0d) {
                        Path path4 = this.f24964b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f35 = fCos6 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos7 + fCos9;
                        float f38 = fSin7 + fSin9;
                        path4.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f24965c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f24966d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f35, f36, f37, f38, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f39 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f33, fSin6 - f34, fCos7 + fCos9, f39, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i4 = i11;
                    d11 = d19;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d22 == d23 - 1.0d) {
                        i11 = i4 + 1;
                        dCeil2 = d23;
                        d19 = d11;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d21 += d20;
                i11 = i4 + 1;
                dCeil2 = d23;
                d19 = d11;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f24977q.a(path);
        this.f24978r = z3;
        return path;
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i4 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f25012c == 1) {
                    this.f24977q.f24902a.add(uVar);
                    uVar.e(this);
                }
            }
            i4++;
        }
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        i7.i iVar;
        i7.i iVar2;
        if (obj == b0.f23710u) {
            this.j.j(oVar);
            return;
        }
        if (obj == b0.f23711v) {
            this.f24972l.j(oVar);
            return;
        }
        if (obj == b0.f23699i) {
            this.f24971k.j(oVar);
            return;
        }
        if (obj == b0.f23712w && (iVar2 = this.f24973m) != null) {
            iVar2.j(oVar);
            return;
        }
        if (obj == b0.f23713x) {
            this.f24974n.j(oVar);
            return;
        }
        if (obj == b0.f23714y && (iVar = this.f24975o) != null) {
            iVar.j(oVar);
        } else if (obj == b0.f23715z) {
            this.f24976p.j(oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f24967e;
    }
}
