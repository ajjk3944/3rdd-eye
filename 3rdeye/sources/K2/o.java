package k2;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import l2.AbstractC5268a;
import l2.C5271d;
import n2.C5351e;
import u2.C5628g;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public final class o implements AbstractC5268a.InterfaceC0489a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f43261c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43262d;

    /* renamed from: e, reason: collision with root package name */
    public final z f43263e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5268a<?, PointF> f43264f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC5268a<?, PointF> f43265g;

    /* renamed from: h, reason: collision with root package name */
    public final C5271d f43266h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f43268k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f43259a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f43260b = new RectF();
    public final C5211b i = new C5211b();

    /* renamed from: j, reason: collision with root package name */
    public AbstractC5268a<Float, Float> f43267j = null;

    public o(z zVar, q2.b bVar, p2.k kVar) {
        this.f43261c = kVar.f45058a;
        this.f43262d = kVar.f45062e;
        this.f43263e = zVar;
        AbstractC5268a<PointF, PointF> abstractC5268aA = kVar.f45059b.a();
        this.f43264f = abstractC5268aA;
        AbstractC5268a<PointF, PointF> abstractC5268aA2 = kVar.f45060c.a();
        this.f43265g = abstractC5268aA2;
        C5271d c5271dA = kVar.f45061d.a();
        this.f43266h = c5271dA;
        bVar.e(abstractC5268aA);
        bVar.e(abstractC5268aA2);
        bVar.e(c5271dA);
        abstractC5268aA.a(this);
        abstractC5268aA2.a(this);
        c5271dA.a(this);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43268k = false;
        this.f43263e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // k2.InterfaceC5212c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<k2.InterfaceC5212c> r5, java.util.List<k2.InterfaceC5212c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            k2.c r0 = (k2.InterfaceC5212c) r0
            boolean r1 = r0 instanceof k2.u
            if (r1 == 0) goto L28
            r1 = r0
            k2.u r1 = (k2.u) r1
            p2.s$a r2 = r1.f43295c
            p2.s$a r3 = p2.s.a.SIMULTANEOUSLY
            if (r2 != r3) goto L28
            k2.b r0 = r4.i
            java.util.ArrayList r0 = r0.f43173a
            r0.add(r1)
            r1.c(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof k2.q
            if (r1 == 0) goto L32
            k2.q r0 = (k2.q) r0
            l2.a<java.lang.Float, java.lang.Float> r0 = r0.f43279b
            r4.f43267j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.o.b(java.util.List, java.util.List):void");
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        if (colorFilter == InterfaceC4433F.f38306g) {
            this.f43265g.k(fVar);
        } else if (colorFilter == InterfaceC4433F.i) {
            this.f43264f.k(fVar);
        } else if (colorFilter == InterfaceC4433F.f38307h) {
            this.f43266h.k(fVar);
        }
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43261c;
    }

    @Override // k2.m
    public final Path getPath() {
        float f10;
        AbstractC5268a<Float, Float> abstractC5268a;
        boolean z10 = this.f43268k;
        Path path = this.f43259a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f43262d) {
            this.f43268k = true;
            return path;
        }
        PointF pointFF = this.f43265g.f();
        float f11 = pointFF.x / 2.0f;
        float f12 = pointFF.y / 2.0f;
        C5271d c5271d = this.f43266h;
        float fL = c5271d == null ? 0.0f : c5271d.l();
        if (fL == 0.0f && (abstractC5268a = this.f43267j) != null) {
            fL = Math.min(abstractC5268a.f().floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointFF2 = this.f43264f.f();
        path.moveTo(pointFF2.x + f11, (pointFF2.y - f12) + fL);
        path.lineTo(pointFF2.x + f11, (pointFF2.y + f12) - fL);
        RectF rectF = this.f43260b;
        if (fL > 0.0f) {
            float f13 = pointFF2.x + f11;
            float f14 = fL * 2.0f;
            f10 = 2.0f;
            float f15 = pointFF2.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f10 = 2.0f;
        }
        path.lineTo((pointFF2.x - f11) + fL, pointFF2.y + f12);
        if (fL > 0.0f) {
            float f16 = pointFF2.x - f11;
            float f17 = pointFF2.y + f12;
            float f18 = fL * f10;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointFF2.x - f11, (pointFF2.y - f12) + fL);
        if (fL > 0.0f) {
            float f19 = pointFF2.x - f11;
            float f20 = pointFF2.y - f12;
            float f21 = fL * f10;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointFF2.x + f11) - fL, pointFF2.y - f12);
        if (fL > 0.0f) {
            float f22 = pointFF2.x + f11;
            float f23 = fL * f10;
            float f24 = pointFF2.y - f12;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.f43268k = true;
        return path;
    }
}
