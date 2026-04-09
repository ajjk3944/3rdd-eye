package Bc;

import Bc.a;
import V7.a;
import V7.b;
import Yg.J;
import Yg.y;
import Zg.AbstractC3689v;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.C;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.t;
import gg.z;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import m9.C6783c;
import pc.InterfaceC7283a;

/* loaded from: classes4.dex */
public final class f implements Bc.a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f1291q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SubscriptionManager f1292a;

    /* renamed from: b, reason: collision with root package name */
    private final TelephonyManager f1293b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f1294c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f1295d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f1296e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f1297f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f1298g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f1299h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f1300i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f1301j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f1302k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f1303l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f1304m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f1305n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f1306o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f1307p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f1308a;

            /* renamed from: b, reason: collision with root package name */
            private final V7.b f1309b;

            public a(boolean z10, V7.b bVar) {
                super(null);
                this.f1308a = z10;
                this.f1309b = bVar;
            }

            public final V7.b a() {
                return this.f1309b;
            }

            public final boolean b() {
                return this.f1308a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f1308a == aVar.f1308a && AbstractC6492s.d(this.f1309b, aVar.f1309b);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.f1308a) * 31;
                V7.b bVar = this.f1309b;
                return iHashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            public String toString() {
                return "DataNetworkType(isPrimary=" + this.f1308a + ", networkType=" + this.f1309b + ")";
            }
        }

        /* renamed from: Bc.f$b$b, reason: collision with other inner class name */
        public static final class C0062b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f1310a;

            public C0062b(String str) {
                super(null);
                this.f1310a = str;
            }

            public final String a() {
                return this.f1310a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0062b) && AbstractC6492s.d(this.f1310a, ((C0062b) obj).f1310a);
            }

            public int hashCode() {
                String str = this.f1310a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Provider(name=" + this.f1310a + ")";
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f1311a;

            public c(Integer num) {
                super(null);
                this.f1311a = num;
            }

            public final Integer a() {
                return this.f1311a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f1311a, ((c) obj).f1311a);
            }

            public int hashCode() {
                Integer num = this.f1311a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "SignalStrength(dBm=" + this.f1311a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1312a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1959519260;
            }

            public String toString() {
                return "Fulfilled";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f1313a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f1314b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f1315c;

            public b(boolean z10, boolean z11, boolean z12) {
                super(null);
                this.f1313a = z10;
                this.f1314b = z11;
                this.f1315c = z12;
            }

            public final boolean a() {
                return this.f1314b;
            }

            public final boolean b() {
                return this.f1315c;
            }

            public final boolean c() {
                return this.f1313a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f1313a == bVar.f1313a && this.f1314b == bVar.f1314b && this.f1315c == bVar.f1315c;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.f1313a) * 31) + Boolean.hashCode(this.f1314b)) * 31) + Boolean.hashCode(this.f1315c);
            }

            public String toString() {
                return "Pending(phoneStatePermission=" + this.f1313a + ", locationPermission=" + this.f1314b + ", locationServiceEnabled=" + this.f1315c + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d ACTIVE = new d("ACTIVE", 0);
        public static final d INACTIVE = new d("INACTIVE", 1);
        public static final d ABSENT = new d("ABSENT", 2);
        public static final d UNKNOWN = new d("UNKNOWN", 3);

        private static final /* synthetic */ d[] $values() {
            return new d[]{ACTIVE, INACTIVE, ABSENT, UNKNOWN};
        }

        static {
            d[] dVarArr$values = $values();
            $VALUES = dVarArr$values;
            $ENTRIES = AbstractC5827b.a(dVarArr$values);
        }

        private d(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    private static abstract class e {

        public static final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            private final C0063f f1316a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0063f manager) {
                super(null);
                AbstractC6492s.i(manager, "manager");
                this.f1316a = manager;
            }

            public final C0063f a() {
                return this.f1316a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f1316a, ((a) obj).f1316a);
            }

            public int hashCode() {
                return this.f1316a.hashCode();
            }

            public String toString() {
                return "Available(manager=" + this.f1316a + ")";
            }
        }

        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            private final a.b.AbstractC0059b f1317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a.b.AbstractC0059b state) {
                super(null);
                AbstractC6492s.i(state, "state");
                this.f1317a = state;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f1317a, ((b) obj).f1317a);
            }

            public int hashCode() {
                return this.f1317a.hashCode();
            }

            public String toString() {
                return "Unavailable(state=" + this.f1317a + ")";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    /* renamed from: Bc.f$f, reason: collision with other inner class name */
    public static final class C0063f {

        /* renamed from: a, reason: collision with root package name */
        private final int f1318a;

        /* renamed from: b, reason: collision with root package name */
        private final TelephonyManager f1319b;

        public C0063f(int i10, TelephonyManager telephonyManager) {
            AbstractC6492s.i(telephonyManager, "telephonyManager");
            this.f1318a = i10;
            this.f1319b = telephonyManager;
        }

        public final int a() {
            return this.f1318a;
        }

        public final TelephonyManager b() {
            return this.f1319b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0063f)) {
                return false;
            }
            C0063f c0063f = (C0063f) obj;
            return this.f1318a == c0063f.f1318a && AbstractC6492s.d(this.f1319b, c0063f.f1319b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f1318a) * 31) + this.f1319b.hashCode();
        }

        public String toString() {
            return "TelephonyManagerWrapper(subscriptionId=" + this.f1318a + ", telephonyManager=" + this.f1319b + ")";
        }
    }

    static final class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(e it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof e.a) {
                return f.this.u(((e.a) it).a()).d1(EnumC5911a.BUFFER);
            }
            if (it instanceof e.b) {
                return gg.i.L0(new b.a(false, null), new b.c(null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class h implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1322b;

        public h(int i10) {
            this.f1322b = i10;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            d dVar;
            try {
                switch (f.this.f1293b.getSimState(this.f1322b)) {
                    case 0:
                    case 1:
                        dVar = d.ABSENT;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        dVar = d.INACTIVE;
                        break;
                    case 5:
                        dVar = d.ACTIVE;
                        break;
                    default:
                        dVar = d.UNKNOWN;
                        break;
                }
                interfaceC5910A.onSuccess(dVar);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f1323a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(2000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class j implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ gg.i f1326c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ gg.i f1327d;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ gg.i f1328a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ gg.i f1329b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f1330c;

            /* renamed from: Bc.f$j$a$a, reason: collision with other inner class name */
            static final class C0064a implements InterfaceC6465b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0064a f1331a = new C0064a();

                C0064a() {
                }

                @Override // kg.InterfaceC6465b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a.b.AbstractC0054a.AbstractC0056b apply(a.C0052a signal, b.a networkTypeEvent) {
                    AbstractC6492s.i(signal, "signal");
                    AbstractC6492s.i(networkTypeEvent, "networkTypeEvent");
                    if (networkTypeEvent.b()) {
                        return new a.b.AbstractC0054a.AbstractC0056b.C0057a(signal.c(), networkTypeEvent.a(), signal.a());
                    }
                    return new a.b.AbstractC0054a.AbstractC0056b.C0058b(signal.c(), networkTypeEvent.a(), signal.a());
                }
            }

            a(gg.i iVar, gg.i iVar2, f fVar) {
                this.f1328a = iVar;
                this.f1329b = iVar2;
                this.f1330c = fVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(c requirements) {
                AbstractC6492s.i(requirements, "requirements");
                if (requirements instanceof c.a) {
                    gg.i iVarV = gg.i.v(this.f1328a, this.f1329b, C0064a.f1331a);
                    AbstractC6492s.h(iVarV, "combineLatest(...)");
                    return iVarV;
                }
                if (!(requirements instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gg.i iVarK0 = gg.i.K0(this.f1330c.q((c.b) requirements));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1332a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.ABSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f1332a = iArr;
            }
        }

        j(int i10, gg.i iVar, gg.i iVar2) {
            this.f1325b = i10;
            this.f1326c = iVar;
            this.f1327d = iVar2;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(d simState) {
            AbstractC6492s.i(simState, "simState");
            int i10 = b.f1332a[simState.ordinal()];
            if (i10 == 1) {
                gg.i iVarI1 = f.this.f1296e.I1(new a(this.f1326c, this.f1327d, f.this));
                AbstractC6492s.h(iVarI1, "switchMap(...)");
                return iVarI1;
            }
            if (i10 == 2) {
                gg.i iVarK0 = gg.i.K0(a.b.AbstractC0054a.c.f1281a);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (i10 == 3) {
                gg.i iVarK02 = gg.i.K0(a.b.AbstractC0054a.C0055a.f1274a);
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK03 = gg.i.K0(new a.b.AbstractC0059b.e(this.f1325b));
            AbstractC6492s.h(iVarK03, "just(...)");
            return iVarK03;
        }
    }

    public static final class k extends PhoneStateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.t f1334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0063f f1335c;

        k(gg.t tVar, C0063f c0063f) {
            this.f1334b = tVar;
            this.f1335c = c0063f;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDataConnectionStateChanged(int i10, int i11) {
            super.onDataConnectionStateChanged(i10, i11);
            this.f1334b.h(new b.a(SubscriptionManager.getDefaultDataSubscriptionId() == this.f1335c.a(), f.this.x(i11)));
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            AbstractC6492s.i(telephonyDisplayInfo, "telephonyDisplayInfo");
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            V7.b bVarX = f.this.x(telephonyDisplayInfo.getNetworkType());
            gg.t tVar = this.f1334b;
            boolean z10 = SubscriptionManager.getDefaultSubscriptionId() == this.f1335c.a();
            if (bVarX instanceof b.c) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                if (overrideNetworkType == 1) {
                    bVarX = b.c.d.f23112a;
                } else if (overrideNetworkType == 2) {
                    bVarX = b.c.C0849c.f23111a;
                } else if (overrideNetworkType == 3 || overrideNetworkType == 4) {
                    bVarX = b.d.C0850b.f23114a;
                }
            } else if (bVarX instanceof b.d) {
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                bVarX = overrideNetworkType2 != 0 ? (overrideNetworkType2 == 4 || overrideNetworkType2 == 5) ? b.d.c.f23115a : (b.d) bVarX : (b.d) bVarX;
            }
            tVar.h(new b.a(z10, bVarX));
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x0123 A[PHI: r1
  0x0123: PHI (r1v6 java.lang.Integer) = (r1v5 java.lang.Integer), (r1v9 java.lang.Integer), (r1v12 java.lang.Integer) binds: [B:37:0x009a, B:49:0x00c8, B:61:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.telephony.PhoneStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSignalStrengthsChanged(android.telephony.SignalStrength r5) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.f.k.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f1336a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set permissions) {
            AbstractC6492s.i(permissions, "permissions");
            return Boolean.valueOf(permissions.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f1337a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set permissions) {
            AbstractC6492s.i(permissions, "permissions");
            return Boolean.valueOf(permissions.contains(com.ui.wifiman.model.android.permissions.a.PHONE_STATE));
        }
    }

    public static final class n implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1339b;

        public n(int i10) {
            this.f1339b = i10;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            SubscriptionInfo activeSubscriptionInfoForSimSlotIndex;
            C0063f c0063f = null;
            try {
                try {
                    activeSubscriptionInfoForSimSlotIndex = f.this.f1292a.getActiveSubscriptionInfoForSimSlotIndex(this.f1339b);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                    return;
                }
            } catch (IllegalStateException | SecurityException unused) {
            }
            Integer numValueOf = activeSubscriptionInfoForSimSlotIndex != null ? Integer.valueOf(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId()) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                TelephonyManager telephonyManagerCreateForSubscriptionId = f.this.f1293b.createForSubscriptionId(numValueOf.intValue());
                AbstractC6492s.h(telephonyManagerCreateForSubscriptionId, "createForSubscriptionId(...)");
                c0063f = new C0063f(iIntValue, telephonyManagerCreateForSubscriptionId);
            }
            interfaceC5910A.onSuccess(new C6556a(c0063f));
        }
    }

    static final class o implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final o f1340a = new o();

        o() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c a(Boolean locationPermission, Boolean phoneStatePermission, Boolean locationProviderEnabled) {
            AbstractC6492s.i(locationPermission, "locationPermission");
            AbstractC6492s.i(phoneStatePermission, "phoneStatePermission");
            AbstractC6492s.i(locationProviderEnabled, "locationProviderEnabled");
            return (locationPermission.booleanValue() && phoneStatePermission.booleanValue() && locationProviderEnabled.booleanValue()) ? c.a.f1312a : new c.b(phoneStatePermission.booleanValue(), locationPermission.booleanValue(), locationProviderEnabled.booleanValue());
        }
    }

    static final class p implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final p f1341a = new p();

        p() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0052a apply(a.C0052a state, y yVar) {
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(yVar, "<destruct>");
            b.C0062b c0062b = (b.C0062b) yVar.a();
            b.c cVar = (b.c) yVar.c();
            b.a aVar = (b.a) yVar.d();
            Integer numA = cVar.a();
            V7.a aVarA = null;
            if (numA != null) {
                int iIntValue = numA.intValue();
                V7.b bVarA = aVar.a();
                if ((bVarA instanceof b.a) || (bVarA instanceof b.AbstractC0846b)) {
                    aVarA = a.C0841a.f23089e.a(iIntValue);
                } else if ((bVarA instanceof b.c) || (bVarA instanceof b.d)) {
                    aVarA = a.b.f23092e.a(iIntValue);
                }
            }
            String strA = c0062b.a();
            V7.b bVarA2 = aVar.a();
            ArrayList arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (a.C0052a.C0053a c0053a : state.b()) {
                if (c0053a.b() > jCurrentTimeMillis - 60000) {
                    arrayList.add(c0053a);
                }
            }
            arrayList.add(new a.C0052a.C0053a(aVarA, jCurrentTimeMillis));
            J j10 = J.f24997a;
            return new a.C0052a(strA, aVarA, bVarA2, arrayList);
        }
    }

    static final class q implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final q f1342a = new q();

        q() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Cell State Primary subscribed", null, 2, null);
        }
    }

    static final class r implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final r f1343a = new r();

        r() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Cell State Primary emission - " + it, null, 2, null);
        }
    }

    static final class s implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final s f1344a = new s();

        s() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Cell State Primary error", it, null, 4, null);
        }
    }

    static final class t implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final t f1345a = new t();

        t() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Cell State Secondary subscribed", null, 2, null);
        }
    }

    static final class u implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final u f1346a = new u();

        u() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Cell State Secondary emission - " + it, null, 2, null);
        }
    }

    static final class v implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final v f1347a = new v();

        v() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Cell State Secondary error", it, null, 4, null);
        }
    }

    static final class w implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final w f1348a = new w();

        w() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.b apply(a.b sim0, a.b sim1) {
            AbstractC6492s.i(sim0, "sim0");
            AbstractC6492s.i(sim1, "sim1");
            return sim1 instanceof a.b.AbstractC0054a.AbstractC0056b.C0057a ? sim1 : sim0;
        }
    }

    static final class x implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1350b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1351a;

            a(int i10) {
                this.f1351a = i10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                C0063f c0063f = (C0063f) c6556a.a();
                return c0063f != null ? new e.a(c0063f) : new e.b(new a.b.AbstractC0059b.e(this.f1351a));
            }
        }

        public static final class b implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f1352a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f1353b;

            public b(f fVar, c cVar) {
                this.f1352a = fVar;
                this.f1353b = cVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(new e.b(this.f1352a.q((c.b) this.f1353b)));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        x(int i10) {
            this.f1350b = i10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(c requirements) {
            AbstractC6492s.i(requirements, "requirements");
            if (requirements instanceof c.a) {
                z zVarA = f.this.z(this.f1350b).A(new a(this.f1350b));
                AbstractC6492s.h(zVarA, "map(...)");
                return zVarA;
            }
            if (!(requirements instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVarI = z.i(new b(f.this, requirements));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    public f(SubscriptionManager subscriptionManager, TelephonyManager telephonyManager, com.ui.wifiman.model.android.permissions.d permissionsService, InterfaceC7283a locationService) {
        AbstractC6492s.i(subscriptionManager, "subscriptionManager");
        AbstractC6492s.i(telephonyManager, "telephonyManager");
        AbstractC6492s.i(permissionsService, "permissionsService");
        AbstractC6492s.i(locationService, "locationService");
        this.f1292a = subscriptionManager;
        this.f1293b = telephonyManager;
        gg.i iVarW = permissionsService.b().N0(l.f1336a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f1294c = iVarW;
        gg.i iVarW2 = permissionsService.b().N0(m.f1337a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f1295d = iVarW2;
        gg.i iVarI2 = gg.i.u(iVarW, iVarW2, locationService.a(), o.f1340a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f1296e = iVarI2;
        gg.i iVarR = r(0);
        this.f1297f = iVarR;
        gg.i iVarR2 = r(1);
        this.f1298g = iVarR2;
        gg.i iVarS = s(0);
        this.f1299h = iVarS;
        gg.i iVarS2 = s(1);
        this.f1300i = iVarS2;
        gg.i iVarI22 = A(iVarR).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f1301j = iVarI22;
        gg.i iVarI23 = y(iVarR).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f1302k = iVarI23;
        gg.i iVarI24 = A(iVarR2).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f1303l = iVarI24;
        gg.i iVarI25 = y(iVarR2).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f1304m = iVarI25;
        gg.i iVarI26 = t(iVarS, b(), iVarI23, 0).g0(q.f1342a).f0(r.f1343a).d0(s.f1344a).Z(new InterfaceC6464a() { // from class: Bc.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                f.B();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f1305n = iVarI26;
        gg.i iVarI27 = t(iVarS2, c(), iVarI25, 1).g0(t.f1345a).f0(u.f1346a).d0(v.f1347a).Z(new InterfaceC6464a() { // from class: Bc.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                f.C();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f1306o = iVarI27;
        gg.i iVarI28 = gg.i.v(e(), d(), w.f1348a).o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f1307p = iVarI28;
    }

    private final gg.i A(gg.i iVar) {
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarZ0 = iVar.Z0(b.C0062b.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarZ02 = iVar.Z0(b.c.class);
        AbstractC6492s.h(iVarZ02, "ofType(R::class.java)");
        gg.i iVarZ03 = iVar.Z0(b.a.class);
        AbstractC6492s.h(iVarZ03, "ofType(R::class.java)");
        gg.i iVarQ1 = cVar.b(iVarZ0, iVarZ02, iVarZ03).q1(new a.C0052a(null, null, null, AbstractC3689v.l()), p.f1341a);
        AbstractC6492s.h(iVarQ1, "scan(...)");
        return iVarQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        Z7.b.h("Cell State Primary finished", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        Z7.b.h("Cell State Secondary finished", null, 2, null);
    }

    private final gg.i D(int i10) {
        gg.i iVarY0 = this.f1296e.N1(new x(i10)).e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        return iVarY0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b.AbstractC0059b q(c.b bVar) {
        return !bVar.c() ? a.b.AbstractC0059b.c.f1284a : !bVar.a() ? a.b.AbstractC0059b.C0061b.f1283a : !bVar.b() ? a.b.AbstractC0059b.C0060a.f1282a : a.b.AbstractC0059b.d.f1285a;
    }

    private final gg.i r(int i10) {
        gg.i iVarI2 = D(i10).I1(new g()).X0(Gg.a.a()).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    private final gg.i s(int i10) {
        z zVarI = z.i(new h(i10));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI2 = zVarI.O(Gg.a.d()).K(i.f1323a).W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    private final gg.i t(gg.i iVar, gg.i iVar2, gg.i iVar3, int i10) {
        gg.i iVarI2 = iVar.I1(new j(i10, iVar2, iVar3)).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.s u(final C0063f c0063f) {
        gg.y yVarD = C6783c.d(C6783c.f53633a, "cellularManager-sub-" + c0063f.a(), 0, 2, null);
        gg.s sVarE1 = gg.s.o(new gg.u() { // from class: Bc.d
            @Override // gg.u
            public final void a(t tVar) {
                f.v(c0063f, this, tVar);
            }
        }).M0(yVarD).e1(yVarD);
        AbstractC6492s.h(sVarE1, "unsubscribeOn(...)");
        return sVarE1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(final C0063f c0063f, f fVar, gg.t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final k kVar = fVar.new k(emitter, c0063f);
        c0063f.b().listen(kVar, Build.VERSION.SDK_INT >= 30 ? 5244176 : 4195664);
        emitter.d(new InterfaceC6468e() { // from class: Bc.e
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                f.w(c0063f, kVar);
            }
        });
        emitter.h(new b.C0062b(c0063f.b().getSimOperatorName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C0063f c0063f, k kVar) {
        c0063f.b().listen(kVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V7.b x(int i10) {
        switch (i10) {
            case -1:
            case 0:
                return null;
            case 1:
                return b.a.c.f23097a;
            case 2:
                return b.a.C0845b.f23096a;
            case 3:
                return b.AbstractC0846b.i.f23108a;
            case 4:
                return b.a.C0844a.f23095a;
            case 5:
                return b.AbstractC0846b.a.f23100a;
            case 6:
                return b.AbstractC0846b.C0847b.f23101a;
            case 7:
                return b.a.e.f23099a;
            case 8:
                return b.AbstractC0846b.d.f23103a;
            case 9:
                return b.AbstractC0846b.g.f23106a;
            case 10:
                return b.AbstractC0846b.e.f23104a;
            case 11:
                return b.a.d.f23098a;
            case 12:
                return b.AbstractC0846b.c.f23102a;
            case 13:
                return b.c.C0848b.f23110a;
            case 14:
                return b.c.a.f23109a;
            case 15:
                return b.AbstractC0846b.f.f23105a;
            case 16:
                return b.e.f23116a;
            case 17:
                return b.AbstractC0846b.h.f23107a;
            case 18:
                return b.d.a.f23113a;
            case 19:
            default:
                Z7.b.f(new IllegalArgumentException("Invalid cellular network type " + i10), null, 2, null);
                return null;
            case 20:
                return b.d.C0850b.f23114a;
        }
    }

    private final gg.i y(gg.i iVar) {
        gg.i iVarZ0 = iVar.Z0(b.a.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        return iVarZ0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z z(int i10) {
        z zVarI = z.i(new n(i10));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // Bc.a
    public gg.i a() {
        return this.f1307p;
    }

    @Override // Bc.a
    public gg.i b() {
        return this.f1301j;
    }

    @Override // Bc.a
    public gg.i c() {
        return this.f1303l;
    }

    @Override // Bc.a
    public gg.i d() {
        return this.f1306o;
    }

    @Override // Bc.a
    public gg.i e() {
        return this.f1305n;
    }
}
