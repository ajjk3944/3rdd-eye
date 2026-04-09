package fa;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f47210a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f47211b;

    /* renamed from: c, reason: collision with root package name */
    private final e f47212c;

    public f(boolean z10, boolean z11, e eVar) {
        this.f47210a = z10;
        this.f47211b = z11;
        this.f47212c = eVar;
    }

    public final boolean a() {
        return this.f47210a;
    }

    public final e b() {
        return this.f47212c;
    }

    public final boolean c() {
        return this.f47211b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f47210a == fVar.f47210a && this.f47211b == fVar.f47211b && AbstractC6492s.d(this.f47212c, fVar.f47212c);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f47210a) * 31) + Boolean.hashCode(this.f47211b)) * 31;
        e eVar = this.f47212c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        return "State(acceptButtonEnabled=" + this.f47210a + ", dismissButtonEnabled=" + this.f47211b + ", deviceData=" + this.f47212c + ")";
    }
}
