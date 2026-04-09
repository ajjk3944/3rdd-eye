package Hi;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f7978a;

    public b(int i10) {
        this.f7978a = i10;
    }

    public final int a() {
        return this.f7978a;
    }

    public final void b(int i10) {
        this.f7978a += i10;
    }

    public final void c(int i10) {
        this.f7978a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f7978a == ((b) obj).f7978a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f7978a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f7978a + ')';
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
