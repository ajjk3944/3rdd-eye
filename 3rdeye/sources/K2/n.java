package k2;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5271d;
import n2.C5351e;
import p2.j;
import p2.s;
import u2.C5628g;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public final class n implements m, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f43245e;

    /* renamed from: f, reason: collision with root package name */
    public final z f43246f;

    /* renamed from: g, reason: collision with root package name */
    public final j.a f43247g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f43248h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C5271d f43249j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC5268a<?, PointF> f43250k;

    /* renamed from: l, reason: collision with root package name */
    public final C5271d f43251l;

    /* renamed from: m, reason: collision with root package name */
    public final C5271d f43252m;

    /* renamed from: n, reason: collision with root package name */
    public final C5271d f43253n;

    /* renamed from: o, reason: collision with root package name */
    public final C5271d f43254o;

    /* renamed from: p, reason: collision with root package name */
    public final C5271d f43255p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f43257r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f43241a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f43242b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f43243c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f43244d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final C5211b f43256q = new C5211b();

    /* compiled from: PolystarContent.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43258a;

        static {
            int[] iArr = new int[j.a.values().length];
            f43258a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43258a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(z zVar, q2.b bVar, p2.j jVar) {
        this.f43246f = zVar;
        this.f43245e = jVar.f45048a;
        j.a aVar = jVar.f45049b;
        this.f43247g = aVar;
        this.f43248h = jVar.f45056j;
        this.i = jVar.f45057k;
        C5271d c5271dA = jVar.f45050c.a();
        this.f43249j = c5271dA;
        AbstractC5268a<PointF, PointF> abstractC5268aA = jVar.f45051d.a();
        this.f43250k = abstractC5268aA;
        C5271d c5271dA2 = jVar.f45052e.a();
        this.f43251l = c5271dA2;
        C5271d c5271dA3 = jVar.f45054g.a();
        this.f43253n = c5271dA3;
        C5271d c5271dA4 = jVar.i.a();
        this.f43255p = c5271dA4;
        j.a aVar2 = j.a.STAR;
        if (aVar == aVar2) {
            this.f43252m = jVar.f45053f.a();
            this.f43254o = jVar.f45055h.a();
        } else {
            this.f43252m = null;
            this.f43254o = null;
        }
        bVar.e(c5271dA);
        bVar.e(abstractC5268aA);
        bVar.e(c5271dA2);
        bVar.e(c5271dA3);
        bVar.e(c5271dA4);
        if (aVar == aVar2) {
            bVar.e(this.f43252m);
            bVar.e(this.f43254o);
        }
        c5271dA.a(this);
        abstractC5268aA.a(this);
        c5271dA2.a(this);
        c5271dA3.a(this);
        c5271dA4.a(this);
        if (aVar == aVar2) {
            this.f43252m.a(this);
            this.f43254o.a(this);
        }
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43257r = false;
        this.f43246f.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(i);
            if (interfaceC5212c instanceof u) {
                u uVar = (u) interfaceC5212c;
                if (uVar.f43295c == s.a.SIMULTANEOUSLY) {
                    this.f43256q.f43173a.add(uVar);
                    uVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        C5271d c5271d;
        C5271d c5271d2;
        if (colorFilter == InterfaceC4433F.f38316r) {
            this.f43249j.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38317s) {
            this.f43251l.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.i) {
            this.f43250k.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38318t && (c5271d2 = this.f43252m) != null) {
            c5271d2.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38319u) {
            this.f43253n.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38320v && (c5271d = this.f43254o) != null) {
            c5271d.k(fVar);
        } else if (colorFilter == InterfaceC4433F.f38321w) {
            this.f43255p.k(fVar);
        }
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43245e;
    }

    @Override // k2.m
    public final Path getPath() {
        boolean z10;
        double d10;
        float f10;
        float f11;
        double d11;
        float fCos;
        float fSin;
        float f12;
        float f13;
        float f14;
        float f15;
        int i;
        int i10;
        double d12;
        boolean z11 = this.f43257r;
        Path path = this.f43241a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f43248h) {
            this.f43257r = true;
            return path;
        }
        int i11 = a.f43258a[this.f43247g.ordinal()];
        AbstractC5268a<?, PointF> abstractC5268a = this.f43250k;
        float f16 = 0.0f;
        C5271d c5271d = this.f43253n;
        C5271d c5271d2 = this.f43255p;
        C5271d c5271d3 = this.f43251l;
        C5271d c5271d4 = this.f43249j;
        if (i11 == 1) {
            z10 = true;
            float fFloatValue = c5271d4.f().floatValue();
            double radians = Math.toRadians((c5271d3 != null ? c5271d3.f().floatValue() : 0.0d) - 90.0d);
            double d13 = fFloatValue;
            float f17 = (float) (6.283185307179586d / d13);
            if (this.i) {
                f17 *= -1.0f;
            }
            float f18 = f17;
            float f19 = f18 / 2.0f;
            float f20 = fFloatValue - ((int) fFloatValue);
            if (f20 != 0.0f) {
                d10 = d13;
                radians += (1.0f - f20) * f19;
            } else {
                d10 = d13;
            }
            float fFloatValue2 = c5271d.f().floatValue();
            float fFloatValue3 = this.f43252m.f().floatValue();
            C5271d c5271d5 = this.f43254o;
            float fFloatValue4 = c5271d5 != null ? c5271d5.f().floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = c5271d2 != null ? c5271d2.f().floatValue() / 100.0f : 0.0f;
            if (f20 != 0.0f) {
                float fE = com.google.android.gms.measurement.internal.a.e(fFloatValue2, fFloatValue3, f20, fFloatValue3);
                double d14 = fE;
                fCos = (float) (Math.cos(radians) * d14);
                fSin = (float) (Math.sin(radians) * d14);
                path.moveTo(fCos, fSin);
                f10 = 2.0f;
                d11 = radians + ((f18 * f20) / 2.0f);
                f12 = fE;
                f11 = f19;
            } else {
                f10 = 2.0f;
                double d15 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d15);
                float fSin2 = (float) (Math.sin(radians) * d15);
                path.moveTo(fCos2, fSin2);
                f11 = f19;
                d11 = radians + f11;
                fCos = fCos2;
                fSin = fSin2;
                f12 = 0.0f;
            }
            double dCeil = Math.ceil(d10) * 2.0d;
            double d16 = d11;
            int i12 = 0;
            boolean z12 = false;
            while (true) {
                double d17 = i12;
                if (d17 >= dCeil) {
                    break;
                }
                float f21 = z12 ? fFloatValue2 : fFloatValue3;
                if (f12 == f16 || d17 != dCeil - 2.0d) {
                    f13 = f16;
                    f14 = f11;
                } else {
                    f13 = f16;
                    f14 = (f18 * f20) / f10;
                }
                if (f12 != f16 && d17 == dCeil - 1.0d) {
                    f21 = f12;
                }
                double d18 = f21;
                float fCos3 = (float) (Math.cos(d16) * d18);
                float f22 = f18;
                float fSin3 = (float) (Math.sin(d16) * d18);
                if (fFloatValue4 == f13 && fFloatValue5 == f13) {
                    path.lineTo(fCos3, fSin3);
                    f15 = f20;
                    i = i12;
                } else {
                    f15 = f20;
                    Path path2 = path;
                    float f23 = fSin;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    i = i12;
                    float f24 = fCos;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f25 = z12 ? fFloatValue4 : fFloatValue5;
                    float f26 = z12 ? fFloatValue5 : fFloatValue4;
                    float f27 = (z12 ? fFloatValue3 : fFloatValue2) * f25 * 0.47829f;
                    float f28 = fCos4 * f27;
                    float f29 = f27 * fSin4;
                    float f30 = (z12 ? fFloatValue2 : fFloatValue3) * f26 * 0.47829f;
                    float f31 = fCos5 * f30;
                    float f32 = f30 * fSin5;
                    if (f20 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d17 == dCeil - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    path = path2;
                    path.cubicTo(f24 - f28, f23 - f29, f31 + fCos3, fSin3 + f32, fCos3, fSin3);
                }
                d16 += f14;
                z12 = !z12;
                i12 = i + 1;
                fCos = fCos3;
                fSin = fSin3;
                f20 = f15;
                f18 = f22;
                f16 = f13;
            }
            PointF pointFF = abstractC5268a.f();
            path.offset(pointFF.x, pointFF.y);
            path.close();
        } else if (i11 != 2) {
            z10 = true;
        } else {
            int iFloor = (int) Math.floor(c5271d4.f().floatValue());
            double radians2 = Math.toRadians((c5271d3 != null ? c5271d3.f().floatValue() : 0.0d) - 90.0d);
            double d19 = iFloor;
            float fFloatValue6 = c5271d2.f().floatValue() / 100.0f;
            float fFloatValue7 = c5271d.f().floatValue();
            double d20 = fFloatValue7;
            z10 = true;
            float fCos6 = (float) (Math.cos(radians2) * d20);
            float fSin6 = (float) (Math.sin(radians2) * d20);
            path.moveTo(fCos6, fSin6);
            double d21 = (float) (6.283185307179586d / d19);
            double dCeil2 = Math.ceil(d19);
            double d22 = radians2 + d21;
            int i13 = 0;
            while (true) {
                double d23 = i13;
                if (d23 >= dCeil2) {
                    break;
                }
                double d24 = dCeil2;
                float fCos7 = (float) (Math.cos(d22) * d20);
                float fSin7 = (float) (Math.sin(d22) * d20);
                if (fFloatValue6 != 0.0f) {
                    i10 = i13;
                    Path path3 = path;
                    d12 = d21;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    float f33 = fCos6;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f34 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f35 = fCos8 * f34;
                    float f36 = f34 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f34;
                    float fSin9 = f34 * ((float) Math.sin(dAtan24));
                    if (d23 == d24 - 1.0d) {
                        Path path4 = this.f43242b;
                        path4.reset();
                        path4.moveTo(f33, fSin6);
                        float f37 = f33 - f35;
                        float f38 = fSin6 - f36;
                        float f39 = fCos7 + fCos9;
                        float f40 = fSin7 + fSin9;
                        path4.cubicTo(f37, f38, f39, f40, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f43243c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f43244d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f37, f38, f39, f40, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f41 = fSin7 + fSin9;
                        path = path3;
                        path.cubicTo(f33 - f35, fSin6 - f36, fCos7 + fCos9, f41, fCos7, fSin7);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    }
                } else {
                    i10 = i13;
                    d12 = d21;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d23 == d24 - 1.0d) {
                        i13 = i10 + 1;
                        d21 = d12;
                        dCeil2 = d24;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d22 += d12;
                i13 = i10 + 1;
                d21 = d12;
                dCeil2 = d24;
            }
            PointF pointFF2 = abstractC5268a.f();
            path.offset(pointFF2.x, pointFF2.y);
            path.close();
        }
        path.close();
        this.f43256q.a(path);
        this.f43257r = z10;
        return path;
    }
}
