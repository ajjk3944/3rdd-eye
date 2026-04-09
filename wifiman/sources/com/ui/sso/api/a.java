package com.ui.sso.api;

import Ii.C3048c0;
import Ii.J;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import com.ui.sso.account.local.UiAccountSharedPrefProvider;
import com.ui.sso.api.UiAccountApi;
import com.ui.sso.api.provider.f;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class a implements UiAccountApi.b {

    /* renamed from: b, reason: collision with root package name */
    private final Context f41693b;

    /* renamed from: c, reason: collision with root package name */
    private final J f41694c;

    /* renamed from: d, reason: collision with root package name */
    private final J f41695d;

    /* renamed from: e, reason: collision with root package name */
    private final String f41696e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageManager f41697f;

    /* renamed from: g, reason: collision with root package name */
    private final String f41698g;

    /* renamed from: h, reason: collision with root package name */
    private final Wa.k f41699h;

    /* renamed from: i, reason: collision with root package name */
    private final Qa.a f41700i;

    /* renamed from: j, reason: collision with root package name */
    private final UiAccountSharedPrefProvider f41701j;

    /* renamed from: k, reason: collision with root package name */
    private final com.ui.sso.api.provider.b f41702k;

    /* renamed from: l, reason: collision with root package name */
    private final Ra.b f41703l;

    /* renamed from: m, reason: collision with root package name */
    private final f.b f41704m;

    static final class A extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final A f41705a = new A();

        A() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Skipping saving API ownership, since the API provider uses legacy lib version and can't acquire ownership";
        }
    }

    /* renamed from: com.ui.sso.api.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1339a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41706a;

        static {
            int[] iArr = new int[Na.c.values().length];
            try {
                iArr[Na.c.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Na.c.LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41706a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41707a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f41708b;

        /* renamed from: com.ui.sso.api.a$b$a, reason: collision with other inner class name */
        static final class C1340a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41710a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1340a(a aVar) {
                super(0);
                this.f41710a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager " + this.f41710a.hashCode() + " API Flow Started";
            }
        }

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = a.this.new b(interfaceC5380e);
            bVar.f41708b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41707a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f41708b;
                Ua.a.e(new C1340a(a.this));
                Yg.J j10 = Yg.J.f24997a;
                this.f41707a = 1;
                if (interfaceC3221h.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41711a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f41713c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N n10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41713c = n10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new c(this.f41713c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41711a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = a.this;
                N n10 = this.f41713c;
                this.f41711a = 1;
                obj = aVar.m(n10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Yg.J j10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(j10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41714a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41715b;

        /* renamed from: com.ui.sso.api.a$d$a, reason: collision with other inner class name */
        static final class C1341a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f41718b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1341a(a aVar, UiAccountApi uiAccountApi) {
                super(0);
                this.f41717a = aVar;
                this.f41718b = uiAccountApi;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager " + this.f41717a.hashCode() + " API emission: $" + this.f41718b.getState();
            }
        }

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = a.this.new d(interfaceC5380e);
            dVar.f41715b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f41714a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            Ua.a.e(new C1341a(a.this, (UiAccountApi) this.f41715b));
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UiAccountApi uiAccountApi, InterfaceC5380e interfaceC5380e) {
            return ((d) create(uiAccountApi, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f41719a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41720b;

        /* renamed from: com.ui.sso.api.a$e$a, reason: collision with other inner class name */
        static final class C1342a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41722a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1342a(a aVar) {
                super(0);
                this.f41722a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager " + this.f41722a.hashCode() + " API Flow Completed";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41723a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.f41723a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager " + this.f41723a.hashCode() + " API Flow Error";
            }
        }

        e(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f41719a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            Throwable th2 = (Throwable) this.f41720b;
            if (th2 == null) {
                Ua.a.e(new C1342a(a.this));
            } else {
                Ua.a.c(new b(a.this), th2);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            e eVar = a.this.new e(interfaceC5380e);
            eVar.f41720b = th2;
            return eVar.invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f41724a = new f();

        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiAccountApi.c invoke(UiAccountApi it) {
            AbstractC6492s.i(it, "it");
            return it.getState();
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41725a;

        /* renamed from: b, reason: collision with root package name */
        Object f41726b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41727c;

        /* renamed from: e, reason: collision with root package name */
        int f41729e;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41727c = obj;
            this.f41729e |= PduHandle.NONE;
            return a.this.k(null, null, this);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f41730a = new h();

        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to obtain direct AccountManager API even though it seems this package is an account owner and it should be able to access AccountManager directly";
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f41731a = new i();

        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: lookup started";
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProviderInfo f41732a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ProviderInfo providerInfo) {
            super(0);
            this.f41732a = providerInfo;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: found API authority '" + this.f41732a.authority + "'";
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProviderInfo f41733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f41734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ProviderInfo providerInfo, a aVar) {
            super(0);
            this.f41733a = providerInfo;
            this.f41734b = aVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: API authority '" + this.f41733a.authority + "' metadata confirmed API availability of account type '" + this.f41734b.f41698g + "'";
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProviderInfo f41735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f41736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ProviderInfo providerInfo, kotlin.jvm.internal.N n10) {
            super(0);
            this.f41735a = providerInfo;
            this.f41736b = n10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: API authority '" + this.f41735a.authority + "' has provider, but API manages different account type '" + this.f41736b.f51689a + "'";
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f41737a = new m();

        m() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: package metadata accountType in invalid format";
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f41738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Set set) {
            super(0);
            this.f41738a = set;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAPI providers: lookup found " + this.f41738a.size() + " authorities";
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41739a;

        /* renamed from: c, reason: collision with root package name */
        int f41741c;

        o(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41739a = obj;
            this.f41741c |= PduHandle.NONE;
            return a.this.m(null, this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f41742a;

        /* renamed from: b, reason: collision with root package name */
        Object f41743b;

        /* renamed from: c, reason: collision with root package name */
        Object f41744c;

        /* renamed from: d, reason: collision with root package name */
        Object f41745d;

        /* renamed from: e, reason: collision with root package name */
        Object f41746e;

        /* renamed from: f, reason: collision with root package name */
        Object f41747f;

        /* renamed from: g, reason: collision with root package name */
        Object f41748g;

        /* renamed from: h, reason: collision with root package name */
        int f41749h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ N f41751j;

        /* renamed from: com.ui.sso.api.a$p$a, reason: collision with other inner class name */
        static final class C1343a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1343a f41752a = new C1343a();

            C1343a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - This package has no Android storage access so it can't be the owner. Try to look for any CNT provider API that can acquire storage ownership";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41753a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41753a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41753a.f51689a;
                return "UIAccountManager GetAPI - acquired CNT provider API - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f41754a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - There is no CNT provider API that can acquire Android account storage ownership. Try to look for any content provider with Android account storage access at least.(legacy version of the lib)";
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41755a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41755a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41755a.f51689a;
                return "UIAccountManager GetAPI - acquired CNT provider API - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f41756a = new e();

            e() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - Failed. Retry in 200 ms";
            }
        }

        static final class f extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f41757a = new f();

            f() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - FALLBACK to local Account storage since account to Android account storage seems to be not possible";
            }
        }

        static final class g extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41758a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41758a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41758a.f51689a;
                return "UIAccountManager GetAPI - acquired Direct LOCAL API - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        static final class h extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L f41759a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(L l10) {
                super(0);
                this.f41759a = l10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI (try " + this.f41759a.f51687a + ")";
            }
        }

        static final class i extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41760a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41760a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41760a.f51689a;
                return "UIAccountManager GetAPI - acquired CNT provider LOCAL API - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        static final class j extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41761a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41761a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - fallen back to Direct access to Local Account Storage - " + ((UiAccountApi) this.f41761a.f51689a).getState();
            }
        }

        static final class k extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final k f41762a = new k();

            k() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - looking for saved Android account storage owner...";
            }
        }

        static final class l extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41763a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41763a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41763a.f51689a;
                return "UIAccountManager GetAPI - acquired API for saved Android account storage owner - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        static final class m extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final m f41764a = new m();

            m() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - no saved storage owner. Check available content providers...";
            }
        }

        static final class n extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41765a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41765a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - found " + ((List) this.f41765a.f51689a).size() + " CNT Provider APIs. Look if there is Android account storage owner between them.";
            }
        }

        static final class o extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41766a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41766a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41766a.f51689a;
                return "UIAccountManager GetAPI - acquired API for Android account storage owner - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        /* renamed from: com.ui.sso.api.a$p$p, reason: collision with other inner class name */
        static final class C1344p extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1344p f41767a = new C1344p();

            C1344p() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UIAccountManager GetAPI - There seems to be no Android account storage owner between available CNT provider APIs. Check if this package can be the owner.";
            }
        }

        static final class q extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f41768a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(kotlin.jvm.internal.N n10) {
                super(0);
                this.f41768a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                UiAccountApi uiAccountApi = (UiAccountApi) this.f41768a.f51689a;
                return "UIAccountManager GetAPI - acquired Direct API since this package can become an storage owner - " + (uiAccountApi != null ? uiAccountApi.getState() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(N n10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41751j = n10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new p(this.f41751j, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x033c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0368  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0373  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x03f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01ed A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0169 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0274 A[PHI: r2 r9 r10 r11 r12 r13
  0x0274: PHI (r2v76 kotlin.jvm.internal.N) = (r2v22 kotlin.jvm.internal.N), (r2v77 kotlin.jvm.internal.N) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r9v28 java.util.Iterator) = (r9v15 java.util.Iterator), (r9v29 java.util.Iterator) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r10v24 kotlin.jvm.internal.L) = (r10v15 kotlin.jvm.internal.L), (r10v25 kotlin.jvm.internal.L) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r11v26 kotlin.jvm.internal.N) = (r11v11 kotlin.jvm.internal.N), (r11v27 kotlin.jvm.internal.N) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r12v18 kotlin.jvm.internal.N) = (r12v5 kotlin.jvm.internal.N), (r12v19 kotlin.jvm.internal.N) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]
  0x0274: PHI (r13v10 com.ui.sso.api.UiAccountApi$d) = (r13v1 com.ui.sso.api.UiAccountApi$d), (r13v11 com.ui.sso.api.UiAccountApi$d) binds: [B:66:0x0261, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02e4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0261 -> B:67:0x0274). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02ab -> B:76:0x02ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02b0 -> B:78:0x02b1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 1048
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((p) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41769a;

        /* renamed from: b, reason: collision with root package name */
        Object f41770b;

        /* renamed from: c, reason: collision with root package name */
        Object f41771c;

        /* renamed from: d, reason: collision with root package name */
        Object f41772d;

        /* renamed from: e, reason: collision with root package name */
        Object f41773e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41774f;

        /* renamed from: h, reason: collision with root package name */
        int f41776h;

        q(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41774f = obj;
            this.f41776h |= PduHandle.NONE;
            return a.this.n(null, null, this);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41777a;

        /* renamed from: b, reason: collision with root package name */
        Object f41778b;

        /* renamed from: c, reason: collision with root package name */
        Object f41779c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41780d;

        /* renamed from: f, reason: collision with root package name */
        int f41782f;

        r(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41780d = obj;
            this.f41782f |= PduHandle.NONE;
            return a.this.o(null, null, null, this);
        }
    }

    static final class s extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.a f41784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, com.ui.sso.api.provider.a aVar) {
            super(0);
            this.f41783a = str;
            this.f41784b = aVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Account API on provided by '" + this.f41783a + "' managed unwanted account type '" + this.f41784b.getState().b() + "'";
        }
    }

    static final class t extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41785a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.a f41786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, com.ui.sso.api.provider.a aVar) {
            super(0);
            this.f41785a = str;
            this.f41786b = aVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UI Account API owner found for authority '" + this.f41785a + "' -> " + this.f41786b.getState();
        }
    }

    static final class u extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41787a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(0);
            this.f41787a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provider '" + this.f41787a + "' access FORBIDDEN due to certificate mishmash";
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str) {
            super(0);
            this.f41788a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provider '" + this.f41788a + "' access FORBIDDEN due to unknown issue";
        }
    }

    static final class w extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str) {
            super(0);
            this.f41789a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provider '" + this.f41789a + "' acting weird";
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41790a;

        /* renamed from: b, reason: collision with root package name */
        Object f41791b;

        /* renamed from: c, reason: collision with root package name */
        Object f41792c;

        /* renamed from: d, reason: collision with root package name */
        Object f41793d;

        /* renamed from: e, reason: collision with root package name */
        Object f41794e;

        /* renamed from: f, reason: collision with root package name */
        Object f41795f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41796g;

        /* renamed from: i, reason: collision with root package name */
        int f41798i;

        x(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41796g = obj;
            this.f41798i |= PduHandle.NONE;
            return a.this.q(null, null, this);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41799a;

        /* renamed from: b, reason: collision with root package name */
        Object f41800b;

        /* renamed from: c, reason: collision with root package name */
        Object f41801c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41802d;

        /* renamed from: f, reason: collision with root package name */
        int f41804f;

        y(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41802d = obj;
            this.f41804f |= PduHandle.NONE;
            return a.this.r(null, null, this);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41805a;

        /* renamed from: b, reason: collision with root package name */
        Object f41806b;

        /* renamed from: c, reason: collision with root package name */
        Object f41807c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41808d;

        /* renamed from: f, reason: collision with root package name */
        int f41810f;

        z(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41808d = obj;
            this.f41810f |= PduHandle.NONE;
            return a.this.s(null, null, this);
        }
    }

    public a(Context context, J dispatcherIO, J dispatcherDefault, String packageName, PackageManager packageManager, String accountType, Wa.k packageInstallationObserver, Qa.a ownershipManager, UiAccountSharedPrefProvider encryptedPrefProvider, com.ui.sso.api.provider.b contentProviderApiFactory, Ra.b directApiFactory, f.b uriFactory) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        AbstractC6492s.i(packageName, "packageName");
        AbstractC6492s.i(packageManager, "packageManager");
        AbstractC6492s.i(accountType, "accountType");
        AbstractC6492s.i(packageInstallationObserver, "packageInstallationObserver");
        AbstractC6492s.i(ownershipManager, "ownershipManager");
        AbstractC6492s.i(encryptedPrefProvider, "encryptedPrefProvider");
        AbstractC6492s.i(contentProviderApiFactory, "contentProviderApiFactory");
        AbstractC6492s.i(directApiFactory, "directApiFactory");
        AbstractC6492s.i(uriFactory, "uriFactory");
        this.f41693b = context;
        this.f41694c = dispatcherIO;
        this.f41695d = dispatcherDefault;
        this.f41696e = packageName;
        this.f41697f = packageManager;
        this.f41698g = accountType;
        this.f41699h = packageInstallationObserver;
        this.f41700i = ownershipManager;
        this.f41701j = encryptedPrefProvider;
        this.f41702k = contentProviderApiFactory;
        this.f41703l = directApiFactory;
        this.f41704m = uriFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(Ii.N r17, com.ui.sso.api.UiAccountApi.d r18, dh.InterfaceC5380e r19) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.k(Ii.N, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(Ii.N r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ui.sso.api.a.o
            if (r0 == 0) goto L13
            r0 = r7
            com.ui.sso.api.a$o r0 = (com.ui.sso.api.a.o) r0
            int r1 = r0.f41741c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41741c = r1
            goto L18
        L13:
            com.ui.sso.api.a$o r0 = new com.ui.sso.api.a$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41739a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41741c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Yg.v.b(r7)
            Ii.J r7 = r5.f41694c
            com.ui.sso.api.a$p r2 = new com.ui.sso.api.a$p
            r4 = 0
            r2.<init>(r6, r4)
            r0.f41741c = r3
            java.lang.Object r7 = Ii.AbstractC3059i.g(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            r6 = r7
            com.ui.sso.api.UiAccountApi r6 = (com.ui.sso.api.UiAccountApi) r6
            com.ui.sso.api.UiAccountApi$d r0 = r6.i()
            com.ui.sso.api.UiAccountApi$c r6 = r6.getState()
            r0.f(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.m(Ii.N, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(Ii.N r17, com.ui.sso.api.UiAccountApi.d r18, dh.InterfaceC5380e r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            boolean r2 = r0 instanceof com.ui.sso.api.a.q
            if (r2 == 0) goto L17
            r2 = r0
            com.ui.sso.api.a$q r2 = (com.ui.sso.api.a.q) r2
            int r3 = r2.f41776h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f41776h = r3
            goto L1c
        L17:
            com.ui.sso.api.a$q r2 = new com.ui.sso.api.a$q
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f41774f
            java.lang.Object r3 = eh.AbstractC5467b.g()
            int r4 = r2.f41776h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L55
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L34
            Yg.v.b(r0)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            goto La3
        L31:
            r0 = move-exception
            goto La6
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3d:
            java.lang.Object r4 = r2.f41773e
            Ii.N r4 = (Ii.N) r4
            java.lang.Object r6 = r2.f41772d
            Ra.b r6 = (Ra.b) r6
            java.lang.Object r7 = r2.f41771c
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.f41770b
            com.ui.sso.api.UiAccountApi$d r8 = (com.ui.sso.api.UiAccountApi.d) r8
            java.lang.Object r9 = r2.f41769a
            com.ui.sso.api.a r9 = (com.ui.sso.api.a) r9
            Yg.v.b(r0)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            goto L7c
        L55:
            Yg.v.b(r0)
            Ra.b r0 = r1.f41703l     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            java.lang.String r7 = r1.f41698g     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            com.ui.sso.account.local.UiAccountSharedPrefProvider r4 = r1.f41701j     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            android.content.Context r8 = r1.f41693b     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41769a = r1     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r9 = r18
            r2.f41770b = r9     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41771c = r7     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41772d = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r10 = r17
            r2.f41773e = r10     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41776h = r6     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            java.lang.Object r4 = r4.a(r8, r6, r2)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            if (r4 != r3) goto L77
            return r3
        L77:
            r6 = r0
            r0 = r4
            r8 = r9
            r4 = r10
            r9 = r1
        L7c:
            r11 = r0
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            Ii.J r13 = r9.f41694c     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            Pa.a r0 = new Pa.a     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r12 = 0
            r14 = 2
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            Ra.b$a r9 = new Ra.b$a     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r9.<init>(r0, r7, r8)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r0 = 0
            r2.f41769a = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41770b = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41771c = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41772d = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41773e = r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            r2.f41776h = r5     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            java.lang.Object r0 = r6.a(r4, r9, r2)     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            if (r0 != r3) goto La3
            return r3
        La3:
            com.ui.sso.api.UiAccountApi r0 = (com.ui.sso.api.UiAccountApi) r0     // Catch: com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException -> L31
            return r0
        La6:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Failed to obtain Local Account API backed with encrypted local storage"
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.n(Ii.N, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(Ii.N r6, java.lang.String r7, com.ui.sso.api.UiAccountApi.d r8, dh.InterfaceC5380e r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.o(Ii.N, java.lang.String, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    private final Object p(N n10, String str, UiAccountApi.d dVar, InterfaceC5380e interfaceC5380e) {
        return o(n10, f.b.C1371b.a(this.f41704m, str, null, 2, null).b(), dVar, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(Ii.N r10, com.ui.sso.api.UiAccountApi.d r11, dh.InterfaceC5380e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.ui.sso.api.a.x
            if (r0 == 0) goto L13
            r0 = r12
            com.ui.sso.api.a$x r0 = (com.ui.sso.api.a.x) r0
            int r1 = r0.f41798i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41798i = r1
            goto L18
        L13:
            com.ui.sso.api.a$x r0 = new com.ui.sso.api.a$x
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f41796g
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41798i
            r3 = 1
            if (r2 == 0) goto L4e
            if (r2 != r3) goto L45
            java.lang.Object r10 = r0.f41795f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.f41794e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.f41793d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f41792c
            com.ui.sso.api.UiAccountApi$d r4 = (com.ui.sso.api.UiAccountApi.d) r4
            java.lang.Object r5 = r0.f41791b
            Ii.N r5 = (Ii.N) r5
            java.lang.Object r6 = r0.f41790a
            com.ui.sso.api.a r6 = (com.ui.sso.api.a) r6
            Yg.v.b(r12)
            r8 = r2
            r2 = r11
            r11 = r5
        L43:
            r5 = r8
            goto L90
        L45:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4e:
            Yg.v.b(r12)
            java.util.Set r12 = r9.l(r11)
            java.util.List r2 = Zg.AbstractC3689v.c()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r12 = Zg.AbstractC3689v.V0(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r6 = r9
            r4 = r2
            r8 = r11
            r11 = r10
            r10 = r12
            r12 = r8
        L6b:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r10.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.f41790a = r6
            r0.f41791b = r11
            r0.f41792c = r12
            r0.f41793d = r4
            r0.f41794e = r2
            r0.f41795f = r10
            r0.f41798i = r3
            java.lang.Object r5 = r6.o(r11, r5, r12, r0)
            if (r5 != r1) goto L8c
            return r1
        L8c:
            r8 = r4
            r4 = r12
            r12 = r5
            goto L43
        L90:
            com.ui.sso.api.provider.a r12 = (com.ui.sso.api.provider.a) r12
            if (r12 == 0) goto Lae
            r2.add(r12)
            com.ui.sso.api.UiAccountApi$c r7 = r12.getState()
            boolean r7 = r7.g()
            if (r7 == 0) goto Lae
            com.ui.sso.api.UiAccountApi$c r12 = r12.getState()
            boolean r12 = r12.f()
            if (r12 != 0) goto Lac
            goto Lae
        Lac:
            r4 = r5
            goto Lb1
        Lae:
            r12 = r4
            r4 = r5
            goto L6b
        Lb1:
            java.util.List r10 = Zg.AbstractC3689v.a(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.q(Ii.N, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(Ii.N r11, com.ui.sso.api.UiAccountApi.d r12, dh.InterfaceC5380e r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.r(Ii.N, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(Ii.N r10, com.ui.sso.api.UiAccountApi.d r11, dh.InterfaceC5380e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.ui.sso.api.a.z
            if (r0 == 0) goto L13
            r0 = r12
            com.ui.sso.api.a$z r0 = (com.ui.sso.api.a.z) r0
            int r1 = r0.f41810f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41810f = r1
            goto L18
        L13:
            com.ui.sso.api.a$z r0 = new com.ui.sso.api.a$z
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f41808d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41810f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5f
            if (r2 == r6) goto L49
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            Yg.v.b(r12)
            goto Lb5
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r0.f41805a
            com.ui.sso.api.a r10 = (com.ui.sso.api.a) r10
            Yg.v.b(r12)
            goto La3
        L45:
            Yg.v.b(r12)
            goto L93
        L49:
            java.lang.Object r10 = r0.f41807c
            r11 = r10
            com.ui.sso.api.UiAccountApi$d r11 = (com.ui.sso.api.UiAccountApi.d) r11
            java.lang.Object r10 = r0.f41806b
            Ii.N r10 = (Ii.N) r10
            java.lang.Object r2 = r0.f41805a
            com.ui.sso.api.a r2 = (com.ui.sso.api.a) r2
            Yg.v.b(r12)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
            goto L77
        L5f:
            Yg.v.b(r12)
            Qa.a r12 = r9.f41700i
            r0.f41805a = r9
            r0.f41806b = r10
            r0.f41807c = r11
            r0.f41810f = r6
            java.lang.Object r12 = r12.c(r0)
            if (r12 != r1) goto L73
            return r1
        L73:
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
        L77:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L7c
            return r7
        L7c:
            java.lang.String r6 = r10.f41696e
            boolean r6 = kotlin.jvm.internal.AbstractC6492s.d(r2, r6)
            if (r6 == 0) goto L94
            r0.f41805a = r7
            r0.f41806b = r7
            r0.f41807c = r7
            r0.f41810f = r5
            java.lang.Object r12 = r10.n(r11, r12, r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            return r12
        L94:
            r0.f41805a = r10
            r0.f41806b = r7
            r0.f41807c = r7
            r0.f41810f = r4
            java.lang.Object r12 = r10.p(r11, r2, r12, r0)
            if (r12 != r1) goto La3
            return r1
        La3:
            com.ui.sso.api.UiAccountApi r12 = (com.ui.sso.api.UiAccountApi) r12
            if (r12 == 0) goto La8
            return r12
        La8:
            Qa.a r10 = r10.f41700i
            r0.f41805a = r7
            r0.f41810f = r3
            java.lang.Object r10 = r10.b(r7, r0)
            if (r10 != r1) goto Lb5
            return r1
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.a.s(Ii.N, com.ui.sso.api.UiAccountApi$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(UiAccountApi uiAccountApi, InterfaceC5380e interfaceC5380e) {
        Object objB;
        if (uiAccountApi.getState().c() < 3) {
            Ua.a.e(A.f41705a);
            return Yg.J.f24997a;
        }
        int i10 = C1339a.f41706a[uiAccountApi.getState().e().ordinal()];
        if (i10 != 1) {
            return (i10 == 2 && (objB = this.f41700i.b(uiAccountApi.getState().d(), interfaceC5380e)) == AbstractC5467b.g()) ? objB : Yg.J.f24997a;
        }
        Object objD = this.f41700i.d(uiAccountApi.getState().d(), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    @Override // com.ui.sso.api.UiAccountApi.b
    public InterfaceC3220g a(N externalScope) {
        AbstractC6492s.i(externalScope, "externalScope");
        return Wa.c.a(AbstractC3222i.C(AbstractC3222i.p(AbstractC3222i.H(AbstractC3222i.I(AbstractC3222i.E(AbstractC3222i.J(this.f41699h.a(), new b(null)), new c(externalScope, null)), new d(null)), new e(null)), f.f41724a), this.f41695d), externalScope, J.a.b(Li.J.f11860a, 0L, 0L, 3, null), 1);
    }

    public final Set l(UiAccountApi.d sup) {
        AbstractC6492s.i(sup, "sup");
        Ua.a.e(i.f41731a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PackageInfo packageInfo : this.f41697f.getInstalledPackages(8)) {
            Set setD = sup.d();
            String str = packageInfo.packageName;
            if (str == null) {
                str = "N/A";
            }
            setD.add(str);
            String str2 = packageInfo.packageName;
            if (str2 != null && !AbstractC6492s.d(str2, this.f41696e)) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        Set setB = sup.b();
                        String str3 = providerInfo.authority;
                        if (str3 == null) {
                            str3 = "N/A";
                        }
                        setB.add(str3);
                        String str4 = providerInfo.authority;
                        if (str4 != null && kotlin.text.t.B(str4, "ui.account.provider", false, 2, null)) {
                            Ua.a.e(new j(providerInfo));
                            try {
                                Bundle bundle = this.f41697f.getApplicationInfo(providerInfo.packageName, 128).metaData;
                                String string = bundle != null ? bundle.getString("accountType") : null;
                                n10.f51689a = string;
                                if (AbstractC6492s.d(string, this.f41698g)) {
                                    Ua.a.e(new k(providerInfo, this));
                                    String authority = providerInfo.authority;
                                    AbstractC6492s.h(authority, "authority");
                                    linkedHashSet.add(authority);
                                } else {
                                    Ua.a.g(new l(providerInfo, n10), null, 2, null);
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            } catch (ClassCastException e10) {
                                Ua.a.f(m.f41737a, e10);
                            }
                        }
                    }
                }
            }
        }
        Ua.a.e(new n(linkedHashSet));
        sup.c().addAll(linkedHashSet);
        return linkedHashSet;
    }

    public /* synthetic */ a(Context context, Ii.J j10, Ii.J j11, String str, PackageManager packageManager, String str2, Wa.k kVar, Qa.a aVar, UiAccountSharedPrefProvider uiAccountSharedPrefProvider, com.ui.sso.api.provider.b bVar, Ra.b bVar2, f.b bVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String packageName;
        PackageManager packageManager2;
        String string;
        com.ui.sso.api.provider.b bVar4;
        Ii.J jB = (i10 & 2) != 0 ? C3048c0.b() : j10;
        Ii.J jA = (i10 & 4) != 0 ? C3048c0.a() : j11;
        if ((i10 & 8) != 0) {
            packageName = context.getPackageName();
            AbstractC6492s.h(packageName, "getPackageName(...)");
        } else {
            packageName = str;
        }
        if ((i10 & 16) != 0) {
            packageManager2 = context.getPackageManager();
            AbstractC6492s.h(packageManager2, "getPackageManager(...)");
        } else {
            packageManager2 = packageManager;
        }
        if ((i10 & 32) != 0) {
            string = context.getString(Na.a.f16328c);
            AbstractC6492s.h(string, "getString(...)");
        } else {
            string = str2;
        }
        Wa.k lVar = (i10 & 64) != 0 ? new Wa.l(context, jA) : kVar;
        Qa.a aVarA = (i10 & 128) != 0 ? Va.a.f23290a.a(context) : aVar;
        UiAccountSharedPrefProvider aVar2 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new com.ui.sso.account.local.a(jB) : uiAccountSharedPrefProvider;
        if ((i10 & 512) != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC6492s.h(contentResolver, "getContentResolver(...)");
            bVar4 = new com.ui.sso.api.provider.b(contentResolver, jB, jA, null, null, 24, null);
        } else {
            bVar4 = bVar;
        }
        this(context, jB, jA, packageName, packageManager2, string, lVar, aVarA, aVar2, bVar4, (i10 & 1024) != 0 ? new Ra.b(packageName, Ta.e.f21524g.a(context, jB), aVarA, jA) : bVar2, (i10 & 2048) != 0 ? f.b.f42152a.a() : bVar3);
    }
}
