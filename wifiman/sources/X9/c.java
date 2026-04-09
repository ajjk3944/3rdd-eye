package X9;

import Eb.SsoUser;
import Eb.w;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.Y;
import Li.AbstractC3222i;
import Li.F;
import Li.InterfaceC3220g;
import Li.P;
import Li.y;
import Li.z;
import Q9.j;
import U9.C3615b;
import U9.C3621h;
import W9.e;
import X9.c;
import X9.p;
import Yg.J;
import Yg.v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.O;
import com.ui.core.ui.sso.UiSSO;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import ga.C5884a;
import gg.AbstractC5912b;
import ha.InterfaceC5970a;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.InterfaceC6411a;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.b;
import s9.d;

/* loaded from: classes3.dex */
public abstract class c extends W9.e implements p {

    /* renamed from: H, reason: collision with root package name */
    public static final a f24049H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public static final int f24050I = 8;

    /* renamed from: A, reason: collision with root package name */
    private final y f24051A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC3220g f24052B;

    /* renamed from: C, reason: collision with root package name */
    private long f24053C;

    /* renamed from: D, reason: collision with root package name */
    private final int f24054D;

    /* renamed from: E, reason: collision with root package name */
    private final s9.d f24055E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f24056F;

    /* renamed from: G, reason: collision with root package name */
    private String f24057G;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC6411a f24058r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC5970a f24059s;

    /* renamed from: t, reason: collision with root package name */
    private final z f24060t;

    /* renamed from: u, reason: collision with root package name */
    private final z f24061u;

    /* renamed from: v, reason: collision with root package name */
    private final z f24062v;

    /* renamed from: w, reason: collision with root package name */
    private final z f24063w;

    /* renamed from: x, reason: collision with root package name */
    private final z f24064x;

    /* renamed from: y, reason: collision with root package name */
    private final z f24065y;

