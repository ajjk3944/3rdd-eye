package mb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Vi.n(with = b.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lmb/m;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "NOT_READY", "ERROR", "NOT_SETUP", "SETTING_UP", "SETUP", "REBOOTING", "POWERING_OFF", "RESETTING_TO_DEFAULTS", "WILL_UPGRADE", "UPGRADING", "UPDATE_AVAILABLE", "UNKNOWN", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @Vi.m("notReady")
    public static final m NOT_READY = new m("NOT_READY", 0);

    @Vi.m("error")
    public static final m ERROR = new m("ERROR", 1);

    @Vi.m("notSetup")
    public static final m NOT_SETUP = new m("NOT_SETUP", 2);

    @Vi.m("settingUp")
    public static final m SETTING_UP = new m("SETTING_UP", 3);

    @Vi.m("setup")
    public static final m SETUP = new m("SETUP", 4);

    @Vi.m("rebooting")
    public static final m REBOOTING = new m("REBOOTING", 5);

    @Vi.m("poweringOff")
    public static final m POWERING_OFF = new m("POWERING_OFF", 6);

    @Vi.m("resettingToDefaults")
    public static final m RESETTING_TO_DEFAULTS = new m("RESETTING_TO_DEFAULTS", 7);

    @Vi.m("willUpgrade")
    public static final m WILL_UPGRADE = new m("WILL_UPGRADE", 8);

    @Vi.m("upgrading")
    public static final m UPGRADING = new m("UPGRADING", 9);

    @Vi.m("updateAvailable")
    public static final m UPDATE_AVAILABLE = new m("UPDATE_AVAILABLE", 10);

    @Vi.m("unknown")
    public static final m UNKNOWN = new m("UNKNOWN", 11);

    /* renamed from: mb.m$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return b.f53836f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Jb.a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f53836f = new b();

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53837a = new a();

            a() {
                super(0, m.class, "values", "values()[Lcom/ui/unifi/core/base/net/models/devices/DeviceState;", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m[] invoke() {
                return m.values();
            }
        }

        private b() {
            super(O.b(m.class), a.f53837a, m.UNKNOWN);
        }
    }

    private static final /* synthetic */ m[] $values() {
        return new m[]{NOT_READY, ERROR, NOT_SETUP, SETTING_UP, SETUP, REBOOTING, POWERING_OFF, RESETTING_TO_DEFAULTS, WILL_UPGRADE, UPGRADING, UPDATE_AVAILABLE, UNKNOWN};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = AbstractC5827b.a(mVarArr$values);
        INSTANCE = new Companion(null);
    }

    private m(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
