package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ts3 implements lz0 {
    public static final ts3 h;
    public static final ts3 i;
    public static final ts3 j;
    public static final ts3 k;
    public static final ts3 l;
    public static final ts3 m;
    public static final ts3 n;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new ts3("TINK", i2);
        i = new ts3("CRUNCHY", i2);
        j = new ts3("NO_PREFIX", i2);
        int i3 = 1;
        k = new ts3("TINK", i3);
        l = new ts3("CRUNCHY", i3);
        m = new ts3("LEGACY", i3);
        n = new ts3("NO_PREFIX", i3);
    }

    public /* synthetic */ ts3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.lz0
    public String a() {
        return this.g;
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lz0
    public void c(lx lxVar) {
    }
}
