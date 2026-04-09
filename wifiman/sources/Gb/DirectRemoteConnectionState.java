package gb;

import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0011 B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d¨\u0006$"}, d2 = {"Lgb/d;", "", "", "seen0", "", "supported", "enabled", "LZi/R0;", "serializationConstructorMarker", "<init>", "(IZZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lgb/d;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSupported", "()Z", "getSupported$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getEnabled", "getEnabled$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class DirectRemoteConnectionState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supported;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: gb.d$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47768a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47768a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.DirectRemoteConnectionState", aVar, 2);
            h02.p("supported", true);
            h02.p("enabled", true);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{c3710i, c3710i};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final DirectRemoteConnectionState c(Yi.e decoder) {
            boolean zU;
            boolean zU2;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                zU = cVarC.u(fVar, 0);
                zU2 = cVarC.u(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                zU = false;
                boolean zU3 = false;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        zU = cVarC.u(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        zU3 = cVarC.u(fVar, 1);
                        i11 |= 2;
                    }
                }
                zU2 = zU3;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new DirectRemoteConnectionState(i10, zU, zU2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, DirectRemoteConnectionState value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            DirectRemoteConnectionState.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47768a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DirectRemoteConnectionState(int i10, boolean z10, boolean z11, R0 r02) {
        if ((i10 & 1) == 0) {
            this.supported = false;
        } else {
            this.supported = z10;
        }
        if ((i10 & 2) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z11;
        }
    }

    public static final /* synthetic */ void a(DirectRemoteConnectionState self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.supported) {
            output.i(serialDesc, 0, self.supported);
        }
        if (output.o(serialDesc, 1) || self.enabled) {
            output.i(serialDesc, 1, self.enabled);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectRemoteConnectionState)) {
            return false;
        }
        DirectRemoteConnectionState directRemoteConnectionState = (DirectRemoteConnectionState) other;
        return this.supported == directRemoteConnectionState.supported && this.enabled == directRemoteConnectionState.enabled;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.supported) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "DirectRemoteConnectionState(supported=" + this.supported + ", enabled=" + this.enabled + ")";
    }
}
