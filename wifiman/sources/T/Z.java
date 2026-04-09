package T;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20996a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20997b;

    public Z(Object obj, Object obj2) {
        this.f20996a = obj;
        this.f20997b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return AbstractC6492s.d(this.f20996a, z10.f20996a) && AbstractC6492s.d(this.f20997b, z10.f20997b);
    }

    public int hashCode() {
        return (a(this.f20996a) * 31) + a(this.f20997b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f20996a + ", right=" + this.f20997b + ')';
    }
}
