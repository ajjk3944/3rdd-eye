package k2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import i2.C4444d;
import i2.C4448h;
import i2.EnumC4441a;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import l2.AbstractC5268a;
import l2.C5270c;
import l2.C5271d;
import l2.C5272e;
import l2.C5273f;
import l2.C5278k;
import m0.C5313f;
import n2.C5351e;
import o2.C5411b;
import p2.C5443c;
import p2.C5444d;
import p2.EnumC5446f;
import u2.C5628g;
import u2.C5629h;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public final class h implements InterfaceC5214e, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f43204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43205b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.b f43206c;

    /* renamed from: d, reason: collision with root package name */
    public final C5313f<LinearGradient> f43207d = new C5313f<>();

    /* renamed from: e, reason: collision with root package name */
    public final C5313f<RadialGradient> f43208e = new C5313f<>();

    /* renamed from: f, reason: collision with root package name */
    public final Path f43209f;

    /* renamed from: g, reason: collision with root package name */
    public final C5167a f43210g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f43211h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC5446f f43212j;

    /* renamed from: k, reason: collision with root package name */
    public final C5272e f43213k;

    /* renamed from: l, reason: collision with root package name */
    public final C5273f f43214l;

    /* renamed from: m, reason: collision with root package name */
    public final C5278k f43215m;

    /* renamed from: n, reason: collision with root package name */
    public final C5278k f43216n;

    /* renamed from: o, reason: collision with root package name */
    public l2.q f43217o;

    /* renamed from: p, reason: collision with root package name */
    public l2.q f43218p;

    /* renamed from: q, reason: collision with root package name */
    public final z f43219q;

    /* renamed from: r, reason: collision with root package name */
    public final int f43220r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC5268a<Float, Float> f43221s;

    /* renamed from: t, reason: collision with root package name */
    public float f43222t;

    /* renamed from: u, reason: collision with root package name */
    public final C5270c f43223u;

    public h(z zVar, C4448h c4448h, q2.b bVar, C5444d c5444d) {
        Path path = new Path();
        this.f43209f = path;
        this.f43210g = new C5167a(1);
        this.f43211h = new RectF();
        this.i = new ArrayList();
        this.f43222t = 0.0f;
        this.f43206c = bVar;
        this.f43204a = c5444d.f45027g;
        this.f43205b = c5444d.f45028h;
        this.f43219q = zVar;
        this.f43212j = c5444d.f45021a;
        path.setFillType(c5444d.f45022b);
        this.f43220r = (int) (c4448h.b() / 32.0f);
        AbstractC5268a abstractC5268aA = c5444d.f45023c.a();
        this.f43213k = (C5272e) abstractC5268aA;
        abstractC5268aA.a(this);
        bVar.e(abstractC5268aA);
        AbstractC5268a abstractC5268aA2 = c5444d.f45024d.a();
        this.f43214l = (C5273f) abstractC5268aA2;
        abstractC5268aA2.a(this);
        bVar.e(abstractC5268aA2);
        AbstractC5268a<PointF, PointF> abstractC5268aA3 = c5444d.f45025e.a();
        this.f43215m = (C5278k) abstractC5268aA3;
        abstractC5268aA3.a(this);
        bVar.e(abstractC5268aA3);
        AbstractC5268a<PointF, PointF> abstractC5268aA4 = c5444d.f45026f.a();
        this.f43216n = (C5278k) abstractC5268aA4;
        abstractC5268aA4.a(this);
        bVar.e(abstractC5268aA4);
        if (bVar.l() != null) {
            C5271d c5271dA = ((C5411b) bVar.l().f2053c).a();
            this.f43221s = c5271dA;
            c5271dA.a(this);
            bVar.e(this.f43221s);
        }
        if (bVar.m() != null) {
            this.f43223u = new C5270c(this, bVar, bVar.m());
        }
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43219q.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC5212c interfaceC5212c = list2.get(i);
            if (interfaceC5212c instanceof m) {
                this.i.add((m) interfaceC5212c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        PointF pointF = InterfaceC4433F.f38300a;
        if (colorFilter == 4) {
            this.f43214l.k(fVar);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC4433F.f38294F;
        q2.b bVar = this.f43206c;
        if (colorFilter == colorFilter2) {
            l2.q qVar = this.f43217o;
            if (qVar != null) {
                bVar.p(qVar);
            }
            l2.q qVar2 = new l2.q(fVar, null);
            this.f43217o = qVar2;
            qVar2.a(this);
            bVar.e(this.f43217o);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38295G) {
            l2.q qVar3 = this.f43218p;
            if (qVar3 != null) {
                bVar.p(qVar3);
            }
            this.f43207d.b();
            this.f43208e.b();
            l2.q qVar4 = new l2.q(fVar, null);
            this.f43218p = qVar4;
            qVar4.a(this);
            bVar.e(this.f43218p);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38304e) {
            AbstractC5268a<Float, Float> abstractC5268a = this.f43221s;
            if (abstractC5268a != null) {
                abstractC5268a.k(fVar);
                return;
            }
            l2.q qVar5 = new l2.q(fVar, null);
            this.f43221s = qVar5;
            qVar5.a(this);
            bVar.e(this.f43221s);
            return;
        }
        C5270c c5270c = this.f43223u;
        if (colorFilter == 5 && c5270c != null) {
            c5270c.f43702c.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38290B && c5270c != null) {
            c5270c.c(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38291C && c5270c != null) {
            c5270c.f43704e.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38292D && c5270c != null) {
            c5270c.f43705f.k(fVar);
        } else {
            if (colorFilter != InterfaceC4433F.f38293E || c5270c == null) {
                return;
            }
            c5270c.f43706g.k(fVar);
        }
    }

    @Override // k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f43209f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        l2.q qVar = this.f43218p;
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

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43204a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f43205b) {
            return;
        }
        EnumC4441a enumC4441a = C4444d.f38338a;
        Path path = this.f43209f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i10)).getPath(), matrix);
            i10++;
        }
        path.computeBounds(this.f43211h, false);
        EnumC5446f enumC5446f = EnumC5446f.LINEAR;
        EnumC5446f enumC5446f2 = this.f43212j;
        C5272e c5272e = this.f43213k;
        C5278k c5278k = this.f43216n;
        C5278k c5278k2 = this.f43215m;
        if (enumC5446f2 == enumC5446f) {
            long jI = i();
            C5313f<LinearGradient> c5313f = this.f43207d;
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
            C5313f<RadialGradient> c5313f2 = this.f43208e;
            shader = (RadialGradient) c5313f2.e(jI2);
            if (shader == null) {
                PointF pointFF3 = c5278k2.f();
                PointF pointFF4 = c5278k.f();
                C5443c c5443c2 = (C5443c) c5272e.f();
                int[] iArrE = e(c5443c2.f45020b);
                float f10 = pointFF3.x;
                float f11 = pointFF3.y;
                float fHypot = (float) Math.hypot(pointFF4.x - f10, pointFF4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f10, f11, fHypot, iArrE, c5443c2.f45019a, Shader.TileMode.CLAMP);
                c5313f2.i(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        C5167a c5167a = this.f43210g;
        c5167a.setShader(shader);
        l2.q qVar = this.f43217o;
        if (qVar != null) {
            c5167a.setColorFilter((ColorFilter) qVar.f());
        }
        AbstractC5268a<Float, Float> abstractC5268a = this.f43221s;
        if (abstractC5268a != null) {
            float fFloatValue = abstractC5268a.f().floatValue();
            if (fFloatValue == 0.0f) {
                c5167a.setMaskFilter(null);
            } else if (fFloatValue != this.f43222t) {
                c5167a.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f43222t = fFloatValue;
        }
        float f12 = i / 255.0f;
        int iIntValue = (int) (((this.f43214l.f().intValue() * f12) / 100.0f) * 255.0f);
        PointF pointF = C5628g.f46556a;
        c5167a.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)));
        C5270c c5270c = this.f43223u;
        if (c5270c != null) {
            C5629h.a aVar = C5629h.f46557a;
            c5270c.b(c5167a, matrix, (int) (((f12 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, c5167a);
        EnumC4441a enumC4441a2 = C4444d.f38338a;
    }

    public final int i() {
        float f10 = this.f43215m.f43689d;
        float f11 = this.f43220r;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f43216n.f43689d * f11);
        int iRound3 = Math.round(this.f43213k.f43689d * f11);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
