package Y9;

import Ab.a;
import Eb.SsoUser;
import Ii.N;
import Li.P;
import Li.z;
import Q9.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import U9.AbstractC3619f;
import U9.C3621h;
import Y9.k;
import Y9.l;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.E;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import ga.C5884a;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.InterfaceC6411a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public class l extends W9.e implements k {

    /* renamed from: u, reason: collision with root package name */
    public static final a f24808u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f24809v = 8;

    /* renamed from: w, reason: collision with root package name */
    private static final String f24810w = "saved_state_base_mfa_push";

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC6411a f24811r;

    /* renamed from: s, reason: collision with root package name */
    private final z f24812s;

    /* renamed from: t, reason: collision with root package name */
    private final Fg.a f24813t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends l implements k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator) {
            super(savedState, session, activityController, vibrator);
            AbstractC6492s.i(savedState, "savedState");
            AbstractC6492s.i(session, "session");
            AbstractC6492s.i(activityController, "activityController");
            AbstractC6492s.i(vibrator, "vibrator");
            I0();
        }

        @Override // W9.e
        protected AbstractC5912b v0() {
            return G0();
        }
    }

    private static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24814a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new c(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(boolean z10) {
            this.f24814a = z10;
        }

        public final boolean a() {
            return this.f24814a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f24814a == ((c) obj).f24814a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f24814a);
        }

        public String toString() {
            return "SavedState(isDenied=" + this.f24814a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeInt(this.f24814a ? 1 : 0);
        }
    }

    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f24815a;

        d(long j10) {
            this.f24815a = j10;
        }

        public final CharSequence a(Context ctx, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ctx, "ctx");
            interfaceC3540l.U(-1884903658);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1884903658, i10, -1, "com.ui.core.ui.sso.mfa.auth.push.PushAuthVMImpl.getResendButtonLabel.<anonymous> (PushAuthVMImpl.kt:52)");
            }
            String string = ctx.getString(P9.b.f18414T);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f24815a)}, 1));
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

    static final class e implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f24817a;

            /* renamed from: Y9.l$e$a$a, reason: collision with other inner class name */
            static final class C0942a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f24818a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l f24819b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SsoUser f24820c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0942a(l lVar, SsoUser ssoUser, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f24819b = lVar;
                    this.f24820c = ssoUser;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String t() {
                    return "MFA PUSH successful";
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0942a(this.f24819b, this.f24820c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f24818a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    S9.a.d(new InterfaceC6824a() { // from class: Y9.m
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return l.e.a.C0942a.t();
                        }
                    });
                    l lVar = this.f24819b;
                    C5884a c5884a = C5884a.f47755a;
                    SsoUser ssoUser = this.f24820c;
                    AbstractC6492s.f(ssoUser);
                    lVar.q0(C5884a.b(c5884a, ssoUser, this.f24819b.p0().h(), this.f24819b.p0().e(), false, 8, null));
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0942a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            a(l lVar) {
                this.f24817a = lVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(SsoUser user) {
                AbstractC6492s.i(user, "user");
                return Qi.g.c(null, new C0942a(this.f24817a, user, null), 1, null);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f24821a;

            b(l lVar) {
                this.f24821a = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c() {
                return "MFA PUSH DENIED";
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                if (it instanceof UnauthorisedException) {
                    S9.a.d(new InterfaceC6824a() { // from class: Y9.n
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return l.e.b.c();
                        }
                    });
                    this.f24821a.f24811r.a(InterfaceC6411a.EnumC1899a.TICK);
                    this.f24821a.K().setValue(k.a.DENIED);
                }
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f24822a = new c();

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final a f24823a = new a();

                a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    return error instanceof UnauthorisedException ? gg.i.j0() : gg.i.d2(P9.n.f18488a.d(), TimeUnit.MILLISECONDS);
                }
            }

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(a.f24823a);
            }
        }

        static final class d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f24824a = new d();

            d() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(P9.n.f18488a.d(), TimeUnit.MILLISECONDS);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(J it) {
            AbstractC6492s.i(it, "it");
            return a.C0015a.a(l.this.p0().g(), null, 1, null).t(new a(l.this)).z(new b(l.this)).Q(c.f24822a).P(d.f24824a);
        }
    }

    public static final class f implements Callable {
        public f() {
        }

        public final void a() {
            l.this.f24813t.h(J.f24997a);
            l.this.K().setValue(k.a.AUTH);
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator) {
        super(savedState, session, activityController);
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        this.f24811r = vibrator;
        k.a aVar = k.a.AUTH;
        this.f24812s = P.a(aVar);
        Fg.a aVarK2 = Fg.a.k2(J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f24813t = aVarK2;
        c cVar = (c) savedState.d(f24810w);
        if (cVar != null) {
            K().setValue(cVar.a() ? k.a.DENIED : aVar);
        }
        k0().setValue(Boolean.TRUE);
        E0();
        N0();
    }

    private final void N0() {
        InterfaceC6043c interfaceC6043cS = this.f24813t.X0(Gg.a.a()).L1(new e()).W(Gg.a.a()).S();
        AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
        c0(interfaceC6043cS);
    }

    static /* synthetic */ Object O0(l lVar, InterfaceC5380e interfaceC5380e) {
        lVar.X().b(lVar.w0() ? new j.a.d(AbstractC3619f.g.f22201a) : new j.a.d(AbstractC3619f.g.f22201a));
        return J.f24997a;
    }

    @Override // Y9.k
    public Object A(InterfaceC5380e interfaceC5380e) {
        return O0(this, interfaceC5380e);
    }

    @Override // W9.e
    protected AbstractC5912b G0() {
        AbstractC5912b abstractC5912bP = p0().g().p();
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new f());
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        AbstractC5912b abstractC5912bG = abstractC5912bP.g(abstractC5912bF);
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        return abstractC5912bG;
    }

    @Override // Y9.k
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public z K() {
        return this.f24812s;
    }

    @Override // W9.e, R9.a
    public void a0() {
        super.a0();
        o0().i(f24810w, new c(K().getValue() == k.a.DENIED));
    }

    @Override // W9.e
    protected s9.d n0(long j10) {
        return j10 > 0 ? new d.a(String.valueOf(j10), new d(j10)) : new d.b(P9.b.f18412S);
    }
}
