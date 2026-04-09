package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f01 implements Comparable {
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public f01(int i, int i2, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f01 f01Var = (f01) obj;
        int i = this.f - f01Var.f;
        return i == 0 ? this.g - f01Var.g : i;
    }
}
