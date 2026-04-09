package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7542q f59452a;

    /* renamed from: b, reason: collision with root package name */
    private final E f59453b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59454c;

    public /* synthetic */ D0(AbstractC7542q abstractC7542q, E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7542q, e10, i10);
    }

    public final int a() {
        return this.f59454c;
    }

    public final E b() {
        return this.f59453b;
    }

    public final AbstractC7542q c() {
        return this.f59452a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return AbstractC6492s.d(this.f59452a, d02.f59452a) && AbstractC6492s.d(this.f59453b, d02.f59453b) && AbstractC7544t.c(this.f59454c, d02.f59454c);
    }

    public int hashCode() {
        return (((this.f59452a.hashCode() * 31) + this.f59453b.hashCode()) * 31) + AbstractC7544t.d(this.f59454c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f59452a + ", easing=" + this.f59453b + ", arcMode=" + ((Object) AbstractC7544t.e(this.f59454c)) + ')';
    }

    private D0(AbstractC7542q abstractC7542q, E e10, int i10) {
        this.f59452a = abstractC7542q;
        this.f59453b = e10;
        this.f59454c = i10;
    }
}
