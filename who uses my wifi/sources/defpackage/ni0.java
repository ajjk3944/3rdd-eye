package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ni0 {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public mi0 e;
    public float f;

    public static synchronized ni0 a(int i, mi0 mi0Var) {
        ni0 ni0Var;
        ni0Var = new ni0();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        ni0Var.b = i;
        ni0Var.c = new Object[i];
        ni0Var.d = 0;
        ni0Var.e = mi0Var;
        ni0Var.f = 1.0f;
        ni0Var.d();
        int i2 = g;
        ni0Var.a = i2;
        g = i2 + 1;
        return ni0Var;
    }

    public final synchronized mi0 b() {
        mi0 mi0Var;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            mi0Var = (mi0) objArr[i];
            mi0Var.f = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return mi0Var;
    }

    public final synchronized void c(mi0 mi0Var) {
        try {
            int i = mi0Var.f;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + mi0Var.f + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            mi0Var.f = this.a;
            this.c[this.d] = mi0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
