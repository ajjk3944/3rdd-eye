package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f55437a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55438b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55439c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f55440d;

    public u(String processName, int i10, int i11, boolean z10) {
        AbstractC6492s.i(processName, "processName");
        this.f55437a = processName;
        this.f55438b = i10;
        this.f55439c = i11;
        this.f55440d = z10;
    }

    public final int a() {
        return this.f55439c;
    }

    public final int b() {
        return this.f55438b;
    }

    public final String c() {
        return this.f55437a;
    }

    public final boolean d() {
        return this.f55440d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC6492s.d(this.f55437a, uVar.f55437a) && this.f55438b == uVar.f55438b && this.f55439c == uVar.f55439c && this.f55440d == uVar.f55440d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.f55437a.hashCode() * 31) + Integer.hashCode(this.f55438b)) * 31) + Integer.hashCode(this.f55439c)) * 31;
        boolean z10 = this.f55440d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f55437a + ", pid=" + this.f55438b + ", importance=" + this.f55439c + ", isDefaultProcess=" + this.f55440d + ')';
    }
}
