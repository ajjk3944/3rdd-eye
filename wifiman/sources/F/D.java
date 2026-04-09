package F;

import R0.C3465s;
import R0.C3470x;
import R0.C3471y;
import R0.r;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4824g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final D f4825h = new D(0, (Boolean) null, 0, 0, (R0.K) null, (Boolean) null, (S0.e) null, BER.MAX_OID_LENGTH, (DefaultConstructorMarker) null);

    /* renamed from: i, reason: collision with root package name */
    private static final D f4826i = new D(0, Boolean.FALSE, C3471y.f19528b.f(), 0, (R0.K) null, (Boolean) null, (S0.e) null, 121, (DefaultConstructorMarker) null);

    /* renamed from: a, reason: collision with root package name */
    private final int f4827a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f4828b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4829c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4830d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f4831e;

    /* renamed from: f, reason: collision with root package name */
    private final S0.e f4832f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f4825h;
        }

        public final D b() {
            return D.f4826i;
        }

        private a() {
        }
    }

    public /* synthetic */ D(int i10, Boolean bool, int i11, int i12, R0.K k10, Boolean bool2, S0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, k10, bool2, eVar);
    }

    private final boolean d() {
        Boolean bool = this.f4828b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int e() {
        C3470x c3470xF = C3470x.f(this.f4827a);
        int iL = c3470xF.l();
        C3470x.a aVar = C3470x.f19521b;
        if (C3470x.i(iL, aVar.d())) {
            c3470xF = null;
        }
        return c3470xF != null ? c3470xF.l() : aVar.b();
    }

    private final S0.e f() {
        S0.e eVar = this.f4832f;
        return eVar == null ? S0.e.f20216c.b() : eVar;
    }

    private final int i() {
        C3471y c3471yK = C3471y.k(this.f4829c);
        int iQ = c3471yK.q();
        C3471y.a aVar = C3471y.f19528b;
        if (C3471y.n(iQ, aVar.i())) {
            c3471yK = null;
        }
        return c3471yK != null ? c3471yK.q() : aVar.h();
    }

    private final boolean k() {
        return C3470x.i(this.f4827a, C3470x.f19521b.d()) && this.f4828b == null && C3471y.n(this.f4829c, C3471y.f19528b.i()) && R0.r.m(this.f4830d, R0.r.f19498b.i()) && this.f4831e == null && this.f4832f == null;
    }

    public final D c(D d10) {
        if (d10 == null || d10.k() || AbstractC6492s.d(d10, this)) {
            return this;
        }
        if (k()) {
            return d10;
        }
        C3470x c3470xF = C3470x.f(this.f4827a);
        if (C3470x.i(c3470xF.l(), C3470x.f19521b.d())) {
            c3470xF = null;
        }
        int iL = c3470xF != null ? c3470xF.l() : d10.f4827a;
        Boolean bool = this.f4828b;
        if (bool == null) {
            bool = d10.f4828b;
        }
        Boolean bool2 = bool;
        C3471y c3471yK = C3471y.k(this.f4829c);
        if (C3471y.n(c3471yK.q(), C3471y.f19528b.i())) {
            c3471yK = null;
        }
        int iQ = c3471yK != null ? c3471yK.q() : d10.f4829c;
        R0.r rVarJ = R0.r.j(this.f4830d);
        R0.r rVar = R0.r.m(rVarJ.p(), R0.r.f19498b.i()) ? null : rVarJ;
        int iP = rVar != null ? rVar.p() : d10.f4830d;
        Boolean bool3 = this.f4831e;
        if (bool3 == null) {
            bool3 = d10.f4831e;
        }
        Boolean bool4 = bool3;
        S0.e eVar = this.f4832f;
        return new D(iL, bool2, iQ, iP, (R0.K) null, bool4, eVar == null ? d10.f4832f : eVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (!C3470x.i(this.f4827a, d10.f4827a) || !AbstractC6492s.d(this.f4828b, d10.f4828b) || !C3471y.n(this.f4829c, d10.f4829c) || !R0.r.m(this.f4830d, d10.f4830d)) {
            return false;
        }
        d10.getClass();
        return AbstractC6492s.d(null, null) && AbstractC6492s.d(this.f4831e, d10.f4831e) && AbstractC6492s.d(this.f4832f, d10.f4832f);
    }

    public final int g() {
        R0.r rVarJ = R0.r.j(this.f4830d);
        int iP = rVarJ.p();
        r.a aVar = R0.r.f19498b;
        if (R0.r.m(iP, aVar.i())) {
            rVarJ = null;
        }
        return rVarJ != null ? rVarJ.p() : aVar.a();
    }

    public final int h() {
        return this.f4829c;
    }

    public int hashCode() {
        int iJ = C3470x.j(this.f4827a) * 31;
        Boolean bool = this.f4828b;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + C3471y.o(this.f4829c)) * 31) + R0.r.n(this.f4830d)) * 961;
        Boolean bool2 = this.f4831e;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        S0.e eVar = this.f4832f;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final boolean j() {
        Boolean bool = this.f4831e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final C3465s l(boolean z10) {
        return new C3465s(z10, e(), d(), i(), g(), null, f(), null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C3470x.k(this.f4827a)) + ", autoCorrectEnabled=" + this.f4828b + ", keyboardType=" + ((Object) C3471y.p(this.f4829c)) + ", imeAction=" + ((Object) R0.r.o(this.f4830d)) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.f4831e + ", hintLocales=" + this.f4832f + ')';
    }

    public /* synthetic */ D(int i10, boolean z10, int i11, int i12, R0.K k10, Boolean bool, S0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, i11, i12, k10, bool, eVar);
    }

    private D(int i10, Boolean bool, int i11, int i12, R0.K k10, Boolean bool2, S0.e eVar) {
        this.f4827a = i10;
        this.f4828b = bool;
        this.f4829c = i11;
        this.f4830d = i12;
        this.f4831e = bool2;
        this.f4832f = eVar;
    }

    public /* synthetic */ D(int i10, Boolean bool, int i11, int i12, R0.K k10, Boolean bool2, S0.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C3470x.f19521b.d() : i10, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? C3471y.f19528b.i() : i11, (i13 & 8) != 0 ? R0.r.f19498b.i() : i12, (i13 & 16) != 0 ? null : k10, (i13 & 32) != 0 ? null : bool2, (i13 & 64) == 0 ? eVar : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ D(int i10, boolean z10, int i11, int i12, R0.K k10, Boolean bool, S0.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C3470x.f19521b.d() : i10, z10, (i13 & 4) != 0 ? C3471y.f19528b.i() : i11, (i13 & 8) != 0 ? R0.r.f19498b.i() : i12, (i13 & 16) != 0 ? null : k10, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : eVar, (DefaultConstructorMarker) null);
    }

    private D(int i10, boolean z10, int i11, int i12, R0.K k10, Boolean bool, S0.e eVar) {
        this(i10, Boolean.valueOf(z10), i11, i12, k10, bool, eVar, (DefaultConstructorMarker) null);
    }
}
