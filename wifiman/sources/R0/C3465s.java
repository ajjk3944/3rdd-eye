package R0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;

/* renamed from: R0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3465s {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19509g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final C3465s f19510h = new C3465s(false, 0, false, 0, 0, null, null, BER.MAX_OID_LENGTH, null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19511a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19512b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19513c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19514d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19515e;

    /* renamed from: f, reason: collision with root package name */
    private final S0.e f19516f;

    /* renamed from: R0.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3465s a() {
            return C3465s.f19510h;
        }

        private a() {
        }
    }

    public /* synthetic */ C3465s(boolean z10, int i10, boolean z11, int i11, int i12, K k10, S0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, k10, eVar);
    }

    public final boolean b() {
        return this.f19513c;
    }

    public final int c() {
        return this.f19512b;
    }

    public final S0.e d() {
        return this.f19516f;
    }

    public final int e() {
        return this.f19515e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3465s)) {
            return false;
        }
        C3465s c3465s = (C3465s) obj;
        if (this.f19511a != c3465s.f19511a || !C3470x.i(this.f19512b, c3465s.f19512b) || this.f19513c != c3465s.f19513c || !C3471y.n(this.f19514d, c3465s.f19514d) || !r.m(this.f19515e, c3465s.f19515e)) {
            return false;
        }
        c3465s.getClass();
        return AbstractC6492s.d(null, null) && AbstractC6492s.d(this.f19516f, c3465s.f19516f);
    }

    public final int f() {
        return this.f19514d;
    }

    public final K g() {
        return null;
    }

    public final boolean h() {
        return this.f19511a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f19511a) * 31) + C3470x.j(this.f19512b)) * 31) + Boolean.hashCode(this.f19513c)) * 31) + C3471y.o(this.f19514d)) * 31) + r.n(this.f19515e)) * 961) + this.f19516f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f19511a + ", capitalization=" + ((Object) C3470x.k(this.f19512b)) + ", autoCorrect=" + this.f19513c + ", keyboardType=" + ((Object) C3471y.p(this.f19514d)) + ", imeAction=" + ((Object) r.o(this.f19515e)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.f19516f + ')';
    }

    private C3465s(boolean z10, int i10, boolean z11, int i11, int i12, K k10, S0.e eVar) {
        this.f19511a = z10;
        this.f19512b = i10;
        this.f19513c = z11;
        this.f19514d = i11;
        this.f19515e = i12;
        this.f19516f = eVar;
    }

    public /* synthetic */ C3465s(boolean z10, int i10, boolean z11, int i11, int i12, K k10, S0.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? C3470x.f19521b.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? C3471y.f19528b.h() : i11, (i13 & 16) != 0 ? r.f19498b.a() : i12, (i13 & 32) != 0 ? null : k10, (i13 & 64) != 0 ? S0.e.f20216c.b() : eVar, null);
    }
}
