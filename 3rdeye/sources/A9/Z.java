package A9;

import N7.B8;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class Z implements InterfaceC0584j0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f218b;

    public Z(boolean z10) {
        this.f218b = z10;
    }

    @Override // A9.InterfaceC0584j0
    public final D0 c() {
        return null;
    }

    @Override // A9.InterfaceC0584j0
    public final boolean isActive() {
        return this.f218b;
    }

    public final String toString() {
        return B8.j(new StringBuilder("Empty{"), this.f218b ? "Active" : "New", '}');
    }
}
