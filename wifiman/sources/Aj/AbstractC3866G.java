package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n(with = H.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Laj/G;", "Laj/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "content", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "Laj/x;", "Laj/B;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aj.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3866G extends j {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: aj.G$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return H.f26326a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AbstractC3866G(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String b();

    public String toString() {
        return b();
    }

    private AbstractC3866G() {
        super(null);
    }
}
