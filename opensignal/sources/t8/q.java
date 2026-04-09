package t8;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import r8.z;

/* loaded from: classes.dex */
public final class q implements u8.a, k, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f22628c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22629d;

    /* renamed from: e, reason: collision with root package name */
    public final r8.v f22630e;

    /* renamed from: f, reason: collision with root package name */
    public final u8.d f22631f;

    /* renamed from: g, reason: collision with root package name */
    public final u8.d f22632g;

    /* renamed from: h, reason: collision with root package name */
    public final u8.h f22633h;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f22626a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f22627b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final fh.f f22634i = new fh.f(3);
    public u8.d j = null;

    public q(r8.v vVar, a9.b bVar, z8.n nVar) {
        this.f22628c = (String) nVar.f26751b;
        this.f22629d = nVar.f26753d;
        this.f22630e = vVar;
        u8.d dVarE0 = nVar.f26754e.E0();
        this.f22631f = dVarE0;
        u8.d dVarE02 = ((y8.e) nVar.f26755f).E0();
        this.f22632g = dVarE02;
        u8.h hVarE0 = nVar.f26752c.E0();
        this.f22633h = hVarE0;
        bVar.e(dVarE0);
        bVar.e(dVarE02);
        bVar.e(hVarE0);
        dVarE0.a(this);
        dVarE02.a(this);
        hVarE0.a(this);
    }

    @Override // u8.a
    public final void a() {
        this.k = false;
        this.f22630e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // t8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            t8.c r0 = (t8.c) r0
            boolean r1 = r0 instanceof t8.v
            if (r1 == 0) goto L28
            r1 = r0
            t8.v r1 = (t8.v) r1
            z8.w r2 = r1.f22661c
            z8.w r3 = z8.w.SIMULTANEOUSLY
            if (r2 != r3) goto L28
            fh.f r0 = r4.f22634i
            java.util.ArrayList r0 = r0.f8871a
            r0.add(r1)
            r1.c(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof t8.s
            if (r1 == 0) goto L32
            t8.s r0 = (t8.s) r0
            u8.d r0 = r0.f22645b
            r4.j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.q.b(java.util.List, java.util.List):void");
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        if (obj == z.f21407g) {
            this.f22632g.k(eVar);
        } else if (obj == z.f21409i) {
            this.f22631f.k(eVar);
        } else if (obj == z.f21408h) {
            this.f22633h.k(eVar);
        }
    }

    @Override // t8.n
    public final Path g() {
        float f10;
        u8.d dVar;
        boolean z10 = this.k;
        Path path = this.f22626a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f22629d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.f22632g.f();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        u8.h hVar = this.f22633h;
        float fM = hVar == null ? 0.0f : hVar.m();
        if (fM == 0.0f && (dVar = this.j) != null) {
            fM = Math.min(((Float) dVar.f()).floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (fM > fMin) {
            fM = fMin;
        }
        PointF pointF2 = (PointF) this.f22631f.f();
        path.moveTo(pointF2.x + f11, (pointF2.y - f12) + fM);
        path.lineTo(pointF2.x + f11, (pointF2.y + f12) - fM);
        RectF rectF = this.f22627b;
        if (fM > 0.0f) {
            float f13 = pointF2.x + f11;
            float f14 = fM * 2.0f;
            f10 = 2.0f;
            float f15 = pointF2.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f10 = 2.0f;
        }
        path.lineTo((pointF2.x - f11) + fM, pointF2.y + f12);
        if (fM > 0.0f) {
            float f16 = pointF2.x - f11;
            float f17 = pointF2.y + f12;
            float f18 = fM * f10;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f11, (pointF2.y - f12) + fM);
        if (fM > 0.0f) {
            float f19 = pointF2.x - f11;
            float f20 = pointF2.y - f12;
            float f21 = fM * f10;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f11) - fM, pointF2.y - f12);
        if (fM > 0.0f) {
            float f22 = pointF2.x + f11;
            float f23 = fM * f10;
            float f24 = pointF2.y - f12;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f22634i.e(path);
        this.k = true;
        return path;
    }

    @Override // t8.c
    public final String getName() {
        return this.f22628c;
    }
}
