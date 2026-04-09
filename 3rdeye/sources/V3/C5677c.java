package v3;

/* compiled from: Encoding.java */
/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5677c {

    /* renamed from: a, reason: collision with root package name */
    public final String f47039a;

    public C5677c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f47039a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5677c)) {
            return false;
        }
        return this.f47039a.equals(((C5677c) obj).f47039a);
    }

    public final int hashCode() {
        return this.f47039a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return B4.f.c(new StringBuilder("Encoding{name=\""), this.f47039a, "\"}");
    }
}
