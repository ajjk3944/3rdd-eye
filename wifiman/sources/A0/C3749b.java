package a0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3749b {

    /* renamed from: a, reason: collision with root package name */
    private int f25712a;

    public C3749b(int i10) {
        this.f25712a = i10;
    }

    public final int a() {
        return this.f25712a;
    }

    public final void b(int i10) {
        this.f25712a += i10;
    }

    public final void c(int i10) {
        this.f25712a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3749b) && this.f25712a == ((C3749b) obj).f25712a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f25712a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f25712a + ')';
    }

    public /* synthetic */ C3749b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
