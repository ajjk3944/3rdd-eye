package N;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13909a;

    /* renamed from: b, reason: collision with root package name */
    private final mh.q f13910b;

    public Q(Object obj, mh.q qVar) {
        this.f13909a = obj;
        this.f13910b = qVar;
    }

    public final Object a() {
        return this.f13909a;
    }

    public final mh.q b() {
        return this.f13910b;
    }

    public final Object c() {
        return this.f13909a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return AbstractC6492s.d(this.f13909a, q10.f13909a) && AbstractC6492s.d(this.f13910b, q10.f13910b);
    }

    public int hashCode() {
        Object obj = this.f13909a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f13910b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f13909a + ", transition=" + this.f13910b + ')';
    }
}
