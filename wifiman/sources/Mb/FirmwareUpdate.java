package mb;

import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001a\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001d"}, d2 = {"Lmb/o;", "", "", "seen0", "", "latestAvailableVersion", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lmb/o;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.o, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class FirmwareUpdate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String latestAvailableVersion;

    /* renamed from: mb.o$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53853a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53853a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.FirmwareUpdate", aVar, 1);
            h02.p("latestAvailableVersion", true);
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
            return new Vi.b[]{Wi.a.u(W0.f25599a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final FirmwareUpdate c(Yi.e decoder) {
            String str;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                str = (String) cVarC.h(fVar, 0, W0.f25599a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        str = (String) cVarC.h(fVar, 0, W0.f25599a, str);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new FirmwareUpdate(i10, str, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, FirmwareUpdate value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            FirmwareUpdate.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.o$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53853a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FirmwareUpdate(int i10, String str, R0 r02) {
        if ((i10 & 1) == 0) {
            this.latestAvailableVersion = null;
        } else {
            this.latestAvailableVersion = str;
        }
    }

    public static final /* synthetic */ void b(FirmwareUpdate self, Yi.d output, Xi.f serialDesc) {
        if (!output.o(serialDesc, 0) && self.latestAvailableVersion == null) {
            return;
        }
        output.t(serialDesc, 0, W0.f25599a, self.latestAvailableVersion);
    }

    /* renamed from: a, reason: from getter */
    public final String getLatestAvailableVersion() {
        return this.latestAvailableVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FirmwareUpdate) && AbstractC6492s.d(this.latestAvailableVersion, ((FirmwareUpdate) other).latestAvailableVersion);
    }

    public int hashCode() {
        String str = this.latestAvailableVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirmwareUpdate(latestAvailableVersion=" + this.latestAvailableVersion + ")";
    }
}
