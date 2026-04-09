package I;

import L0.C3174d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: h, reason: collision with root package name */
    public static final a f8022h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f8023i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final U0 f8024a;

    /* renamed from: b, reason: collision with root package name */
    private final C2944m f8025b;

    /* renamed from: c, reason: collision with root package name */
    private int f8026c;

    /* renamed from: d, reason: collision with root package name */
    private int f8027d;

    /* renamed from: e, reason: collision with root package name */
    private Yg.s f8028e;

    /* renamed from: f, reason: collision with root package name */
    private int f8029f;

    /* renamed from: g, reason: collision with root package name */
    private int f8030g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ I(C3174d c3174d, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, j10);
    }

    private final void a(int i10, int i11) {
        if (i10 < 0 || i10 > this.f8024a.length()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f8024a.length());
        }
        if (i11 < 0 || i11 > this.f8024a.length()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f8024a.length());
        }
    }

    private final void v(int i10) {
        if (i10 >= 0) {
            this.f8027d = i10;
            this.f8028e = null;
        } else {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i10).toString());
        }
    }

    private final void w(int i10) {
        if (i10 >= 0) {
            this.f8026c = i10;
            this.f8028e = null;
        } else {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i10).toString());
        }
    }

    public final void b() {
        this.f8028e = null;
    }

    public final void c() {
        this.f8029f = -1;
        this.f8030g = -1;
    }

    public final void d(int i10, int i11) {
        a(i10, i11);
        long jB = L0.T.b(i10, i11);
        this.f8025b.f(i10, i11, 0);
        U0.d(this.f8024a, L0.S.l(jB), L0.S.k(jB), "", 0, 0, 24, null);
        long jA = J.a(L0.T.b(this.f8026c, this.f8027d), jB);
        w(L0.S.n(jA));
        v(L0.S.i(jA));
        if (p()) {
            long jA2 = J.a(L0.T.b(this.f8029f, this.f8030g), jB);
            if (L0.S.h(jA2)) {
                c();
            } else {
                this.f8029f = L0.S.l(jA2);
                this.f8030g = L0.S.k(jA2);
            }
        }
        this.f8028e = null;
    }

    public final char e(int i10) {
        return this.f8024a.charAt(i10);
    }

    public final C2944m f() {
        return this.f8025b;
    }

    public final L0.S g() {
        if (p()) {
            return L0.S.b(L0.T.b(this.f8029f, this.f8030g));
        }
        return null;
    }

    public final int h() {
        return this.f8030g;
    }

    public final int i() {
        return this.f8029f;
    }

    public final int j() {
        int i10 = this.f8026c;
        int i11 = this.f8027d;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final Yg.s k() {
        return this.f8028e;
    }

    public final int l() {
        return this.f8024a.length();
    }

    public final long m() {
        return L0.T.b(this.f8026c, this.f8027d);
    }

    public final int n() {
        return this.f8027d;
    }

    public final int o() {
        return this.f8026c;
    }

    public final boolean p() {
        return this.f8029f != -1;
    }

    public final void q(int i10, int i11, CharSequence charSequence) {
        a(i10, i11);
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (i13 < iMax && i12 < charSequence.length() && charSequence.charAt(i12) == this.f8024a.charAt(i13)) {
            i12++;
            i13++;
        }
        int length = charSequence.length();
        int i14 = iMax;
        while (i14 > iMin && length > i12 && charSequence.charAt(length - 1) == this.f8024a.charAt(i14 - 1)) {
            length--;
            i14--;
        }
        this.f8025b.f(i13, i14, length - i12);
        U0.d(this.f8024a, iMin, iMax, charSequence, 0, 0, 24, null);
        w(charSequence.length() + iMin);
        v(iMin + charSequence.length());
        this.f8029f = -1;
        this.f8030g = -1;
        this.f8028e = null;
    }

    public final void r(int i10, int i11) {
        if (i10 < 0 || i10 > this.f8024a.length()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f8024a.length());
        }
        if (i11 < 0 || i11 > this.f8024a.length()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f8024a.length());
        }
        if (i10 < i11) {
            this.f8029f = i10;
            this.f8030g = i11;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
    }

    public final void s(int i10) {
        u(i10, i10);
    }

    public final void t(int i10, int i11, int i12) {
        if (i11 < i12) {
            this.f8028e = new Yg.s(H.n.c(i10), L0.S.b(L0.T.b(AbstractC7978m.k(i11, 0, l()), AbstractC7978m.k(i12, 0, l()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
        }
    }

    public String toString() {
        return this.f8024a.toString();
    }

    public final void u(int i10, int i11) {
        int iK = AbstractC7978m.k(i10, 0, l());
        int iK2 = AbstractC7978m.k(i11, 0, l());
        w(iK);
        v(iK2);
    }

    public /* synthetic */ I(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private I(C3174d c3174d, long j10) {
        this.f8024a = new U0(c3174d.k());
        this.f8025b = new C2944m(null, 1, null);
        this.f8026c = L0.S.n(j10);
        this.f8027d = L0.S.i(j10);
        this.f8029f = -1;
        this.f8030g = -1;
        a(L0.S.n(j10), L0.S.i(j10));
    }

    private I(String str, long j10) {
        this(new C3174d(str, null, null, 6, null), j10, (DefaultConstructorMarker) null);
    }
}
