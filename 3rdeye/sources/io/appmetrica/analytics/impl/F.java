package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f39391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39393c;

    public F(int i, int i10, int i11) {
        this.f39391a = i;
        this.f39392b = i10;
        this.f39393c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!F.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        F f10 = (F) obj;
        return this.f39391a == f10.f39391a && this.f39392b == f10.f39392b && this.f39393c == f10.f39393c;
    }

    public final int hashCode() {
        return AbstractC4504b8.a(this.f39393c) + ((AbstractC4504b8.a(this.f39392b) + (AbstractC4504b8.a(this.f39391a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + G.a(this.f39391a) + ", canTrackHoaid=" + G.a(this.f39392b) + ", canTrackYandexAdvId=" + G.a(this.f39393c) + ')';
    }
}
