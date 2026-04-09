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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lmb/i;", "", "", "ongoing", "<init>", "(Ljava/lang/String;IZ)V", "Z", "getOngoing", "()Z", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "ACTIVE", "INACTIVE", "ACTIVATING", "DEACTIVATING", "UNKNOWN", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final boolean ongoing;

    @Vi.m("active")
    public static final i ACTIVE = new i("ACTIVE", 0, false);

    @Vi.m("inactive")
    public static final i INACTIVE = new i("INACTIVE", 1, false);

    @Vi.m("activating")
    public static final i ACTIVATING = new i("ACTIVATING", 2, true);

    @Vi.m("deactivating")
    public static final i DEACTIVATING = new i("DEACTIVATING", 3, true);

    @Vi.m("unknown")
    public static final i UNKNOWN = new i("UNKNOWN", 4, false);

    /* renamed from: mb.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return b.f53797f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Jb.a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f53797f = new b();

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53798a = new a();

            a() {
                super(0, i.class, "values", "values()[Lcom/ui/unifi/core/base/net/models/devices/ControllerState;", 0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i[] invoke() {
                return i.values();
            }
        }

        private b() {
            super(O.b(i.class), a.f53798a, i.UNKNOWN);
        }
    }

    private static final /* synthetic */ i[] $values() {
        return new i[]{ACTIVE, INACTIVE, ACTIVATING, DEACTIVATING, UNKNOWN};
    }

    static {
        i[] iVarArr$values = $values();
        $VALUES = iVarArr$values;
        $ENTRIES = AbstractC5827b.a(iVarArr$values);
        INSTANCE = new Companion(null);
    }

    private i(String str, int i10, boolean z10) {
        this.ongoing = z10;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final boolean getOngoing() {
        return this.ongoing;
    }
}
