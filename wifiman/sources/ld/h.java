package Ld;

import Yg.m;
import android.content.Context;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.UnifiCloudConsoleServiceImpl;
import dc.C5341a;
import fe.u;
import gg.AbstractC5912b;
import gg.i;
import java.util.UUID;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;

/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ l[] f11573h = {O.g(new D(h.class, "productCatalog", "<v#0>", 0)), O.g(new D(h.class, "certManager", "<v#1>", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final DI f11574a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11575b;

    /* renamed from: c, reason: collision with root package name */
    private final C5341a f11576c;

    /* renamed from: d, reason: collision with root package name */
    private final Qd.e f11577d;

    /* renamed from: e, reason: collision with root package name */
    private final Zc.f f11578e;

    /* renamed from: f, reason: collision with root package name */
    private final u f11579f;

    /* renamed from: g, reason: collision with root package name */
    private final i f11580g;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends o<xa.o> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<Sd.a> {
    }

    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ l[] f11581b = {O.g(new D(h.class, "ssoSession", "<v#2>", 0))};

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f11583a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f11584b;

            a(h hVar, com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                this.f11583a = hVar;
                this.f11584b = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Gb.d storage) {
                AbstractC6492s.i(storage, "storage");
                return new C6556a(this.f11583a.f(this.f11584b.e(), this.f11583a.f11577d, storage));
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Ld.h$c$c, reason: collision with other inner class name */
        public static final class C0458c extends o<com.ui.wifiman.model.ubiquiti.cloud.sso.a> {
        }

        public static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f11585a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Object obj) {
                super(0);
                this.f11585a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f11585a;
            }
        }

        c() {
        }

        private static final com.ui.wifiman.model.ubiquiti.cloud.sso.a b(m mVar) {
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.a) mVar.getValue();
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a();
            if (bVar == null) {
                return i.K0(new C6556a(null));
            }
            DI di2 = h.this.f11574a;
            b.a aVarA = b.a.a(bVar.e());
            org.kodein.type.i iVarE = s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, b.a.class);
            org.kodein.type.i iVarE2 = s.e(new C0458c().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return b(org.kodein.di.d.b(di2, dVar, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.ubiquiti.cloud.sso.a.class), null, new d(aVarA)).a(null, f11581b[0])).g().N0(new a(h.this, bVar));
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11586a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            e eVar = (e) it.b();
            UUID uuidA = eVar != null ? eVar.a() : null;
            Z7.b.h("Ubiquiti Cloud session Primary - " + (uuidA == null ? "null" : b.a.f(uuidA)), null, 2, null);
        }
    }

    public h(DI di2, Context context, C5341a buildConfig, UiSSOAccountManager accountManager, Qd.e consoleCache, Zc.f networkConnectionManager, u schedulers) {
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(buildConfig, "buildConfig");
        AbstractC6492s.i(accountManager, "accountManager");
        AbstractC6492s.i(consoleCache, "consoleCache");
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f11574a = di2;
        this.f11575b = context;
        this.f11576c = buildConfig;
        this.f11577d = consoleCache;
        this.f11578e = networkConnectionManager;
        this.f11579f = schedulers;
        i iVarW = accountManager.e().I1(new c()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        i iVarI2 = n9.c.c(iVarW, new InterfaceC6835l() { // from class: Ld.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return h.i(this.f11572a, (C6556a) obj);
            }
        }).f0(d.f11586a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f11580g = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e f(UUID uuid, Qd.e eVar, Gb.d dVar) {
        cb.c cVar = new cb.c(this.f11575b, dVar, com.ubnt.usurvey.a.f39654r.a().getConfig().g(), null, null, "wifiman/android", this.f11576c.d(), null, null, true, 392, null);
        DI di2 = this.f11574a;
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, xa.o.class), null);
        l[] lVarArr = f11573h;
        m mVarA = interfaceC7810x2A.a(null, lVarArr[0]);
        DI di3 = this.f11574a;
        org.kodein.type.i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.di.d.a(di3, new org.kodein.type.d(iVarE2, Sd.a.class), null).a(null, lVarArr[1]);
        return new e(uuid, new com.ui.wifiman.model.ubiquiti.cloud.a(cVar, g(mVarA)), new UnifiCloudConsoleServiceImpl(this, eVar, this.f11578e, this.f11579f), new com.ui.wifiman.model.ubiquiti.console.g(cVar, g(mVarA)), cVar, null);
    }

    private static final xa.o g(m mVar) {
        return (xa.o) mVar.getValue();
    }

    private final AbstractC5912b h(e eVar) {
        return eVar != null ? this.f11577d.b(eVar.a()) : this.f11577d.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b i(h hVar, C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        return hVar.h((e) c6556a.a());
    }

    @Override // Ld.f
    public i a() {
        return this.f11580g;
    }
}
