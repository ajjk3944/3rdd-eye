package Gb;

import Vi.n;
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

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001c\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006 "}, d2 = {"LGb/b;", "", "", "macAddress", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(LGb/b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Companion", "storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gb.b, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class LocalLoginToken {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String macAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: Gb.b$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7267a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f7267a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.storage.LocalLoginToken", aVar, 2);
            h02.p("macAddress", false);
            h02.p("token", false);
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
            return new Vi.b[]{w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final LocalLoginToken c(Yi.e decoder) {
            String strW;
            String strW2;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
                strW2 = cVarC.w(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strW = null;
                String strW3 = null;
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
                        strW3 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    }
                }
                strW2 = strW3;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new LocalLoginToken(i10, strW, strW2, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, LocalLoginToken value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            LocalLoginToken.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Gb.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f7267a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LocalLoginToken(int i10, String str, String str2, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, a.f7267a.a());
        }
        this.macAddress = str;
        this.token = str2;
    }

    public static final /* synthetic */ void c(LocalLoginToken self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.macAddress);
        output.y(serialDesc, 1, self.token);
    }

    /* renamed from: a, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    /* renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalLoginToken)) {
            return false;
        }
        LocalLoginToken localLoginToken = (LocalLoginToken) other;
        return AbstractC6492s.d(this.macAddress, localLoginToken.macAddress) && AbstractC6492s.d(this.token, localLoginToken.token);
    }

    public int hashCode() {
        return (this.macAddress.hashCode() * 31) + this.token.hashCode();
    }

    public String toString() {
        return "LocalLoginToken(macAddress=" + this.macAddress + ", token=" + this.token + ")";
    }

    public LocalLoginToken(String macAddress, String token) {
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(token, "token");
        this.macAddress = macAddress;
        this.token = token;
    }
}
