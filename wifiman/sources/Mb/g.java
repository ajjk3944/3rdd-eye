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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lmb/g;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "INSTALL_PENDING", "INSTALLING", "INSTALLED", "UNINSTALL_PENDING", "UNINSTALLING", "UNINSTALLED", "UPDATE_PENDING", "UPDATING", "UPDATE_FAILED", "START_PENDING", "STARTING", "STOP_PENDING", "STOPPING", "DOWNLOADED", "UNKNOWN", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @Vi.m("installPending")
    public static final g INSTALL_PENDING = new g("INSTALL_PENDING", 0);

    @Vi.m("installing")
    public static final g INSTALLING = new g("INSTALLING", 1);

    @Vi.m("installed")
    public static final g INSTALLED = new g("INSTALLED", 2);

    @Vi.m("uninstallPending")
    public static final g UNINSTALL_PENDING = new g("UNINSTALL_PENDING", 3);

    @Vi.m("uninstalling")
    public static final g UNINSTALLING = new g("UNINSTALLING", 4);

    @Vi.m("uninstalled")
    public static final g UNINSTALLED = new g("UNINSTALLED", 5);

    @Vi.m("updatePending")
    public static final g UPDATE_PENDING = new g("UPDATE_PENDING", 6);

    @Vi.m("updating")
    public static final g UPDATING = new g("UPDATING", 7);

    @Vi.m("updateFailed")
    public static final g UPDATE_FAILED = new g("UPDATE_FAILED", 8);

    @Vi.m("startPending")
    public static final g START_PENDING = new g("START_PENDING", 9);

    @Vi.m("starting")
    public static final g STARTING = new g("STARTING", 10);

    @Vi.m("stopPending")
    public static final g STOP_PENDING = new g("STOP_PENDING", 11);

    @Vi.m("stopping")
    public static final g STOPPING = new g("STOPPING", 12);

    @Vi.m("downloaded")
    public static final g DOWNLOADED = new g("DOWNLOADED", 13);

    @Vi.m("unknown")
    public static final g UNKNOWN = new g("UNKNOWN", 14);

    /* renamed from: mb.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return b.f53790f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Jb.a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f53790f = new b();

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53791a = new a();

            a() {
                super(0, g.class, "values", "values()[Lcom/ui/unifi/core/base/net/models/devices/ControllerInstallState;", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g[] invoke() {
                return g.values();
            }
        }

        private b() {
            super(O.b(g.class), a.f53791a, g.UNKNOWN);
        }
    }

    private static final /* synthetic */ g[] $values() {
        return new g[]{INSTALL_PENDING, INSTALLING, INSTALLED, UNINSTALL_PENDING, UNINSTALLING, UNINSTALLED, UPDATE_PENDING, UPDATING, UPDATE_FAILED, START_PENDING, STARTING, STOP_PENDING, STOPPING, DOWNLOADED, UNKNOWN};
    }

    static {
        g[] gVarArr$values = $values();
        $VALUES = gVarArr$values;
        $ENTRIES = AbstractC5827b.a(gVarArr$values);
        INSTANCE = new Companion(null);
    }

    private g(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
