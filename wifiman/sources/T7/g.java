package t7;

import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class g implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final long f61840a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61841b = true;

    public g(long j10) {
        this.f61840a = j10;
    }

    public final long a() {
        return this.f61840a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f61840a == ((g) obj).f61840a;
    }

    public int hashCode() {
        return Long.hashCode(this.f61840a);
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61841b;
    }

    public String toString() {
        return "Uptime(seconds=" + this.f61840a + ")";
    }
}