    /* renamed from: z, reason: collision with root package name */
    private final z f24066z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24067a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24068b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f24069c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String code, String str, boolean z10) {
            AbstractC6492s.i(code, "code");
            this.f24067a = code;
            this.f24068b = str;
            this.f24069c = z10;
        }

        public final String a() {
            return this.f24068b;
        }

        public final String b() {
            return this.f24067a;
        }

        public final boolean c() {
            return this.f24069c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f24067a, bVar.f24067a) && AbstractC6492s.d(this.f24068b, bVar.f24068b) && this.f24069c == bVar.f24069c;
        }

        public int hashCode() {
            int iHashCode = this.f24067a.hashCode() * 31;
            String str = this.f24068b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f24069c);
        }

        public String toString() {
            return "SavedState(code=" + this.f24067a + ", clipboardContent=" + this.f24068b + ", screenLeft=" + this.f24069c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.f24067a);
            dest.writeString(this.f24068b);
            dest.writeInt(this.f24069c ? 1 : 0);
        }
    }

    /* renamed from: X9.c$c, reason: collision with other inner class name */
    public static final class CallableC0912c implements Callable {
        public CallableC0912c() {
        }

        public final void a() {
            c.this.U0();
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24071a;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return c.this.new d(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24071a;
            if (i10 == 0) {
                v.b(obj);
                this.f24071a = 1;
                if (Y.a(1000L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            String strA = c.this.f24059s.a();
            if (strA != null && !AbstractC6492s.d(strA, c.this.f24057G) && c.this.l1(strA)) {
                c.this.f24051A.j(new p.a.c(strA));
                c.this.O(strA);
            }
            c.this.f24057G = strA;
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements kg.n {

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f24074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f24075b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SsoUser f24076c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, SsoUser ssoUser, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f24075b = cVar;
                this.f24076c = ssoUser;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String t() {
                return "MFA successful";
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f24075b, this.f24076c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f24074a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                S9.a.d(new InterfaceC6824a() { // from class: X9.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return c.e.a.t();
                    }
                });
                c cVar = this.f24075b;
                C5884a c5884a = C5884a.f47755a;
                SsoUser ssoUser = this.f24076c;
                AbstractC6492s.f(ssoUser);
                cVar.q0(C5884a.b(c5884a, ssoUser, this.f24075b.p0().h(), this.f24075b.p0().e(), false, 8, null));
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(SsoUser user) {
            AbstractC6492s.i(user, "user");
            return Qi.g.c(null, new a(c.this, user, null), 1, null);
        }
    }

    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            c.this.H0(e.a.SUBMITTING);
        }
    }

    static final class g implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f24078a = new g();

        g() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to submit code";
        }
    }

    public static final class h implements Callable {
        public h() {
        }

        public final void a() {
            c.this.f24058r.a(InterfaceC6411a.EnumC1899a.TICK);
            c.this.W0().setValue(c.this.Z0());
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    public static final class i implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f24080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f24081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9.d f24082c;

        public i(Throwable th2, c cVar, s9.d dVar) {
            this.f24080a = th2;
            this.f24081b = cVar;
            this.f24082c = dVar;
        }

        public final void a() {
            S9.a.c(g.f24078a, new UiSSO.SuppressedError("Failed to submit code", this.f24080a));
            this.f24081b.W0().setValue(this.f24082c);
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
        super(savedState, session, activityController);
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(clipboard, "clipboard");
        this.f24058r = vibrator;
        this.f24059s = clipboard;
        this.f24060t = P.a(null);
        this.f24061u = P.a(new d.c(""));
        this.f24062v = P.a(new d.c(""));
        this.f24063w = P.a(new d.b(P9.b.f18475y));
        z zVarA = P.a("");
        this.f24064x = zVarA;
        this.f24065y = P.a(null);
        this.f24066z = P.a(null);
        y yVarB = F.b(1, 0, null, 6, null);
        this.f24051A = yVarB;
        this.f24052B = AbstractC3222i.a(yVarB);
        this.f24053C = System.currentTimeMillis() + 10000;
        this.f24054D = 6;
        this.f24055E = new d.b(P9.b.f18469v);
        b bVar = (b) savedState.d("saved_state_base_mfa_code");
        if (bVar != null) {
            zVarA.setValue(bVar.b());
            this.f24057G = bVar.a();
            this.f24056F = bVar.c();
        }
        h1();
        E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        this.f24064x.setValue("");
        this.f24065y.setValue(null);
        this.f24051A.j(p.a.C0916a.f24216a);
    }

    private final AbstractC5912b V0() {
        AbstractC5912b abstractC5912bA0 = AbstractC5912b.a0(2000L, TimeUnit.MILLISECONDS);
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new CallableC0912c());
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bA0, abstractC5912bF);
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    private final void c1() {
        if (this.f24056F) {
            AbstractC3063k.d(O.a(this), null, null, new d(null), 3, null);
        }
    }

    static /* synthetic */ Object d1(c cVar, InterfaceC5380e interfaceC5380e) {
        cVar.j0().e0(U9.j.f22213a);
        return J.f24997a;
    }

    static /* synthetic */ Object e1(c cVar, InterfaceC5380e interfaceC5380e) {
        cVar.i1();
        return J.f24997a;
    }

    static /* synthetic */ Object f1(c cVar, InterfaceC5380e interfaceC5380e) {
        cVar.X().b(j.a.C0677a.f19270a);
        return J.f24997a;
    }

    static /* synthetic */ Object g1(c cVar, InterfaceC5380e interfaceC5380e) {
        cVar.X().b(new j.a.e("https://play.google.com/store/apps/details?id=com.ui.uid.authenticator"));
        return J.f24997a;
    }

    private final void h1() {
        w wVar;
        C3615b c3615bA;
        Set setA;
        Object next;
        C3615b c3615bA2;
        if (P9.n.f18488a.h() && !w0()) {
            UiSSO.d dVarD = p0().d();
            if (!(((dVarD == null || (c3615bA2 = dVarD.a()) == null) ? null : c3615bA2.b()) instanceof w.Push)) {
                UiSSO.d dVarD2 = p0().d();
                if (dVarD2 == null || (c3615bA = dVarD2.a()) == null || (setA = c3615bA.a()) == null) {
                    wVar = null;
                } else {
                    Iterator it = setA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((w) next) instanceof w.Push) {
                                break;
                            }
                        }
                    }
                    wVar = (w) next;
                }
                if (wVar == null) {
                    this.f24066z.setValue(new Z9.a("", new b.a(P9.a.f18369f, null, null, 6, null), false, new d.b(P9.b.f18425Y0), new d.b(P9.b.f18463s)));
                    return;
                }
            }
        }
        this.f24066z.setValue(null);
    }

    private final void i1() {
        this.f24051A.j(p.a.b.f24217a);
        AbstractC5912b abstractC5912bW = p0().g().i((String) this.f24064x.getValue()).t(new e()).B(new f()).w(new InterfaceC6464a() { // from class: X9.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                c.j1(this.f24047a);
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        InterfaceC6043c interfaceC6043cS = r0(abstractC5912bW, new InterfaceC6839p() { // from class: X9.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return c.k1(this.f24048a, (Throwable) obj, (s9.d) obj2);
            }
        }).S();
        AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
        c0(interfaceC6043cS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(c cVar) {
        cVar.H0(e.a.IDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b k1(c cVar, Throwable error, s9.d errorString) {
        AbstractC6492s.i(error, "error");
        AbstractC6492s.i(errorString, "errorString");
        if (!(error instanceof UnauthorisedException)) {
            AbstractC5912b abstractC5912bF = AbstractC5912b.F(new i(error, cVar, errorString));
            AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
            return abstractC5912bF;
        }
        AbstractC5912b abstractC5912bF2 = AbstractC5912b.F(cVar.new h());
        AbstractC6492s.h(abstractC5912bF2, "fromCallable(...)");
        AbstractC5912b abstractC5912bG = abstractC5912bF2.g(cVar.V0());
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        return abstractC5912bG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l1(String str) {
        return str.length() == X0();
    }

    @Override // W9.e, W9.f
    public Object H(InterfaceC5380e interfaceC5380e) {
        return f1(this, interfaceC5380e);
    }

    @Override // W9.e
    protected void I0() {
        super.I0();
        h1();
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N L() {
        return this.f24062v;
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N N() {
        return this.f24063w;
    }

    @Override // X9.p
    public void O(String code) {
        AbstractC6492s.i(code, "code");
        if (AbstractC6492s.d(this.f24064x.getValue(), code)) {
            return;
        }
        this.f24064x.setValue(code);
        this.f24065y.setValue(null);
        E0();
        if (l1(code)) {
            i1();
        }
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N P() {
        return this.f24061u;
    }

    @Override // X9.p
    public Object Q(InterfaceC5380e interfaceC5380e) {
        return g1(this, interfaceC5380e);
    }

    @Override // W9.e, W9.f
    public Object R(InterfaceC5380e interfaceC5380e) {
        return d1(this, interfaceC5380e);
    }

    public final z W0() {
        return this.f24065y;
    }

    protected int X0() {
        return this.f24054D;
    }

    public final z Y0() {
        return this.f24061u;
    }

    protected s9.d Z0() {
        return this.f24055E;
    }

    @Override // W9.e, R9.a
    public void a0() {
        super.a0();
        this.f24056F = true;
        o0().i("saved_state_base_mfa_code", new b((String) this.f24064x.getValue(), this.f24057G, this.f24056F));
    }

    public final z a1() {
        return this.f24062v;
    }

    @Override // X9.p
    public InterfaceC3220g b() {
        return this.f24052B;
    }

    public final z b1() {
        return this.f24060t;
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N c() {
        return this.f24060t;
    }

    @Override // X9.p
    public Object e(InterfaceC5380e interfaceC5380e) {
        return e1(this, interfaceC5380e);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void g(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.g(owner);
        c1();
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N m() {
        return this.f24065y;
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N n() {
        return this.f24066z;
    }

    @Override // X9.p
    public /* bridge */ /* synthetic */ Li.N r() {
        return this.f24064x;
    }
}
