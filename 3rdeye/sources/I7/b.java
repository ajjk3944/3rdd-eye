package i7;

import N7.Z;

/* compiled from: DivItemBuilderResult.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Z f38460a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f38461b;

    public b(Z div, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        this.f38460a = div;
        this.f38461b = expressionResolver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.b(this.f38460a, bVar.f38460a) && kotlin.jvm.internal.l.b(this.f38461b, bVar.f38461b);
    }

    public final int hashCode() {
        return this.f38461b.hashCode() + (this.f38460a.hashCode() * 31);
    }

    public final String toString() {
        return "DivItemBuilderResult(div=" + this.f38460a + ", expressionResolver=" + this.f38461b + ')';
    }
}
