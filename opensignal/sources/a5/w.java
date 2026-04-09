package a5;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f168c = new w(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f170b;

    static {
        new w(0, 0);
    }

    public w(int i10, int i11) {
        a.e((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f169a = i10;
        this.f170b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f169a == wVar.f169a && this.f170b == wVar.f170b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f169a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f170b;
    }

    public final String toString() {
        return this.f169a + "x" + this.f170b;
    }
}
