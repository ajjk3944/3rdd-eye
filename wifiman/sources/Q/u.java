package Q;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final E.a f18921a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f18922b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f18923c;

    /* renamed from: d, reason: collision with root package name */
    private final E.a f18924d;

    /* renamed from: e, reason: collision with root package name */
    private final E.a f18925e;

    public u(E.a aVar, E.a aVar2, E.a aVar3, E.a aVar4, E.a aVar5) {
        this.f18921a = aVar;
        this.f18922b = aVar2;
        this.f18923c = aVar3;
        this.f18924d = aVar4;
        this.f18925e = aVar5;
    }

    public final E.a a() {
        return this.f18925e;
    }

    public final E.a b() {
        return this.f18921a;
    }

    public final E.a c() {
        return this.f18924d;
    }

    public final E.a d() {
        return this.f18923c;
    }

    public final E.a e() {
        return this.f18922b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC6492s.d(this.f18921a, uVar.f18921a) && AbstractC6492s.d(this.f18922b, uVar.f18922b) && AbstractC6492s.d(this.f18923c, uVar.f18923c) && AbstractC6492s.d(this.f18924d, uVar.f18924d) && AbstractC6492s.d(this.f18925e, uVar.f18925e);
    }

    public int hashCode() {
        return (((((((this.f18921a.hashCode() * 31) + this.f18922b.hashCode()) * 31) + this.f18923c.hashCode()) * 31) + this.f18924d.hashCode()) * 31) + this.f18925e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f18921a + ", small=" + this.f18922b + ", medium=" + this.f18923c + ", large=" + this.f18924d + ", extraLarge=" + this.f18925e + ')';
    }

    public /* synthetic */ u(E.a aVar, E.a aVar2, E.a aVar3, E.a aVar4, E.a aVar5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? t.f18915a.b() : aVar, (i10 & 2) != 0 ? t.f18915a.e() : aVar2, (i10 & 4) != 0 ? t.f18915a.d() : aVar3, (i10 & 8) != 0 ? t.f18915a.c() : aVar4, (i10 & 16) != 0 ? t.f18915a.a() : aVar5);
    }
}
