package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bs3 implements iq3, dp2 {
    public static final bs3 h;
    public static final bs3 i;
    public static final bs3 j;
    public static final bs3 k;
    public static final bs3 l;
    public static final bs3 m;
    public static final bs3 n;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new bs3("SHA1", i2);
        i = new bs3("SHA224", i2);
        j = new bs3("SHA256", i2);
        k = new bs3("SHA384", i2);
        l = new bs3("SHA512", i2);
        int i3 = 1;
        m = new bs3("TINK", i3);
        n = new bs3("NO_PREFIX", i3);
    }

    public /* synthetic */ bs3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ((lp2) obj).w(this.g);
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        hg4.C.h.e(this.g, th);
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

    @Override // defpackage.iq3
    public void p(Object obj) {
    }
}
