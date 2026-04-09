package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class td {
    public final /* synthetic */ int a;
    public int b;

    public static String g(int i) {
        char c = (char) ((i >> 24) & 255);
        int length = String.valueOf(c).length();
        char c2 = (char) ((i >> 16) & 255);
        int length2 = String.valueOf(c2).length();
        char c3 = (char) ((i >> 8) & 255);
        char c4 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c3).length() + String.valueOf(c4).length());
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public boolean f() {
        return h(1);
    }

    public boolean h(int i) {
        return (this.b & i) == i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return g(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ td(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
