package h7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f7.b0;
import f7.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements i7.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f24981c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24982d;

    /* renamed from: e, reason: collision with root package name */
    public final x f24983e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.e f24984f;
    public final i7.e g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.i f24985h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24987k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24979a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f24980b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f24986i = new c(0);
    public i7.e j = null;

    public p(x xVar, n7.a aVar, m7.i iVar) {
        this.f24981c = iVar.f28918b;
        this.f24982d = iVar.f28920d;
        this.f24983e = xVar;
        i7.e eVarG = iVar.f28921e.g();
        this.f24984f = eVarG;
        i7.e eVarG2 = ((l7.f) iVar.f28922f).g();
        this.g = eVarG2;
        i7.i iVarG = iVar.f28919c.g();
        this.f24985h = iVarG;
        aVar.e(eVarG);
        aVar.e(eVarG2);
        aVar.e(iVarG);
        eVarG.a(this);
        eVarG2.a(this);
        iVarG.a(this);
    }

    @Override // i7.a
    public final void a() {
        this.f24987k = false;
        this.f24983e.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        float f10;
        i7.e eVar;
        boolean z3 = this.f24987k;
        Path path = this.f24979a;
        if (z3) {
            return path;
        }
        path.reset();
        if (this.f24982d) {
            this.f24987k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        i7.i iVar = this.f24985h;
        float fL = iVar == null ? 0.0f : iVar.l();
        if (fL == 0.0f && (eVar = this.j) != null) {
            fL = Math.min(((Float) eVar.e()).floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f24984f.e();
        path.moveTo(pointF2.x + f11, (pointF2.y - f12) + fL);
        path.lineTo(pointF2.x + f11, (pointF2.y + f12) - fL);
        RectF rectF = this.f24980b;
        if (fL > 0.0f) {
            float f13 = pointF2.x + f11;
            float f14 = fL * 2.0f;
            f10 = 2.0f;
            float f15 = pointF2.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f10 = 2.0f;
        }
        path.lineTo((pointF2.x - f11) + fL, pointF2.y + f12);
        if (fL > 0.0f) {
            float f16 = pointF2.x - f11;
            float f17 = pointF2.y + f12;
            float f18 = fL * f10;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f11, (pointF2.y - f12) + fL);
        if (fL > 0.0f) {
            float f19 = pointF2.x - f11;
            float f20 = pointF2.y - f12;
            float f21 = fL * f10;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f11) - fL, pointF2.y - f12);
        if (fL > 0.0f) {
            float f22 = pointF2.x + f11;
            float f23 = fL * f10;
            float f24 = pointF2.y - f12;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f24986i.a(path);
        this.f24987k = true;
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // h7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            h7.d r0 = (h7.d) r0
            boolean r1 = r0 instanceof h7.u
            if (r1 == 0) goto L27
            r1 = r0
            h7.u r1 = (h7.u) r1
            int r2 = r1.f25012c
            r3 = 1
            if (r2 != r3) goto L27
            h7.c r0 = r4.f24986i
            java.util.ArrayList r0 = r0.f24902a
            r0.add(r1)
            r1.e(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof h7.r
            if (r1 == 0) goto L31
            h7.r r0 = (h7.r) r0
            i7.e r0 = r0.f24997b
            r4.j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.p.c(java.util.List, java.util.List):void");
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        if (obj == b0.g) {
            this.g.j(oVar);
        } else if (obj == b0.f23699i) {
            this.f24984f.j(oVar);
        } else if (obj == b0.f23698h) {
            this.f24985h.j(oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f24981c;
    }
}
