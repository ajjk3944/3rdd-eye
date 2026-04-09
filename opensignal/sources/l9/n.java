package l9;

/* loaded from: classes.dex */
public final class n extends y {

    /* renamed from: a, reason: collision with root package name */
    public final x f15039a;

    /* renamed from: b, reason: collision with root package name */
    public final l f15040b;

    public n(x xVar, l lVar) {
        this.f15039a = xVar;
        this.f15040b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        x xVar = this.f15039a;
        if (xVar == null) {
            if (((n) yVar).f15039a != null) {
                return false;
            }
        } else if (!xVar.equals(((n) yVar).f15039a)) {
            return false;
        }
        return this.f15040b.equals(((n) yVar).f15040b);
    }

    public final int hashCode() {
        x xVar = this.f15039a;
        return (((xVar == null ? 0 : xVar.hashCode()) ^ 1000003) * 1000003) ^ this.f15040b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f15039a + ", androidClientInfo=" + this.f15040b + "}";
    }
}
