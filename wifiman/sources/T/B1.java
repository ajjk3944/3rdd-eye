package T;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class B1 implements F1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20838a;

    public B1(Object obj) {
        this.f20838a = obj;
    }

    @Override // T.F1
    public Object a(A0 a02) {
        return this.f20838a;
    }

    public final Object b() {
        return this.f20838a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B1) && AbstractC6492s.d(this.f20838a, ((B1) obj).f20838a);
    }

    public int hashCode() {
        Object obj = this.f20838a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f20838a + ')';
    }
}
