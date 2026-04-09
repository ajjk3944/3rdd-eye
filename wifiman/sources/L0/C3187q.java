package L0;

import L0.S;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import m0.U0;
import sh.AbstractC7978m;

/* renamed from: L0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3187q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3186p f11175a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11176b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11177c;

    /* renamed from: d, reason: collision with root package name */
    private int f11178d;

    /* renamed from: e, reason: collision with root package name */
    private int f11179e;

    /* renamed from: f, reason: collision with root package name */
    private float f11180f;

    /* renamed from: g, reason: collision with root package name */
    private float f11181g;

    public C3187q(InterfaceC3186p interfaceC3186p, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f11175a = interfaceC3186p;
        this.f11176b = i10;
        this.f11177c = i11;
        this.f11178d = i12;
        this.f11179e = i13;
        this.f11180f = f10;
        this.f11181g = f11;
    }

    public static /* synthetic */ long l(C3187q c3187q, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c3187q.k(j10, z10);
    }

    public final float a() {
        return this.f11181g;
    }

    public final int b() {
        return this.f11177c;
    }

    public final int c() {
        return this.f11179e;
    }

    public final int d() {
        return this.f11177c - this.f11176b;
    }

    public final InterfaceC3186p e() {
        return this.f11175a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187q)) {
            return false;
        }
        C3187q c3187q = (C3187q) obj;
        return AbstractC6492s.d(this.f11175a, c3187q.f11175a) && this.f11176b == c3187q.f11176b && this.f11177c == c3187q.f11177c && this.f11178d == c3187q.f11178d && this.f11179e == c3187q.f11179e && Float.compare(this.f11180f, c3187q.f11180f) == 0 && Float.compare(this.f11181g, c3187q.f11181g) == 0;
    }

    public final int f() {
        return this.f11176b;
    }

    public final int g() {
        return this.f11178d;
    }

    public final float h() {
        return this.f11180f;
    }

    public int hashCode() {
        return (((((((((((this.f11175a.hashCode() * 31) + Integer.hashCode(this.f11176b)) * 31) + Integer.hashCode(this.f11177c)) * 31) + Integer.hashCode(this.f11178d)) * 31) + Integer.hashCode(this.f11179e)) * 31) + Float.hashCode(this.f11180f)) * 31) + Float.hashCode(this.f11181g);
    }

    public final C6533i i(C6533i c6533i) {
        return c6533i.x(AbstractC6532h.a(0.0f, this.f11180f));
    }

    public final U0 j(U0 u02) {
        u02.r(AbstractC6532h.a(0.0f, this.f11180f));
        return u02;
    }

    public final long k(long j10, boolean z10) {
        if (z10) {
            S.a aVar = S.f11103b;
            if (S.g(j10, aVar.a())) {
                return aVar.a();
            }
        }
        return T.b(m(S.n(j10)), m(S.i(j10)));
    }

    public final int m(int i10) {
        return i10 + this.f11176b;
    }

    public final int n(int i10) {
        return i10 + this.f11178d;
    }

    public final float o(float f10) {
        return f10 + this.f11180f;
    }

    public final C6533i p(C6533i c6533i) {
        return c6533i.x(AbstractC6532h.a(0.0f, -this.f11180f));
    }

    public final long q(long j10) {
        return AbstractC6532h.a(C6531g.m(j10), C6531g.n(j10) - this.f11180f);
    }

    public final int r(int i10) {
        return AbstractC7978m.k(i10, this.f11176b, this.f11177c) - this.f11176b;
    }

    public final int s(int i10) {
        return i10 - this.f11178d;
    }

    public final float t(float f10) {
        return f10 - this.f11180f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f11175a + ", startIndex=" + this.f11176b + ", endIndex=" + this.f11177c + ", startLineIndex=" + this.f11178d + ", endLineIndex=" + this.f11179e + ", top=" + this.f11180f + ", bottom=" + this.f11181g + ')';
    }
}
