package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vu0 implements kk0, x9, v40 {
    public final String b;
    public final boolean c;
    public final i90 d;
    public final cv0 e;
    public boolean f;
    public final Path a = new Path();
    public final ih g = new ih();

    public vu0(i90 i90Var, da daVar, lv0 lv0Var) {
        this.b = lv0Var.a;
        this.c = lv0Var.d;
        this.d = i90Var;
        cv0 cv0Var = new cv0((List) lv0Var.c.g);
        this.e = cv0Var;
        daVar.e(cv0Var);
        cv0Var.a(this);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        if (obj == n90.K) {
            this.e.j(vq2Var);
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.vi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L40
            java.lang.Object r1 = r1.get(r0)
            vi r1 = (defpackage.vi) r1
            boolean r2 = r1 instanceof defpackage.e31
            if (r2 == 0) goto L28
            r2 = r1
            e31 r2 = (defpackage.e31) r2
            int r3 = r2.c
            r4 = 1
            if (r3 != r4) goto L28
            ih r1 = r5.g
            java.util.ArrayList r1 = r1.a
            r1.add(r2)
            r2.a(r5)
            goto L3d
        L28:
            boolean r2 = r1 instanceof defpackage.yq0
            if (r2 == 0) goto L3d
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            yq0 r1 = (defpackage.yq0) r1
            ba r2 = r1.b
            r2.a(r5)
            r7.add(r1)
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            cv0 r6 = r5.e
            r6.m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu0.d(java.util.List, java.util.List):void");
    }

    @Override // defpackage.kk0
    public final Path f() {
        boolean z = this.f;
        cv0 cv0Var = this.e;
        Path path = this.a;
        if (z && cv0Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) cv0Var.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f = true;
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
