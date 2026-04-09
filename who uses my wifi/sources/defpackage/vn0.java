package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vn0 implements x9, v40, kk0 {
    public final String c;
    public final boolean d;
    public final i90 e;
    public final ba f;
    public final ba g;
    public final pu h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final ih i = new ih();
    public ba j = null;

    public vn0(i90 i90Var, da daVar, wn0 wn0Var) {
        this.c = wn0Var.b;
        this.d = wn0Var.d;
        this.e = i90Var;
        ba baVarQ0 = wn0Var.e.Q0();
        this.f = baVarQ0;
        ba baVarQ02 = ((j4) wn0Var.f).Q0();
        this.g = baVarQ02;
        pu puVarQ0 = wn0Var.c.Q0();
        this.h = puVarQ0;
        daVar.e(baVarQ0);
        daVar.e(baVarQ02);
        daVar.e(puVarQ0);
        baVarQ0.a(this);
        baVarQ02.a(this);
        puVarQ0.a(this);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        if (obj == n90.g) {
            this.g.j(vq2Var);
        } else if (obj == n90.i) {
            this.f.j(vq2Var);
        } else if (obj == n90.h) {
            this.h.j(vq2Var);
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // defpackage.vi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            vi r0 = (defpackage.vi) r0
            boolean r1 = r0 instanceof defpackage.e31
            if (r1 == 0) goto L27
            r1 = r0
            e31 r1 = (defpackage.e31) r1
            int r2 = r1.c
            r3 = 1
            if (r2 != r3) goto L27
            ih r0 = r4.i
            java.util.ArrayList r0 = r0.a
            r0.add(r1)
            r1.a(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof defpackage.yq0
            if (r1 == 0) goto L31
            yq0 r0 = (defpackage.yq0) r0
            ba r0 = r0.b
            r4.j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn0.d(java.util.List, java.util.List):void");
    }

    @Override // defpackage.kk0
    public final Path f() {
        float f;
        ba baVar;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        pu puVar = this.h;
        float fL = puVar == null ? 0.0f : puVar.l();
        if (fL == 0.0f && (baVar = this.j) != null) {
            fL = Math.min(((Float) baVar.e()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fL);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fL);
        RectF rectF = this.b;
        if (fL > 0.0f) {
            float f4 = pointF2.x + f2;
            float f5 = fL * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + fL, pointF2.y + f3);
        if (fL > 0.0f) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = fL * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fL);
        if (fL > 0.0f) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = fL * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fL, pointF2.y - f3);
        if (fL > 0.0f) {
            float f13 = pointF2.x + f2;
            float f14 = fL * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }
}
