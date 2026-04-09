package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f620a;

    public n0(List list) {
        this.f620a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.f620a.equals(((n0) obj).f620a);
    }

    public final int hashCode() {
        return this.f620a.hashCode();
    }

    public final String toString() {
        return "RegionRestrictionsConfig(restrictionsList=" + this.f620a + ')';
    }
}
