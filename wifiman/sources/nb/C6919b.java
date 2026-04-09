package nb;

import Vi.n;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002\u0019\u001dBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006)"}, d2 = {"Lnb/b;", "Lnb/e;", "", "candidate", "mid", "", "mlineIndex", "client", "clientVersion", "os", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lnb/b;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getCandidate", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getMid", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Integer;", "getMlineIndex", "()Ljava/lang/Integer;", "getMlineIndex$annotations", "()V", "d", "f", "g", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6919b extends AbstractC6922e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String candidate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String mid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer mlineIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String client;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String clientVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String os;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String event;

    /* renamed from: nb.b$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54522a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f54522a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.mqtt.CandidateRequest", aVar, 7);
            h02.p("candidate", false);
            h02.p("mid", true);
            h02.p("mline_index", true);
            h02.p("client", false);
            h02.p("clientVersion", false);
            h02.p("os", false);
            h02.p("event", true);
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
            return new Vi.b[]{w02, Wi.a.u(w02), Wi.a.u(W.f25597a), w02, w02, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C6919b c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            Integer num;
            String str3;
            String str4;
            String str5;
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String strW2 = null;
            if (cVarC.B()) {
                String strW3 = cVarC.w(fVar, 0);
                String str6 = (String) cVarC.h(fVar, 1, W0.f25599a, null);
                Integer num2 = (Integer) cVarC.h(fVar, 2, W.f25597a, null);
                String strW4 = cVarC.w(fVar, 3);
                String strW5 = cVarC.w(fVar, 4);
                String strW6 = cVarC.w(fVar, 5);
                str = strW3;
                strW = cVarC.w(fVar, 6);
                str5 = strW6;
                str3 = strW4;
                str4 = strW5;
                num = num2;
                str2 = str6;
                i10 = 127;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str7 = null;
                Integer num3 = null;
                String strW7 = null;
                String strW8 = null;
                String strW9 = null;
                String strW10 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            strW2 = cVarC.w(fVar, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            str7 = (String) cVarC.h(fVar, 1, W0.f25599a, str7);
                            i11 |= 2;
                            break;
                        case 2:
                            num3 = (Integer) cVarC.h(fVar, 2, W.f25597a, num3);
                            i11 |= 4;
                            break;
                        case 3:
                            strW7 = cVarC.w(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            strW8 = cVarC.w(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            strW9 = cVarC.w(fVar, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            strW10 = cVarC.w(fVar, 6);
                            i11 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i11;
                str = strW2;
                str2 = str7;
                num = num3;
                str3 = strW7;
                str4 = strW8;
                str5 = strW9;
                strW = strW10;
            }
            cVarC.b(fVar);
            return new C6919b(i10, str, str2, num, str3, str4, str5, strW, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C6919b value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C6919b.e(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: nb.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f54522a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C6919b(int i10, String str, String str2, Integer num, String str3, String str4, String str5, String str6, R0 r02) {
        if (57 != (i10 & 57)) {
            C0.a(i10, 57, a.f54522a.a());
        }
        this.candidate = str;
        if ((i10 & 2) == 0) {
            this.mid = null;
        } else {
            this.mid = str2;
        }
        if ((i10 & 4) == 0) {
            this.mlineIndex = null;
        } else {
            this.mlineIndex = num;
        }
        this.client = str3;
        this.clientVersion = str4;
        this.os = str5;
        if ((i10 & 64) == 0) {
            this.event = "icecandidate";
        } else {
            this.event = str6;
        }
    }

    public static final /* synthetic */ void e(C6919b self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.candidate);
        if (output.o(serialDesc, 1) || self.mid != null) {
            output.t(serialDesc, 1, W0.f25599a, self.mid);
        }
        if (output.o(serialDesc, 2) || self.mlineIndex != null) {
            output.t(serialDesc, 2, W.f25597a, self.mlineIndex);
        }
        output.y(serialDesc, 3, self.getClient());
        output.y(serialDesc, 4, self.getClientVersion());
        output.y(serialDesc, 5, self.getOs());
        if (!output.o(serialDesc, 6) && AbstractC6492s.d(self.getEvent(), "icecandidate")) {
            return;
        }
        output.y(serialDesc, 6, self.getEvent());
    }

    /* renamed from: a, reason: from getter */
    public String getClient() {
        return this.client;
    }

    /* renamed from: b, reason: from getter */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /* renamed from: c, reason: from getter */
    public String getEvent() {
        return this.event;
    }

    /* renamed from: d, reason: from getter */
    public String getOs() {
        return this.os;
    }

    public /* synthetic */ C6919b(String str, String str2, Integer num, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, str3, str4, str5, (i10 & 64) != 0 ? "icecandidate" : str6);
    }

    public C6919b(String candidate, String str, Integer num, String client, String clientVersion, String os, String event) {
        AbstractC6492s.i(candidate, "candidate");
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(clientVersion, "clientVersion");
        AbstractC6492s.i(os, "os");
        AbstractC6492s.i(event, "event");
        this.candidate = candidate;
        this.mid = str;
        this.mlineIndex = num;
        this.client = client;
        this.clientVersion = clientVersion;
        this.os = os;
        this.event = event;
    }
}
