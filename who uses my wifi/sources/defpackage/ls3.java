package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ls3 {
    public static final ls3 c;
    public static final ls3 d;
    public static final ls3 e;
    public static final ls3 f;
    public static final ls3 g;
    public static final ls3 h;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        c = new ls3("TINK", i);
        d = new ls3("CRUNCHY", i);
        e = new ls3("NO_PREFIX", i);
        int i2 = 1;
        f = new ls3("SHA256", i2);
        g = new ls3("SHA384", i2);
        h = new ls3("SHA512", i2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ls3(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
