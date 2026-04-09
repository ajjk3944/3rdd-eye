package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kp0 implements bq, kk0, yz, x9, v40 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final i90 c;
    public final da d;
    public final String e;
    public final boolean f;
    public final pu g;
    public final pu h;
    public final q21 i;
    public zi j;

    public kp0(i90 i90Var, da daVar, wn0 wn0Var) {
        this.c = i90Var;
        this.d = daVar;
        this.e = wn0Var.b;
        this.f = wn0Var.d;
        pu puVarQ0 = wn0Var.c.Q0();
        this.g = puVarQ0;
        daVar.e(puVarQ0);
        puVarQ0.a(this);
        pu puVarQ02 = ((c4) wn0Var.e).Q0();
        this.h = puVarQ02;
        daVar.e(puVarQ02);
        puVarQ02.a(this);
        h4 h4Var = (h4) wn0Var.f;
        h4Var.getClass();
        q21 q21Var = new q21(h4Var);
        this.i = q21Var;
        q21Var.a(daVar);
        q21Var.b(this);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        if (this.i.c(obj, vq2Var)) {
            return;
        }
        if (obj == n90.p) {
            this.g.j(vq2Var);
        } else if (obj == n90.q) {
            this.h.j(vq2Var);
        }
    }

    @Override // defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.j.b(rectF, matrix, z);
    }

    @Override // defpackage.x9
    public final void c() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        this.j.d(list, list2);
    }

    @Override // defpackage.yz
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((vi) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new zi(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.kk0
    public final Path f() {
        Path pathF = this.j.f();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path.addPath(pathF, matrix);
        }
        return path;
    }

    @Override // defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        q21 q21Var = this.i;
        float fFloatValue3 = ((Float) q21Var.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) q21Var.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(q21Var.f(f + fFloatValue2));
            this.j.g(canvas, matrix2, (int) (te0.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), mqVar);
        }
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            vi viVar = (vi) this.j.i.get(i2);
            if (viVar instanceof v40) {
                te0.g(t40Var, i, arrayList, t40Var2, (v40) viVar);
            }
        }
    }
}
