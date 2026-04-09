package t8;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import r8.z;
import z8.w;

/* loaded from: classes.dex */
public final class p implements n, u8.a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f22614e;

    /* renamed from: f, reason: collision with root package name */
    public final r8.v f22615f;

    /* renamed from: g, reason: collision with root package name */
    public final z8.l f22616g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22617h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22618i;
    public final u8.h j;
    public final u8.d k;

    /* renamed from: l, reason: collision with root package name */
    public final u8.h f22619l;

    /* renamed from: m, reason: collision with root package name */
    public final u8.h f22620m;

    /* renamed from: n, reason: collision with root package name */
    public final u8.h f22621n;

    /* renamed from: o, reason: collision with root package name */
    public final u8.h f22622o;

    /* renamed from: p, reason: collision with root package name */
    public final u8.h f22623p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22625r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f22610a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f22611b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f22612c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f22613d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final fh.f f22624q = new fh.f(3);

    public p(r8.v vVar, a9.b bVar, z8.m mVar) {
        this.f22615f = vVar;
        this.f22614e = mVar.f26741a;
        z8.l lVar = mVar.f26742b;
        this.f22616g = lVar;
        this.f22617h = mVar.j;
        this.f22618i = mVar.k;
        u8.h hVarE0 = mVar.f26743c.E0();
        this.j = hVarE0;
        u8.d dVarE0 = mVar.f26744d.E0();
        this.k = dVarE0;
        u8.h hVarE02 = mVar.f26745e.E0();
        this.f22619l = hVarE02;
        u8.h hVarE03 = mVar.f26747g.E0();
        this.f22621n = hVarE03;
        u8.h hVarE04 = mVar.f26749i.E0();
        this.f22623p = hVarE04;
        z8.l lVar2 = z8.l.STAR;
        if (lVar == lVar2) {
            this.f22620m = mVar.f26746f.E0();
            this.f22622o = mVar.f26748h.E0();
        } else {
            this.f22620m = null;
            this.f22622o = null;
        }
        bVar.e(hVarE0);
        bVar.e(dVarE0);
        bVar.e(hVarE02);
        bVar.e(hVarE03);
        bVar.e(hVarE04);
        if (lVar == lVar2) {
            bVar.e(this.f22620m);
            bVar.e(this.f22622o);
        }
        hVarE0.a(this);
        dVarE0.a(this);
        hVarE02.a(this);
        hVarE03.a(this);
        hVarE04.a(this);
        if (lVar == lVar2) {
            this.f22620m.a(this);
            this.f22622o.a(this);
        }
    }

    @Override // u8.a
    public final void a() {
        this.f22625r = false;
        this.f22615f.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f22661c == w.SIMULTANEOUSLY) {
                    this.f22624q.f8871a.add(vVar);
                    vVar.c(this);
                }
            }
            i10++;
        }
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        u8.h hVar;
        u8.h hVar2;
        if (obj == z.f21419u) {
            this.j.k(eVar);
            return;
        }
        if (obj == z.f21420v) {
            this.f22619l.k(eVar);
            return;
        }
        if (obj == z.f21409i) {
            this.k.k(eVar);
            return;
        }
        if (obj == z.f21421w && (hVar2 = this.f22620m) != null) {
            hVar2.k(eVar);
            return;
        }
        if (obj == z.f21422x) {
            this.f22621n.k(eVar);
            return;
        }
        if (obj == z.f21423y && (hVar = this.f22622o) != null) {
            hVar.k(eVar);
        } else if (obj == z.f21424z) {
            this.f22623p.k(eVar);
        }
    }

    @Override // t8.n
    public final Path g() {
        boolean z10;
        float f10;
        double d6;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        double d10;
        boolean z11 = this.f22625r;
        Path path = this.f22610a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f22617h) {
            this.f22625r = true;
            return path;
        }
        int i11 = o.f22609a[this.f22616g.ordinal()];
        u8.d dVar = this.k;
        u8.h hVar = this.f22621n;
        u8.h hVar2 = this.f22623p;
        u8.h hVar3 = this.f22619l;
        u8.h hVar4 = this.j;
        if (i11 == 1) {
            z10 = true;
            float fFloatValue = ((Float) hVar4.f()).floatValue();
            double radians = Math.toRadians((hVar3 != null ? ((Float) hVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d11 = fFloatValue;
            float f16 = (float) (6.283185307179586d / d11);
            if (this.f22618i) {
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
            float fFloatValue2 = ((Float) hVar.f()).floatValue();
            float fFloatValue3 = ((Float) this.f22620m.f()).floatValue();
            u8.h hVar5 = this.f22622o;
            float fFloatValue4 = hVar5 != null ? ((Float) hVar5.f()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = hVar2 != null ? ((Float) hVar2.f()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fA = c7.a.a(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d12 = fA;
                f13 = fA;
                float fCos = (float) (Math.cos(radians) * d12);
                float fSin = (float) (Math.sin(radians) * d12);
                path.moveTo(fCos, fSin);
                d6 = radians + ((f17 * f19) / f10);
                f11 = fCos;
                f12 = fSin;
            } else {
                double d13 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d13);
                float fSin2 = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos2, fSin2);
                d6 = radians + f18;
                f11 = fCos2;
                f12 = fSin2;
                f13 = 0.0f;
            }
            double dCeil = Math.ceil(d11) * 2.0d;
            double d14 = d6;
            int i12 = 0;
            boolean z12 = false;
            while (true) {
                double d15 = i12;
                if (d15 >= dCeil) {
                    break;
                }
                float f20 = z12 ? fFloatValue2 : fFloatValue3;
                float f21 = (f13 == 0.0f || d15 != dCeil - 2.0d) ? f18 : (f17 * f19) / f10;
                if (f13 != 0.0f && d15 == dCeil - 1.0d) {
                    f20 = f13;
                }
                double d16 = f20;
                float fCos3 = (float) (Math.cos(d14) * d16);
                float fSin3 = (float) (Math.sin(d14) * d16);
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
                    float f24 = z12 ? fFloatValue4 : fFloatValue5;
                    float f25 = z12 ? fFloatValue5 : fFloatValue4;
                    float f26 = (z12 ? fFloatValue3 : fFloatValue2) * f24 * 0.47829f;
                    float f27 = fCos4 * f26;
                    float f28 = f26 * fSin4;
                    float f29 = (z12 ? fFloatValue2 : fFloatValue3) * f25 * 0.47829f;
                    float f30 = fCos5 * f29;
                    float f31 = f29 * fSin5;
                    if (f19 != 0.0f) {
                        if (i12 == 0) {
                            f27 *= f14;
                            f28 *= f14;
                        } else if (d15 == dCeil - 1.0d) {
                            f30 *= f14;
                            f31 *= f14;
                        }
                    }
                    f15 = fCos3;
                    path = path2;
                    path.cubicTo(f22 - f27, f23 - f28, f30 + fCos3, fSin3 + f31, f15, fSin3);
                }
                d14 += f21;
                z12 = !z12;
                i12++;
                f11 = f15;
                f12 = fSin3;
                f19 = f14;
                f10 = 2.0f;
            }
            PointF pointF = (PointF) dVar.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i11 != 2) {
            z10 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) hVar4.f()).floatValue());
            double radians2 = Math.toRadians((hVar3 != null ? ((Float) hVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d17 = iFloor;
            float fFloatValue6 = ((Float) hVar2.f()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) hVar.f()).floatValue();
            double d18 = fFloatValue7;
            z10 = true;
            float fCos6 = (float) (Math.cos(radians2) * d18);
            float fSin6 = (float) (Math.sin(radians2) * d18);
            path.moveTo(fCos6, fSin6);
            double d19 = (float) (6.283185307179586d / d17);
            double dCeil2 = Math.ceil(d17);
            double d20 = radians2 + d19;
            int i13 = 0;
            while (true) {
                double d21 = i13;
                if (d21 >= dCeil2) {
                    break;
                }
                double d22 = dCeil2;
                float fCos7 = (float) (Math.cos(d20) * d18);
                float fSin7 = (float) (Math.sin(d20) * d18);
                if (fFloatValue6 != 0.0f) {
                    i10 = i13;
                    Path path3 = path;
                    d10 = d18;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f33 = f32 * fCos8;
                    float f34 = f32 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f32;
                    float fSin9 = f32 * ((float) Math.sin(dAtan24));
                    if (d21 == d22 - 1.0d) {
                        Path path4 = this.f22611b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f35 = fCos6 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos7 + fCos9;
                        float f38 = fSin7 + fSin9;
                        path4.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f22612c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f22613d;
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
                    i10 = i13;
                    d10 = d18;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d21 == d22 - 1.0d) {
                        i13 = i10 + 1;
                        dCeil2 = d22;
                        d18 = d10;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d20 += d19;
                i13 = i10 + 1;
                dCeil2 = d22;
                d18 = d10;
            }
            PointF pointF2 = (PointF) dVar.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f22624q.e(path);
        this.f22625r = z10;
        return path;
    }

    @Override // t8.c
    public final String getName() {
        return this.f22614e;
    }
}
