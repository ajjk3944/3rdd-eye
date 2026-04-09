package r1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f23357a;

    public k(String str) {
        this.f23357a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f23357a.equals(((k) obj).f23357a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23357a.hashCode();
    }

    public final String toString() {
        return A.f.p(new StringBuilder("StringHeaderFactory{value='"), this.f23357a, "'}");
    }
}
