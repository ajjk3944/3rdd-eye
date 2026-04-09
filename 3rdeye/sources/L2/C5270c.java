package l2;

import android.graphics.Color;
import android.graphics.Matrix;
import i2.C4440M;
import j2.C5167a;
import l2.AbstractC5268a;
import o2.C5410a;
import o2.C5411b;
import v2.C5674b;

/* compiled from: DropShadowKeyframeAnimation.java */
/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5270c implements AbstractC5268a.InterfaceC0489a {

    /* renamed from: a, reason: collision with root package name */
    public final q2.b f43700a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43701b;

    /* renamed from: c, reason: collision with root package name */
    public final C5269b f43702c;

    /* renamed from: d, reason: collision with root package name */
    public final C5271d f43703d;

    /* renamed from: e, reason: collision with root package name */
    public final C5271d f43704e;

    /* renamed from: f, reason: collision with root package name */
    public final C5271d f43705f;

    /* renamed from: g, reason: collision with root package name */
    public final C5271d f43706g;

    /* renamed from: h, reason: collision with root package name */
    public float f43707h = Float.NaN;
    public float i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f43708j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public int f43709k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f43710l = new float[9];

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* renamed from: l2.c$a */
    public class a extends B0.f {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ B0.f f43711e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B0.f fVar) {
            super(7);
            this.f43711e = fVar;
        }

        @Override // B0.f
        public final Object d(C5674b c5674b) {
            Float f10 = (Float) ((C4440M) this.f43711e.f358d);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public C5270c(AbstractC5268a.InterfaceC0489a interfaceC0489a, q2.b bVar, D3.d dVar) {
        this.f43701b = interfaceC0489a;
        this.f43700a = bVar;
        AbstractC5268a<?, ?> abstractC5268aA = ((C5410a) dVar.f1051b).a();
        this.f43702c = (C5269b) abstractC5268aA;
        abstractC5268aA.a(this);
        bVar.e(abstractC5268aA);
        C5271d c5271dA = ((C5411b) dVar.f1052c).a();
        this.f43703d = c5271dA;
        c5271dA.a(this);
        bVar.e(c5271dA);
        C5271d c5271dA2 = ((C5411b) dVar.f1053d).a();
        this.f43704e = c5271dA2;
        c5271dA2.a(this);
        bVar.e(c5271dA2);
        C5271d c5271dA3 = ((C5411b) dVar.f1054e).a();
        this.f43705f = c5271dA3;
        c5271dA3.a(this);
        bVar.e(c5271dA3);
        C5271d c5271dA4 = ((C5411b) dVar.f1055f).a();
        this.f43706g = c5271dA4;
        c5271dA4.a(this);
        bVar.e(c5271dA4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.a$a] */
    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43701b.a();
    }

    public final void b(C5167a c5167a, Matrix matrix, int i) {
        float fL = this.f43704e.l() * 0.017453292f;
        float fFloatValue = this.f43705f.f().floatValue();
        double d10 = fL;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        Matrix matrixE = this.f43700a.f45353w.e();
        float[] fArr = this.f43710l;
        matrixE.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[4];
        matrix.getValues(fArr);
        float f12 = fArr[0] / f10;
        float f13 = fSin * f12;
        float f14 = fCos * (fArr[4] / f11);
        int iIntValue = this.f43702c.f().intValue();
        int iArgb = Color.argb(Math.round((this.f43703d.f().floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(this.f43706g.f().floatValue() * f12, Float.MIN_VALUE);
        if (this.f43707h == fMax && this.i == f13 && this.f43708j == f14 && this.f43709k == iArgb) {
            return;
        }
        this.f43707h = fMax;
        this.i = f13;
        this.f43708j = f14;
        this.f43709k = iArgb;
        c5167a.setShadowLayer(fMax, f13, f14, iArgb);
    }

    public final void c(B0.f fVar) {
        this.f43703d.k(new a(fVar));
    }
}
