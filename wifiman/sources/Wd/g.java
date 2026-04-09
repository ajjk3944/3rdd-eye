package Wd;

import Yg.s;
import Yg.z;
import com.ubnt.usurvey.a;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient;
import fd.InterfaceC5808b;
import gg.D;
import gg.i;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f23873d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5808b f23874a;

    /* renamed from: b, reason: collision with root package name */
    private final i f23875b;

    /* renamed from: c, reason: collision with root package name */
    private final i f23876c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23877a = new b();

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.c f23878a;

            a(com.ui.wifiman.model.ubiquiti.cloud.sso.c cVar) {
                this.f23878a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                com.ui.sso.auth.a aVar = (com.ui.sso.auth.a) c6556a.a();
                return new C6556a(aVar != null ? z.a(b.a.a(((com.ui.wifiman.model.ubiquiti.cloud.sso.a) this.f23878a).f()), aVar) : null);
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            C6556a c6556a = (C6556a) sVar.a();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            com.ui.wifiman.model.ubiquiti.cloud.sso.c cVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.c) c6556a.b();
            if (((Boolean) objC).booleanValue() && cVar != null && (cVar instanceof com.ui.wifiman.model.ubiquiti.cloud.sso.a)) {
                i iVarN0 = ((com.ui.wifiman.model.ubiquiti.cloud.sso.a) cVar).a().N0(new a(cVar));
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            i iVarK0 = i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class c implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f23880a;

            /* renamed from: Wd.g$c$a$a, reason: collision with other inner class name */
            static final class C0900a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C0900a f23881a = new C0900a();

                C0900a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(String it) {
                    AbstractC6492s.i(it, "it");
                    return new C6556a(it);
                }
            }

            static final class b implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final b f23882a = new b();

                /* renamed from: Wd.g$c$a$b$a, reason: collision with other inner class name */
                static final class C0901a implements n {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0901a f23883a = new C0901a();

                    C0901a() {
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(Throwable error) {
                        AbstractC6492s.i(error, "error");
                        return error instanceof UbiquitiFirmwareClient.Error.IO ? i.d2(5000L, TimeUnit.MILLISECONDS) : i.k0(error);
                    }
                }

                b() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(i it) {
                    AbstractC6492s.i(it, "it");
                    return it.p0(C0901a.f23883a);
                }
            }

            /* renamed from: Wd.g$c$a$c, reason: collision with other inner class name */
            static final class C0902c implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C0902c f23884a = new C0902c();

                C0902c() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final D apply(Throwable it) {
                    AbstractC6492s.i(it, "it");
                    return it instanceof UbiquitiFirmwareClient.Error ? gg.z.z(new C6556a(null)) : gg.z.p(it);
                }
            }

            a(s sVar) {
                this.f23880a = sVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(UbiquitiFirmwareClient it) {
                AbstractC6492s.i(it, "it");
                String string = ((b.a) this.f23880a.h()).g().toString();
                AbstractC6492s.h(string, "toString(...)");
                return it.b(string, ((com.ui.sso.auth.a) this.f23880a.j()).a()).A(C0900a.f23881a).L(b.f23882a).F(C0902c.f23884a);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            s sVar = (s) c6556a.a();
            if (sVar == null) {
                gg.z zVarZ = gg.z.z(new C6556a(null));
                AbstractC6492s.f(zVarZ);
                return zVarZ;
            }
            gg.z zVarS = g.this.b(null).s(new a(sVar));
            AbstractC6492s.f(zVarS);
            return zVarS;
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return g.this.b((String) c6556a.a());
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f23886a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.t());
        }
    }

    public g(UiSSOAccountManager ssoAccountManager, InterfaceC5808b okHttpClientHolder, a.b appConfigurationManager) {
        AbstractC6492s.i(ssoAccountManager, "ssoAccountManager");
        AbstractC6492s.i(okHttpClientHolder, "okHttpClientHolder");
        AbstractC6492s.i(appConfigurationManager, "appConfigurationManager");
        this.f23874a = okHttpClientHolder;
        i iVarW = appConfigurationManager.b().N0(e.f23886a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f23875b = iVarW;
        i iVarI2 = Ag.c.f753a.a(ssoAccountManager.c(), iVarW).I1(b.f23877a).W().N1(new c()).W().x0(new d()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f23876c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z b(String str) {
        gg.z zVarZ = gg.z.z(new com.ui.wifiman.model.ubiquiti.firmware.b(this.f23874a, str));
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }

    @Override // Wd.f
    public i getClient() {
        return this.f23876c;
    }
}
