package C0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1096a;

    /* renamed from: b, reason: collision with root package name */
    public int f1097b;

    public static String m(int i) {
        char c6 = (char) ((i >> 24) & 255);
        int length = String.valueOf(c6).length();
        char c7 = (char) ((i >> 16) & 255);
        int length2 = String.valueOf(c7).length();
        char c8 = (char) ((i >> 8) & 255);
        char c9 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c8).length() + String.valueOf(c9).length());
        sb.append(c6);
        sb.append(c7);
        sb.append(c8);
        sb.append(c9);
        return sb.toString();
    }

    public abstract void a(H0.c cVar);

    public abstract void b(H0.c cVar);

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract void h(H0.c cVar);

    public abstract void i(H0.c cVar);

    public abstract void j(H0.c cVar);

    public abstract r k(H0.c cVar);

    public boolean l() {
        return n(1);
    }

    public boolean n(int i) {
        return (this.f1097b & i) == i;
    }

    public String toString() {
        switch (this.f1096a) {
            case 1:
                return m(this.f1097b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(int i, int i3) {
        this.f1096a = i3;
        this.f1097b = i;
    }
}
