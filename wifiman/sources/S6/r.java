package S6;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20349a;

    public r(Object obj) {
        this.f20349a = obj;
    }

    public final Object a() {
        return this.f20349a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC6492s.d(this.f20349a, ((r) obj).f20349a);
    }

    public int hashCode() {
        Object obj = this.f20349a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StableHolder(value=" + this.f20349a + ')';
    }
}
