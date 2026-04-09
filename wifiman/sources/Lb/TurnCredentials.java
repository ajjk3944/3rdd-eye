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
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002 $BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b$\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b'\u0010#¨\u0006,"}, d2 = {"Llb/n;", "", "", "seen0", "", "", "uris", "username", "password", "", "ttl", "turnUris", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Llb/n;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "getUris", "()Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "d", SnmpConfigurator.O_COMMUNITY, "J", "getTtl", "()J", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.n, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TurnCredentials {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Vi.b[] f52509f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List uris;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String username;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ttl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List turnUris;

    /* renamed from: lb.n$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52515a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f52515a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.TurnCredentials", aVar, 5);
            h02.p("uris", false);
            h02.p("username", false);
            h02.p("password", false);
            h02.p("ttl", false);
            h02.p("turnUris", true);
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
            Vi.b[] bVarArr = TurnCredentials.f52509f;
            Vi.b bVar = bVarArr[0];
            Vi.b bVar2 = bVarArr[4];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{bVar, w02, w02, C3709h0.f25636a, bVar2};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final TurnCredentials c(Yi.e decoder) {
            int i10;
            List list;
            String str;
            String str2;
            List list2;
            long j10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = TurnCredentials.f52509f;
            int i11 = 3;
            List list3 = null;
            if (cVarC.B()) {
                List list4 = (List) cVarC.p(fVar, 0, bVarArr[0], null);
                String strW = cVarC.w(fVar, 1);
                String strW2 = cVarC.w(fVar, 2);
                long jQ = cVarC.q(fVar, 3);
                list2 = (List) cVarC.p(fVar, 4, bVarArr[4], null);
                list = list4;
                i10 = 31;
                str2 = strW2;
                str = strW;
                j10 = jQ;
            } else {
                boolean z10 = true;
                int i12 = 0;
                List list5 = null;
                long jQ2 = 0;
                String strW3 = null;
                String strW4 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        list3 = (List) cVarC.p(fVar, 0, bVarArr[0], list3);
                        i12 |= 1;
                        i11 = 3;
                    } else if (iK == 1) {
                        strW3 = cVarC.w(fVar, 1);
                        i12 |= 2;
                    } else if (iK == 2) {
                        strW4 = cVarC.w(fVar, 2);
                        i12 |= 4;
                    } else if (iK == i11) {
                        jQ2 = cVarC.q(fVar, i11);
                        i12 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        list5 = (List) cVarC.p(fVar, 4, bVarArr[4], list5);
                        i12 |= 16;
                    }
                }
                i10 = i12;
                list = list3;
                str = strW3;
                str2 = strW4;
                list2 = list5;
                j10 = jQ2;
            }
            cVarC.b(fVar);
            return new TurnCredentials(i10, list, str, str2, j10, list2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TurnCredentials value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TurnCredentials.e(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: lb.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f52515a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        W0 w02 = W0.f25599a;
        f52509f = new Vi.b[]{new C3704f(w02), null, null, null, new C3704f(w02)};
    }

    public /* synthetic */ TurnCredentials(int i10, List list, String str, String str2, long j10, List list2, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f52515a.a());
        }
        this.uris = list;
        this.username = str;
        this.password = str2;
        this.ttl = j10;
        if ((i10 & 16) == 0) {
            this.turnUris = list;
        } else {
            this.turnUris = list2;
        }
    }

    public static final /* synthetic */ void e(TurnCredentials self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f52509f;
        output.q(serialDesc, 0, bVarArr[0], self.uris);
        output.y(serialDesc, 1, self.username);
        output.y(serialDesc, 2, self.password);
        output.p(serialDesc, 3, self.ttl);
        if (!output.o(serialDesc, 4) && AbstractC6492s.d(self.turnUris, self.uris)) {
            return;
        }
        output.q(serialDesc, 4, bVarArr[4], self.turnUris);
    }

    /* renamed from: b, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: c, reason: from getter */
    public final List getTurnUris() {
        return this.turnUris;
    }

    /* renamed from: d, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnCredentials)) {
            return false;
        }
        TurnCredentials turnCredentials = (TurnCredentials) other;
        return AbstractC6492s.d(this.uris, turnCredentials.uris) && AbstractC6492s.d(this.username, turnCredentials.username) && AbstractC6492s.d(this.password, turnCredentials.password) && this.ttl == turnCredentials.ttl;
    }

    public int hashCode() {
        return (((((this.uris.hashCode() * 31) + this.username.hashCode()) * 31) + this.password.hashCode()) * 31) + Long.hashCode(this.ttl);
    }

    public String toString() {
        return "TurnCredentials(uris=" + this.uris + ", username=" + this.username + ", password=" + this.password + ", ttl=" + this.ttl + ")";
    }
}
