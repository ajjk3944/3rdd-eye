package L0;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final P0.b f11072a;

    public K(int i10) {
        this.f11072a = new P0.b(i10);
    }

    public final M a(L l10) {
        M m10 = (M) this.f11072a.d(new C3177g(l10));
        if (m10 == null || m10.w().j().c()) {
            return null;
        }
        return m10;
    }

    public final M b(L l10, M m10) {
        return (M) this.f11072a.e(new C3177g(l10), m10);
    }
}
