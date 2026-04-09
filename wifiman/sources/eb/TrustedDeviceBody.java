package Eb;

import Zi.C0;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"LEb/t;", "", "", "deviceId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(LEb/t;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "getDeviceId$annotations", "()V", "Companion", SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.t, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TrustedDeviceBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: Eb.t$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4514a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4514a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.TrustedDeviceBody", aVar, 1);
            h02.p("device_id", false);
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
            return new Vi.b[]{W0.f25599a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final TrustedDeviceBody c(Yi.e decoder) {
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                strW = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        strW = cVarC.w(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new TrustedDeviceBody(i10, strW, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TrustedDeviceBody value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TrustedDeviceBody.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.t$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4514a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TrustedDeviceBody(int i10, String str, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f4514a.a());
        }
        this.deviceId = str;
    }

    public static final /* synthetic */ void a(TrustedDeviceBody self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.deviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TrustedDeviceBody) && AbstractC6492s.d(this.deviceId, ((TrustedDeviceBody) other).deviceId);
    }

    public int hashCode() {
        return this.deviceId.hashCode();
    }

    public String toString() {
        return "TrustedDeviceBody(deviceId=" + this.deviceId + ")";
    }

    public TrustedDeviceBody(String deviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }
}
