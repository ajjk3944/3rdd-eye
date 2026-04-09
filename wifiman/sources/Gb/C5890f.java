package gb;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\u0018B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lgb/f;", "", "", "seen0", "", "ssoUuid", "uniqueId", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lgb/f;LYi/d;LXi/f;)V", "Ljava/lang/String;", "getSsoUuid", "()Ljava/lang/String;", "getSsoUuid$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getUniqueId", "getUniqueId$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5890f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String ssoUuid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String uniqueId;

    /* renamed from: gb.f$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47777a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47777a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.Owner", aVar, 2);
            h02.p("sso_uuid", true);
            h02.p("unique_id", true);
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
            W0 w02 = W0.f25599a;
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C5890f c(Yi.e decoder) {
            String str;
            int i10;
            String str2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                str2 = (String) cVarC.h(fVar, 0, w02, null);
                str = (String) cVarC.h(fVar, 1, w02, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                String str3 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str3 = (String) cVarC.h(fVar, 0, W0.f25599a, str3);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        str = (String) cVarC.h(fVar, 1, W0.f25599a, str);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                str2 = str3;
            }
            cVarC.b(fVar);
            return new C5890f(i10, str2, str, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C5890f value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C5890f.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47777a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C5890f(int i10, String str, String str2, R0 r02) {
        if ((i10 & 1) == 0) {
            this.ssoUuid = null;
        } else {
            this.ssoUuid = str;
        }
        if ((i10 & 2) == 0) {
            this.uniqueId = null;
        } else {
            this.uniqueId = str2;
        }
    }

    public static final /* synthetic */ void a(C5890f self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.ssoUuid != null) {
            output.t(serialDesc, 0, W0.f25599a, self.ssoUuid);
        }
        if (!output.o(serialDesc, 1) && self.uniqueId == null) {
            return;
        }
        output.t(serialDesc, 1, W0.f25599a, self.uniqueId);
    }
}
