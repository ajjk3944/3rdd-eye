package Of;

import Of.a;
import Of.e;
import com.ui.wmw.api.v1.ApiV1Settings;
import gg.AbstractC5912b;
import gg.i;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class e implements a.InterfaceC0626a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f17822a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17823b;

    static final class a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17824a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Settings stream error";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Nf.a.b(new InterfaceC6824a() { // from class: Of.d
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return e.a.c();
                }
            }, it);
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17825a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Of.a apply(ApiV1Settings it) {
            AbstractC6492s.i(it, "it");
            String name = it.getName();
            if (name == null) {
                name = "";
            }
            return new Of.a(name, it.getIsHwResetButtonBlocked(), it.getAutoSleepTimeMillis());
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17826a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Settings stream error";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Nf.a.b(new InterfaceC6824a() { // from class: Of.f
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return e.c.c();
                }
            }, it);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f17827a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(Of.a aVar) {
            return "WMW Settings emission " + aVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final Of.a it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Of.g
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return e.d.c(it);
                }
            });
        }
    }

    /* renamed from: Of.e$e, reason: collision with other inner class name */
    static final class C0627e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C0627e f17828a = new C0627e();

        C0627e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Settings subscribed";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Of.h
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return e.C0627e.c();
                }
            });
        }
    }

    public e(com.ui.wmw.api.v1.a api, Kf.e sessionState) {
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(sessionState, "sessionState");
        this.f17822a = api;
        i iVarW = sessionState.p().N0(b.f17825a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        i iVarI2 = com.ui.wmw.f.c(iVarW, true).d0(c.f17826a).f0(d.f17827a).g0(C0627e.f17828a).Z(new InterfaceC6464a() { // from class: Of.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                e.e();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f17823b = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        Nf.a.d(new InterfaceC6824a() { // from class: Of.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return "WMW Settings finished";
    }

    @Override // Of.a.InterfaceC0626a
    public i c() {
        return this.f17823b;
    }

    @Override // Of.a.InterfaceC0626a
    public AbstractC5912b d(String name) {
        AbstractC6492s.i(name, "name");
        AbstractC5912b abstractC5912bZ = com.ui.wmw.f.b(this.f17822a.d(name)).z(a.f17824a);
        AbstractC6492s.h(abstractC5912bZ, "doOnError(...)");
        return abstractC5912bZ;
    }
}
