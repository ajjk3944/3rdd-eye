package k2;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import i2.C4444d;
import i2.EnumC4441a;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import java.util.ArrayList;
import l2.AbstractC5268a;
import l2.C5270c;
import l2.C5271d;
import l2.C5273f;
import n2.C5351e;
import o2.C5411b;
import o2.C5413d;
import u2.C5628g;

/* compiled from: BaseStrokeContent.java */
/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5210a implements AbstractC5268a.InterfaceC0489a, k, InterfaceC5214e {

    /* renamed from: e, reason: collision with root package name */
    public final z f43159e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.b f43160f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f43162h;
    public final C5167a i;

    /* renamed from: j, reason: collision with root package name */
    public final C5271d f43163j;

    /* renamed from: k, reason: collision with root package name */
    public final C5273f f43164k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f43165l;

    /* renamed from: m, reason: collision with root package name */
    public final C5271d f43166m;

    /* renamed from: n, reason: collision with root package name */
    public l2.q f43167n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC5268a<Float, Float> f43168o;

    /* renamed from: p, reason: collision with root package name */
    public float f43169p;

    /* renamed from: q, reason: collision with root package name */
    public final C5270c f43170q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f43155a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f43156b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f43157c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f43158d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f43161g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: k2.a$a, reason: collision with other inner class name */
    public static final class C0483a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f43171a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final u f43172b;

        public C0483a(u uVar) {
            this.f43172b = uVar;
        }
    }

    public AbstractC5210a(z zVar, q2.b bVar, Paint.Cap cap, Paint.Join join, float f10, C5413d c5413d, C5411b c5411b, ArrayList arrayList, C5411b c5411b2) {
        C5167a c5167a = new C5167a(1);
        this.i = c5167a;
        this.f43169p = 0.0f;
        this.f43159e = zVar;
        this.f43160f = bVar;
        c5167a.setStyle(Paint.Style.STROKE);
        c5167a.setStrokeCap(cap);
        c5167a.setStrokeJoin(join);
        c5167a.setStrokeMiter(f10);
        this.f43164k = (C5273f) c5413d.a();
        this.f43163j = c5411b.a();
        if (c5411b2 == null) {
            this.f43166m = null;
        } else {
            this.f43166m = c5411b2.a();
        }
        this.f43165l = new ArrayList(arrayList.size());
        this.f43162h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f43165l.add(((C5411b) arrayList.get(i)).a());
        }
        bVar.e(this.f43164k);
        bVar.e(this.f43163j);
        for (int i10 = 0; i10 < this.f43165l.size(); i10++) {
            bVar.e((AbstractC5268a) this.f43165l.get(i10));
        }
        C5271d c5271d = this.f43166m;
        if (c5271d != null) {
            bVar.e(c5271d);
        }
        this.f43164k.a(this);
        this.f43163j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((AbstractC5268a) this.f43165l.get(i11)).a(this);
        }
        C5271d c5271d2 = this.f43166m;
        if (c5271d2 != null) {
            c5271d2.a(this);
        }
        if (bVar.l() != null) {
            C5271d c5271dA = ((C5411b) bVar.l().f2053c).a();
            this.f43168o = c5271dA;
            c5271dA.a(this);
            bVar.e(this.f43168o);
        }
        if (bVar.m() != null) {
            this.f43170q = new C5270c(this, bVar, bVar.m());
        }
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43159e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // k2.InterfaceC5212c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<k2.InterfaceC5212c> r8, java.util.List<k2.InterfaceC5212c> r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            k2.c r3 = (k2.InterfaceC5212c) r3
            boolean r4 = r3 instanceof k2.u
            if (r4 == 0) goto L1f
            k2.u r3 = (k2.u) r3
            p2.s$a r4 = r3.f43295c
            p2.s$a r5 = p2.s.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.c(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.f43161g
            if (r8 < 0) goto L68
            java.lang.Object r3 = r9.get(r8)
            k2.c r3 = (k2.InterfaceC5212c) r3
            boolean r4 = r3 instanceof k2.u
            if (r4 == 0) goto L53
            r4 = r3
            k2.u r4 = (k2.u) r4
            p2.s$a r5 = r4.f43295c
            p2.s$a r6 = p2.s.a.INDIVIDUALLY
            if (r5 != r6) goto L53
            if (r1 == 0) goto L49
            r0.add(r1)
        L49:
            k2.a$a r0 = new k2.a$a
            r0.<init>(r4)
            r4.c(r7)
            r1 = r0
            goto L65
        L53:
            boolean r0 = r3 instanceof k2.m
            if (r0 == 0) goto L65
            if (r1 != 0) goto L5e
            k2.a$a r1 = new k2.a$a
            r1.<init>(r2)
        L5e:
            java.util.ArrayList r0 = r1.f43171a
            k2.m r3 = (k2.m) r3
            r0.add(r3)
        L65:
            int r8 = r8 + (-1)
            goto L2d
        L68:
            if (r1 == 0) goto L6d
            r0.add(r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.AbstractC5210a.b(java.util.List, java.util.List):void");
    }

    @Override // n2.InterfaceC5352f
    public void c(ColorFilter colorFilter, B0.f fVar) {
        PointF pointF = InterfaceC4433F.f38300a;
        if (colorFilter == 4) {
            this.f43164k.k(fVar);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38312n) {
            this.f43163j.k(fVar);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC4433F.f38294F;
        q2.b bVar = this.f43160f;
        if (colorFilter == colorFilter2) {
            l2.q qVar = this.f43167n;
            if (qVar != null) {
                bVar.p(qVar);
            }
            l2.q qVar2 = new l2.q(fVar, null);
            this.f43167n = qVar2;
            qVar2.a(this);
            bVar.e(this.f43167n);
            return;
        }
        if (colorFilter == InterfaceC4433F.f38304e) {
            AbstractC5268a<Float, Float> abstractC5268a = this.f43168o;
            if (abstractC5268a != null) {
                abstractC5268a.k(fVar);
                return;
            }
            l2.q qVar3 = new l2.q(fVar, null);
            this.f43168o = qVar3;
            qVar3.a(this);
            bVar.e(this.f43168o);
            return;
        }
        C5270c c5270c = this.f43170q;
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
        EnumC4441a enumC4441a = C4444d.f38338a;
        Path path = this.f43156b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43161g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f43158d;
                path.computeBounds(rectF2, false);
                float fL = this.f43163j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                EnumC4441a enumC4441a2 = C4444d.f38338a;
                return;
            }
            C0483a c0483a = (C0483a) arrayList.get(i);
            for (int i10 = 0; i10 < c0483a.f43171a.size(); i10++) {
                path.addPath(((m) c0483a.f43171a.get(i10)).getPath(), matrix);
            }
            i++;
        }
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    @Override // k2.InterfaceC5214e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.AbstractC5210a.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
