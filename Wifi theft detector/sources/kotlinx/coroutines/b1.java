package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class b1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22233a;

    public b1(boolean z10) {
        this.f22233a = z10;
    }

    @Override // kotlinx.coroutines.m1
    public d2 a() {
        return null;
    }

    @Override // kotlinx.coroutines.m1
    public boolean isActive() {
        return this.f22233a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
