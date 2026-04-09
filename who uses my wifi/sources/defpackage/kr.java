package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kr implements kk0, x9, v40 {
    public final String b;
    public final i90 c;
    public final rz d;
    public final ba e;
    public final cf f;
    public boolean h;
    public final Path a = new Path();
    public final ih g = new ih();

    public kr(i90 i90Var, da daVar, cf cfVar) {
        this.b = cfVar.a;
        this.c = i90Var;
        ba baVarQ0 = cfVar.c.Q0();
        this.d = (rz) baVarQ0;
        ba baVarQ02 = cfVar.b.Q0();
        this.e = baVarQ02;
        this.f = cfVar;
        daVar.e(baVarQ0);
        daVar.e(baVarQ02);
        baVarQ0.a(this);
        baVarQ02.a(this);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        if (obj == n90.f) {
            this.d.j(vq2Var);
        } else if (obj == n90.i) {
            this.e.j(vq2Var);
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            vi viVar = (vi) arrayList.get(i);
            if (viVar instanceof e31) {
                e31 e31Var = (e31) viVar;
                if (e31Var.c == 1) {
                    this.g.a.add(e31Var);
                    e31Var.a(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.kk0
    public final Path f() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        cf cfVar = this.f;
        if (cfVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (cfVar.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }
}
