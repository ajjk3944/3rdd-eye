package r;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: r.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7534i0 implements InterfaceC7533i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f59717a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59718b;

    public C7534i0(InterfaceC7533i interfaceC7533i, long j10) {
        this.f59717a = interfaceC7533i;
        this.f59718b = j10;
    }

    @Override // r.InterfaceC7533i
    public v0 a(s0 s0Var) {
        return new j0(this.f59717a.a(s0Var), this.f59718b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7534i0)) {
            return false;
        }
        C7534i0 c7534i0 = (C7534i0) obj;
        return c7534i0.f59718b == this.f59718b && AbstractC6492s.d(c7534i0.f59717a, this.f59717a);
    }

    public int hashCode() {
        return (this.f59717a.hashCode() * 31) + Long.hashCode(this.f59718b);
    }
}
