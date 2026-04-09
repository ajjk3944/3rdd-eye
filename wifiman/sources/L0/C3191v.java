package L0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;

/* renamed from: L0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3191v {

    /* renamed from: a, reason: collision with root package name */
    private final int f11185a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11186b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11187c;

    /* renamed from: d, reason: collision with root package name */
    private final W0.q f11188d;

    /* renamed from: e, reason: collision with root package name */
    private final z f11189e;

    /* renamed from: f, reason: collision with root package name */
    private final W0.h f11190f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11191g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11192h;

    /* renamed from: i, reason: collision with root package name */
    private final W0.s f11193i;

    public /* synthetic */ C3191v(int i10, int i11, long j10, W0.q qVar, z zVar, W0.h hVar, int i12, int i13, W0.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, qVar, zVar, hVar, i12, i13, sVar);
    }

    public final C3191v a(int i10, int i11, long j10, W0.q qVar, z zVar, W0.h hVar, int i12, int i13, W0.s sVar) {
        return new C3191v(i10, i11, j10, qVar, zVar, hVar, i12, i13, sVar, null);
    }

    public final int c() {
        return this.f11192h;
    }

    public final int d() {
        return this.f11191g;
    }

    public final long e() {
        return this.f11187c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3191v)) {
            return false;
        }
        C3191v c3191v = (C3191v) obj;
        return W0.j.k(this.f11185a, c3191v.f11185a) && W0.l.j(this.f11186b, c3191v.f11186b) && Y0.v.e(this.f11187c, c3191v.f11187c) && AbstractC6492s.d(this.f11188d, c3191v.f11188d) && AbstractC6492s.d(this.f11189e, c3191v.f11189e) && AbstractC6492s.d(this.f11190f, c3191v.f11190f) && W0.f.f(this.f11191g, c3191v.f11191g) && W0.e.g(this.f11192h, c3191v.f11192h) && AbstractC6492s.d(this.f11193i, c3191v.f11193i);
    }

    public final W0.h f() {
        return this.f11190f;
    }

    public final z g() {
        return this.f11189e;
    }

    public final int h() {
        return this.f11185a;
    }

    public int hashCode() {
        int iL = ((((W0.j.l(this.f11185a) * 31) + W0.l.k(this.f11186b)) * 31) + Y0.v.i(this.f11187c)) * 31;
        W0.q qVar = this.f11188d;
        int iHashCode = (iL + (qVar != null ? qVar.hashCode() : 0)) * 31;
        z zVar = this.f11189e;
        int iHashCode2 = (iHashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
        W0.h hVar = this.f11190f;
        int iHashCode3 = (((((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + W0.f.j(this.f11191g)) * 31) + W0.e.h(this.f11192h)) * 31;
        W0.s sVar = this.f11193i;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final int i() {
        return this.f11186b;
    }

    public final W0.q j() {
        return this.f11188d;
    }

    public final W0.s k() {
        return this.f11193i;
    }

    public final C3191v l(C3191v c3191v) {
        return c3191v == null ? this : AbstractC3192w.a(this, c3191v.f11185a, c3191v.f11186b, c3191v.f11187c, c3191v.f11188d, c3191v.f11189e, c3191v.f11190f, c3191v.f11191g, c3191v.f11192h, c3191v.f11193i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) W0.j.m(this.f11185a)) + ", textDirection=" + ((Object) W0.l.l(this.f11186b)) + ", lineHeight=" + ((Object) Y0.v.j(this.f11187c)) + ", textIndent=" + this.f11188d + ", platformStyle=" + this.f11189e + ", lineHeightStyle=" + this.f11190f + ", lineBreak=" + ((Object) W0.f.k(this.f11191g)) + ", hyphens=" + ((Object) W0.e.i(this.f11192h)) + ", textMotion=" + this.f11193i + ')';
    }

    private C3191v(int i10, int i11, long j10, W0.q qVar, z zVar, W0.h hVar, int i12, int i13, W0.s sVar) {
        this.f11185a = i10;
        this.f11186b = i11;
        this.f11187c = j10;
        this.f11188d = qVar;
        this.f11189e = zVar;
        this.f11190f = hVar;
        this.f11191g = i12;
        this.f11192h = i13;
        this.f11193i = sVar;
        if (Y0.v.e(j10, Y0.v.f24549b.a()) || Y0.v.h(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + Y0.v.h(j10) + ')').toString());
    }

    public /* synthetic */ C3191v(int i10, int i11, long j10, W0.q qVar, z zVar, W0.h hVar, int i12, int i13, W0.s sVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? W0.j.f23523b.g() : i10, (i14 & 2) != 0 ? W0.l.f23537b.f() : i11, (i14 & 4) != 0 ? Y0.v.f24549b.a() : j10, (i14 & 8) != 0 ? null : qVar, (i14 & 16) != 0 ? null : zVar, (i14 & 32) != 0 ? null : hVar, (i14 & 64) != 0 ? W0.f.f23488b.b() : i12, (i14 & 128) != 0 ? W0.e.f23483b.c() : i13, (i14 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? sVar : null, null);
    }
}
