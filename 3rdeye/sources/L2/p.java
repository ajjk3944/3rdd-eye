package l2;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.camera.core.impl.C0;
import i2.InterfaceC4433F;
import java.util.Collections;
import l2.AbstractC5268a;
import o2.C5410a;
import o2.C5411b;
import o2.C5413d;
import o2.C5417h;
import o2.InterfaceC5418i;
import v2.C5673a;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f43734a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f43735b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f43736c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f43737d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f43738e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC5268a<PointF, PointF> f43739f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC5268a<?, PointF> f43740g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC5268a<v2.c, v2.c> f43741h;
    public AbstractC5268a<Float, Float> i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC5268a<Integer, Integer> f43742j;

    /* renamed from: k, reason: collision with root package name */
    public C5271d f43743k;

    /* renamed from: l, reason: collision with root package name */
    public C5271d f43744l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC5268a<?, Float> f43745m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC5268a<?, Float> f43746n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f43747o;

    public p(C5417h c5417h) {
        C0 c02 = c5417h.f44816a;
        this.f43739f = c02 == null ? null : c02.a();
        InterfaceC5418i<PointF, PointF> interfaceC5418i = c5417h.f44817b;
        this.f43740g = interfaceC5418i == null ? null : interfaceC5418i.a();
        C5410a c5410a = c5417h.f44818c;
        this.f43741h = c5410a == null ? null : c5410a.a();
        C5411b c5411b = c5417h.f44819d;
        this.i = c5411b == null ? null : c5411b.a();
        C5411b c5411b2 = c5417h.f44821f;
        C5271d c5271dA = c5411b2 == null ? null : c5411b2.a();
        this.f43743k = c5271dA;
        this.f43747o = c5417h.f44824j;
        if (c5271dA != null) {
            this.f43735b = new Matrix();
            this.f43736c = new Matrix();
            this.f43737d = new Matrix();
            this.f43738e = new float[9];
        } else {
            this.f43735b = null;
            this.f43736c = null;
            this.f43737d = null;
            this.f43738e = null;
        }
        C5411b c5411b3 = c5417h.f44822g;
        this.f43744l = c5411b3 == null ? null : c5411b3.a();
        C5413d c5413d = c5417h.f44820e;
        if (c5413d != null) {
            this.f43742j = c5413d.a();
        }
        C5411b c5411b4 = c5417h.f44823h;
        if (c5411b4 != null) {
            this.f43745m = c5411b4.a();
        } else {
            this.f43745m = null;
        }
        C5411b c5411b5 = c5417h.i;
        if (c5411b5 != null) {
            this.f43746n = c5411b5.a();
        } else {
            this.f43746n = null;
        }
    }

    public final void a(q2.b bVar) {
        bVar.e(this.f43742j);
        bVar.e(this.f43745m);
        bVar.e(this.f43746n);
        bVar.e(this.f43739f);
        bVar.e(this.f43740g);
        bVar.e(this.f43741h);
        bVar.e(this.i);
        bVar.e(this.f43743k);
        bVar.e(this.f43744l);
    }

    public final void b(AbstractC5268a.InterfaceC0489a interfaceC0489a) {
        AbstractC5268a<Integer, Integer> abstractC5268a = this.f43742j;
        if (abstractC5268a != null) {
            abstractC5268a.a(interfaceC0489a);
        }
        AbstractC5268a<?, Float> abstractC5268a2 = this.f43745m;
        if (abstractC5268a2 != null) {
            abstractC5268a2.a(interfaceC0489a);
        }
        AbstractC5268a<?, Float> abstractC5268a3 = this.f43746n;
        if (abstractC5268a3 != null) {
            abstractC5268a3.a(interfaceC0489a);
        }
        AbstractC5268a<PointF, PointF> abstractC5268a4 = this.f43739f;
        if (abstractC5268a4 != null) {
            abstractC5268a4.a(interfaceC0489a);
        }
        AbstractC5268a<?, PointF> abstractC5268a5 = this.f43740g;
        if (abstractC5268a5 != null) {
            abstractC5268a5.a(interfaceC0489a);
        }
        AbstractC5268a<v2.c, v2.c> abstractC5268a6 = this.f43741h;
        if (abstractC5268a6 != null) {
            abstractC5268a6.a(interfaceC0489a);
        }
        AbstractC5268a<Float, Float> abstractC5268a7 = this.i;
        if (abstractC5268a7 != null) {
            abstractC5268a7.a(interfaceC0489a);
        }
        C5271d c5271d = this.f43743k;
        if (c5271d != null) {
            c5271d.a(interfaceC0489a);
        }
        C5271d c5271d2 = this.f43744l;
        if (c5271d2 != null) {
            c5271d2.a(interfaceC0489a);
        }
    }

    public final boolean c(ColorFilter colorFilter, B0.f fVar) {
        if (colorFilter == InterfaceC4433F.f38300a) {
            AbstractC5268a<PointF, PointF> abstractC5268a = this.f43739f;
            if (abstractC5268a == null) {
                this.f43739f = new q(fVar, new PointF());
                return true;
            }
            abstractC5268a.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38301b) {
            AbstractC5268a<?, PointF> abstractC5268a2 = this.f43740g;
            if (abstractC5268a2 == null) {
                this.f43740g = new q(fVar, new PointF());
                return true;
            }
            abstractC5268a2.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38302c) {
            AbstractC5268a<?, PointF> abstractC5268a3 = this.f43740g;
            if (abstractC5268a3 instanceof m) {
                m mVar = (m) abstractC5268a3;
                B0.f fVar2 = mVar.f43729m;
                mVar.f43729m = fVar;
                return true;
            }
        }
        if (colorFilter == InterfaceC4433F.f38303d) {
            AbstractC5268a<?, PointF> abstractC5268a4 = this.f43740g;
            if (abstractC5268a4 instanceof m) {
                m mVar2 = (m) abstractC5268a4;
                B0.f fVar3 = mVar2.f43730n;
                mVar2.f43730n = fVar;
                return true;
            }
        }
        if (colorFilter == InterfaceC4433F.f38308j) {
            AbstractC5268a<v2.c, v2.c> abstractC5268a5 = this.f43741h;
            if (abstractC5268a5 == null) {
                this.f43741h = new q(fVar, new v2.c());
                return true;
            }
            abstractC5268a5.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38309k) {
            AbstractC5268a<Float, Float> abstractC5268a6 = this.i;
            if (abstractC5268a6 == null) {
                this.i = new q(fVar, Float.valueOf(0.0f));
                return true;
            }
            abstractC5268a6.k(fVar);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC5268a<Integer, Integer> abstractC5268a7 = this.f43742j;
            if (abstractC5268a7 == null) {
                this.f43742j = new q(fVar, 100);
                return true;
            }
            abstractC5268a7.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38322x) {
            AbstractC5268a<?, Float> abstractC5268a8 = this.f43745m;
            if (abstractC5268a8 == null) {
                this.f43745m = new q(fVar, Float.valueOf(100.0f));
                return true;
            }
            abstractC5268a8.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38323y) {
            AbstractC5268a<?, Float> abstractC5268a9 = this.f43746n;
            if (abstractC5268a9 == null) {
                this.f43746n = new q(fVar, Float.valueOf(100.0f));
                return true;
            }
            abstractC5268a9.k(fVar);
            return true;
        }
        if (colorFilter == InterfaceC4433F.f38310l) {
            if (this.f43743k == null) {
                this.f43743k = new C5271d(Collections.singletonList(new C5673a(Float.valueOf(0.0f))));
            }
            this.f43743k.k(fVar);
            return true;
        }
        if (colorFilter != InterfaceC4433F.f38311m) {
            return false;
        }
        if (this.f43744l == null) {
            this.f43744l = new C5271d(Collections.singletonList(new C5673a(Float.valueOf(0.0f))));
        }
        this.f43744l.k(fVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f43738e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointFF;
        v2.c cVarF;
        PointF pointFF2;
        Matrix matrix = this.f43734a;
        matrix.reset();
        AbstractC5268a<?, PointF> abstractC5268a = this.f43740g;
        if (abstractC5268a != null && (pointFF2 = abstractC5268a.f()) != null) {
            float f10 = pointFF2.x;
            if (f10 != 0.0f || pointFF2.y != 0.0f) {
                matrix.preTranslate(f10, pointFF2.y);
            }
        }
        if (!this.f43747o) {
            AbstractC5268a<Float, Float> abstractC5268a2 = this.i;
            if (abstractC5268a2 != null) {
                float fFloatValue = abstractC5268a2 instanceof q ? abstractC5268a2.f().floatValue() : ((C5271d) abstractC5268a2).l();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC5268a != null) {
            float f11 = abstractC5268a.f43689d;
            PointF pointFF3 = abstractC5268a.f();
            float f12 = pointFF3.x;
            float f13 = pointFF3.y;
            abstractC5268a.j(1.0E-4f + f11);
            PointF pointFF4 = abstractC5268a.f();
            abstractC5268a.j(f11);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointFF4.y - f13, pointFF4.x - f12)));
        }
        if (this.f43743k != null) {
            float fCos = this.f43744l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.l()) + 90.0f));
            float fSin = this.f43744l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.l()));
            d();
            float[] fArr = this.f43738e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f43735b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f43736c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f14;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f43737d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC5268a<v2.c, v2.c> abstractC5268a3 = this.f43741h;
        if (abstractC5268a3 != null && (cVarF = abstractC5268a3.f()) != null) {
            float f15 = cVarF.f47033a;
            if (f15 != 1.0f || cVarF.f47034b != 1.0f) {
                matrix.preScale(f15, cVarF.f47034b);
            }
        }
        AbstractC5268a<PointF, PointF> abstractC5268a4 = this.f43739f;
        if (abstractC5268a4 != null && (pointFF = abstractC5268a4.f()) != null) {
            float f16 = pointFF.x;
            if (f16 != 0.0f || pointFF.y != 0.0f) {
                matrix.preTranslate(-f16, -pointFF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f10) {
        AbstractC5268a<?, PointF> abstractC5268a = this.f43740g;
        PointF pointFF = abstractC5268a == null ? null : abstractC5268a.f();
        AbstractC5268a<v2.c, v2.c> abstractC5268a2 = this.f43741h;
        v2.c cVarF = abstractC5268a2 == null ? null : abstractC5268a2.f();
        Matrix matrix = this.f43734a;
        matrix.reset();
        if (pointFF != null) {
            matrix.preTranslate(pointFF.x * f10, pointFF.y * f10);
        }
        if (cVarF != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(cVarF.f47033a, d10), (float) Math.pow(cVarF.f47034b, d10));
        }
        AbstractC5268a<Float, Float> abstractC5268a3 = this.i;
        if (abstractC5268a3 != null) {
            float fFloatValue = abstractC5268a3.f().floatValue();
            AbstractC5268a<PointF, PointF> abstractC5268a4 = this.f43739f;
            PointF pointFF2 = abstractC5268a4 != null ? abstractC5268a4.f() : null;
            matrix.preRotate(fFloatValue * f10, pointFF2 == null ? 0.0f : pointFF2.x, pointFF2 != null ? pointFF2.y : 0.0f);
        }
        return matrix;
    }
}
