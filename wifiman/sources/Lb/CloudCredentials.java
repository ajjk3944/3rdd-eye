package lb;

import Zi.C0;
import Zi.C3704f;
import Zi.C3709h0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import lb.TurnCredentials;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002%'By\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b)\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b.\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010\u001e¨\u00068"}, d2 = {"Llb/b;", "", "", "seen0", "", "accessKeyId", "secretKey", "identityId", "", "roles", "sessionToken", "", "expiration", "region", "Llb/n;", "turnCredentials", "token", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Llb/n;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "h", "(Llb/b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_COMMUNITY, "d", "Ljava/util/List;", "getRoles", "()Ljava/util/List;", "f", "J", "getExpiration", "()J", "g", "Llb/n;", "()Llb/n;", "i", "getToken", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class CloudCredentials {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Vi.b[] f52473j = {null, null, null, new C3704f(W0.f25599a), null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accessKeyId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String identityId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List roles;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long expiration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TurnCredentials turnCredentials;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: lb.b$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52483a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f52483a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.CloudCredentials", aVar, 9);
            h02.p("accessKeyId", false);
            h02.p("secretKey", false);
            h02.p("identityId", false);
            h02.p("roles", true);
            h02.p("sessionToken", false);
            h02.p("expiration", false);
            h02.p("region", false);
            h02.p("turnCredentials", false);
            h02.p("token", true);
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
            Vi.b[] bVarArr = CloudCredentials.f52473j;
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, w02, Wi.a.u(bVarArr[3]), w02, C3709h0.f25636a, w02, TurnCredentials.a.f52515a, Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final CloudCredentials c(Yi.e decoder) {
            int i10;
            String str;
            TurnCredentials turnCredentials;
            List list;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            long j10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = CloudCredentials.f52473j;
            int i11 = 7;
            String strW = null;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                String strW4 = cVarC.w(fVar, 2);
                List list2 = (List) cVarC.h(fVar, 3, bVarArr[3], null);
                String strW5 = cVarC.w(fVar, 4);
                long jQ = cVarC.q(fVar, 5);
                String strW6 = cVarC.w(fVar, 6);
                list = list2;
                str2 = strW2;
                turnCredentials = (TurnCredentials) cVarC.p(fVar, 7, TurnCredentials.a.f52515a, null);
                str6 = strW6;
                str = (String) cVarC.h(fVar, 8, W0.f25599a, null);
                i10 = 511;
                str5 = strW5;
                str4 = strW4;
                str3 = strW3;
                j10 = jQ;
            } else {
                boolean z10 = true;
                int i12 = 0;
                String str7 = null;
                TurnCredentials turnCredentials2 = null;
                List list3 = null;
                String strW7 = null;
                String strW8 = null;
                long jQ2 = 0;
                String strW9 = null;
                String strW10 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z10 = false;
                            i11 = 7;
                        case 0:
                            i12 |= 1;
                            strW = cVarC.w(fVar, 0);
                            i11 = 7;
                        case 1:
                            i12 |= 2;
                            strW9 = cVarC.w(fVar, 1);
                            i11 = 7;
                        case 2:
                            strW10 = cVarC.w(fVar, 2);
                            i12 |= 4;
                            i11 = 7;
                        case 3:
                            list3 = (List) cVarC.h(fVar, 3, bVarArr[3], list3);
                            i12 |= 8;
                            i11 = 7;
                        case 4:
                            strW7 = cVarC.w(fVar, 4);
                            i12 |= 16;
                        case 5:
                            jQ2 = cVarC.q(fVar, 5);
                            i12 |= 32;
                        case 6:
                            strW8 = cVarC.w(fVar, 6);
                            i12 |= 64;
                        case 7:
                            turnCredentials2 = (TurnCredentials) cVarC.p(fVar, i11, TurnCredentials.a.f52515a, turnCredentials2);
                            i12 |= 128;
                        case 8:
                            str7 = (String) cVarC.h(fVar, 8, W0.f25599a, str7);
                            i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i12;
                str = str7;
                turnCredentials = turnCredentials2;
                list = list3;
                str2 = strW;
                str3 = strW9;
                str4 = strW10;
                str5 = strW7;
                str6 = strW8;
                j10 = jQ2;
            }
            cVarC.b(fVar);
            return new CloudCredentials(i10, str2, str3, str4, list, str5, j10, str6, turnCredentials, str, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, CloudCredentials value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            CloudCredentials.h(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: lb.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f52483a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CloudCredentials(int i10, String str, String str2, String str3, List list, String str4, long j10, String str5, TurnCredentials turnCredentials, String str6, R0 r02) {
        if (247 != (i10 & 247)) {
            C0.a(i10, 247, a.f52483a.a());
        }
        this.accessKeyId = str;
        this.secretKey = str2;
        this.identityId = str3;
        if ((i10 & 8) == 0) {
            this.roles = null;
        } else {
            this.roles = list;
        }
        this.sessionToken = str4;
        this.expiration = j10;
        this.region = str5;
        this.turnCredentials = turnCredentials;
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.token = null;
        } else {
            this.token = str6;
        }
    }

    public static final /* synthetic */ void h(CloudCredentials self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f52473j;
        output.y(serialDesc, 0, self.accessKeyId);
        output.y(serialDesc, 1, self.secretKey);
        output.y(serialDesc, 2, self.identityId);
        if (output.o(serialDesc, 3) || self.roles != null) {
            output.t(serialDesc, 3, bVarArr[3], self.roles);
        }
        output.y(serialDesc, 4, self.sessionToken);
        output.p(serialDesc, 5, self.expiration);
        output.y(serialDesc, 6, self.region);
        output.q(serialDesc, 7, TurnCredentials.a.f52515a, self.turnCredentials);
        if (!output.o(serialDesc, 8) && self.token == null) {
            return;
        }
        output.t(serialDesc, 8, W0.f25599a, self.token);
    }

    /* renamed from: b, reason: from getter */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdentityId() {
        return this.identityId;
    }

    /* renamed from: d, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: e, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudCredentials)) {
            return false;
        }
        CloudCredentials cloudCredentials = (CloudCredentials) other;
        return AbstractC6492s.d(this.accessKeyId, cloudCredentials.accessKeyId) && AbstractC6492s.d(this.secretKey, cloudCredentials.secretKey) && AbstractC6492s.d(this.identityId, cloudCredentials.identityId) && AbstractC6492s.d(this.roles, cloudCredentials.roles) && AbstractC6492s.d(this.sessionToken, cloudCredentials.sessionToken) && this.expiration == cloudCredentials.expiration && AbstractC6492s.d(this.region, cloudCredentials.region) && AbstractC6492s.d(this.turnCredentials, cloudCredentials.turnCredentials) && AbstractC6492s.d(this.token, cloudCredentials.token);
    }

    /* renamed from: f, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* renamed from: g, reason: from getter */
    public final TurnCredentials getTurnCredentials() {
        return this.turnCredentials;
    }

    public int hashCode() {
        int iHashCode = ((((this.accessKeyId.hashCode() * 31) + this.secretKey.hashCode()) * 31) + this.identityId.hashCode()) * 31;
        List list = this.roles;
        int iHashCode2 = (((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.sessionToken.hashCode()) * 31) + Long.hashCode(this.expiration)) * 31) + this.region.hashCode()) * 31) + this.turnCredentials.hashCode()) * 31;
        String str = this.token;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CloudCredentials(accessKeyId=" + this.accessKeyId + ", secretKey=" + this.secretKey + ", identityId=" + this.identityId + ", roles=" + this.roles + ", sessionToken=" + this.sessionToken + ", expiration=" + this.expiration + ", region=" + this.region + ", turnCredentials=" + this.turnCredentials + ", token=" + this.token + ")";
    }
}
