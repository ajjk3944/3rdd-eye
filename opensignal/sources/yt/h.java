package yt;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f26447a;

    public h(Throwable th2) {
        this.f26447a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return br.l.a(this.f26447a, ((h) obj).f26447a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f26447a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // yt.i
    public final String toString() {
        return "Closed(" + this.f26447a + ')';
    }
}
