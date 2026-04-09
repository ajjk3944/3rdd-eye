package jj;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import y0.C8603x;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f51001a;

    /* renamed from: b, reason: collision with root package name */
    private final C6531g f51002b;

    public /* synthetic */ k(long j10, C6531g c6531g, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, c6531g);
    }

    public final long a() {
        return this.f51001a;
    }

    public final C6531g b() {
        return this.f51002b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C8603x.d(this.f51001a, kVar.f51001a) && AbstractC6492s.d(this.f51002b, kVar.f51002b);
    }

    public int hashCode() {
        int iE = C8603x.e(this.f51001a) * 31;
        C6531g c6531g = this.f51002b;
        return iE + (c6531g == null ? 0 : C6531g.o(c6531g.v()));
    }

    public String toString() {
        return "StartDrag(id=" + ((Object) C8603x.f(this.f51001a)) + ", offset=" + this.f51002b + ')';
    }

    private k(long j10, C6531g c6531g) {
        this.f51001a = j10;
        this.f51002b = c6531g;
    }

    public /* synthetic */ k(long j10, C6531g c6531g, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : c6531g, null);
    }
}
