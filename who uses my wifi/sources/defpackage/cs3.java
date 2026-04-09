package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cs3 implements dp2 {
    public static final cs3 h;
    public static final cs3 i;
    public static final cs3 j;
    public static final cs3 k;
    public static final cs3 l;
    public static final cs3 m;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new cs3("TINK", i2);
        i = new cs3("CRUNCHY", i2);
        j = new cs3("NO_PREFIX", i2);
        int i3 = 1;
        k = new cs3("TINK", i3);
        l = new cs3("CRUNCHY", i3);
        m = new cs3("NO_PREFIX", i3);
    }

    public /* synthetic */ cs3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    public static cs3 a(kz2 kz2Var) {
        String str;
        kz2Var.G(2);
        int iK = kz2Var.K();
        int i2 = iK >> 1;
        int i3 = iK & 1;
        int iK2 = kz2Var.K() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = iK2 | (i3 << 5);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i4).length();
        String str2 = i2 < 10 ? ".0" : ".";
        int i5 = ga1.i(str2, str.length(), length);
        String str3 = i4 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(ga1.i(str3, i5, length2));
        sb.append(str);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        sb.append(i4);
        return new cs3(sb.toString(), 3);
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ((lp2) obj).l(this.g);
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
