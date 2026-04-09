package P8;

import If.Q;
import Li.N;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.WifimanWizard;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.r;
import i8.InterfaceC6084a;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class l extends Q {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18340o = {O.h(new F(l.class, "wifimanWizard", "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), O.h(new F(l.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(l.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f18341p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18342g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18343h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f18344i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f18345j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f18346k;

    /* renamed from: l, reason: collision with root package name */
    private final N f18347l;

    /* renamed from: m, reason: collision with root package name */
    private final N f18348m;

    /* renamed from: n, reason: collision with root package name */
    private final N f18349n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final s9.d buttonPrimary;
        private final s9.d subtitle;
        private final s9.d title;
        public static final a LOCATION_DISABLED = new a("LOCATION_DISABLED", 0, new d.b(R.string.wm_wizard_popup_unavailable_location_provider_title), new d.b(R.string.wm_wizard_popup_unavailable_location_provider_subtitle), new d.b(R.string.wm_wizard_popup_unavailable_location_provider_button_primary));
        public static final a PERMISSIONS = new a("PERMISSIONS", 1, new d.b(R.string.wm_wizard_popup_unavailable_location_permission_title), new d.b(R.string.wm_wizard_popup_unavailable_location_permission_subtitle), new d.b(R.string.wm_wizard_popup_unavailable_location_permission_button_primary));
        public static final a BLUETOOTH_ADAPTER_UNAVAILABLE = new a("BLUETOOTH_ADAPTER_UNAVAILABLE", 2, new d.b(R.string.wm_wizard_popup_unavailable_bluetooth_unavailable_title), new d.b(R.string.wm_wizard_popup_unavailable_bluetooth_unavailable_subtitle), null);
        public static final a BLUETOOTH_ADAPTER_DISABLED = new a("BLUETOOTH_ADAPTER_DISABLED", 3, new d.b(R.string.wm_wizard_popup_unavailable_bluetooth_disabled_title), new d.b(R.string.wm_wizard_popup_unavailable_bluetooth_disabled_subtitle), new d.b(R.string.wm_wizard_popup_unavailable_bluetooth_disabled_button_primary));

        private static final /* synthetic */ a[] $values() {
            return new a[]{LOCATION_DISABLED, PERMISSIONS, BLUETOOTH_ADAPTER_UNAVAILABLE, BLUETOOTH_ADAPTER_DISABLED};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, s9.d dVar, s9.d dVar2, s9.d dVar3) {
            this.title = dVar;
            this.subtitle = dVar2;
            this.buttonPrimary = dVar3;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final s9.d getButtonPrimary() {
            return this.buttonPrimary;
        }

        public final s9.d getSubtitle() {
            return this.subtitle;
        }

        public final s9.d getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18350a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LOCATION_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PERMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BLUETOOTH_ADAPTER_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BLUETOOTH_ADAPTER_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18350a = iArr;
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18351a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.getButtonPrimary());
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a reason) {
            AbstractC6492s.i(reason, "reason");
            return l.this.u0(reason);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18353a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(WifimanWizard.a wizardState) {
            AbstractC6492s.i(wizardState, "wizardState");
            if (wizardState instanceof WifimanWizard.a.c.d) {
                return gg.n.o(a.LOCATION_DISABLED);
            }
            if (wizardState instanceof WifimanWizard.a.c.b) {
                return gg.n.o(a.BLUETOOTH_ADAPTER_UNAVAILABLE);
            }
            if (wizardState instanceof WifimanWizard.a.c.C1523a) {
                return gg.n.o(a.BLUETOOTH_ADAPTER_DISABLED);
            }
            if (wizardState instanceof WifimanWizard.a.c.C1524c) {
                return gg.n.o(a.PERMISSIONS);
            }
            if ((wizardState instanceof WifimanWizard.a.AbstractC1520a) || (wizardState instanceof WifimanWizard.a.b)) {
                return gg.n.h();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends o<com.ui.wifiman.model.android.permissions.d> {
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f18354a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.getSubtitle());
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f18355a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.getTitle());
        }
    }

    public l(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18342g = di2;
        org.kodein.type.i iVarE = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null);
        th.l[] lVarArr = f18340o;
        this.f18343h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18344i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18345j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = t0().getState().M1(e.f18353a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18346k = iVarI2;
        gg.i iVarN0 = iVarI2.N0(j.f18355a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f18347l = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
        gg.i iVarN02 = iVarI2.N0(i.f18354a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f18348m = AbstractC8661g.h0(this, iVarN02, null, null, 2, null);
        gg.i iVarN03 = iVarI2.N0(c.f18351a);
        AbstractC6492s.h(iVarN03, "map(...)");
        this.f18349n = AbstractC8661g.h0(this, iVarN03, null, null, 2, null);
    }

    private final com.ui.wifiman.model.android.permissions.d r0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f18345j.getValue();
    }

    private final InterfaceC6084a s0() {
        return (InterfaceC6084a) this.f18344i.getValue();
    }

    private final WifimanWizard t0() {
        return (WifimanWizard) this.f18343h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b u0(a aVar) {
        int i10 = b.f18350a[aVar.ordinal()];
        if (i10 == 1) {
            return s0().a(InterfaceC6084a.b.D.e.f48900a);
        }
        if (i10 == 2) {
            return r0().a(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE, com.ui.wifiman.model.android.permissions.a.BLUETOOTH);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return s0().a(InterfaceC6084a.b.D.C1821b.f48894a);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f18342g;
    }

    @Override // If.Q
    public N getTitle() {
        return this.f18347l;
    }

    @Override // If.Q
    public N n0() {
        return this.f18349n;
    }

    @Override // If.Q
    public N o0() {
        return this.f18348m;
    }

    @Override // If.Q
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f18346k.o0().t(new d());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
