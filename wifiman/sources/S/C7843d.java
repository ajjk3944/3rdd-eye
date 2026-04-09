package s;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6688Y;
import m0.InterfaceC6717n0;
import m0.J0;
import m0.U0;
import o0.C7034a;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7843d {

    /* renamed from: a, reason: collision with root package name */
    private J0 f60735a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6717n0 f60736b;

    /* renamed from: c, reason: collision with root package name */
    private C7034a f60737c;

    /* renamed from: d, reason: collision with root package name */
    private U0 f60738d;

    public C7843d(J0 j02, InterfaceC6717n0 interfaceC6717n0, C7034a c7034a, U0 u02) {
        this.f60735a = j02;
        this.f60736b = interfaceC6717n0;
        this.f60737c = c7034a;
        this.f60738d = u02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7843d)) {
            return false;
        }
        C7843d c7843d = (C7843d) obj;
        return AbstractC6492s.d(this.f60735a, c7843d.f60735a) && AbstractC6492s.d(this.f60736b, c7843d.f60736b) && AbstractC6492s.d(this.f60737c, c7843d.f60737c) && AbstractC6492s.d(this.f60738d, c7843d.f60738d);
    }

    public final U0 g() {
        U0 u02 = this.f60738d;
        if (u02 != null) {
            return u02;
        }
        U0 u0A = AbstractC6688Y.a();
        this.f60738d = u0A;
        return u0A;
    }

    public int hashCode() {
        J0 j02 = this.f60735a;
        int iHashCode = (j02 == null ? 0 : j02.hashCode()) * 31;
        InterfaceC6717n0 interfaceC6717n0 = this.f60736b;
        int iHashCode2 = (iHashCode + (interfaceC6717n0 == null ? 0 : interfaceC6717n0.hashCode())) * 31;
        C7034a c7034a = this.f60737c;
        int iHashCode3 = (iHashCode2 + (c7034a == null ? 0 : c7034a.hashCode())) * 31;
        U0 u02 = this.f60738d;
        return iHashCode3 + (u02 != null ? u02.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f60735a + ", canvas=" + this.f60736b + ", canvasDrawScope=" + this.f60737c + ", borderPath=" + this.f60738d + ')';
    }

    public /* synthetic */ C7843d(J0 j02, InterfaceC6717n0 interfaceC6717n0, C7034a c7034a, U0 u02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : j02, (i10 & 2) != 0 ? null : interfaceC6717n0, (i10 & 4) != 0 ? null : c7034a, (i10 & 8) != 0 ? null : u02);
    }
}
