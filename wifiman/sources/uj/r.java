package uj;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f63229a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f63230b;

    public r(Object scopeId, Object obj) {
        AbstractC6492s.i(scopeId, "scopeId");
        this.f63229a = scopeId;
        this.f63230b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC6492s.d(this.f63229a, rVar.f63229a) && AbstractC6492s.d(this.f63230b, rVar.f63230b);
    }

    public int hashCode() {
        int iHashCode = this.f63229a.hashCode() * 31;
        Object obj = this.f63230b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ScopeKey(scopeId=" + this.f63229a + ", arg=" + this.f63230b + ')';
    }
}
