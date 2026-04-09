package mb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.C6785A;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0014\u0012B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmb/z;", "", "", "seen0", "", "deviceId", "Lmb/A;", "state", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmb/A;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lmb/z;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "Lmb/A;", "()Lmb/A;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C6785A state;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53946a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53946a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UcoreShadow", aVar, 2);
            h02.p("deviceId", false);
            h02.p("state", false);
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
            return new Vi.b[]{W0.f25599a, C6785A.a.f53675a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final z c(Yi.e decoder) {
            String strW;
            C6785A c6785a;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
                c6785a = (C6785A) cVarC.p(fVar, 1, C6785A.a.f53675a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strW = null;
                C6785A c6785a2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        c6785a2 = (C6785A) cVarC.p(fVar, 1, C6785A.a.f53675a, c6785a2);
                        i11 |= 2;
                    }
                }
                c6785a = c6785a2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new z(i10, strW, c6785a, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, z value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            z.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.z$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53946a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ z(int i10, String str, C6785A c6785a, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, a.f53946a.a());
        }
        this.deviceId = str;
        this.state = c6785a;
    }

    public static final /* synthetic */ void b(z self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.deviceId);
        output.q(serialDesc, 1, C6785A.a.f53675a, self.state);
    }

    /* renamed from: a, reason: from getter */
    public final C6785A getState() {
        return this.state;
    }
}
