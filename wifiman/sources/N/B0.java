package N;

import E0.InterfaceC2632j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import s.InterfaceC7836I;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
final class B0 implements InterfaceC7836I {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13548a;

    /* renamed from: b, reason: collision with root package name */
    private final float f13549b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6739y0 f13550c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13551d;

    static final class a implements InterfaceC6739y0 {
        a() {
        }

        @Override // m0.InterfaceC6739y0
        public final long a() {
            return B0.this.f13551d;
        }
    }

    public /* synthetic */ B0(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    @Override // s.InterfaceC7836I
    public InterfaceC2632j a(InterfaceC8556k interfaceC8556k) {
        InterfaceC6739y0 aVar = this.f13550c;
        if (aVar == null) {
            aVar = new a();
        }
        return new C(interfaceC8556k, this.f13548a, this.f13549b, aVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f13548a == b02.f13548a && Y0.h.n(this.f13549b, b02.f13549b) && AbstractC6492s.d(this.f13550c, b02.f13550c)) {
            return C6733v0.m(this.f13551d, b02.f13551d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f13548a) * 31) + Y0.h.p(this.f13549b)) * 31;
        InterfaceC6739y0 interfaceC6739y0 = this.f13550c;
        return ((iHashCode + (interfaceC6739y0 != null ? interfaceC6739y0.hashCode() : 0)) * 31) + C6733v0.s(this.f13551d);
    }

    private B0(boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, long j10) {
        this.f13548a = z10;
        this.f13549b = f10;
        this.f13550c = interfaceC6739y0;
        this.f13551d = j10;
    }

    private B0(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC6739y0) null, j10);
    }
}
