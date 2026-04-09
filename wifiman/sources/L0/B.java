package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final A f10970a;

    /* renamed from: b, reason: collision with root package name */
    private final z f10971b;

    public B(A a10, z zVar) {
        this.f10970a = a10;
        this.f10971b = zVar;
    }

    public final z a() {
        return this.f10971b;
    }

    public final A b() {
        return this.f10970a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return AbstractC6492s.d(this.f10971b, b10.f10971b) && AbstractC6492s.d(this.f10970a, b10.f10970a);
    }

    public int hashCode() {
        A a10 = this.f10970a;
        int iHashCode = (a10 != null ? a10.hashCode() : 0) * 31;
        z zVar = this.f10971b;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f10970a + ", paragraphSyle=" + this.f10971b + ')';
    }

    public B(boolean z10) {
        this(null, new z(z10));
    }
}
