package R0;

import L0.C3174d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: R0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3459l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19487f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f19488g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final I f19489a;

    /* renamed from: b, reason: collision with root package name */
    private int f19490b;

    /* renamed from: c, reason: collision with root package name */
    private int f19491c;

    /* renamed from: d, reason: collision with root package name */
    private int f19492d;

    /* renamed from: e, reason: collision with root package name */
    private int f19493e;

    /* renamed from: R0.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C3459l(C3174d c3174d, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, j10);
    }

    private final void q(int i10) {
        if (i10 >= 0) {
            this.f19491c = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i10).toString());
    }

    private final void r(int i10) {
        if (i10 >= 0) {
            this.f19490b = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i10).toString());
    }

    public final void a() {
        this.f19492d = -1;
        this.f19493e = -1;
    }

    public final void b(int i10, int i11) {
        long jB = L0.T.b(i10, i11);
        this.f19489a.c(i10, i11, "");
        long jA = AbstractC3460m.a(L0.T.b(this.f19490b, this.f19491c), jB);
        r(L0.S.l(jA));
        q(L0.S.k(jA));
        if (l()) {
            long jA2 = AbstractC3460m.a(L0.T.b(this.f19492d, this.f19493e), jB);
            if (L0.S.h(jA2)) {
                a();
            } else {
                this.f19492d = L0.S.l(jA2);
                this.f19493e = L0.S.k(jA2);
            }
        }
    }

    public final char c(int i10) {
        return this.f19489a.a(i10);
    }

    public final L0.S d() {
        if (l()) {
            return L0.S.b(L0.T.b(this.f19492d, this.f19493e));
        }
        return null;
    }

    public final int e() {
        return this.f19493e;
    }

    public final int f() {
        return this.f19492d;
    }

    public final int g() {
        int i10 = this.f19490b;
        int i11 = this.f19491c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return this.f19489a.b();
    }

    public final long i() {
        return L0.T.b(this.f19490b, this.f19491c);
    }

    public final int j() {
        return this.f19491c;
    }

    public final int k() {
        return this.f19490b;
    }

    public final boolean l() {
        return this.f19492d != -1;
    }

    public final void m(int i10, int i11, String str) {
        if (i10 < 0 || i10 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i11 < 0 || i11 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i10 <= i11) {
            this.f19489a.c(i10, i11, str);
            r(str.length() + i10);
            q(i10 + str.length());
            this.f19492d = -1;
            this.f19493e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    public final void n(int i10, int i11) {
        if (i10 < 0 || i10 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i11 < 0 || i11 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i10 < i11) {
            this.f19492d = i10;
            this.f19493e = i11;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
    }

    public final void o(int i10) {
        p(i10, i10);
    }

    public final void p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i11 < 0 || i11 > this.f19489a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f19489a.b());
        }
        if (i10 <= i11) {
            r(i10);
            q(i11);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    public final C3174d s() {
        return new C3174d(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f19489a.toString();
    }

    private C3459l(C3174d c3174d, long j10) {
        this.f19489a = new I(c3174d.k());
        this.f19490b = L0.S.l(j10);
        this.f19491c = L0.S.k(j10);
        this.f19492d = -1;
        this.f19493e = -1;
        int iL = L0.S.l(j10);
        int iK = L0.S.k(j10);
        if (iL < 0 || iL > c3174d.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + c3174d.length());
        }
        if (iK < 0 || iK > c3174d.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + c3174d.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }
}
