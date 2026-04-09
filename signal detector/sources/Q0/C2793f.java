package q0;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2793f {

    /* renamed from: a, reason: collision with root package name */
    public final J f22960a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22961b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22962c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22963d;

    public C2793f(J j6, boolean z6, Object obj, boolean z7) {
        if (!j6.f22937a && z6) {
            throw new IllegalArgumentException(j6.b().concat(" does not allow nullable values").toString());
        }
        if (!z6 && z7 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + j6.b() + " has null value but is not nullable.").toString());
        }
        this.f22960a = j6;
        this.f22961b = z6;
        this.f22963d = obj;
        this.f22962c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2793f.class.equals(obj.getClass())) {
            C2793f c2793f = (C2793f) obj;
            Object obj2 = c2793f.f22963d;
            if (this.f22961b != c2793f.f22961b || this.f22962c != c2793f.f22962c || !q5.i.a(this.f22960a, c2793f.f22960a)) {
                return false;
            }
            Object obj3 = this.f22963d;
            if (obj3 != null) {
                return q5.i.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f22960a.hashCode() * 31) + (this.f22961b ? 1 : 0)) * 31) + (this.f22962c ? 1 : 0)) * 31;
        Object obj = this.f22963d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2793f.class.getSimpleName());
        sb.append(" Type: " + this.f22960a);
        sb.append(" Nullable: " + this.f22961b);
        if (this.f22962c) {
            sb.append(" DefaultValue: " + this.f22963d);
        }
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
