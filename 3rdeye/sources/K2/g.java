package k2;

import H6.B;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i2.C4444d;
import i2.EnumC4441a;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import l2.AbstractC5268a;
import l2.C5269b;
import l2.C5270c;
import l2.C5271d;
import l2.C5273f;
import n2.C5351e;
import o2.C5411b;
import u2.C5628g;
import u2.C5629h;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public final class g implements InterfaceC5214e, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f43192a;

    /* renamed from: b, reason: collision with root package name */
    public final C5167a f43193b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.b f43194c;

    /* renamed from: d, reason: collision with root package name */
    public final String f43195d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43196e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f43197f;

    /* renamed from: g, reason: collision with root package name */
    public final C5269b f43198g;

    /* renamed from: h, reason: collision with root package name */
    public final C5273f f43199h;
    public l2.q i;

    /* renamed from: j, reason: collision with root package name */
    public final z f43200j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC5268a<Float, Float> f43201k;

    /* renamed from: l, reason: collision with root package name */
    public float f43202l;

    /* renamed from: m, reason: collision with root package name */
    public final C5270c f43203m;

    public g(z zVar, q2.b bVar, p2.o oVar) {
        Path path = new Path();
        this.f43192a = path;
        this.f43193b = new C5167a(1);
        this.f43197f = new ArrayList();
        this.f43194c = bVar;
        this.f43195d = oVar.f45074c;
        this.f43196e = oVar.f45077f;
        this.f43200j = zVar;
        if (bVar.l() != null) {
            C5271d c5271dA = ((C5411b) bVar.l().f2053c).a();
            this.f43201k = c5271dA;
            c5271dA.a(this);
            bVar.e(this.f43201k);
        }
        if (bVar.m() != null) {
            this.f43203m = new C5270c(this, bVar, bVar.m());
        }
        B b10 = oVar.f45075d;
        if (b10 == null) {
            this.f43198g = null;
            this.f43199h = null;
            return;
        }
        B b11 = oVar.f45076e;
        path.setFillType(oVar.f45073b);
        AbstractC5268a abstractC5268aA = b10.a();
        this.f43198g = (C5269b) abstractC5268aA;
        abstractC5268aA.a(this);
        bVar.e(abstractC5268aA);
        AbstractC5268a abstractC5268aA2 = b11.a();
        this.f43199h = (C5273f) abstractC5268aA2;
        abstractC5268aA2.a(this);
        bVar.e(abstractC5268aA2);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43200j.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC5212c interfaceC5212c = list2.get(i);
            if (interfaceC5212c instanceof m) {
                this.f43197f.add((m) interfaceC5212c);
            }
        }
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        PointF pointF = InterfaceC4433F.f38300a;
        if (colorFilter == 1) {
            this.f43198g.k(fVar);
            return;
        }
        if (colorFilter == 4) {
            this.f43199h.k(fVar);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC4433F.f38294F;
        q2.b bVar = this.f43194c;
        if (colorFilter == colorFilter2) {
            l2.q qVar = this.i;
            if (qVar != null) {
                bVar.p(qVar);
            }
            l2.q qVar2 = new l2.q(fVar, null);
            this.i = qVar2;
            qVar2.a(this);
            bVar.e(this.i);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38304e) {
            AbstractC5268a<Float, Float> abstractC5268a = this.f43201k;
            if (abstractC5268a != null) {
                abstractC5268a.k(fVar);
                return;
            }
            l2.q qVar3 = new l2.q(fVar, null);
            this.f43201k = qVar3;
            qVar3.a(this);
            bVar.e(this.f43201k);
            return;
        }
        C5270c c5270c = this.f43203m;
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
        Path path = this.f43192a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43197f;
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

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43195d;
    }

    @Override // k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.f43196e) {
            return;
        }
        EnumC4441a enumC4441a = C4444d.f38338a;
        C5269b c5269b = this.f43198g;
        int iL = c5269b.l(c5269b.b(), c5269b.d());
        float f10 = i / 255.0f;
        int iIntValue = (int) (((this.f43199h.f().intValue() * f10) / 100.0f) * 255.0f);
        PointF pointF = C5628g.f46556a;
        int i10 = 0;
        int iMax = (iL & 16777215) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)) << 24);
        C5167a c5167a = this.f43193b;
        c5167a.setColor(iMax);
        l2.q qVar = this.i;
        if (qVar != null) {
            c5167a.setColorFilter((ColorFilter) qVar.f());
        }
        AbstractC5268a<Float, Float> abstractC5268a = this.f43201k;
        if (abstractC5268a != null) {
            float fFloatValue = abstractC5268a.f().floatValue();
            if (fFloatValue == 0.0f) {
                c5167a.setMaskFilter(null);
            } else if (fFloatValue != this.f43202l) {
                q2.b bVar = this.f43194c;
                if (bVar.f45329A == fFloatValue) {
                    blurMaskFilter = bVar.f45330B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f45330B = blurMaskFilter2;
                    bVar.f45329A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c5167a.setMaskFilter(blurMaskFilter);
            }
            this.f43202l = fFloatValue;
        }
        C5270c c5270c = this.f43203m;
        if (c5270c != null) {
            C5629h.a aVar = C5629h.f46557a;
            c5270c.b(c5167a, matrix, (int) (((f10 * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f43192a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f43197f;
            if (i10 >= arrayList.size()) {
                canvas.drawPath(path, c5167a);
                EnumC4441a enumC4441a2 = C4444d.f38338a;
                return;
            } else {
                path.addPath(((m) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }
}
