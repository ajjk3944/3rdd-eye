package r0;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24134a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24135b;

    public e(Object obj, Object obj2) {
        this.f24134a = obj;
        this.f24135b = obj2;
    }

    public static e a(Object obj, Object obj2) {
        return new e(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f24134a, this.f24134a) && d.a(eVar.f24135b, this.f24135b);
    }

    public int hashCode() {
        Object obj = this.f24134a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f24135b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f24134a + " " + this.f24135b + "}";
    }
}
