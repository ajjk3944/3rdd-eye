package ob;

import Vi.n;
import Xi.f;
import Yi.d;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob.UCorePermission;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0010\u001fB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lob/b;", "", "", "seen0", "Lob/a;", "ucorePermission", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILob/a;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lob/b;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lob/a;", "getUcorePermission", "()Lob/a;", "Companion", SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ob.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class User {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UCorePermission ucorePermission;

    /* renamed from: ob.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f55606a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ User(int i10, UCorePermission c7114a, R0 r02) {
        int i11 = 1;
        if ((i10 & 1) == 0) {
            this.ucorePermission = new UCorePermission(false, i11, (DefaultConstructorMarker) null);
        } else {
            this.ucorePermission = c7114a;
        }
    }

    public static final /* synthetic */ void a(User self, d output, f serialDesc) {
        boolean z10 = false;
        if (!output.o(serialDesc, 0) && AbstractC6492s.d(self.ucorePermission, new UCorePermission(z10, 1, (DefaultConstructorMarker) null))) {
            return;
        }
        output.q(serialDesc, 0, UCorePermission.C2010a.f55604a, self.ucorePermission);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof User) && AbstractC6492s.d(this.ucorePermission, ((User) other).ucorePermission);
    }

    public int hashCode() {
        return this.ucorePermission.hashCode();
    }

    public String toString() {
        return "User(ucorePermission=" + this.ucorePermission + ")";
    }
}
