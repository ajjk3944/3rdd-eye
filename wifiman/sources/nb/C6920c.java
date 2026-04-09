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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0015BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lnb/c;", "Lnb/f;", "", "seen0", "seq", "", "candidate", "mid", "mlineIndex", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lnb/c;LYi/d;LXi/f;)V", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "()Ljava/lang/String;", "d", "Ljava/lang/Integer;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/lang/Integer;", "getMlineIndex$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6920c extends C6923f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String candidate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mid;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer mlineIndex;

    /* renamed from: nb.c$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54526a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f54526a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.mqtt.IceCandidateResponse", aVar, 4);
            h02.p("seq", true);
            h02.p("candidate", false);
            h02.p("mid", true);
            h02.p("mline_index", true);
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
            W w10 = W.f25597a;
            Vi.b bVarU = Wi.a.u(w10);
            W0 w02 = W0.f25599a;
            return new Vi.b[]{bVarU, w02, Wi.a.u(w02), Wi.a.u(w10)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C6920c c(Yi.e decoder) {
            int i10;
            Integer num;
            String str;
            String str2;
            Integer num2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Integer num3 = null;
            if (cVarC.B()) {
                W w10 = W.f25597a;
                Integer num4 = (Integer) cVarC.h(fVar, 0, w10, null);
                String strW = cVarC.w(fVar, 1);
                String str3 = (String) cVarC.h(fVar, 2, W0.f25599a, null);
                num2 = (Integer) cVarC.h(fVar, 3, w10, null);
                i10 = 15;
                str2 = str3;
                str = strW;
                num = num4;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strW2 = null;
                String str4 = null;
                Integer num5 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        num3 = (Integer) cVarC.h(fVar, 0, W.f25597a, num3);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW2 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        str4 = (String) cVarC.h(fVar, 2, W0.f25599a, str4);
                        i11 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        num5 = (Integer) cVarC.h(fVar, 3, W.f25597a, num5);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                num = num3;
                str = strW2;
                str2 = str4;
                num2 = num5;
            }
            cVarC.b(fVar);
            return new C6920c(i10, num, str, str2, num2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C6920c value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C6920c.f(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: nb.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f54526a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6920c(int i10, Integer num, String str, String str2, Integer num2, R0 r02) {
        super(i10, num, r02);
        if (2 != (i10 & 2)) {
            C0.a(i10, 2, a.f54526a.a());
        }
        this.candidate = str;
        if ((i10 & 4) == 0) {
            this.mid = null;
        } else {
            this.mid = str2;
        }
        if ((i10 & 8) == 0) {
            this.mlineIndex = null;
        } else {
            this.mlineIndex = num2;
        }
    }

    public static final /* synthetic */ void f(C6920c self, Yi.d output, Xi.f serialDesc) {
        C6923f.b(self, output, serialDesc);
        output.y(serialDesc, 1, self.candidate);
        if (output.o(serialDesc, 2) || self.mid != null) {
            output.t(serialDesc, 2, W0.f25599a, self.mid);
        }
        if (!output.o(serialDesc, 3) && self.mlineIndex == null) {
            return;
        }
        output.t(serialDesc, 3, W.f25597a, self.mlineIndex);
    }

    /* renamed from: c, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* renamed from: d, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getMlineIndex() {
        return this.mlineIndex;
    }
}
