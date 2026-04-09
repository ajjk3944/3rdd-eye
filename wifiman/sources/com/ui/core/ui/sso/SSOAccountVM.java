package com.ui.core.ui.sso;

import Ii.AbstractC3061j;
import Ii.C3079s0;
import Ii.N;
import Li.AbstractC3222i;
import Li.F;
import Li.InterfaceC3220g;
import Li.y;
import Yg.J;
import Yg.v;
import androidx.lifecycle.E;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.c;
import com.ui.sso.api.UiAccountApi;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import ia.AbstractC6138a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class SSOAccountVM extends R9.a implements c.a {

    /* renamed from: e, reason: collision with root package name */
    private final UiAccountApi.b f41349e;

    /* renamed from: f, reason: collision with root package name */
    private final E f41350f;

    /* renamed from: g, reason: collision with root package name */
    private com.ui.core.ui.sso.c f41351g;

    /* renamed from: h, reason: collision with root package name */
    private UiSSO.d f41352h;

    /* renamed from: i, reason: collision with root package name */
    private final UiSSO.e f41353i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f41354j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f41355k;

    /* renamed from: l, reason: collision with root package name */
    private final y f41356l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3220g f41357m;

    private static abstract class AccountCreationError extends RuntimeException {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$AccountApi;", "Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError;", "Lcom/ui/sso/api/UiAccountApi$Error;", "cause", "<init>", "(Lcom/ui/sso/api/UiAccountApi$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/sso/api/UiAccountApi$Error;", "()Lcom/ui/sso/api/UiAccountApi$Error;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AccountApi extends AccountCreationError {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UiAccountApi.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountApi(UiAccountApi.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public UiAccountApi.Error getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountApi) && AbstractC6492s.d(this.cause, ((AccountApi) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "AccountApi(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$InvalidData;", "Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidData extends AccountCreationError {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidData(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidData)) {
                    return false;
                }
                InvalidData invalidData = (InvalidData) other;
                return AbstractC6492s.d(this.message, invalidData.message) && AbstractC6492s.d(this.cause, invalidData.cause);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                int iHashCode = this.message.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "InvalidData(message=" + this.message + ", cause=" + this.cause + ")";
            }
        }

        public /* synthetic */ AccountCreationError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AccountCreationError() {
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41361a;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return SSOAccountVM.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41361a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3220g interfaceC3220gA = SSOAccountVM.this.f41349e.a(C3079s0.f9355a);
                this.f41361a = 1;
                obj = AbstractC3222i.x(interfaceC3220gA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41363a;

        /* renamed from: b, reason: collision with root package name */
        Object f41364b;

        /* renamed from: c, reason: collision with root package name */
        Object f41365c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41366d;

        /* renamed from: f, reason: collision with root package name */
        int f41368f;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41366d = obj;
            this.f41368f |= PduHandle.NONE;
            return SSOAccountVM.this.l0(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41369a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t() {
            return "Failed to obtain device identifiers from account api";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return SSOAccountVM.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41369a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    UiAccountApi uiAccountApiO0 = SSOAccountVM.this.o0();
                    this.f41369a = 1;
                    obj = uiAccountApiO0.h(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return (Ta.c) obj;
            } catch (UiAccountApi.Error e10) {
                S9.a.c(new InterfaceC6824a() { // from class: com.ui.core.ui.sso.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return SSOAccountVM.c.t();
                    }
                }, e10);
                return null;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41371a;

        /* renamed from: b, reason: collision with root package name */
        Object f41372b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41373c;

        /* renamed from: e, reason: collision with root package name */
        int f41375e;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41373c = obj;
            this.f41375e |= PduHandle.NONE;
            return SSOAccountVM.this.G(null, this);
        }
    }

    public SSOAccountVM(UiAccountApi.b uiAccountApiService, E savedStateHandle, P9.k kVar) {
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        AbstractC6492s.i(savedStateHandle, "savedStateHandle");
        this.f41349e = uiAccountApiService;
        this.f41350f = savedStateHandle;
        this.f41352h = (UiSSO.d) savedStateHandle.d("mfa_params");
        this.f41353i = (UiSSO.e) savedStateHandle.d("pkce_params");
        this.f41354j = Yg.n.b(new InterfaceC6824a() { // from class: P9.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return SSOAccountVM.k0(this.f18479a);
            }
        });
        this.f41355k = Yg.n.b(new InterfaceC6824a() { // from class: P9.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return SSOAccountVM.n0(this.f18480a);
            }
        });
        y yVarB = F.b(1, 0, null, 6, null);
        this.f41356l = yVarB;
        this.f41357m = yVarB;
        t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiAccountApi k0(SSOAccountVM sSOAccountVM) {
        return (UiAccountApi) AbstractC3061j.b(null, sSOAccountVM.new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[Catch: Error -> 0x0039, TRY_LEAVE, TryCatch #2 {Error -> 0x0039, blocks: (B:14:0x0034, B:21:0x004d, B:46:0x010a, B:48:0x0118, B:24:0x005e, B:33:0x00a9, B:34:0x00b1, B:36:0x00b5, B:42:0x00f9, B:39:0x00c5, B:41:0x00c9, B:53:0x0135, B:54:0x013a, B:55:0x013b, B:56:0x0143, B:29:0x0093), top: B:65:0x0028, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(com.ui.core.ui.sso.UiSSO.a r19, dh.InterfaceC5380e r20) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.core.ui.sso.SSOAccountVM.l0(com.ui.core.ui.sso.UiSSO$a, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m0() {
        return "Error when creating UI account in system AccountManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ta.c n0(SSOAccountVM sSOAccountVM) {
        return (Ta.c) AbstractC3061j.b(null, sSOAccountVM.new c(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiAccountApi o0() {
        return (UiAccountApi) this.f41354j.getValue();
    }

    private final Ta.c p0() {
        return (Ta.c) this.f41355k.getValue();
    }

    private final void t0() {
        String strB;
        if (this.f41351g == null) {
            Gb.i iVar = new Gb.i(new P9.i(this.f41350f));
            UiSSO.d dVar = this.f41352h;
            if (dVar != null && (strB = dVar.b()) != null) {
                iVar.C(strB);
            }
            if (AbstractC6138a.a(this.f41353i)) {
                UiSSO.e eVar = this.f41353i;
                iVar.B(eVar != null ? eVar.b() : null);
            }
            Ta.c cVarP0 = p0();
            if (cVarP0 != null) {
                iVar.d(cVarP0.c());
                iVar.J(cVarP0.b());
                iVar.l(cVarP0.a());
            }
            UiSSO.d dVar2 = this.f41352h;
            UiSSO.e eVar2 = this.f41353i;
            P9.n nVar = P9.n.f18488a;
            Ab.h hVarE = nVar.e();
            String strA = nVar.a();
            String strB2 = nVar.b();
            boolean zA = AbstractC6138a.a(this.f41353i);
            Ta.c cVarP02 = p0();
            this.f41351g = new com.ui.core.ui.sso.c(new Ab.g(hVarE, iVar, null, strA, strB2, null, new Cb.b(iVar, zA, cVarP02 != null ? cVarP02.c() : null), null, null, null, 928, null), iVar, this.f41349e, dVar2, eVar2, this, null, 64, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.core.ui.sso.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object G(com.ui.core.ui.sso.UiSSO.a r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ui.core.ui.sso.SSOAccountVM.d
            if (r0 == 0) goto L13
            r0 = r6
            com.ui.core.ui.sso.SSOAccountVM$d r0 = (com.ui.core.ui.sso.SSOAccountVM.d) r0
            int r1 = r0.f41375e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41375e = r1
            goto L18
        L13:
            com.ui.core.ui.sso.SSOAccountVM$d r0 = new com.ui.core.ui.sso.SSOAccountVM$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41373c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41375e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f41372b
            com.ui.core.ui.sso.UiSSO$a r5 = (com.ui.core.ui.sso.UiSSO.a) r5
            java.lang.Object r0 = r0.f41371a
            com.ui.core.ui.sso.SSOAccountVM r0 = (com.ui.core.ui.sso.SSOAccountVM) r0
            Yg.v.b(r6)
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            Yg.v.b(r6)
            r0.f41371a = r4
            r0.f41372b = r5
            r0.f41375e = r3
            java.lang.Object r6 = r4.l0(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            Li.y r6 = r0.f41356l
            r6.j(r5)
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.core.ui.sso.SSOAccountVM.G(com.ui.core.ui.sso.UiSSO$a, dh.e):java.lang.Object");
    }

    public final InterfaceC3220g q0() {
        return this.f41357m;
    }

    public final com.ui.core.ui.sso.c r0() {
        com.ui.core.ui.sso.c cVar = this.f41351g;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("session instance not available, did you call initSession()?");
    }

    public final P9.k s0() {
        return null;
    }

    public final void u0(UiSSO.a authResponse) {
        AbstractC6492s.i(authResponse, "authResponse");
        this.f41351g = com.ui.core.ui.sso.c.b(r0(), null, null, null, null, null, null, authResponse, 63, null);
    }

    public final void v0(UiSSO.d mfaParams, UiSSO.e eVar) {
        AbstractC6492s.i(mfaParams, "mfaParams");
        this.f41350f.i("mfa_params", mfaParams);
        this.f41351g = new com.ui.core.ui.sso.c(r0().g(), r0().h(), r0().i(), mfaParams, eVar, r0().c(), null, 64, null);
    }
}
