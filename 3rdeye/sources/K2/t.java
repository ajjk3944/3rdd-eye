package k2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import l2.AbstractC5268a;
import l2.C5269b;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public final class t extends AbstractC5210a {

    /* renamed from: r, reason: collision with root package name */
    public final q2.b f43288r;

    /* renamed from: s, reason: collision with root package name */
    public final String f43289s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f43290t;

    /* renamed from: u, reason: collision with root package name */
    public final C5269b f43291u;

    /* renamed from: v, reason: collision with root package name */
    public l2.q f43292v;

    public t(z zVar, q2.b bVar, p2.r rVar) {
        super(zVar, bVar, rVar.f45091g.toPaintCap(), rVar.f45092h.toPaintJoin(), rVar.i, rVar.f45089e, rVar.f45090f, rVar.f45087c, rVar.f45086b);
        this.f43288r = bVar;
        this.f43289s = rVar.f45085a;
        this.f43290t = rVar.f45093j;
        AbstractC5268a abstractC5268aA = rVar.f45088d.a();
        this.f43291u = (C5269b) abstractC5268aA;
        abstractC5268aA.a(this);
        bVar.e(abstractC5268aA);
    }

    @Override // k2.AbstractC5210a, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        PointF pointF = InterfaceC4433F.f38300a;
        C5269b c5269b = this.f43291u;
        if (colorFilter == 2) {
            c5269b.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38294F) {
            l2.q qVar = this.f43292v;
            q2.b bVar = this.f43288r;
            if (qVar != null) {
                bVar.p(qVar);
            }
            l2.q qVar2 = new l2.q(fVar, null);
            this.f43292v = qVar2;
            qVar2.a(this);
            bVar.e(c5269b);
        }
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43289s;
    }

    @Override // k2.AbstractC5210a, k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.f43290t) {
            return;
        }
        C5269b c5269b = this.f43291u;
        int iL = c5269b.l(c5269b.b(), c5269b.d());
        C5167a c5167a = this.i;
        c5167a.setColor(iL);
        l2.q qVar = this.f43292v;
        if (qVar != null) {
            c5167a.setColorFilter((ColorFilter) qVar.f());
        }
        super.h(canvas, matrix, i);
    }
}
