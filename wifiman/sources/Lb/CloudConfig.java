package lb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import lb.UnifiCloudAccess;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001b\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Llb/a;", "", "", "seen0", "Llb/o;", "unifiCloudAccess", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILlb/o;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Llb/a;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Llb/o;", "()Llb/o;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class CloudConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UnifiCloudAccess unifiCloudAccess;

    /* renamed from: lb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1938a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final C1938a f52472a;
        private static final Xi.f descriptor;

        static {
            C1938a c1938a = new C1938a();
            f52472a = c1938a;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.CloudConfig", c1938a, 1);
            h02.p("unifiCloudAccess", false);
            descriptor = h02;
        }

        private C1938a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            return new Vi.b[]{UnifiCloudAccess.a.f52521a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final CloudConfig c(Yi.e decoder) {
            UnifiCloudAccess unifiCloudAccess;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                unifiCloudAccess = (UnifiCloudAccess) cVarC.p(fVar, 0, UnifiCloudAccess.a.f52521a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                unifiCloudAccess = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        unifiCloudAccess = (UnifiCloudAccess) cVarC.p(fVar, 0, UnifiCloudAccess.a.f52521a, unifiCloudAccess);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new CloudConfig(i10, unifiCloudAccess, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, CloudConfig value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            CloudConfig.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: lb.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return C1938a.f52472a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CloudConfig(int i10, UnifiCloudAccess unifiCloudAccess, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, C1938a.f52472a.a());
        }
        this.unifiCloudAccess = unifiCloudAccess;
    }

    public static final /* synthetic */ void b(CloudConfig self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, UnifiCloudAccess.a.f52521a, self.unifiCloudAccess);
    }

    /* renamed from: a, reason: from getter */
    public final UnifiCloudAccess getUnifiCloudAccess() {
        return this.unifiCloudAccess;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloudConfig) && AbstractC6492s.d(this.unifiCloudAccess, ((CloudConfig) other).unifiCloudAccess);
    }

    public int hashCode() {
        return this.unifiCloudAccess.hashCode();
    }

    public String toString() {
        return "CloudConfig(unifiCloudAccess=" + this.unifiCloudAccess + ")";
    }
}
