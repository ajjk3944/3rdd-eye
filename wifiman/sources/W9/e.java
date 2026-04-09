package W9;

import Ii.AbstractC3063k;
import Ii.N;
import Li.P;
import Li.z;
import Q9.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import U9.C3621h;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.E;
import androidx.lifecycle.O;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.c;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import retrofit2.HttpException;
import s9.d;

/* loaded from: classes3.dex */
public abstract class e extends R9.a implements W9.f {

    /* renamed from: p, reason: collision with root package name */
    public static final b f23711p = new b(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f23712q = 8;

    /* renamed from: e, reason: collision with root package name */
    private final E f23713e;

    /* renamed from: f, reason: collision with root package name */
    private final com.ui.core.ui.sso.c f23714f;

    /* renamed from: g, reason: collision with root package name */
    private final C3621h f23715g;

    /* renamed from: h, reason: collision with root package name */
    private final z f23716h;

    /* renamed from: i, reason: collision with root package name */
    private final z f23717i;

    /* renamed from: j, reason: collision with root package name */
    private final z f23718j;

    /* renamed from: k, reason: collision with root package name */
    private final z f23719k;

    /* renamed from: l, reason: collision with root package name */
    private final z f23720l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23721m;

    /* renamed from: n, reason: collision with root package name */
    private long f23722n;

    /* renamed from: o, reason: collision with root package name */
    private a f23723o;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IDLE = new a("IDLE", 0);
        public static final a SUBMITTING = new a("SUBMITTING", 1);
        public static final a RESENDING = new a("RESENDING", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{IDLE, SUBMITTING, RESENDING};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final long f23724a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new c(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(long j10) {
            this.f23724a = j10;
        }

        public final long a() {
            return this.f23724a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f23724a == ((c) obj).f23724a;
        }

        public int hashCode() {
            return Long.hashCode(this.f23724a);
        }

        public String toString() {
            return "SavedState(resendAvailableAt=" + this.f23724a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeLong(this.f23724a);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23725a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SUBMITTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.RESENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23725a = iArr;
        }
    }

    /* renamed from: W9.e$e, reason: collision with other inner class name */
    static final class C0882e implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f23726a;

        C0882e(long j10) {
            this.f23726a = j10;
        }

        public final CharSequence a(Context ctx, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ctx, "ctx");
            interfaceC3540l.U(-377246054);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-377246054, i10, -1, "com.ui.core.ui.sso.mfa.auth.BaseMFAAuthVM.getResendButtonLabel.<anonymous> (BaseMFAAuthVM.kt:169)");
            }
            String string = ctx.getString(P9.b.f18467u);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f23726a)}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23727a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiSSO.a f23729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23729c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return e.this.new f(this.f23729c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23727a;
            if (i10 == 0) {
                v.b(obj);
                c.a aVarC = e.this.p0().c();
                UiSSO.a aVar = this.f23729c;
                this.f23727a = 1;
                if (aVarC.G(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f23730a;

        g(InterfaceC6839p interfaceC6839p) {
            this.f23730a = interfaceC6839p;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UnauthorisedException ? (gg.f) this.f23730a.invoke(error, new d.b(P9.b.f18469v)) : error instanceof HttpException ? ((HttpException) error).a() == 429 ? (AbstractC5912b) this.f23730a.invoke(error, new d.b(P9.b.f18473x)) : (AbstractC5912b) this.f23730a.invoke(error, new d.b(P9.b.f18437f)) : error instanceof IOException ? (gg.f) this.f23730a.invoke(error, new d.b(P9.b.f18453n)) : AbstractC5912b.D(error);
        }
    }

    public static final class h implements Callable {
        public h() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return e.this.v0();
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f23732a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC5912b it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    static final class j implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f23733a = new j();

        j() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to send initial code request";
        }
    }

    public static final class k implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f23734a;

        public k(Throwable th2) {
            this.f23734a = th2;
        }

        public final void a() {
            S9.a.c(j.f23733a, new UiSSO.SuppressedError("Initial code request failed", this.f23734a));
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long apply(Long it) {
            AbstractC6492s.i(it, "it");
            return Long.valueOf(Math.max(0L, (e.this.f23722n - System.currentTimeMillis()) / 1000));
        }
    }

    static final class m implements InterfaceC6469f {
        m() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Long remainingSeconds) {
            AbstractC6492s.i(remainingSeconds, "remainingSeconds");
            e.this.m0().setValue(e.this.n0(remainingSeconds.longValue()));
            if (remainingSeconds.longValue() > 0) {
                e.this.l0().setValue(Boolean.FALSE);
            } else {
                e.this.l0().setValue(Boolean.TRUE);
            }
        }
    }

    static final class n implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f23737a = new n();

        n() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to send initial code request";
        }
    }

    static final class o implements InterfaceC6469f {
        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            e.this.H0(a.RESENDING);
        }
    }

    public static final class p implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f23739a;

        public p(Throwable th2) {
            this.f23739a = th2;
        }

        public final void a() {
            S9.a.c(n.f23737a, new UiSSO.SuppressedError("Initial code request failed", this.f23739a));
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    public e(E savedState, com.ui.core.ui.sso.c session, C3621h activityController) {
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        this.f23713e = savedState;
        this.f23714f = session;
        this.f23715g = activityController;
        Boolean bool = Boolean.FALSE;
        this.f23716h = P.a(bool);
        this.f23717i = P.a(new d.b(P9.b.f18465t));
        this.f23718j = P.a(bool);
        this.f23719k = P.a(bool);
        this.f23720l = P.a(Boolean.TRUE);
        this.f23722n = System.currentTimeMillis() + 10000;
        this.f23723o = a.IDLE;
        c cVar = (c) savedState.d("saved_state_base_mfa_auth");
        if (cVar != null) {
            this.f23722n = cVar.a();
        }
        E0();
        u0();
        s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(e eVar) {
        eVar.H0(a.IDLE);
    }

    static /* synthetic */ Object B0(final e eVar, InterfaceC5380e interfaceC5380e) {
        eVar.f23718j.setValue(kotlin.coroutines.jvm.internal.b.a(false));
        AbstractC5912b abstractC5912bX = eVar.F0().x(new InterfaceC6464a() { // from class: W9.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                e.y0(this.f23709a);
            }
        });
        AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
        InterfaceC6043c interfaceC6043cS = eVar.r0(abstractC5912bX, new InterfaceC6839p() { // from class: W9.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return e.z0((Throwable) obj, (s9.d) obj2);
            }
        }).B(eVar.new o()).w(new InterfaceC6464a() { // from class: W9.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                e.A0(this.f23710a);
            }
        }).S();
        AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
        eVar.c0(interfaceC6043cS);
        return J.f24997a;
    }

    static /* synthetic */ Object D0(e eVar, InterfaceC5380e interfaceC5380e) {
        eVar.X().b(j.a.C0677a.f19270a);
        return J.f24997a;
    }

    private final AbstractC5912b F0() {
        return G0();
    }

    private final void s0() {
        gg.z zVarX = gg.z.x(new h());
        AbstractC6492s.h(zVarX, "fromCallable(...)");
        AbstractC5912b abstractC5912bT = zVarX.t(i.f23732a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        InterfaceC6043c interfaceC6043cS = r0(abstractC5912bT, new InterfaceC6839p() { // from class: W9.d
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return e.t0((Throwable) obj, (s9.d) obj2);
            }
        }).S();
        AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
        c0(interfaceC6043cS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b t0(Throwable error, s9.d dVar) {
        AbstractC6492s.i(error, "error");
        AbstractC6492s.i(dVar, "<unused var>");
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new k(error));
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    private final void u0() {
        this.f23722n = System.currentTimeMillis() + 10000;
        InterfaceC6043c interfaceC6043cA1 = gg.i.F0(0L, 200L, TimeUnit.MILLISECONDS).N0(new l()).W().f0(new m()).F1(Gg.a.a()).A1();
        AbstractC6492s.h(interfaceC6043cA1, "subscribe(...)");
        c0(interfaceC6043cA1);
    }

    static /* synthetic */ Object x0(e eVar, InterfaceC5380e interfaceC5380e) {
        eVar.f23715g.e0(U9.j.f22213a);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(e eVar) {
        eVar.f23722n = System.currentTimeMillis() + 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b z0(Throwable error, s9.d dVar) {
        AbstractC6492s.i(error, "error");
        AbstractC6492s.i(dVar, "<unused var>");
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new p(error));
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    public void C0(UiSSO.a authResponse) {
        AbstractC6492s.i(authResponse, "authResponse");
        this.f23715g.e0(new U9.k(authResponse));
    }

    @Override // W9.f
    public /* bridge */ /* synthetic */ Li.N D() {
        return this.f23720l;
    }

    @Override // W9.f
    public /* bridge */ /* synthetic */ Li.N E() {
        return this.f23719k;
    }

    protected final void E0() {
        int i10 = d.f23725a[this.f23723o.ordinal()];
        if (i10 == 1) {
            this.f23716h.setValue(Boolean.FALSE);
        } else if (i10 == 2) {
            this.f23716h.setValue(Boolean.TRUE);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f23716h.setValue(Boolean.TRUE);
        }
    }

    @Override // W9.f
    public /* bridge */ /* synthetic */ Li.N F() {
        return this.f23716h;
    }

    protected abstract AbstractC5912b G0();

    @Override // W9.f
    public Object H(InterfaceC5380e interfaceC5380e) {
        return D0(this, interfaceC5380e);
    }

    protected final void H0(a value) {
        AbstractC6492s.i(value, "value");
        this.f23723o = value;
        E0();
    }

    protected void I0() {
        this.f23721m = true;
        this.f23720l.setValue(Boolean.FALSE);
    }

    @Override // W9.f
    public /* bridge */ /* synthetic */ Li.N M() {
        return this.f23717i;
    }

    @Override // W9.f
    public Object R(InterfaceC5380e interfaceC5380e) {
        return x0(this, interfaceC5380e);
    }

    @Override // R9.a
    public void a0() {
        super.a0();
        this.f23713e.i("saved_state_base_mfa_auth", new c(this.f23722n));
    }

    protected final C3621h j0() {
        return this.f23715g;
    }

    @Override // W9.f
    public Object k(InterfaceC5380e interfaceC5380e) {
        return B0(this, interfaceC5380e);
    }

    public final z k0() {
        return this.f23719k;
    }

    public final z l0() {
        return this.f23718j;
    }

    public final z m0() {
        return this.f23717i;
    }

    protected s9.d n0(long j10) {
        return j10 > 0 ? new d.a(String.valueOf(j10), new C0882e(j10)) : new d.b(P9.b.f18465t);
    }

    protected final E o0() {
        return this.f23713e;
    }

    protected final com.ui.core.ui.sso.c p0() {
        return this.f23714f;
    }

    public final void q0(UiSSO.a authResponse) {
        AbstractC6492s.i(authResponse, "authResponse");
        if (P9.n.f18488a.g()) {
            C0(authResponse);
        } else {
            AbstractC3063k.d(O.a(this), null, null, new f(authResponse, null), 3, null);
        }
    }

    protected final AbstractC5912b r0(AbstractC5912b abstractC5912b, InterfaceC6839p errorHandler) {
        AbstractC6492s.i(abstractC5912b, "<this>");
        AbstractC6492s.i(errorHandler, "errorHandler");
        AbstractC5912b abstractC5912bO = abstractC5912b.O(new g(errorHandler));
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    @Override // W9.f
    public /* bridge */ /* synthetic */ Li.N v() {
        return this.f23718j;
    }

    protected AbstractC5912b v0() {
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    protected final boolean w0() {
        return this.f23721m;
    }
}
