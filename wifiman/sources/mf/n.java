package Mf;

import Mf.a;
import Mf.n;
import com.ui.common.semver.SemVer;
import com.ui.wmw.WMWizard;
import com.ui.wmw.api.v1.ApiV1BluetoothSettings;
import gg.AbstractC5912b;
import gg.t;
import gg.u;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class n implements a.InterfaceC0524a, s {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f13153a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.e f13154b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f13155c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f13156d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f13157e;

    static final class a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13158a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW FW Upgrade stream error";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof WMWizard.Error) {
                Nf.a.b(new InterfaceC6824a() { // from class: Mf.m
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return n.a.c();
                    }
                }, it);
            }
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13159a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.String c(Mf.a.b r5) {
            /*
                float r0 = r5.a()
                r1 = 100
                float r1 = (float) r1
                float r0 = r0 * r1
                boolean r1 = r5 instanceof Mf.a.b.C0526b
                if (r1 == 0) goto Lf
                Mf.a$b$b r5 = (Mf.a.b.C0526b) r5
                goto L10
            Lf:
                r5 = 0
            L10:
                if (r5 == 0) goto L37
                long r1 = r5.c()
                float r1 = (float) r1
                r2 = 1232348160(0x49742400, float:1000000.0)
                float r1 = r1 / r2
                long r3 = r5.b()
                float r5 = (float) r3
                float r5 = r5 / r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "/"
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                if (r5 != 0) goto L39
            L37:
                java.lang.String r5 = ""
            L39:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "WMW FW Upgrade State - "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "% "
                r1.append(r0)
                r1.append(r5)
                java.lang.String r5 = "}"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Mf.n.b.c(Mf.a$b):java.lang.String");
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final a.b it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Mf.o
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return n.b.c(it);
                }
            });
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13160a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW FW Upgrade - Bluetooth speed MAX SUBSCRIBED";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Mf.l
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return n.c.c();
                }
            });
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13161a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW FW Upgrade - Bluetooth speed MAX FAILED";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Mf.p
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return n.d.c();
                }
            });
        }
    }

    static final class e implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f13162a = new e();

        e() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(com.ui.wmw.api.v1.d it) {
            AbstractC6492s.i(it, "it");
            return it.b() == it.a();
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f13163a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.b apply(com.ui.wmw.api.v1.d uploadStatus) {
            AbstractC6492s.i(uploadStatus, "uploadStatus");
            return uploadStatus.b() == uploadStatus.a() ? new a.b.C0525a(uploadStatus.b()) : new a.b.C0526b(uploadStatus.b(), uploadStatus.a());
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f13164a = new g();

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW FW Upgrade - Upload SUBSCRIBED";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Mf.q
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return n.g.c();
                }
            });
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final h f13165a = new h();

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW FW Upgrade - Upload FAILED";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Mf.r
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return n.h.c();
                }
            });
        }
    }

    public n(com.ui.wmw.api.v1.a api, Kf.e sessionState) {
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(sessionState, "sessionState");
        this.f13153a = api;
        this.f13154b = sessionState;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f13155c = aVarK2;
        AbstractC5912b abstractC5912bF0 = gg.s.o(new u() { // from class: Mf.f
            @Override // gg.u
            public final void a(t tVar) {
                n.m(this.f13151a, tVar);
            }
        }).x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f13156d = abstractC5912bF0;
        gg.i iVarI2 = aVarK2.e1().W().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f13157e = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final n nVar, t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        Nf.a.d(new InterfaceC6824a() { // from class: Mf.j
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return n.n();
            }
        });
        nVar.f13155c.h(Boolean.TRUE);
        emitter.d(new InterfaceC6468e() { // from class: Mf.k
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                n.o(this.f13152a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n() {
        return "WMW - FW upgrade in process signalled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(n nVar) {
        Nf.a.d(new InterfaceC6824a() { // from class: Mf.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return n.p();
            }
        });
        nVar.f13155c.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p() {
        return "WMW - FW upgrade in finished signalled";
    }

    private final boolean q() {
        return this.f13154b.m().compareTo(new SemVer(1, 3, 1, null, null, 24, null)) >= 0;
    }

    private final ApiV1BluetoothSettings r() {
        return this.f13154b.m().compareTo(new SemVer(1, 1, 2, null, null, 24, null)) < 0 ? new ApiV1BluetoothSettings(ApiV1BluetoothSettings.a.CUSTOM.getId(), 6, 6, 500, 0, Boolean.FALSE) : new ApiV1BluetoothSettings(ApiV1BluetoothSettings.a.MAX.getId(), null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s() {
        Nf.a.d(new InterfaceC6824a() { // from class: Mf.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return n.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t() {
        return "WMW FW Upgrade - Bluetooth speed MAX Finished";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u() {
        Nf.a.d(new InterfaceC6824a() { // from class: Mf.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return n.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v() {
        return "WMW FW Upgrade - Upload Completed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
        Nf.a.d(new InterfaceC6824a() { // from class: Mf.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return n.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x() {
        return "WMW FW Upgrade - Upload Finished";
    }

    @Override // Mf.s
    public gg.i a() {
        return this.f13157e;
    }

    @Override // Mf.a.InterfaceC0524a
    public gg.i b(Mf.a firmware) {
        AbstractC6492s.i(firmware, "firmware");
        gg.i iVarW = gg.i.A(this.f13153a.j(r()).B(c.f13160a).z(d.f13161a).w(new InterfaceC6464a() { // from class: Mf.g
            @Override // kg.InterfaceC6464a
            public final void run() {
                n.s();
            }
        }).c0(), this.f13153a.g(firmware.a(), firmware.b(), q()).U0(this.f13156d).R1(e.f13162a).N0(f.f13163a).g0(g.f13164a).a0(new InterfaceC6464a() { // from class: Mf.h
            @Override // kg.InterfaceC6464a
            public final void run() {
                n.u();
            }
        }).d0(h.f13165a).Z(new InterfaceC6464a() { // from class: Mf.i
            @Override // kg.InterfaceC6464a
            public final void run() {
                n.w();
            }
        })).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        gg.i iVarF0 = com.ui.wmw.f.c(iVarW, false).d0(a.f13158a).f0(b.f13159a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }
}
