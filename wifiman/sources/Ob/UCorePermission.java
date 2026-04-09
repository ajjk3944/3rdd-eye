package ob;

import Vi.n;
import Xi.f;
import Yi.c;
import Yi.d;
import Yi.e;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lob/a;", "", "", "hasUpdateAndInstallPermission", "<init>", "(Z)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(IZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lob/a;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasUpdateAndInstallPermission", "()Z", "Companion", SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ob.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class UCorePermission {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUpdateAndInstallPermission;

    /* renamed from: ob.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2010a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final C2010a f55604a;
        private static final f descriptor;

        static {
            C2010a c2010a = new C2010a();
            f55604a = c2010a;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.user.UCorePermission", c2010a, 1);
            h02.p("hasUpdateAndInstallPermission", true);
            descriptor = h02;
        }

        private C2010a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            return new Vi.b[]{C3710i.f25639a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UCorePermission c(e decoder) {
            boolean zU;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            int i10 = 1;
            if (cVarC.B()) {
                zU = cVarC.u(fVar, 0);
            } else {
                boolean z10 = true;
                zU = false;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        zU = cVarC.u(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new UCorePermission(i10, zU, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UCorePermission value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            UCorePermission.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: ob.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return C2010a.f55604a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UCorePermission(int i10, boolean z10, R0 r02) {
        if ((i10 & 1) == 0) {
            this.hasUpdateAndInstallPermission = false;
        } else {
            this.hasUpdateAndInstallPermission = z10;
        }
    }

    public static final /* synthetic */ void a(UCorePermission self, d output, f serialDesc) {
        if (output.o(serialDesc, 0) || self.hasUpdateAndInstallPermission) {
            output.i(serialDesc, 0, self.hasUpdateAndInstallPermission);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UCorePermission) && this.hasUpdateAndInstallPermission == ((UCorePermission) other).hasUpdateAndInstallPermission;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasUpdateAndInstallPermission);
    }

    public String toString() {
        return "UCorePermission(hasUpdateAndInstallPermission=" + this.hasUpdateAndInstallPermission + ")";
    }

    public UCorePermission(boolean z10) {
        this.hasUpdateAndInstallPermission = z10;
    }

    public /* synthetic */ UCorePermission(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
