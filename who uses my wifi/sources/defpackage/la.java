package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class la implements x9, v40, bq {
    public final i90 e;
    public final da f;
    public final float[] h;
    public final d50 i;
    public final pu j;
    public final fg k;
    public final ArrayList l;
    public final pu m;
    public m41 n;
    public ba o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public la(i90 i90Var, da daVar, Paint.Cap cap, Paint.Join join, float f, b4 b4Var, c4 c4Var, ArrayList arrayList, c4 c4Var2) {
        d50 d50Var = new d50(1, 0);
        this.i = d50Var;
        this.p = 0.0f;
        this.e = i90Var;
        this.f = daVar;
        d50Var.setStyle(Paint.Style.STROKE);
        d50Var.setStrokeCap(cap);
        d50Var.setStrokeJoin(join);
        d50Var.setStrokeMiter(f);
        this.k = (fg) b4Var.Q0();
        this.j = c4Var.Q0();
        if (c4Var2 == null) {
            this.m = null;
        } else {
            this.m = c4Var2.Q0();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((c4) arrayList.get(i)).Q0());
        }
        daVar.e(this.k);
        daVar.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            daVar.e((ba) this.l.get(i2));
        }
        pu puVar = this.m;
        if (puVar != null) {
            daVar.e(puVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ba) this.l.get(i3)).a(this);
        }
        pu puVar2 = this.m;
        if (puVar2 != null) {
            puVar2.a(this);
        }
        if (daVar.l() != null) {
            pu puVarQ0 = ((c4) daVar.l().g).Q0();
            this.o = puVarQ0;
            puVarQ0.a(this);
            daVar.e(this.o);
        }
    }

    @Override // defpackage.u40
    public void a(Object obj, vq2 vq2Var) {
        PointF pointF = n90.a;
        if (obj == 4) {
            this.k.j(vq2Var);
            return;
        }
        if (obj == n90.n) {
            this.j.j(vq2Var);
            return;
        }
        ColorFilter colorFilter = n90.F;
        da daVar = this.f;
        if (obj == colorFilter) {
            m41 m41Var = this.n;
            if (m41Var != null) {
                daVar.o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.n = m41Var2;
            m41Var2.a(this);
            daVar.e(this.n);
            return;
        }
        if (obj == n90.e) {
            ba baVar = this.o;
            if (baVar != null) {
                baVar.j(vq2Var);
                return;
            }
            m41 m41Var3 = new m41(null, vq2Var);
            this.o = m41Var3;
            m41Var3.a(this);
            daVar.e(this.o);
        }
    }

    @Override // defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            ka kaVar = (ka) arrayList.get(i);
            for (int i2 = 0; i2 < kaVar.a.size(); i2++) {
                path.addPath(((kk0) kaVar.a.get(i2)).f(), matrix);
            }
            i++;
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // defpackage.vi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            vi r4 = (defpackage.vi) r4
            boolean r5 = r4 instanceof defpackage.e31
            if (r5 == 0) goto L1e
            e31 r4 = (defpackage.e31) r4
            int r5 = r4.c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.a(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            vi r4 = (defpackage.vi) r4
            boolean r5 = r4 instanceof defpackage.e31
            if (r5 == 0) goto L50
            r5 = r4
            e31 r5 = (defpackage.e31) r5
            int r6 = r5.c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            ka r0 = new ka
            r0.<init>(r5)
            r5.a(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof defpackage.kk0
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            ka r1 = new ka
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.a
            kk0 r4 = (defpackage.kk0) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la.d(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    @Override // defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, defpackage.mq r24) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la.g(android.graphics.Canvas, android.graphics.Matrix, int, mq):void");
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }
}
