package B5;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f794a;

    public e(Throwable th) {
        this.f794a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return q5.i.a(this.f794a, ((e) obj).f794a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f794a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // B5.f
    public final String toString() {
        return "Closed(" + this.f794a + ')';
    }
}
