package t8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import r8.z;

/* loaded from: classes.dex */
public final class u extends b {

    /* renamed from: q, reason: collision with root package name */
    public final a9.b f22654q;

    /* renamed from: r, reason: collision with root package name */
    public final String f22655r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22656s;

    /* renamed from: t, reason: collision with root package name */
    public final u8.e f22657t;

    /* renamed from: u, reason: collision with root package name */
    public u8.r f22658u;

    public u(r8.v vVar, a9.b bVar, z8.v vVar2) {
        super(vVar, bVar, vVar2.f26779g.toPaintCap(), vVar2.f26780h.toPaintJoin(), vVar2.f26781i, vVar2.f26777e, vVar2.f26778f, vVar2.f26775c, vVar2.f26774b);
        this.f22654q = bVar;
        this.f22655r = vVar2.f26773a;
        this.f22656s = vVar2.j;
        u8.d dVarE0 = vVar2.f26776d.E0();
        this.f22657t = (u8.e) dVarE0;
        dVarE0.a(this);
        bVar.e(dVarE0);
    }

    @Override // t8.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        PointF pointF = z.f21401a;
        u8.e eVar2 = this.f22657t;
        if (obj == 2) {
            eVar2.k(eVar);
            return;
        }
        if (obj == z.I) {
            u8.r rVar = this.f22658u;
            a9.b bVar = this.f22654q;
            if (rVar != null) {
                bVar.o(rVar);
            }
            u8.r rVar2 = new u8.r(eVar, null);
            this.f22658u = rVar2;
            rVar2.a(this);
            bVar.e(eVar2);
        }
    }

    @Override // t8.c
    public final String getName() {
        return this.f22655r;
    }

    @Override // t8.b, t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        if (this.f22656s) {
            return;
        }
        u8.e eVar = this.f22657t;
        int iM = eVar.m(eVar.b(), eVar.d());
        a9.l lVar = this.f22541i;
        lVar.setColor(iM);
        u8.r rVar = this.f22658u;
        if (rVar != null) {
            lVar.setColorFilter((ColorFilter) rVar.f());
        }
        super.h(canvas, matrix, i10, aVar);
    }
}
