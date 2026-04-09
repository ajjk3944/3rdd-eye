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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lmb/v;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "ENABLED", "DISABLED", "UNSUPPORTED", "UNKNOWN", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @Vi.m("ENABLED")
    public static final v ENABLED = new v("ENABLED", 0);

    @Vi.m("DISABLED")
    public static final v DISABLED = new v("DISABLED", 1);

    @Vi.m("UNSUPPORTED")
    public static final v UNSUPPORTED = new v("UNSUPPORTED", 2);

    @Vi.m("UNKNOWN")
    public static final v UNKNOWN = new v("UNKNOWN", 3);

    /* renamed from: mb.v$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return b.f53931f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Jb.a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f53931f = new b();

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53932a = new a();

            a() {
                super(0, v.class, "values", "values()[Lcom/ui/unifi/core/base/net/models/devices/TeleportState;", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v[] invoke() {
                return v.values();
            }
        }

        private b() {
            super(O.b(v.class), a.f53932a, v.UNKNOWN);
        }
    }

    private static final /* synthetic */ v[] $values() {
        return new v[]{ENABLED, DISABLED, UNSUPPORTED, UNKNOWN};
    }

    static {
        v[] vVarArr$values = $values();
        $VALUES = vVarArr$values;
        $ENTRIES = AbstractC5827b.a(vVarArr$values);
        INSTANCE = new Companion(null);
    }

    private v(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
