package H;

import I.C2944m;
import I.S0;
import I.U0;
import L0.S;
import L0.T;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    private final h f7542a;

    /* renamed from: b, reason: collision with root package name */
    private final S0 f7543b;

    /* renamed from: c, reason: collision with root package name */
    private final U0 f7544c;

    /* renamed from: d, reason: collision with root package name */
    private C2944m f7545d;

    /* renamed from: e, reason: collision with root package name */
    private long f7546e;

    public interface a {
        int a();

        long b(int i10);

        long c(int i10);
    }

    public f(h hVar, C2944m c2944m, h hVar2, S0 s02) {
        this.f7542a = hVar2;
        this.f7543b = s02;
        this.f7544c = new U0(hVar);
        this.f7545d = c2944m != null ? new C2944m(c2944m) : null;
        this.f7546e = hVar.f();
    }

    private final C2944m b() {
        C2944m c2944m = this.f7545d;
        if (c2944m != null) {
            return c2944m;
        }
        C2944m c2944m2 = new C2944m(null, 1, 0 == true ? 1 : 0);
        this.f7545d = c2944m2;
        return c2944m2;
    }

    private final void g(int i10, int i11, int i12) {
        int i13;
        b().f(i10, i11, i12);
        S0 s02 = this.f7543b;
        if (s02 != null) {
            s02.e(i10, i11, i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iL = S.l(e());
        int iK = S.k(e());
        if (iK < iMin) {
            return;
        }
        if (iL <= iMin && iMax <= iK) {
            i13 = i12 - (iMax - iMin);
            if (iL == iK) {
                iL += i13;
            }
            iMin = iK + i13;
        } else if (iL > iMin && iK < iMax) {
            iMin += i12;
            iL = iMin;
        } else if (iL >= iMax) {
            i13 = i12 - (iMax - iMin);
            iL += i13;
            iMin = iK + i13;
        } else if (iMin < iL) {
            iL = iMin + i12;
            i13 = i12 - (iMax - iMin);
            iMin = iK + i13;
        }
        this.f7546e = T.b(iL, iMin);
    }

    private final void k(int i10, boolean z10, boolean z11) {
        int i11 = z10 ? 0 : -1;
        int iD = z11 ? d() : d() + 1;
        if (i11 > i10 || i10 >= iD) {
            throw new IllegalArgumentException(("Expected " + i10 + " to be in [" + i11 + ", " + iD + ')').toString());
        }
    }

    public static /* synthetic */ h m(f fVar, long j10, S s10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fVar.e();
        }
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return fVar.l(j10, s10);
    }

    public final CharSequence a() {
        return this.f7544c;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            g(d(), d(), charSequence.length());
            U0 u02 = this.f7544c;
            U0.d(u02, u02.length(), this.f7544c.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    public final a c() {
        return b();
    }

    public final int d() {
        return this.f7544c.length();
    }

    public final long e() {
        return this.f7546e;
    }

    public final boolean f() {
        return !S.h(e());
    }

    public final void h(int i10) {
        k(i10, true, false);
        this.f7546e = T.a(i10);
    }

    public final void i(int i10, int i11, CharSequence charSequence) {
        j(i10, i11, charSequence, 0, charSequence.length());
    }

    public final void j(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected start=" + i10 + " <= end=" + i11).toString());
        }
        if (i12 <= i13) {
            g(i10, i11, i13 - i12);
            this.f7544c.c(i10, i11, charSequence, i12, i13);
            return;
        }
        throw new IllegalArgumentException(("Expected textStart=" + i12 + " <= textEnd=" + i13).toString());
    }

    public final h l(long j10, S s10) {
        return new h(this.f7544c.toString(), j10, s10, null, 8, null);
    }

    public String toString() {
        return this.f7544c.toString();
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            g(d(), d(), i11 - i10);
            U0 u02 = this.f7544c;
            U0.d(u02, u02.length(), this.f7544c.length(), charSequence.subSequence(i10, i11), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) {
        g(d(), d(), 1);
        U0 u02 = this.f7544c;
        U0.d(u02, u02.length(), this.f7544c.length(), String.valueOf(c10), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ f(h hVar, C2944m c2944m, h hVar2, S0 s02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i10 & 2) != 0 ? null : c2944m, (i10 & 4) != 0 ? hVar : hVar2, (i10 & 8) != 0 ? null : s02);
    }
}
