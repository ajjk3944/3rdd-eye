package t8;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import r8.z;

/* loaded from: classes.dex */
public abstract class b implements u8.a, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final r8.v f22537e;

    /* renamed from: f, reason: collision with root package name */
    public final a9.b f22538f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f22540h;

    /* renamed from: i, reason: collision with root package name */
    public final a9.l f22541i;
    public final u8.h j;
    public final u8.e k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22542l;

    /* renamed from: m, reason: collision with root package name */
    public final u8.h f22543m;

    /* renamed from: n, reason: collision with root package name */
    public u8.r f22544n;

    /* renamed from: o, reason: collision with root package name */
    public u8.d f22545o;

    /* renamed from: p, reason: collision with root package name */
    public float f22546p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f22533a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f22534b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f22535c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f22536d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22539g = new ArrayList();

    public b(r8.v vVar, a9.b bVar, Paint.Cap cap, Paint.Join join, float f10, y8.a aVar, y8.b bVar2, ArrayList arrayList, y8.b bVar3) {
        a9.l lVar = new a9.l(1, 2);
        this.f22541i = lVar;
        this.f22546p = 0.0f;
        this.f22537e = vVar;
        this.f22538f = bVar;
        lVar.setStyle(Paint.Style.STROKE);
        lVar.setStrokeCap(cap);
        lVar.setStrokeJoin(join);
        lVar.setStrokeMiter(f10);
        this.k = (u8.e) aVar.E0();
        this.j = bVar2.E0();
        if (bVar3 == null) {
            this.f22543m = null;
        } else {
            this.f22543m = bVar3.E0();
        }
        this.f22542l = new ArrayList(arrayList.size());
        this.f22540h = new float[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f22542l.add(((y8.b) arrayList.get(i10)).E0());
        }
        bVar.e(this.k);
        bVar.e(this.j);
        for (int i11 = 0; i11 < this.f22542l.size(); i11++) {
            bVar.e((u8.d) this.f22542l.get(i11));
        }
        u8.h hVar = this.f22543m;
        if (hVar != null) {
            bVar.e(hVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((u8.d) this.f22542l.get(i12)).a(this);
        }
        u8.h hVar2 = this.f22543m;
        if (hVar2 != null) {
            hVar2.a(this);
        }
        if (bVar.l() != null) {
            u8.h hVarE0 = ((y8.b) bVar.l().f26690a).E0();
            this.f22545o = hVarE0;
            hVarE0.a(this);
            bVar.e(this.f22545o);
        }
    }

    @Override // u8.a
    public final void a() {
        this.f22537e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // t8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8, java.util.List r9) {
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
            t8.c r3 = (t8.c) r3
            boolean r4 = r3 instanceof t8.v
            if (r4 == 0) goto L1f
            t8.v r3 = (t8.v) r3
            z8.w r4 = r3.f22661c
            z8.w r5 = z8.w.INDIVIDUALLY
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
            java.util.ArrayList r0 = r7.f22539g
            if (r8 < 0) goto L68
            java.lang.Object r3 = r9.get(r8)
            t8.c r3 = (t8.c) r3
            boolean r4 = r3 instanceof t8.v
            if (r4 == 0) goto L53
            r4 = r3
            t8.v r4 = (t8.v) r4
            z8.w r5 = r4.f22661c
            z8.w r6 = z8.w.INDIVIDUALLY
            if (r5 != r6) goto L53
            if (r1 == 0) goto L49
            r0.add(r1)
        L49:
            t8.a r0 = new t8.a
            r0.<init>(r4)
            r4.c(r7)
            r1 = r0
            goto L65
        L53:
            boolean r0 = r3 instanceof t8.n
            if (r0 == 0) goto L65
            if (r1 != 0) goto L5e
            t8.a r1 = new t8.a
            r1.<init>(r2)
        L5e:
            java.util.ArrayList r0 = r1.f22531a
            t8.n r3 = (t8.n) r3
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
        throw new UnsupportedOperationException("Method not decompiled: t8.b.b(java.util.List, java.util.List):void");
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        r8.a aVar = r8.d.f21312a;
        Path path = this.f22534b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22539g;
            if (i10 >= arrayList.size()) {
                RectF rectF2 = this.f22536d;
                path.computeBounds(rectF2, false);
                float fM = this.j.m() / 2.0f;
                rectF2.set(rectF2.left - fM, rectF2.top - fM, rectF2.right + fM, rectF2.bottom + fM);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                r8.a aVar2 = r8.d.f21312a;
                return;
            }
            a aVar3 = (a) arrayList.get(i10);
            for (int i11 = 0; i11 < aVar3.f22531a.size(); i11++) {
                path.addPath(((n) aVar3.f22531a.get(i11)).g(), matrix);
            }
            i10++;
        }
    }

    @Override // x8.g
    public void f(bm.e eVar, Object obj) {
        PointF pointF = z.f21401a;
        if (obj == 4) {
            this.k.k(eVar);
            return;
        }
        if (obj == z.f21415q) {
            this.j.k(eVar);
            return;
        }
        ColorFilter colorFilter = z.I;
        a9.b bVar = this.f22538f;
        if (obj == colorFilter) {
            u8.r rVar = this.f22544n;
            if (rVar != null) {
                bVar.o(rVar);
            }
            u8.r rVar2 = new u8.r(eVar, null);
            this.f22544n = rVar2;
            rVar2.a(this);
            bVar.e(this.f22544n);
            return;
        }
        if (obj == z.f21405e) {
            u8.d dVar = this.f22545o;
            if (dVar != null) {
                dVar.k(eVar);
                return;
            }
            u8.r rVar3 = new u8.r(eVar, null);
            this.f22545o = rVar3;
            rVar3.a(this);
            bVar.e(this.f22545o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    @Override // t8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, e9.a r24) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.b.h(android.graphics.Canvas, android.graphics.Matrix, int, e9.a):void");
    }
}
