package com.ui.wifiman.model.ubiquiti.console;

import Wc.b;
import Zc.e;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient;
import com.ui.wifiman.model.ubiquiti.console.UnifiCloudConsoleServiceImpl;
import com.ui.wifiman.model.ubiquiti.console.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import fe.AbstractC5817h;
import fe.u;
import gg.AbstractC5912b;
import gg.D;
import gg.EnumC5911a;
import gg.i;
import gg.s;
import gg.v;
import gg.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final class UnifiCloudConsoleServiceImpl implements com.ui.wifiman.model.ubiquiti.console.b {

    /* renamed from: h, reason: collision with root package name */
    public static final a f43670h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Qd.e f43671a;

    /* renamed from: b, reason: collision with root package name */
    private final Zc.f f43672b;

    /* renamed from: c, reason: collision with root package name */
    private final u f43673c;

    /* renamed from: d, reason: collision with root package name */
    private final i f43674d;

    /* renamed from: e, reason: collision with root package name */
    private final i f43675e;

    /* renamed from: f, reason: collision with root package name */
    private final i f43676f;

    /* renamed from: g, reason: collision with root package name */
    private final i f43677g;

    private static abstract class InternalError extends RuntimeException {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$NetworkConnectionUnavailable;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetworkConnectionUnavailable extends InternalError {

            /* renamed from: a, reason: collision with root package name */
            public static final NetworkConnectionUnavailable f43678a = new NetworkConnectionUnavailable();

            private NetworkConnectionUnavailable() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NetworkConnectionUnavailable);
            }

            public int hashCode() {
                return 39601161;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NetworkConnectionUnavailable";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$SSOSessionUnavailable;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SSOSessionUnavailable extends InternalError {

            /* renamed from: a, reason: collision with root package name */
            public static final SSOSessionUnavailable f43679a = new SSOSessionUnavailable();

            private SSOSessionUnavailable() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SSOSessionUnavailable);
            }

            public int hashCode() {
                return -1491557148;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "SSOSessionUnavailable";
            }
        }

        public /* synthetic */ InternalError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InternalError() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43680a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ld.f f43681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiCloudConsoleServiceImpl f43682b;

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiCloudConsoleServiceImpl f43683a;

            a(UnifiCloudConsoleServiceImpl unifiCloudConsoleServiceImpl) {
                this.f43683a = unifiCloudConsoleServiceImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC5912b d(UnifiCloudConsoleServiceImpl unifiCloudConsoleServiceImpl, Ld.e eVar, Wc.b fetch) {
                AbstractC6492s.i(fetch, "fetch");
                if (fetch instanceof b.a.C0897b) {
                    return unifiCloudConsoleServiceImpl.f43671a.c(((UnifiCloudClient.a) ((b.a.C0897b) fetch).b()).b(), eVar.a());
                }
                if ((fetch instanceof b.c) || (fetch instanceof b.C0898b)) {
                    AbstractC5912b abstractC5912bM = AbstractC5912b.m();
                    AbstractC6492s.h(abstractC5912bM, "complete(...)");
                    return abstractC5912bM;
                }
                if (!(fetch instanceof b.a.C0896a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((b.a.C0896a) fetch).c() instanceof UnifiCloudClient.Error.Unauthorized) {
                    return unifiCloudConsoleServiceImpl.f43671a.d();
                }
                AbstractC5912b abstractC5912bM2 = AbstractC5912b.m();
                AbstractC6492s.h(abstractC5912bM2, "complete(...)");
                return abstractC5912bM2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Wc.b e(Wc.b previous, Wc.b current) {
                AbstractC6492s.i(previous, "previous");
                AbstractC6492s.i(current, "current");
                return (!(current instanceof b.a.C0897b) && (current instanceof b.C0898b) && (previous instanceof b.a)) ? previous : current;
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                final Ld.e eVar = (Ld.e) c6556a.a();
                if (eVar == null) {
                    i iVarK0 = i.K0(new b.a.C0896a(InternalError.SSOSessionUnavailable.f43679a));
                    AbstractC6492s.h(iVarK0, "just(...)");
                    return iVarK0;
                }
                i iVarI = this.f43683a.i(eVar.b());
                final UnifiCloudConsoleServiceImpl unifiCloudConsoleServiceImpl = this.f43683a;
                i iVarR1 = n9.c.c(iVarI, new InterfaceC6835l() { // from class: com.ui.wifiman.model.ubiquiti.console.c
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return UnifiCloudConsoleServiceImpl.c.a.d(unifiCloudConsoleServiceImpl, eVar, (Wc.b) obj);
                    }
                }).r1(new InterfaceC6465b() { // from class: com.ui.wifiman.model.ubiquiti.console.d
                    @Override // kg.InterfaceC6465b
                    public final Object apply(Object obj, Object obj2) {
                        return UnifiCloudConsoleServiceImpl.c.a.e((Wc.b) obj, (Wc.b) obj2);
                    }
                });
                AbstractC6492s.h(iVarR1, "scan(...)");
                return iVarR1;
            }
        }

        c(Ld.f fVar, UnifiCloudConsoleServiceImpl unifiCloudConsoleServiceImpl) {
            this.f43681a = fVar;
            this.f43682b = unifiCloudConsoleServiceImpl;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean isNetworkConnected) {
            AbstractC6492s.i(isNetworkConnected, "isNetworkConnected");
            return !isNetworkConnected.booleanValue() ? i.K0(new b.a.C0896a(InternalError.NetworkConnectionUnavailable.f43678a)) : this.f43681a.a().I1(new a(this.f43682b));
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43684a = new d();

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String strF = ((com.ui.wifiman.model.ubiquiti.console.e) obj).f();
                e.b bVarA = strF != null ? e.b.a(strF) : null;
                String strF2 = ((com.ui.wifiman.model.ubiquiti.console.e) obj2).f();
                return AbstractC4260a.e(bVarA, strF2 != null ? e.b.a(strF2) : null);
            }
        }

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Wc.b cloudConsolesFetch, List list) {
            List persistentCloudConsoles = list;
            AbstractC6492s.i(cloudConsolesFetch, "cloudConsolesFetch");
            AbstractC6492s.i(persistentCloudConsoles, "persistentCloudConsoles");
            if (!(cloudConsolesFetch instanceof b.c) && !(cloudConsolesFetch instanceof b.C0898b)) {
                if (cloudConsolesFetch instanceof b.a.C0896a) {
                    List list2 = persistentCloudConsoles;
                    persistentCloudConsoles = new ArrayList(AbstractC3689v.w(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        persistentCloudConsoles.add(com.ui.wifiman.model.ubiquiti.console.e.b((com.ui.wifiman.model.ubiquiti.console.e) it.next(), null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, 16319, null));
                    }
                } else {
                    if (!(cloudConsolesFetch instanceof b.a.C0897b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    persistentCloudConsoles = ((UnifiCloudClient.a) ((b.a.C0897b) cloudConsolesFetch).b()).b();
                }
            }
            AbstractC6492s.f(persistentCloudConsoles);
            return AbstractC3689v.X0(persistentCloudConsoles, new a());
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43685a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UnifiCloudClient.Error ? s.h0(new b.a.C0896a(error)) : s.L(error);
        }
    }

    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(s it) {
            AbstractC6492s.i(it, "it");
            return it.s(10L, TimeUnit.SECONDS, UnifiCloudConsoleServiceImpl.this.f43673c.a());
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43687a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Wc.b fetch) {
            AbstractC6492s.i(fetch, "fetch");
            if (!(fetch instanceof b.a.C0896a)) {
                if ((fetch instanceof b.c) || (fetch instanceof b.a.C0897b)) {
                    z zVarZ = z.z(b.a.d.f43711a);
                    AbstractC6492s.h(zVarZ, "just(...)");
                    return zVarZ;
                }
                if (!(fetch instanceof b.C0898b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z zVarZ2 = z.z(b.a.c.f43710a);
                AbstractC6492s.h(zVarZ2, "just(...)");
                return zVarZ2;
            }
            b.a.C0896a c0896a = (b.a.C0896a) fetch;
            Throwable thC = c0896a.c();
            if (thC instanceof InternalError) {
                z zVarZ3 = z.z(b.a.C1496b.f43709a);
                AbstractC6492s.h(zVarZ3, "just(...)");
                return zVarZ3;
            }
            if (thC instanceof UnifiCloudClient.Error) {
                z zVarZ4 = z.z(new b.a.C1495a((UnifiCloudClient.Error) c0896a.c()));
                AbstractC6492s.h(zVarZ4, "just(...)");
                return zVarZ4;
            }
            z zVarP = z.p(c0896a.c());
            AbstractC6492s.h(zVarP, "error(...)");
            return zVarP;
        }
    }

    public UnifiCloudConsoleServiceImpl(Ld.f cloud, Qd.e cache, Zc.f networkConnectionManager, u schedulers) {
        AbstractC6492s.i(cloud, "cloud");
        AbstractC6492s.i(cache, "cache");
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f43671a = cache;
        this.f43672b = networkConnectionManager;
        this.f43673c = schedulers;
        i iVarI2 = networkConnectionManager.getState().N0(b.f43680a).W().I1(new c(cloud, this)).e1().Y0(schedulers.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43674d = iVarI2;
        i iVarI22 = i.v(iVarI2, cache.a(), d.f43684a).e1().Y0(schedulers.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43675e = iVarI22;
        i iVarI23 = AbstractC5817h.j(iVarI2, new InterfaceC6835l() { // from class: Qd.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return UnifiCloudConsoleServiceImpl.k((UnifiCloudClient.a) obj);
            }
        }).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43676f = iVarI23;
        i iVarI24 = iVarI2.K(g.f43687a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43677g = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i i(UnifiCloudClient unifiCloudClient) {
        i iVarD1 = AbstractC5817h.d(unifiCloudClient.a(), new InterfaceC6835l() { // from class: Qd.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return UnifiCloudConsoleServiceImpl.j((Throwable) obj);
            }
        }).q0(e.f43685a).v0(new f()).d1(EnumC5911a.LATEST);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        return iVarD1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z j(Throwable er) {
        Throwable cause;
        AbstractC6492s.i(er, "er");
        RuntimeException runtimeException = er instanceof RuntimeException ? (RuntimeException) er : null;
        if (runtimeException != null && (cause = runtimeException.getCause()) != null) {
            er = cause;
        }
        z zVarP = er instanceof UnauthorisedException ? z.p(new UnifiCloudClient.Error.Unauthorized((UnauthorisedException) er)) : ((er instanceof HttpException) || (er instanceof IOException)) ? z.p(new UnifiCloudClient.Error.IO(er)) : z.p(er);
        AbstractC6492s.f(zVarP);
        return zVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(UnifiCloudClient.a it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    @Override // com.ui.wifiman.model.ubiquiti.console.b
    public i a() {
        return this.f43675e;
    }

    @Override // com.ui.wifiman.model.ubiquiti.console.b
    public i b() {
        return this.f43677g;
    }

    @Override // com.ui.wifiman.model.ubiquiti.console.b
    public i c() {
        return this.f43676f;
    }
}
