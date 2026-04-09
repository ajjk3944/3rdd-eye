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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lmb/j;", "", "", "controllerName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getControllerName", "()Ljava/lang/String;", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "PROTECT", "NETWORK", "ACCESS", "TALK", "LED", "CONNECT", "APOLLO", "USERS", "SETTINGS", "UNKNOWN", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String controllerName;

    @Vi.m("protect")
    public static final j PROTECT = new j("PROTECT", 0, "protect");

    @Vi.m("network")
    public static final j NETWORK = new j("NETWORK", 1, "network");

    @Vi.m("access")
    public static final j ACCESS = new j("ACCESS", 2, "access");

    @Vi.m("talk")
    public static final j TALK = new j("TALK", 3, "talk");

    @Vi.m("led")
    public static final j LED = new j("LED", 4, "led");

    @Vi.m("connect")
    public static final j CONNECT = new j("CONNECT", 5, "connect");

    @Vi.m("apollo")
    public static final j APOLLO = new j("APOLLO", 6, "apollo");

    @Vi.m("users")
    public static final j USERS = new j("USERS", 7, "users");

    @Vi.m("settings")
    public static final j SETTINGS = new j("SETTINGS", 8, "settings");

    @Vi.m("unknown")
    public static final j UNKNOWN = new j("UNKNOWN", 9, "unknown");

    /* renamed from: mb.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return b.f53799f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Jb.a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f53799f = new b();

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53800a = new a();

            a() {
                super(0, j.class, "values", "values()[Lcom/ui/unifi/core/base/net/models/devices/ControllerType;", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j[] invoke() {
                return j.values();
            }
        }

        private b() {
            super(O.b(j.class), a.f53800a, j.UNKNOWN);
        }
    }

    private static final /* synthetic */ j[] $values() {
        return new j[]{PROTECT, NETWORK, ACCESS, TALK, LED, CONNECT, APOLLO, USERS, SETTINGS, UNKNOWN};
    }

    static {
        j[] jVarArr$values = $values();
        $VALUES = jVarArr$values;
        $ENTRIES = AbstractC5827b.a(jVarArr$values);
        INSTANCE = new Companion(null);
    }

    private j(String str, int i10, String str2) {
        this.controllerName = str2;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String getControllerName() {
        return this.controllerName;
    }
}
