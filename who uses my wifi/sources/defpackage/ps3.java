package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ps3 implements dp2 {
    public static final ps3 h;
    public static final ps3 i;
    public static final ps3 j;
    public static final ps3 k;
    public static final ps3 l;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new ps3("TINK", i2);
        i = new ps3("CRUNCHY", i2);
        j = new ps3("NO_PREFIX", i2);
        int i3 = 1;
        k = new ps3("IEEE_P1363", i3);
        l = new ps3("DER", i3);
    }

    public /* synthetic */ ps3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ((dq2) obj).G(this.g);
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
}
