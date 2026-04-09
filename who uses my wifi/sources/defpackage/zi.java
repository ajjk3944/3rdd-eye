package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zi implements bq, kk0, x9, u40 {
    public final t3 a;
    public final RectF b;
    public final pi0 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final i90 j;
    public ArrayList k;
    public final q21 l;

    public zi(i90 i90Var, da daVar, av0 av0Var, u80 u80Var) {
        h4 h4Var;
        String str = av0Var.a;
        boolean z = av0Var.c;
        List list = av0Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            vi viVarA = ((ej) list.get(i2)).a(i90Var, u80Var, daVar);
            if (viVarA != null) {
                arrayList.add(viVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                h4Var = null;
                break;
            }
            ej ejVar = (ej) list.get(i);
            if (ejVar instanceof h4) {
                h4Var = (h4) ejVar;
                break;
            }
            i++;
        }
        this(i90Var, daVar, str, z, arrayList, h4Var);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        q21 q21Var = this.l;
        if (q21Var != null) {
            q21Var.c(obj, vq2Var);
        }
    }

    @Override // defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        q21 q21Var = this.l;
        if (q21Var != null) {
            matrix2.preConcat(q21Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vi viVar = (vi) arrayList.get(size);
            if (viVar instanceof bq) {
                ((bq) viVar).b(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            vi viVar = (vi) arrayList.get(size2);
            viVar.d(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(viVar);
        }
    }

    public final List e() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                vi viVar = (vi) arrayList.get(i);
                if (viVar instanceof kk0) {
                    this.k.add((kk0) viVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.kk0
    public final Path f() {
        Matrix matrix = this.d;
        matrix.reset();
        q21 q21Var = this.l;
        if (q21Var != null) {
            matrix.set(q21Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vi viVar = (vi) arrayList.get(size);
                if (viVar instanceof kk0) {
                    path.addPath(((kk0) viVar).f(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        q21 q21Var = this.l;
        if (q21Var != null) {
            matrix2.preConcat(q21Var.e());
            i = (int) (((((q21Var.j == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        i90 i90Var = this.j;
        boolean z = (i90Var.x && i() && i != 255) || (mqVar != null && i90Var.y && i());
        int i2 = z ? 255 : i;
        pi0 pi0Var = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            b(rectF, matrix, true);
            t3 t3Var = this.a;
            t3Var.g = i;
            if (mqVar != null) {
                if (Color.alpha(mqVar.d) > 0) {
                    t3Var.h = mqVar;
                } else {
                    t3Var.h = null;
                }
                mqVar = null;
            } else {
                t3Var.h = null;
            }
            canvas = pi0Var.e(canvas, rectF, t3Var);
        } else if (mqVar != null) {
            mq mqVar2 = new mq(mqVar);
            mqVar2.b(i2);
            mqVar = mqVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof bq) {
                ((bq) obj).g(canvas, matrix2, i2, mqVar);
            }
        }
        if (z) {
            pi0Var.c();
        }
    }

    @Override // defpackage.vi
    public final String getName() {
        throw null;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        String str = this.g;
        if (!t40Var.c(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            t40 t40Var3 = new t40(t40Var2);
            t40Var3.a.add(str);
            if (t40Var.a(str, i)) {
                t40 t40Var4 = new t40(t40Var3);
                t40Var4.b = this;
                arrayList.add(t40Var4);
            }
            t40Var2 = t40Var3;
        }
        if (!t40Var.d(str, i)) {
            return;
        }
        int iB = t40Var.b(str, i) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            vi viVar = (vi) arrayList2.get(i2);
            if (viVar instanceof u40) {
                ((u40) viVar).h(t40Var, iB, arrayList, t40Var2);
            }
            i2++;
        }
    }

    public final boolean i() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof bq) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public zi(i90 i90Var, da daVar, String str, boolean z, ArrayList arrayList, h4 h4Var) {
        this.a = new t3(4, (byte) 0);
        this.b = new RectF();
        this.c = new pi0();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = i90Var;
        this.h = z;
        this.i = arrayList;
        if (h4Var != null) {
            q21 q21Var = new q21(h4Var);
            this.l = q21Var;
            q21Var.a(daVar);
            q21Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vi viVar = (vi) arrayList.get(size);
            if (viVar instanceof yz) {
                arrayList2.add((yz) viVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((yz) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
