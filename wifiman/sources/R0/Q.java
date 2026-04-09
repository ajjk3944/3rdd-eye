package R0;

import L0.C3174d;
import L0.InterfaceC3185o;
import Zg.AbstractC3689v;
import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: d, reason: collision with root package name */
    public static final c f19415d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC4182k f19416e = AbstractC4183l.a(a.f19420a, b.f19421a);

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f19417a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19418b;

    /* renamed from: c, reason: collision with root package name */
    private final L0.S f19419c;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19420a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4184m interfaceC4184m, Q q10) {
            return AbstractC3689v.h(L0.C.y(q10.f(), L0.C.h(), interfaceC4184m), L0.C.y(L0.S.b(q10.h()), L0.C.j(L0.S.f11103b), interfaceC4184m));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19421a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q invoke(Object obj) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            InterfaceC4182k interfaceC4182kH = L0.C.h();
            Boolean bool = Boolean.FALSE;
            L0.S s10 = null;
            C3174d c3174d = ((!AbstractC6492s.d(obj2, bool) || (interfaceC4182kH instanceof InterfaceC3185o)) && obj2 != null) ? (C3174d) interfaceC4182kH.a(obj2) : null;
            AbstractC6492s.f(c3174d);
            Object obj3 = list.get(1);
            InterfaceC4182k interfaceC4182kJ = L0.C.j(L0.S.f11103b);
            if ((!AbstractC6492s.d(obj3, bool) || (interfaceC4182kJ instanceof InterfaceC3185o)) && obj3 != null) {
                s10 = (L0.S) interfaceC4182kJ.a(obj3);
            }
            AbstractC6492s.f(s10);
            return new Q(c3174d, s10.r(), (L0.S) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return Q.f19416e;
        }

        private c() {
        }
    }

    public /* synthetic */ Q(C3174d c3174d, long j10, L0.S s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, j10, s10);
    }

    public static /* synthetic */ Q d(Q q10, C3174d c3174d, long j10, L0.S s10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3174d = q10.f19417a;
        }
        if ((i10 & 2) != 0) {
            j10 = q10.f19418b;
        }
        if ((i10 & 4) != 0) {
            s10 = q10.f19419c;
        }
        return q10.b(c3174d, j10, s10);
    }

    public static /* synthetic */ Q e(Q q10, String str, long j10, L0.S s10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = q10.f19418b;
        }
        if ((i10 & 4) != 0) {
            s10 = q10.f19419c;
        }
        return q10.c(str, j10, s10);
    }

    public final Q b(C3174d c3174d, long j10, L0.S s10) {
        return new Q(c3174d, j10, s10, (DefaultConstructorMarker) null);
    }

    public final Q c(String str, long j10, L0.S s10) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new Q(new C3174d(str, null, null, 6, defaultConstructorMarker), j10, s10, defaultConstructorMarker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return L0.S.g(this.f19418b, q10.f19418b) && AbstractC6492s.d(this.f19419c, q10.f19419c) && AbstractC6492s.d(this.f19417a, q10.f19417a);
    }

    public final C3174d f() {
        return this.f19417a;
    }

    public final L0.S g() {
        return this.f19419c;
    }

    public final long h() {
        return this.f19418b;
    }

    public int hashCode() {
        int iHashCode = ((this.f19417a.hashCode() * 31) + L0.S.o(this.f19418b)) * 31;
        L0.S s10 = this.f19419c;
        return iHashCode + (s10 != null ? L0.S.o(s10.r()) : 0);
    }

    public final String i() {
        return this.f19417a.k();
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f19417a) + "', selection=" + ((Object) L0.S.q(this.f19418b)) + ", composition=" + this.f19419c + ')';
    }

    public /* synthetic */ Q(String str, long j10, L0.S s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, s10);
    }

    private Q(C3174d c3174d, long j10, L0.S s10) {
        this.f19417a = c3174d;
        this.f19418b = L0.T.c(j10, 0, i().length());
        this.f19419c = s10 != null ? L0.S.b(L0.T.c(s10.r(), 0, i().length())) : null;
    }

    public /* synthetic */ Q(C3174d c3174d, long j10, L0.S s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, (i10 & 2) != 0 ? L0.S.f11103b.a() : j10, (i10 & 4) != 0 ? null : s10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Q(String str, long j10, L0.S s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? L0.S.f11103b.a() : j10, (i10 & 4) != 0 ? null : s10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Q(String str, long j10, L0.S s10) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(new C3174d(str, null, null, 6, defaultConstructorMarker), j10, s10, defaultConstructorMarker);
    }
}
