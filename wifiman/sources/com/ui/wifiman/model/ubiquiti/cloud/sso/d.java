package com.ui.wifiman.model.ubiquiti.cloud.sso;

import Eb.SsoUser;
import Ii.N;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.sso.api.UiAccountApi;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.cloud.sso.d;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kg.InterfaceC6466c;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import lc.AbstractC6571b;
import lc.C6572c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.kodein.di.DI;
import retrofit2.HttpException;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class d implements UiSSOAccountManager {

    /* renamed from: a, reason: collision with root package name */
    private final DI f43571a;

    /* renamed from: b, reason: collision with root package name */
    private final Lb.b f43572b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f43573c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f43574d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f43575e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f43576f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43577g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43578h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43579i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f43580j;

    static final class A implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f43582a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f43583b;

            a(d dVar, List list) {
                this.f43582a = dVar;
                this.f43583b = list;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(List localAccounts) {
                AbstractC6492s.i(localAccounts, "localAccounts");
                d dVar = this.f43582a;
                List list = this.f43583b;
                AbstractC6492s.f(list);
                return dVar.v(list, localAccounts);
            }
        }

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List apiAccounts) {
            AbstractC6492s.i(apiAccounts, "apiAccounts");
            return d.this.f43574d.o0().t(new a(d.this, apiAccounts));
        }
    }

    static final class B implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SsoUser f43585b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43586a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43587b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SsoUser f43588c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43589d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, SsoUser ssoUser, UiAccountApi uiAccountApi, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43587b = bVar;
                this.f43588c = ssoUser;
                this.f43589d = uiAccountApi;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f43587b, this.f43588c, this.f43589d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f43586a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Z7.b.h("SSO - Updating UI Account api info for " + this.f43587b + " with " + this.f43588c, null, 2, null);
                    UiAccountApi uiAccountApi = this.f43589d;
                    Na.b bVar = new Na.b(this.f43587b.e(), this.f43588c.getEmail(), this.f43588c.getUsername(), this.f43588c.getPicture());
                    this.f43586a = 1;
                    if (uiAccountApi.b(bVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                Z7.b.h("SSO - Updating UI Account api info for " + this.f43587b + " - SUCCESS", null, 2, null);
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SsoUser f43591b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43592c;

            public b(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, SsoUser ssoUser, UiAccountApi uiAccountApi) {
                this.f43590a = bVar;
                this.f43591b = ssoUser;
                this.f43592c = uiAccountApi;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Qi.g.c(null, new a(this.f43590a, this.f43591b, this.f43592c, null), 1, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        B(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, SsoUser ssoUser) {
            this.f43584a = bVar;
            this.f43585b = ssoUser;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(UiAccountApi api) {
            AbstractC6492s.i(api, "api");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(this.f43584a, this.f43585b, api));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class C implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C f43593a = new C();

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f43594a;

            public a(Throwable th2) {
                this.f43594a = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.e("Failed to update Account info via UiAccountApi", this.f43594a, null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        C() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof UiSSOAccountManager.Error) && !(error instanceof UiAccountApi.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public static final class D implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f43595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SsoUser f43596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f43597c;

        public D(b bVar, SsoUser ssoUser, d dVar) {
            this.f43595a = bVar;
            this.f43596b = ssoUser;
            this.f43597c = dVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("SSO - Updating User info for " + this.f43595a + " with " + this.f43596b, null, 2, null);
                if (this.f43597c.f43572b.d(this.f43595a.e(), new E(this.f43596b)) < 1) {
                    Z7.b.e("Update account failed.", null, null, 6, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class E implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SsoUser f43598a;

        E(SsoUser ssoUser) {
            this.f43598a = ssoUser;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Lb.a invoke(Lb.a persistent) {
            AbstractC6492s.i(persistent, "persistent");
            return persistent.a((1539 & 1) != 0 ? persistent.f11519a : null, (1539 & 2) != 0 ? persistent.f11520b : null, (1539 & 4) != 0 ? persistent.f11521c : this.f43598a.getFirstName(), (1539 & 8) != 0 ? persistent.f11522d : this.f43598a.getLastName(), (1539 & 16) != 0 ? persistent.f11523e : this.f43598a.getEmail(), (1539 & 32) != 0 ? persistent.f11524f : this.f43598a.getPicture(), (1539 & 64) != 0 ? persistent.f11525g : Boolean.valueOf(this.f43598a.getIsVerified()), (1539 & 128) != 0 ? persistent.f11526h : this.f43598a.getCurrentPrivacyRevision(), (1539 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? persistent.f11527i : this.f43598a.getCurrentTermsRevision(), (1539 & 512) != 0 ? persistent.f11528j : false, (1539 & 1024) != 0 ? persistent.f11529k : 0L);
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$a, reason: case insensitive filesystem */
    private static final class C5187a extends UiSSOAccountManager.Error {

        /* renamed from: a, reason: collision with root package name */
        private final UiAccountApi.c f43599a;

        /* renamed from: b, reason: collision with root package name */
        private final UiAccountApi.d f43600b;

        /* renamed from: c, reason: collision with root package name */
        private final String f43601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5187a(UiAccountApi.c state, UiAccountApi.d supportFile) {
            super(null);
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(supportFile, "supportFile");
            this.f43599a = state;
            this.f43600b = supportFile;
            this.f43601c = "Account API fallen back to LOCAL Account storage. API STATE: " + state + ". Support File: " + supportFile;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f43601c;
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$b, reason: case insensitive filesystem */
    static final class C5188b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C5188b f43602a = new C5188b();

        C5188b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(b it) {
            AbstractC6492s.i(it, "it");
            return it.k();
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("SSO -  " + AbstractC3689v.z0(it, ", ", null, null, 0, null, new InterfaceC6835l() { // from class: com.ui.wifiman.model.ubiquiti.cloud.sso.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return d.C5188b.c((b) obj);
                }
            }, 30, null) + "}", null, 2, null);
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$c, reason: case insensitive filesystem */
    static final class C5189c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f43603a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f43604b;

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f43606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43607c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f43608d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, UiAccountApi uiAccountApi, d dVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43606b = bVar;
                this.f43607c = uiAccountApi;
                this.f43608d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f43606b, this.f43607c, this.f43608d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f43605a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Z7.b.h("SSO - Deleting Account " + this.f43606b.k(), null, 2, null);
                    UiAccountApi uiAccountApi = this.f43607c;
                    d dVar = this.f43608d;
                    UUID uuidC = dVar.y(dVar.B(this.f43606b)).c();
                    this.f43605a = 1;
                    if (uiAccountApi.c(uuidC, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        C5189c(b bVar, d dVar) {
            this.f43603a = bVar;
            this.f43604b = dVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(UiAccountApi api) {
            AbstractC6492s.i(api, "api");
            return Qi.g.c(null, new a(this.f43603a, api, this.f43604b, null), 1, null);
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$d, reason: collision with other inner class name */
    static final class C1486d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f43609a;

        C1486d(b bVar) {
            this.f43609a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof UiAccountApi.Error)) {
                return AbstractC5912b.D(error);
            }
            return AbstractC5912b.D(new UiSSOAccountManager.Error.AccountApi("Failed to delete account " + this.f43609a.k(), (UiAccountApi.Error) error));
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$e, reason: case insensitive filesystem */
    static final class C5190e implements kg.n {
        C5190e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List persistentAccounts) {
            AbstractC6492s.i(persistentAccounts, "persistentAccounts");
            List list = persistentAccounts;
            d dVar = d.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(dVar.z((Lb.a) it.next()));
            }
            return arrayList;
        }
    }

    public static final class f implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UiAccountApi f43611a;

        public f(UiAccountApi uiAccountApi) {
            this.f43611a = uiAccountApi;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("UI Account API (v" + this.f43611a.getState().c() + ") provided by " + this.f43611a.getState().d() + " accessed " + this.f43611a.getState().a() + " - state: " + this.f43611a.getState(), null, 2, null);
                if (this.f43611a.getState().e() != Na.c.ANDROID) {
                    Z7.b.f(new C5187a(this.f43611a.getState(), this.f43611a.i()), null, 2, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class g implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43612a = new g();

        g() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6572c it) {
            AbstractC6492s.i(it, "it");
            return AbstractC6571b.b(it.b(), lc.f.a(O7.a.SSO_ACCOUNT_DONE));
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43613a = new h();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6572c f43614a;

            public a(C6572c c6572c) {
                this.f43614a = c6572c;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
            @Override // gg.q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(gg.o r5) {
                /*
                    r4 = this;
                    lc.c r0 = r4.f43614a     // Catch: java.lang.Throwable -> L16
                    android.content.Intent r0 = r0.a()     // Catch: java.lang.Throwable -> L16
                    r1 = 0
                    if (r0 == 0) goto L18
                    android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Throwable -> L16
                    if (r0 == 0) goto L18
                    com.ui.core.ui.sso.UiSSO$a$a r2 = com.ui.core.ui.sso.UiSSO.a.INSTANCE     // Catch: java.lang.Throwable -> L16
                    com.ui.core.ui.sso.UiSSO$a r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L16
                    goto L19
                L16:
                    r0 = move-exception
                    goto L64
                L18:
                    r0 = r1
                L19:
                    if (r0 == 0) goto L53
                    Eb.r r2 = r0.getUser()     // Catch: java.lang.Throwable -> L16 java.lang.IllegalArgumentException -> L32
                    if (r2 == 0) goto L53
                    java.lang.String r2 = r2.getUuid()     // Catch: java.lang.Throwable -> L16 java.lang.IllegalArgumentException -> L32
                    if (r2 == 0) goto L53
                    java.util.UUID r2 = java.util.UUID.fromString(r2)     // Catch: java.lang.Throwable -> L16 java.lang.IllegalArgumentException -> L32
                    if (r2 == 0) goto L53
                    java.util.UUID r0 = com.ui.wifiman.model.ubiquiti.cloud.sso.b.a.b(r2)     // Catch: java.lang.Throwable -> L16 java.lang.IllegalArgumentException -> L32
                    goto L54
                L32:
                    Eb.r r0 = r0.getUser()     // Catch: java.lang.Throwable -> L16
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = r0.getUuid()     // Catch: java.lang.Throwable -> L16
                    goto L3e
                L3d:
                    r0 = r1
                L3e:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
                    r2.<init>()     // Catch: java.lang.Throwable -> L16
                    java.lang.String r3 = "Obtained invalid User id "
                    r2.append(r3)     // Catch: java.lang.Throwable -> L16
                    r2.append(r0)     // Catch: java.lang.Throwable -> L16
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L16
                    r2 = 6
                    Z7.b.j(r0, r1, r1, r2, r1)     // Catch: java.lang.Throwable -> L16
                L53:
                    r0 = r1
                L54:
                    if (r0 == 0) goto L5a
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b$a r1 = com.ui.wifiman.model.ubiquiti.cloud.sso.b.a.a(r0)     // Catch: java.lang.Throwable -> L16
                L5a:
                    if (r1 == 0) goto L60
                    r5.onSuccess(r1)     // Catch: java.lang.Throwable -> L16
                    goto L67
                L60:
                    r5.a()     // Catch: java.lang.Throwable -> L16
                    goto L67
                L64:
                    r5.onError(r0)
                L67:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.ubiquiti.cloud.sso.d.h.a.a(gg.o):void");
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6572c result) {
            AbstractC6492s.i(result, "result");
            gg.n nVarC = gg.n.c(new a(result));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class i implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f43616a;

            a(UUID uuid) {
                this.f43616a = uuid;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(List accountsList) {
                Object next;
                AbstractC6492s.i(accountsList, "accountsList");
                UUID uuid = this.f43616a;
                Iterator it = accountsList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (b.a.d(((com.ui.wifiman.model.ubiquiti.cloud.sso.b) next).e(), uuid)) {
                        break;
                    }
                }
                return new C6556a(next);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f43617a;

            b(d dVar) {
                this.f43617a = dVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(com.ui.wifiman.model.ubiquiti.cloud.sso.b newCreatedAccount) {
                AbstractC6492s.i(newCreatedAccount, "newCreatedAccount");
                Z7.b.h("Setting new created account " + b.a.f(newCreatedAccount.e()) + " as primary account", null, 2, null);
                return this.f43617a.b(newCreatedAccount);
            }
        }

        i() {
        }

        public final gg.f a(UUID newUserId) {
            AbstractC6492s.i(newUserId, "newUserId");
            gg.i iVarN0 = d.this.a().N0(new a(newUserId));
            AbstractC6492s.h(iVarN0, "map(...)");
            return AbstractC6561f.e(iVarN0).o0().t(new b(d.this));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((b.a) obj).g());
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43618a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            Object next;
            AbstractC6492s.i(it, "it");
            Iterator it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((b) next).m()) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final k f43619a = new k();

        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("SSO - Primary Account - " + it.b(), null, 2, null);
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f43620a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            b bVar = (b) c6556a.a();
            UUID uuidE = bVar != null ? bVar.e() : null;
            return new C6556a(uuidE != null ? b.a.a(uuidE) : null);
        }
    }

    static final class m implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ th.l[] f43621b = {O.g(new kotlin.jvm.internal.D(d.class, "session", "<v#1>", 0))};

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.c> {
        }

        public static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f43623a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Object obj) {
                super(0);
                this.f43623a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f43623a;
            }
        }

        m() {
        }

        private static final com.ui.wifiman.model.ubiquiti.cloud.sso.c b(Yg.m mVar) {
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.c) mVar.getValue();
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            b.a aVar = (b.a) c6556a.a();
            com.ui.wifiman.model.ubiquiti.cloud.sso.c cVarB = null;
            UUID uuidG = aVar != null ? aVar.g() : null;
            if (uuidG != null) {
                DI di2 = d.this.f43571a;
                b.a aVarA = b.a.a(uuidG);
                org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
                AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar = new org.kodein.type.d(iVarE, b.a.class);
                org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
                AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                cVarB = b(org.kodein.di.d.b(di2, dVar, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.ubiquiti.cloud.sso.c.class), null, new c(aVarA)).a(null, f43621b[0]));
            }
            return new C6556a(cVarB);
        }
    }

    public static final class n implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f43624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f43625b;

        public n(b bVar, d dVar) {
            this.f43624a = bVar;
            this.f43625b = dVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("SSO - Setting Account " + this.f43624a + " primary", null, 2, null);
                Lb.b bVar = this.f43625b.f43572b;
                b bVar2 = this.f43624a;
                if (bVar.h(String.valueOf(bVar2 != null ? bVar2.e() : null)) < 1) {
                    Z7.b.e("Set primary account failed.", null, null, 6, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f43626a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiSSOAccountManager.a apply(UiAccountApi it) {
            AbstractC6492s.i(it, "it");
            return UiSSOAccountManager.a.C1480a.f43523a;
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f43627a = new p();

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UiSSOAccountManager.Error ? gg.i.K0(new UiSSOAccountManager.a.b((UiSSOAccountManager.Error) error)) : gg.i.k0(error);
        }
    }

    public static final class q implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f43628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f43629b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f43630c;

        public q(List list, List list2, d dVar) {
            this.f43628a = list;
            this.f43629b = list2;
            this.f43630c = dVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Map mapU = U.u(AbstractC8783m.N(AbstractC3689v.d0(this.f43628a), r.f43631a));
                Map mapU2 = U.u(AbstractC8783m.N(AbstractC3689v.d0(this.f43629b), s.f43632a));
                for (b bVar : this.f43629b) {
                    if (!mapU.containsKey(bVar.e())) {
                        arrayList.add(this.f43630c.B(bVar));
                    }
                }
                int i10 = 0;
                for (Object obj : this.f43628a) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC3689v.v();
                    }
                    Na.b bVar2 = (Na.b) obj;
                    if (!mapU2.containsKey(bVar2.c())) {
                        arrayList2.add(this.f43630c.A(bVar2, i10 == 0 && this.f43629b.isEmpty()));
                    }
                    i10 = i11;
                }
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    this.f43630c.f43572b.e(arrayList2, arrayList);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class r implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final r f43631a = new r();

        r() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s invoke(Na.b it) {
            AbstractC6492s.i(it, "it");
            return Yg.z.a(it.c(), it);
        }
    }

    static final class s implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final s f43632a = new s();

        s() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s invoke(b it) {
            AbstractC6492s.i(it, "it");
            return Yg.z.a(it.e(), it);
        }
    }

    static final class t implements kg.n {
        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(UiAccountApi api) {
            AbstractC6492s.i(api, "api");
            return d.this.x(api);
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f43634a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UiAccountApi.Error ? AbstractC5912b.D(new UiSSOAccountManager.Error.AccountApi("Failed to sync sso accounts", (UiAccountApi.Error) error)) : AbstractC5912b.D(error);
        }
    }

    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final v f43635a = new v();

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f43636a;

            public a(Throwable th2) {
                this.f43636a = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.e("Failed to sync SSO Accounts", this.f43636a, null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof UiSSOAccountManager.Error.AccountApi)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class w implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final w f43637a = new w();

        w() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(List t12, List t22) {
            AbstractC6492s.i(t12, "t1");
            AbstractC6492s.i(t22, "t2");
            List list = t12;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.a.a(((b) it.next()).e()));
            }
            List list2 = t22;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b.a.a(((b) it2.next()).e()));
            }
            return AbstractC6492s.d(arrayList, arrayList2);
        }
    }

    static final class x implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final x f43638a = new x();

        x() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(List accounts) {
            AbstractC6492s.i(accounts, "accounts");
            return !accounts.isEmpty();
        }
    }

    static final class y implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ th.l[] f43639b = {O.g(new kotlin.jvm.internal.D(d.class, "session", "<v#0>", 0))};

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Yg.m f43641a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f43642b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43643c;

            /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$y$a$a, reason: collision with other inner class name */
            static final class C1487a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f43644a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43645b;

                /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$y$a$a$a, reason: collision with other inner class name */
                static final class C1488a implements kg.n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ d f43646a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43647b;

                    C1488a(d dVar, com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                        this.f43646a = dVar;
                        this.f43647b = bVar;
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final AbstractC5912b apply(SsoUser user) {
                        AbstractC6492s.i(user, "user");
                        return this.f43646a.u(this.f43647b, user);
                    }
                }

                C1487a(d dVar, com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                    this.f43644a = dVar;
                    this.f43645b = bVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.D apply(Gb.d it) {
                    AbstractC6492s.i(it, "it");
                    return this.f43644a.t(it).g().A(new C1488a(this.f43644a, this.f43645b));
                }
            }

            public static final class b implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f43648a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Yg.m f43649b;

                public b(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, Yg.m mVar) {
                    this.f43648a = bVar;
                    this.f43649b = mVar;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.h("SSO - Account " + this.f43648a + " not authorized anymore. Invalidating token", null, 2, null);
                        y.c(this.f43649b).invalidate();
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(Yg.m mVar, d dVar, com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                this.f43641a = mVar;
                this.f43642b = dVar;
                this.f43643c = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC5912b c(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, Yg.m mVar, Throwable er) {
                Throwable cause;
                AbstractC6492s.i(er, "er");
                RuntimeException runtimeException = er instanceof RuntimeException ? (RuntimeException) er : null;
                if (runtimeException != null && (cause = runtimeException.getCause()) != null) {
                    er = cause;
                }
                if (er instanceof UnauthorisedException) {
                    AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(bVar, mVar));
                    AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                    return abstractC5912bR;
                }
                if (!(er instanceof HttpException) && !(er instanceof IOException)) {
                    return AbstractC5912b.D(er);
                }
                Z7.b.j("SSO - IO Error while syncing account token", er, null, 4, null);
                return AbstractC5912b.m();
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Boolean isAuthenticated) {
                AbstractC6492s.i(isAuthenticated, "isAuthenticated");
                if (!isAuthenticated.booleanValue()) {
                    return gg.z.z(AbstractC5912b.m());
                }
                gg.z zVarS = y.c(this.f43641a).g().o0().s(new C1487a(this.f43642b, this.f43643c));
                final com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = this.f43643c;
                final Yg.m mVar = this.f43641a;
                return zVarS.G(new kg.n() { // from class: com.ui.wifiman.model.ubiquiti.cloud.sso.f
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return d.y.a.c(bVar, mVar, (Throwable) obj);
                    }
                });
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f43650a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(Object[] it) {
                AbstractC6492s.i(it, "it");
                ArrayList arrayList = new ArrayList(it.length);
                for (Object obj : it) {
                    AbstractC6492s.g(obj, "null cannot be cast to non-null type io.reactivex.rxjava3.core.Completable");
                    arrayList.add((AbstractC5912b) obj);
                }
                return arrayList;
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends org.kodein.type.o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.d$y$d, reason: collision with other inner class name */
        public static final class C1489d extends org.kodein.type.o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
        }

        public static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f43651a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Object obj) {
                super(0);
                this.f43651a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f43651a;
            }
        }

        y() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.ui.wifiman.model.ubiquiti.cloud.sso.a c(Yg.m mVar) {
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.a) mVar.getValue();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(List accounts) {
            AbstractC6492s.i(accounts, "accounts");
            List<com.ui.wifiman.model.ubiquiti.cloud.sso.b> list = accounts;
            d dVar = d.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar : list) {
                DI di2 = dVar.f43571a;
                b.a aVarA = b.a.a(bVar.e());
                org.kodein.type.i iVarE = org.kodein.type.s.e(new c().getSuperType());
                AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar2 = new org.kodein.type.d(iVarE, b.a.class);
                org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C1489d().getSuperType());
                AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                Yg.m mVarA = org.kodein.di.d.b(di2, dVar2, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, new e(aVarA)).a(null, f43639b[0]);
                arrayList.add(c(mVarA).b().o0().s(new a(mVarA, dVar, bVar)));
            }
            return gg.z.f0(arrayList, b.f43650a);
        }
    }

    static final class z implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final z f43652a = new z();

        z() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List accountActions) {
            AbstractC6492s.i(accountActions, "accountActions");
            return AbstractC5912b.H(accountActions);
        }
    }

    public d(DI di2, Lb.b accountDao, Nd.c uiAccountApiService, lc.e activityResultService) {
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(accountDao, "accountDao");
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        AbstractC6492s.i(activityResultService, "activityResultService");
        this.f43571a = di2;
        this.f43572b = accountDao;
        gg.i iVarI2 = n9.c.c(uiAccountApiService.c(), new InterfaceC6835l() { // from class: Nd.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.ubiquiti.cloud.sso.d.r(this.f16400a, (UiAccountApi) obj);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43573c = iVarI2;
        gg.i iVarI22 = accountDao.c().X0(Gg.a.d()).N0(new C5190e()).X0(Gg.a.a()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43574d = iVarI22;
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(iVarI2.L1(new t()).O(u.f43634a).O(v.f43635a), w());
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        this.f43575e = abstractC5912bI;
        AbstractC5912b abstractC5912bL1 = activityResultService.b().m0(g.f43612a).v0(h.f43613a).L1(new i());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f43576f = abstractC5912bL1;
        gg.i iVarI23 = iVarI2.N0(o.f43626a).f1(p.f43627a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43577g = iVarI23;
        gg.i iVarI24 = iVarI22.U0(abstractC5912bI).f0(C5188b.f43602a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43578h = iVarI24;
        gg.i iVarI25 = a().N0(j.f43618a).W().f0(k.f43619a).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f43579i = iVarI25;
        gg.i iVarI26 = e().N0(l.f43620a).W().N0(new m()).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f43580j = iVarI26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Lb.a A(Na.b bVar, boolean z10) {
        String string = bVar.c().toString();
        AbstractC6492s.h(string, "toString(...)");
        return new Lb.a(string, bVar.d(), null, null, bVar.b(), bVar.a(), null, null, null, z10, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Lb.a B(b bVar) {
        String string = bVar.e().toString();
        AbstractC6492s.h(string, "toString(...)");
        String strK = bVar.k();
        String strD = bVar.d();
        String strF = bVar.f();
        String strH = bVar.h();
        String strI = bVar.i();
        Boolean boolL = bVar.l();
        return new Lb.a(string, strK, strD, strF, bVar.c(), bVar.b(), boolL, strH, strI, bVar.m(), bVar.j());
    }

    private final AbstractC5912b C(b bVar, SsoUser ssoUser) {
        AbstractC5912b abstractC5912bL = this.f43573c.o0().t(new B(bVar, ssoUser)).O(C.f43593a).W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    private final AbstractC5912b D(b bVar, SsoUser ssoUser) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new D(bVar, ssoUser, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b r(d dVar, UiAccountApi api) {
        AbstractC6492s.i(api, "api");
        return dVar.s(api);
    }

    private final AbstractC5912b s(UiAccountApi uiAccountApi) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f(uiAccountApi));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ab.a t(Gb.d dVar) {
        Gb.i iVar = new Gb.i(dVar);
        P9.n nVar = P9.n.f18488a;
        return new Ab.g(nVar.e(), iVar, null, nVar.a(), nVar.b(), null, new Cb.b(iVar, true, null), null, null, null, 928, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b u(b bVar, SsoUser ssoUser) {
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(D(bVar, ssoUser), C(bVar, ssoUser));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b v(List list, List list2) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new q(list, list2, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    private final AbstractC5912b w() {
        AbstractC5912b abstractC5912bL1 = this.f43574d.X(w.f43637a).m0(x.f43638a).N1(new y()).L1(z.f43652a);
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        return abstractC5912bL1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b x(UiAccountApi uiAccountApi) {
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(Qi.i.c(uiAccountApi.a(), null, 1, null).W().e1().D(new A()), this.f43576f);
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        return abstractC5912bI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Na.b y(Lb.a aVar) {
        UUID uuidFromString = UUID.fromString(aVar.k());
        AbstractC6492s.h(uuidFromString, "fromString(...)");
        return new Na.b(uuidFromString, aVar.d(), aVar.j(), aVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b z(Lb.a aVar) {
        UUID uuidFromString = UUID.fromString(aVar.k());
        AbstractC6492s.h(uuidFromString, "fromString(...)");
        UUID uuidB = b.a.b(uuidFromString);
        String strJ = aVar.j();
        String strE = aVar.e();
        String strF = aVar.f();
        String strD = aVar.d();
        String strG = aVar.g();
        return new b(uuidB, strJ, strE, strF, strD, aVar.l(), aVar.h(), strG, aVar.c(), aVar.m(), aVar.i(), null);
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public gg.i a() {
        return this.f43578h;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public AbstractC5912b b(b bVar) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new n(bVar, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public gg.i c() {
        return this.f43580j;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public AbstractC5912b d(b account) {
        AbstractC6492s.i(account, "account");
        AbstractC5912b abstractC5912bL = this.f43573c.o0().t(new C5189c(account, this)).O(new C1486d(account)).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public gg.i e() {
        return this.f43579i;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager
    public gg.i getState() {
        return this.f43577g;
    }
}
