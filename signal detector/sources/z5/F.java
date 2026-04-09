package z5;

/* loaded from: classes3.dex */
public final class F implements O {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24487a;

    public F(boolean z6) {
        this.f24487a = z6;
    }

    @Override // z5.O
    public final boolean a() {
        return this.f24487a;
    }

    @Override // z5.O
    public final d0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f24487a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
