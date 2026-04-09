package Q;

import E0.InterfaceC2632j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import s.InterfaceC7836I;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
final class p implements InterfaceC7836I {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18850a;

    /* renamed from: b, reason: collision with root package name */
    private final float f18851b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6739y0 f18852c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18853d;

    static final class a implements InterfaceC6739y0 {
        a() {
        }

        @Override // m0.InterfaceC6739y0
        public final long a() {
            return p.this.f18853d;
        }
    }

    public /* synthetic */ p(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    @Override // s.InterfaceC7836I
    public InterfaceC2632j a(InterfaceC8556k interfaceC8556k) {
        InterfaceC6739y0 aVar = this.f18852c;
        if (aVar == null) {
            aVar = new a();
        }
        return new g(interfaceC8556k, this.f18850a, this.f18851b, aVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f18850a == pVar.f18850a && Y0.h.n(this.f18851b, pVar.f18851b) && AbstractC6492s.d(this.f18852c, pVar.f18852c)) {
            return C6733v0.m(this.f18853d, pVar.f18853d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f18850a) * 31) + Y0.h.p(this.f18851b)) * 31;
        InterfaceC6739y0 interfaceC6739y0 = this.f18852c;
        return ((iHashCode + (interfaceC6739y0 != null ? interfaceC6739y0.hashCode() : 0)) * 31) + C6733v0.s(this.f18853d);
    }

    private p(boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, long j10) {
        this.f18850a = z10;
        this.f18851b = f10;
        this.f18852c = interfaceC6739y0;
        this.f18853d = j10;
    }

    private p(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC6739y0) null, j10);
    }
}
