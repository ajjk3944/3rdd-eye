package u3;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f24504a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f24504a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f24504a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f24504a.equals(((b) obj).f24504a);
        }
        return false;
    }

    public int hashCode() {
        return this.f24504a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f24504a + "\"}";
    }
}
