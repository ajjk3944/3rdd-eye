package lb;

import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0012\u001fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Llb/d;", "", "", "withTurn", "generateToken", "<init>", "(ZZ)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(IZZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Llb/d;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWithTurn", "()Z", SnmpConfigurator.O_BIND_ADDRESS, "getGenerateToken", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.d, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class CreateCredentials {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean withTurn;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean generateToken;

    /* renamed from: lb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f52489a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateCredentials(int i10, boolean z10, boolean z11, R0 r02) {
        if ((i10 & 1) == 0) {
            this.withTurn = true;
        } else {
            this.withTurn = z10;
        }
        if ((i10 & 2) == 0) {
            this.generateToken = true;
        } else {
            this.generateToken = z11;
        }
    }

    public static final /* synthetic */ void a(CreateCredentials self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || !self.withTurn) {
            output.i(serialDesc, 0, self.withTurn);
        }
        if (!output.o(serialDesc, 1) && self.generateToken) {
            return;
        }
        output.i(serialDesc, 1, self.generateToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCredentials)) {
            return false;
        }
        CreateCredentials createCredentials = (CreateCredentials) other;
        return this.withTurn == createCredentials.withTurn && this.generateToken == createCredentials.generateToken;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.withTurn) * 31) + Boolean.hashCode(this.generateToken);
    }

    public String toString() {
        return "CreateCredentials(withTurn=" + this.withTurn + ", generateToken=" + this.generateToken + ")";
    }

    public CreateCredentials(boolean z10, boolean z11) {
        this.withTurn = z10;
        this.generateToken = z11;
    }
}
