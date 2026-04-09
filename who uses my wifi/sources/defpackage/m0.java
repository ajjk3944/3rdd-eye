package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class m0 {
    public int f;
    public int g;
    public Object h;

    public static b54 f(byte[] bArr, int i, int i2) {
        b54 b54Var = new b54(bArr, i, i2);
        try {
            b54Var.D(i2);
            return b54Var;
        } catch (a64 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract int D(int i);

    public abstract void a(int i);

    public abstract boolean c();

    public abstract int e();

    public void g() {
        int iJ;
        do {
            iJ = j();
            if (iJ == 0) {
                return;
            }
            int i = this.f;
            int i2 = this.g;
            if (i + i2 >= 100) {
                throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.g = i2 + 1;
            this.g--;
        } while (l(iJ));
    }

    public abstract int j();

    public abstract void k(int i);

    public abstract boolean l(int i);

    public abstract double m();

    public abstract float n();

    public abstract long o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract boolean t();

    public abstract String u();

    public abstract String v();

    public abstract y44 w();

    public abstract int x();

    public abstract int y();

    public abstract int z();
}
