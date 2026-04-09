package e1;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2300c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19901b;

    public C2300c(String str, int i) {
        this.f19900a = str;
        this.f19901b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2300c)) {
            return false;
        }
        C2300c c2300c = (C2300c) obj;
        if (this.f19901b != c2300c.f19901b) {
            return false;
        }
        return this.f19900a.equals(c2300c.f19900a);
    }

    public final int hashCode() {
        return (this.f19900a.hashCode() * 31) + this.f19901b;
    }
}
