package N8;

import N8.a;
import N8.f;
import android.os.Build;
import de.C5357a;
import de.InterfaceC5358b;
import gg.AbstractC5912b;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class f implements N8.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.android.permissions.d f15418a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5358b f15419b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f15420c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f15421d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f15422e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f15423f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f15424g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f15425h;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15426a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C5357a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(AbstractC6492s.d(it.f(), Boolean.TRUE));
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15427a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C5357a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(AbstractC6492s.d(it.c(), Boolean.TRUE));
        }
    }

    static final class c implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15429a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Set it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.BLUETOOTH));
            }
        }

        static final class b implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f15430a = new b();

            b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean it) {
                AbstractC6492s.i(it, "it");
                return it.booleanValue();
            }
        }

        /* renamed from: N8.f$c$c, reason: collision with other inner class name */
        static final class C0587c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f15431a;

            C0587c(f fVar) {
                this.f15431a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5357a c(C5357a it) {
                AbstractC6492s.i(it, "it");
                return C5357a.b(it, null, null, Boolean.TRUE, null, 11, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean it) {
                AbstractC6492s.i(it, "it");
                return this.f15431a.f15419b.a(new InterfaceC6835l() { // from class: N8.g
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return f.c.C0587c.c((C5357a) obj);
                    }
                });
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean permissionHandled) {
            AbstractC6492s.i(permissionHandled, "permissionHandled");
            return !permissionHandled.booleanValue() ? f.this.f15418a.b().N0(a.f15429a).m0(b.f15430a).o0().t(new C0587c(f.this)).c0().z1(Boolean.FALSE) : gg.i.K0(Boolean.TRUE);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15432a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C5357a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(AbstractC6492s.d(it.d(), Boolean.TRUE));
        }
    }

    static final class e implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15434a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Set it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION));
            }
        }

        static final class b implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f15435a = new b();

            b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean it) {
                AbstractC6492s.i(it, "it");
                return it.booleanValue();
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f15436a;

            c(f fVar) {
                this.f15436a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5357a c(C5357a it) {
                AbstractC6492s.i(it, "it");
                return C5357a.b(it, Boolean.TRUE, null, null, null, 14, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean it) {
                AbstractC6492s.i(it, "it");
                return this.f15436a.f15419b.a(new InterfaceC6835l() { // from class: N8.h
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return f.e.c.c((C5357a) obj);
                    }
                });
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean locationHandled) {
            AbstractC6492s.i(locationHandled, "locationHandled");
            return !locationHandled.booleanValue() ? f.this.f15418a.b().N0(a.f15434a).m0(b.f15435a).o0().t(new c(f.this)).c0().z1(Boolean.FALSE) : gg.i.K0(Boolean.TRUE);
        }
    }

    /* renamed from: N8.f$f, reason: collision with other inner class name */
    static final class C0588f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0588f f15437a = new C0588f();

        C0588f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C5357a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(AbstractC6492s.d(it.e(), Boolean.TRUE));
        }
    }

    static final class g implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15439a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Set it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.NOTIFICATION));
            }
        }

        static final class b implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f15440a = new b();

            b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean it) {
                AbstractC6492s.i(it, "it");
                return it.booleanValue();
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f15441a;

            c(f fVar) {
                this.f15441a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5357a c(C5357a it) {
                AbstractC6492s.i(it, "it");
                return C5357a.b(it, null, null, null, Boolean.TRUE, 7, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean it) {
                AbstractC6492s.i(it, "it");
                return this.f15441a.f15419b.a(new InterfaceC6835l() { // from class: N8.i
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return f.g.c.c((C5357a) obj);
                    }
                });
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean permissionHandled) {
            AbstractC6492s.i(permissionHandled, "permissionHandled");
            return !permissionHandled.booleanValue() ? f.this.f15418a.b().N0(a.f15439a).m0(b.f15440a).o0().t(new c(f.this)).c0().z1(Boolean.FALSE) : gg.i.K0(Boolean.TRUE);
        }
    }

    static final class h implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f15442a = new h();

        h() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.AbstractC0585a a(Boolean locationHandled, Boolean localSpeedtestHandled, Boolean bluetoothScanHandled, Boolean notificationHandled) {
            Hf.a aVar;
            AbstractC6492s.i(locationHandled, "locationHandled");
            AbstractC6492s.i(localSpeedtestHandled, "localSpeedtestHandled");
            AbstractC6492s.i(bluetoothScanHandled, "bluetoothScanHandled");
            AbstractC6492s.i(notificationHandled, "notificationHandled");
            if (locationHandled.booleanValue() && localSpeedtestHandled.booleanValue()) {
                return a.AbstractC0585a.C0586a.f15416a;
            }
            if (!locationHandled.booleanValue()) {
                aVar = Hf.a.LOCATION_PERMISSION;
            } else if (!notificationHandled.booleanValue()) {
                aVar = Hf.a.NOTIFICATION_PERMISSION;
            } else if (!bluetoothScanHandled.booleanValue()) {
                aVar = Hf.a.BLUETOOTH_PERMISSION;
            } else {
                if (localSpeedtestHandled.booleanValue()) {
                    throw new IllegalStateException("invalid wizard state");
                }
                aVar = Hf.a.APP_TO_APP_SPEEDTEST;
            }
            return new a.AbstractC0585a.b(aVar);
        }
    }

    public f(com.ui.wifiman.model.android.permissions.d permissionsService, InterfaceC5358b appWizardConfigManager) {
        AbstractC6492s.i(permissionsService, "permissionsService");
        AbstractC6492s.i(appWizardConfigManager, "appWizardConfigManager");
        this.f15418a = permissionsService;
        this.f15419b = appWizardConfigManager;
        gg.i iVarI1 = appWizardConfigManager.b().N0(d.f15432a).W().I1(new e());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f15420c = iVarI1;
        gg.i iVarW = appWizardConfigManager.b().N0(a.f15426a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f15421d = iVarW;
        gg.i iVarI12 = (Build.VERSION.SDK_INT >= 31 ? appWizardConfigManager.b().N0(b.f15427a) : gg.i.K0(Boolean.TRUE)).W().I1(new c());
        AbstractC6492s.h(iVarI12, "switchMap(...)");
        this.f15422e = iVarI12;
        gg.i iVarI13 = (!com.ui.wifiman.model.android.permissions.a.NOTIFICATION.getAlwaysGranted() ? appWizardConfigManager.b().N0(C0588f.f15437a) : gg.i.K0(Boolean.TRUE)).W().I1(new g());
        AbstractC6492s.h(iVarI13, "switchMap(...)");
        this.f15423f = iVarI13;
        gg.i iVarI2 = gg.i.t(iVarI1, iVarW, iVarI12, iVarI13, h.f15442a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f15424g = iVarI2;
        this.f15425h = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5357a k(C5357a it) {
        AbstractC6492s.i(it, "it");
        return C5357a.b(it, null, null, Boolean.TRUE, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5357a l(C5357a it) {
        AbstractC6492s.i(it, "it");
        return C5357a.b(it, Boolean.TRUE, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5357a m(C5357a it) {
        AbstractC6492s.i(it, "it");
        return C5357a.b(it, null, null, null, Boolean.TRUE, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5357a n(C5357a it) {
        AbstractC6492s.i(it, "it");
        return C5357a.b(it, null, Boolean.TRUE, null, null, 13, null);
    }

    @Override // N8.a
    public AbstractC5912b a() {
        return this.f15419b.a(new InterfaceC6835l() { // from class: N8.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.k((C5357a) obj);
            }
        });
    }

    @Override // N8.a
    public AbstractC5912b b() {
        return this.f15419b.a(new InterfaceC6835l() { // from class: N8.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.n((C5357a) obj);
            }
        });
    }

    @Override // N8.a
    public AbstractC5912b c() {
        return this.f15419b.a(new InterfaceC6835l() { // from class: N8.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.l((C5357a) obj);
            }
        });
    }

    @Override // N8.a
    public AbstractC5912b d() {
        return this.f15419b.a(new InterfaceC6835l() { // from class: N8.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.m((C5357a) obj);
            }
        });
    }

    @Override // N8.a
    public gg.i getState() {
        return this.f15425h;
    }
}
