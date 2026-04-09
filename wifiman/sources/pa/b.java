package pa;

import L0.U;
import Q0.A;
import Q0.AbstractC3434k;
import Y0.w;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final U f57810a;

    /* renamed from: b, reason: collision with root package name */
    private final U f57811b;

    /* renamed from: c, reason: collision with root package name */
    private final U f57812c;

    /* renamed from: d, reason: collision with root package name */
    private final U f57813d;

    /* renamed from: e, reason: collision with root package name */
    private final U f57814e;

    /* renamed from: f, reason: collision with root package name */
    private final U f57815f;

    public b(U header28, U header20, U header18, U header16, U body14, U label12) {
        AbstractC6492s.i(header28, "header28");
        AbstractC6492s.i(header20, "header20");
        AbstractC6492s.i(header18, "header18");
        AbstractC6492s.i(header16, "header16");
        AbstractC6492s.i(body14, "body14");
        AbstractC6492s.i(label12, "label12");
        this.f57810a = header28;
        this.f57811b = header20;
        this.f57812c = header18;
        this.f57813d = header16;
        this.f57814e = body14;
        this.f57815f = label12;
    }

    public final U a() {
        return this.f57814e;
    }

    public final U b() {
        return this.f57813d;
    }

    public final U c() {
        return this.f57812c;
    }

    public final U d() {
        return this.f57811b;
    }

    public final U e() {
        return this.f57810a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f57810a, bVar.f57810a) && AbstractC6492s.d(this.f57811b, bVar.f57811b) && AbstractC6492s.d(this.f57812c, bVar.f57812c) && AbstractC6492s.d(this.f57813d, bVar.f57813d) && AbstractC6492s.d(this.f57814e, bVar.f57814e) && AbstractC6492s.d(this.f57815f, bVar.f57815f);
    }

    public final U f() {
        return this.f57815f;
    }

    public int hashCode() {
        return (((((((((this.f57810a.hashCode() * 31) + this.f57811b.hashCode()) * 31) + this.f57812c.hashCode()) * 31) + this.f57813d.hashCode()) * 31) + this.f57814e.hashCode()) * 31) + this.f57815f.hashCode();
    }

    public String toString() {
        return "UiMobileTypography(header28=" + this.f57810a + ", header20=" + this.f57811b + ", header18=" + this.f57812c + ", header16=" + this.f57813d + ", body14=" + this.f57814e + ", label12=" + this.f57815f + ")";
    }

    public /* synthetic */ b(U u10, U u11, U u12, U u13, U u14, U u15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        U u16;
        U u17;
        U u18;
        U u19;
        U u20;
        U u21;
        if ((i10 & 1) != 0) {
            AbstractC3434k abstractC3434kA = C7273a.f57808a.a();
            A aE = A.f18971b.e();
            u16 = new U(0L, w.g(28), aE, null, null, abstractC3434kA, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(36), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u16 = u10;
        }
        if ((i10 & 2) != 0) {
            AbstractC3434k abstractC3434kA2 = C7273a.f57808a.a();
            A aE2 = A.f18971b.e();
            u17 = new U(0L, w.g(20), aE2, null, null, abstractC3434kA2, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(28), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u17 = u11;
        }
        if ((i10 & 4) != 0) {
            AbstractC3434k abstractC3434kA3 = C7273a.f57808a.a();
            A aE3 = A.f18971b.e();
            u18 = new U(0L, w.g(18), aE3, null, null, abstractC3434kA3, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u18 = u12;
        }
        if ((i10 & 8) != 0) {
            AbstractC3434k abstractC3434kA4 = C7273a.f57808a.a();
            A aE4 = A.f18971b.e();
            u19 = new U(0L, w.g(16), aE4, null, null, abstractC3434kA4, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u19 = u13;
        }
        if ((i10 & 16) != 0) {
            AbstractC3434k abstractC3434kA5 = C7273a.f57808a.a();
            A aE5 = A.f18971b.e();
            u20 = new U(0L, w.g(14), aE5, null, null, abstractC3434kA5, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(20), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u20 = u14;
        }
        if ((i10 & 32) != 0) {
            AbstractC3434k abstractC3434kA6 = C7273a.f57808a.a();
            A aE6 = A.f18971b.e();
            u21 = new U(0L, w.g(12), aE6, null, null, abstractC3434kA6, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(16), null, null, null, 0, 0, null, 16645977, null);
        } else {
            u21 = u15;
        }
        this(u16, u17, u18, u19, u20, u21);
    }
}
