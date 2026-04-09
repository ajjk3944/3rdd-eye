package a3;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3754b {

    /* renamed from: a, reason: collision with root package name */
    private final String f25719a;

    private C3754b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f25719a = str;
    }

    public static C3754b b(String str) {
        return new C3754b(str);
    }

    public String a() {
        return this.f25719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3754b) {
            return this.f25719a.equals(((C3754b) obj).f25719a);
        }
        return false;
    }

    public int hashCode() {
        return this.f25719a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f25719a + "\"}";
    }
}
