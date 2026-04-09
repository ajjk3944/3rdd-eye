package wc;

import Cc.AbstractC2558b;
import a8.C3772b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import xa.InterfaceC8439a;

/* renamed from: wc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8321a {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f64802a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f64803b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64804c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC2293a f64805d;

    /* renamed from: e, reason: collision with root package name */
    private final U7.a f64806e;

    /* renamed from: f, reason: collision with root package name */
    private final String f64807f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC2558b f64808g;

    /* renamed from: h, reason: collision with root package name */
    private final com.ui.wifiman.model.vendor.d f64809h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC8439a.d f64810i;

    /* renamed from: j, reason: collision with root package name */
    private final Long f64811j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f64812k;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f64813l;

    /* renamed from: m, reason: collision with root package name */
    private final List f64814m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f64815n;

    /* renamed from: o, reason: collision with root package name */
    private final long f64816o;

    /* renamed from: p, reason: collision with root package name */
    private final C3772b f64817p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wc.a$a, reason: collision with other inner class name */
    public static final class EnumC2293a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC2293a[] $VALUES;
        public static final EnumC2293a BOOTING = new EnumC2293a("BOOTING", 0);
        public static final EnumC2293a FACTORY = new EnumC2293a("FACTORY", 1);
        public static final EnumC2293a NORMAL = new EnumC2293a("NORMAL", 2);

        private static final /* synthetic */ EnumC2293a[] $values() {
            return new EnumC2293a[]{BOOTING, FACTORY, NORMAL};
        }

        static {
            EnumC2293a[] enumC2293aArr$values = $values();
            $VALUES = enumC2293aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC2293aArr$values);
        }

        private EnumC2293a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC2293a valueOf(String str) {
            return (EnumC2293a) Enum.valueOf(EnumC2293a.class, str);
        }

        public static EnumC2293a[] values() {
            return (EnumC2293a[]) $VALUES.clone();
        }
    }

    public C8321a(C5969a mac, C5969a bluetoothDeviceMac, boolean z10, EnumC2293a status, U7.a aVar, String str, AbstractC2558b abstractC2558b, com.ui.wifiman.model.vendor.d dVar, InterfaceC8439a.d dVar2, Long l10, Set supportedTypes, Integer num, List bleBeacons, boolean z11, long j10) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(bluetoothDeviceMac, "bluetoothDeviceMac");
        AbstractC6492s.i(status, "status");
        AbstractC6492s.i(supportedTypes, "supportedTypes");
        AbstractC6492s.i(bleBeacons, "bleBeacons");
        this.f64802a = mac;
        this.f64803b = bluetoothDeviceMac;
        this.f64804c = z10;
        this.f64805d = status;
        this.f64806e = aVar;
        this.f64807f = str;
        this.f64808g = abstractC2558b;
        this.f64809h = dVar;
        this.f64810i = dVar2;
        this.f64811j = l10;
        this.f64812k = supportedTypes;
        this.f64813l = num;
        this.f64814m = bleBeacons;
        this.f64815n = z11;
        this.f64816o = j10;
        this.f64817p = C3772b.f25747c.b(bluetoothDeviceMac);
    }

    public final Long a() {
        return this.f64811j;
    }

    public final List b() {
        return this.f64814m;
    }

    public final boolean c() {
        return this.f64815n;
    }

    public final C5969a d() {
        return this.f64803b;
    }

    public final boolean e() {
        return this.f64804c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8321a)) {
            return false;
        }
        C8321a c8321a = (C8321a) obj;
        return AbstractC6492s.d(this.f64802a, c8321a.f64802a) && AbstractC6492s.d(this.f64803b, c8321a.f64803b) && this.f64804c == c8321a.f64804c && this.f64805d == c8321a.f64805d && AbstractC6492s.d(this.f64806e, c8321a.f64806e) && AbstractC6492s.d(this.f64807f, c8321a.f64807f) && AbstractC6492s.d(this.f64808g, c8321a.f64808g) && AbstractC6492s.d(this.f64809h, c8321a.f64809h) && AbstractC6492s.d(this.f64810i, c8321a.f64810i) && AbstractC6492s.d(this.f64811j, c8321a.f64811j) && AbstractC6492s.d(this.f64812k, c8321a.f64812k) && AbstractC6492s.d(this.f64813l, c8321a.f64813l) && AbstractC6492s.d(this.f64814m, c8321a.f64814m) && this.f64815n == c8321a.f64815n && this.f64816o == c8321a.f64816o;
    }

    public final C3772b f() {
        return this.f64817p;
    }

    public final long g() {
        return this.f64816o;
    }

    public final C5969a h() {
        return this.f64802a;
    }

    public int hashCode() {
        return this.f64802a.hashCode();
    }

    public final String i() {
        return this.f64807f;
    }

    public final InterfaceC8439a.d j() {
        return this.f64810i;
    }

    public final U7.a k() {
        return this.f64806e;
    }

    public final EnumC2293a l() {
        return this.f64805d;
    }

    public final Set m() {
        return this.f64812k;
    }

    public final AbstractC2558b n() {
        return this.f64808g;
    }

    public final com.ui.wifiman.model.vendor.d o() {
        return this.f64809h;
    }

    public String toString() {
        return "BluetoothDevice(mac=" + this.f64802a + ", bluetoothDeviceMac=" + this.f64803b + ", connected=" + this.f64804c + ", status=" + this.f64805d + ", signal=" + this.f64806e + ", name=" + this.f64807f + ", type=" + this.f64808g + ", vendor=" + this.f64809h + ", product=" + this.f64810i + ", advertisingIntervalMs=" + this.f64811j + ", supportedTypes=" + this.f64812k + ", txPower=" + this.f64813l + ", bleBeacons=" + this.f64814m + ", bleConnectable=" + this.f64815n + ", lastSeenAt=" + this.f64816o + ")";
    }
}
