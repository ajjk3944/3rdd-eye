package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class le {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public ArrayList i;

    public final void a(l60 l60Var) {
        c(l60Var);
        this.i.add(l60Var);
    }

    public final void b(xs xsVar, int i) {
        float f = xsVar.h;
        ArrayList arrayList = this.i;
        if (arrayList.size() <= i || i < 0) {
            Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            return;
        }
        q10 q10Var = (q10) arrayList.get(i);
        l60 l60Var = (l60) q10Var;
        ArrayList arrayList2 = l60Var.o;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (f < l60Var.s) {
            l60Var.s = f;
        }
        if (f > l60Var.r) {
            l60Var.r = f;
        }
        float f2 = xsVar.f;
        if (f2 < l60Var.q) {
            l60Var.q = f2;
        }
        if (f2 > l60Var.p) {
            l60Var.p = f2;
        }
        if (arrayList2.add(xsVar)) {
            int i2 = ((l60) q10Var).d;
            float f3 = this.a;
            float f4 = xsVar.f;
            if (f3 < f4) {
                this.a = f4;
            }
            if (this.b > f4) {
                this.b = f4;
            }
            if (this.c < f) {
                this.c = f;
            }
            if (this.d > f) {
                this.d = f;
            }
            if (i2 == 1) {
                if (this.e < f4) {
                    this.e = f4;
                }
                if (this.f > f4) {
                    this.f = f4;
                    return;
                }
                return;
            }
            if (this.g < f4) {
                this.g = f4;
            }
            if (this.h > f4) {
                this.h = f4;
            }
        }
    }

    public final void c(q10 q10Var) {
        float f = this.a;
        l60 l60Var = (l60) q10Var;
        float f2 = l60Var.p;
        if (f < f2) {
            this.a = f2;
        }
        float f3 = this.b;
        float f4 = l60Var.q;
        if (f3 > f4) {
            this.b = f4;
        }
        float f5 = this.c;
        float f6 = l60Var.r;
        if (f5 < f6) {
            this.c = f6;
        }
        float f7 = this.d;
        float f8 = l60Var.s;
        if (f7 > f8) {
            this.d = f8;
        }
        if (((l60) q10Var).d == 1) {
            if (this.e < f2) {
                this.e = f2;
            }
            if (this.f > f4) {
                this.f = f4;
                return;
            }
            return;
        }
        if (this.g < f2) {
            this.g = f2;
        }
        if (this.h > f4) {
            this.h = f4;
        }
    }

    public final q10 d(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (q10) arrayList.get(i);
    }

    public final int e() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int size2 = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            size2 += ((l60) ((q10) obj)).o.size();
        }
        return size2;
    }

    public final float f(int i) {
        if (i == 1) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float g(int i) {
        if (i == 1) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }
}
