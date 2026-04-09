package k2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import i2.InterfaceC4433F;
import i2.z;
import l2.AbstractC5268a;
import l2.C5272e;
import l2.C5278k;
import m0.C5313f;
import p2.C5443c;
import p2.C5445e;
import p2.EnumC5446f;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public final class i extends AbstractC5210a {

    /* renamed from: A, reason: collision with root package name */
    public final C5278k f43224A;

    /* renamed from: B, reason: collision with root package name */
    public l2.q f43225B;

    /* renamed from: r, reason: collision with root package name */
    public final String f43226r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f43227s;

    /* renamed from: t, reason: collision with root package name */
    public final C5313f<LinearGradient> f43228t;

    /* renamed from: u, reason: collision with root package name */
    public final C5313f<RadialGradient> f43229u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f43230v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC5446f f43231w;

    /* renamed from: x, reason: collision with root package name */
    public final int f43232x;

    /* renamed from: y, reason: collision with root package name */
    public final C5272e f43233y;

    /* renamed from: z, reason: collision with root package name */
    public final C5278k f43234z;

    public i(z zVar, q2.b bVar, C5445e c5445e) {
        super(zVar, bVar, c5445e.f45036h.toPaintCap(), c5445e.i.toPaintJoin(), c5445e.f45037j, c5445e.f45032d, c5445e.f45035g, c5445e.f45038k, c5445e.f45039l);
        this.f43228t = new C5313f<>();
        this.f43229u = new C5313f<>();
        this.f43230v = new RectF();
        this.f43226r = c5445e.f45029a;
        this.f43231w = c5445e.f45030b;
        this.f43227s = c5445e.f45040m;
        this.f43232x = (int) (zVar.f38423b.b() / 32.0f);
        AbstractC5268a abstractC5268aA = c5445e.f45031c.a();
        this.f43233y = (C5272e) abstractC5268aA;
        abstractC5268aA.a(this);
        bVar.e(abstractC5268aA);
        AbstractC5268a<PointF, PointF> abstractC5268aA2 = c5445e.f45033e.a();
        this.f43234z = (C5278k) abstractC5268aA2;
        abstractC5268aA2.a(this);
        bVar.e(abstractC5268aA2);
        AbstractC5268a<PointF, PointF> abstractC5268aA3 = c5445e.f45034f.a();
        this.f43224A = (C5278k) abstractC5268aA3;
        abstractC5268aA3.a(this);
        bVar.e(abstractC5268aA3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.AbstractC5210a, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        if (colorFilter == InterfaceC4433F.f38295G) {
            l2.q qVar = this.f43225B;
            q2.b bVar = this.f43160f;
            if (qVar != null) {
                bVar.p(qVar);
            }
            l2.q qVar2 = new l2.q(fVar, null);
            this.f43225B = qVar2;
            qVar2.a(this);
            bVar.e(this.f43225B);
        }
    }

    public final int[] e(int[] iArr) {
        l2.q qVar = this.f43225B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43226r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.AbstractC5210a, k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f43227s) {
            return;
        }
        d(this.f43230v, matrix, false);
        EnumC5446f enumC5446f = EnumC5446f.LINEAR;
        EnumC5446f enumC5446f2 = this.f43231w;
        C5272e c5272e = this.f43233y;
        C5278k c5278k = this.f43224A;
        C5278k c5278k2 = this.f43234z;
        if (enumC5446f2 == enumC5446f) {
            long jI = i();
            C5313f<LinearGradient> c5313f = this.f43228t;
            shader = (LinearGradient) c5313f.e(jI);
            if (shader == null) {
                PointF pointFF = c5278k2.f();
                PointF pointFF2 = c5278k.f();
                C5443c c5443c = (C5443c) c5272e.f();
                radialGradient = new LinearGradient(pointFF.x, pointFF.y, pointFF2.x, pointFF2.y, e(c5443c.f45020b), c5443c.f45019a, Shader.TileMode.CLAMP);
                c5313f.i(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            C5313f<RadialGradient> c5313f2 = this.f43229u;
            shader = (RadialGradient) c5313f2.e(jI2);
            if (shader == null) {
                PointF pointFF3 = c5278k2.f();
                PointF pointFF4 = c5278k.f();
                C5443c c5443c2 = (C5443c) c5272e.f();
                int[] iArrE = e(c5443c2.f45020b);
                radialGradient = new RadialGradient(pointFF3.x, pointFF3.y, (float) Math.hypot(pointFF4.x - r10, pointFF4.y - r11), iArrE, c5443c2.f45019a, Shader.TileMode.CLAMP);
                c5313f2.i(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.h(canvas, matrix, i);
    }

    public final int i() {
        float f10 = this.f43234z.f43689d;
        float f11 = this.f43232x;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f43224A.f43689d * f11);
        int iRound3 = Math.round(this.f43233y.f43689d * f11);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
