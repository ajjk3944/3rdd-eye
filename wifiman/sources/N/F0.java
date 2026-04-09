package N;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final E.a f13675a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f13676b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f13677c;

    public F0(E.a aVar, E.a aVar2, E.a aVar3) {
        this.f13675a = aVar;
        this.f13676b = aVar2;
        this.f13677c = aVar3;
    }

    public final E.a a() {
        return this.f13677c;
    }

    public final E.a b() {
        return this.f13676b;
    }

    public final E.a c() {
        return this.f13675a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return AbstractC6492s.d(this.f13675a, f02.f13675a) && AbstractC6492s.d(this.f13676b, f02.f13676b) && AbstractC6492s.d(this.f13677c, f02.f13677c);
    }

    public int hashCode() {
        return (((this.f13675a.hashCode() * 31) + this.f13676b.hashCode()) * 31) + this.f13677c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f13675a + ", medium=" + this.f13676b + ", large=" + this.f13677c + ')';
    }

    public /* synthetic */ F0(E.a aVar, E.a aVar2, E.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? E.h.d(Y0.h.j(4)) : aVar, (i10 & 2) != 0 ? E.h.d(Y0.h.j(4)) : aVar2, (i10 & 4) != 0 ? E.h.d(Y0.h.j(0)) : aVar3);
    }
}
