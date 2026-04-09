package kb;

import Zi.C0;
import Zi.C3697b0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import aj.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00023\"B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lkb/n;", "Lkb/f;", "", "path", "method", "", "id", "", "Laj/G;", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "seen0", "type", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "i", "(Lkb/n;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "h", SnmpConfigurator.O_COMMUNITY, "g", "d", "I", "getId", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "f", "getType", "setType", "(Ljava/lang/String;)V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kb.n, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class RequestHeader extends f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Vi.b[] f51377g = {null, null, null, new C3697b0(W0.f25599a, H.f26326a), null};

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String path;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String method;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map headers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* renamed from: kb.n$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f51383a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f51383a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.message.RequestHeader", aVar, 5);
            h02.p("path", false);
            h02.p("method", false);
            h02.p("id", false);
            h02.p("headers", false);
            h02.p("type", true);
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
            Vi.b bVarU = Wi.a.u(RequestHeader.f51377g[3]);
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, W.f25597a, bVarU, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final RequestHeader c(Yi.e decoder) {
            int i10;
            int i11;
            String str;
            String str2;
            Map map;
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = RequestHeader.f51377g;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                int i12 = cVarC.i(fVar, 2);
                map = (Map) cVarC.h(fVar, 3, bVarArr[3], null);
                str = strW2;
                strW = cVarC.w(fVar, 4);
                i10 = i12;
                i11 = 31;
                str2 = strW3;
            } else {
                boolean z10 = true;
                int i13 = 0;
                String strW4 = null;
                String strW5 = null;
                Map map2 = null;
                String strW6 = null;
                int i14 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW4 = cVarC.w(fVar, 0);
                        i14 |= 1;
                    } else if (iK == 1) {
                        strW5 = cVarC.w(fVar, 1);
                        i14 |= 2;
                    } else if (iK == 2) {
                        i13 = cVarC.i(fVar, 2);
                        i14 |= 4;
                    } else if (iK == 3) {
                        map2 = (Map) cVarC.h(fVar, 3, bVarArr[3], map2);
                        i14 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        strW6 = cVarC.w(fVar, 4);
                        i14 |= 16;
                    }
                }
                i10 = i13;
                i11 = i14;
                str = strW4;
                str2 = strW5;
                map = map2;
                strW = strW6;
            }
            cVarC.b(fVar);
            return new RequestHeader(i11, str, str2, i10, map, strW, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, RequestHeader value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            RequestHeader.i(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: kb.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f51383a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestHeader(int i10, String str, String str2, int i11, Map map, String str3, R0 r02) {
        super(i10, r02);
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f51383a.a());
        }
        this.path = str;
        this.method = str2;
        this.id = i11;
        this.headers = map;
        if ((i10 & 16) == 0) {
            this.type = "httpRequest";
        } else {
            this.type = str3;
        }
    }

    public static final /* synthetic */ void i(RequestHeader self, Yi.d output, Xi.f serialDesc) {
        f.e(self, output, serialDesc);
        Vi.b[] bVarArr = f51377g;
        output.y(serialDesc, 0, self.path);
        output.y(serialDesc, 1, self.method);
        output.C(serialDesc, 2, self.id);
        output.t(serialDesc, 3, bVarArr[3], self.headers);
        if (!output.o(serialDesc, 4) && AbstractC6492s.d(self.type, "httpRequest")) {
            return;
        }
        output.y(serialDesc, 4, self.type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestHeader)) {
            return false;
        }
        RequestHeader requestHeader = (RequestHeader) other;
        return AbstractC6492s.d(this.path, requestHeader.path) && AbstractC6492s.d(this.method, requestHeader.method) && this.id == requestHeader.id && AbstractC6492s.d(this.headers, requestHeader.headers);
    }

    /* renamed from: g, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: h, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = ((((this.path.hashCode() * 31) + this.method.hashCode()) * 31) + Integer.hashCode(this.id)) * 31;
        Map map = this.headers;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "RequestHeader(path=" + this.path + ", method=" + this.method + ", id=" + this.id + ", headers=" + this.headers + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestHeader(String path, String method, int i10, Map map) {
        super(null);
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        this.path = path;
        this.method = method;
        this.id = i10;
        this.headers = map;
        this.type = "httpRequest";
    }
}
