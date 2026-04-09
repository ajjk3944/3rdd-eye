package kb;

import Zi.R0;
import Zi.W;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002 #BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkb/u;", "Lkb/q;", "", "seen0", "", "type", "statusCode", "id", "action", "Lkb/g;", "headers", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkb/g;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lkb/u;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getType", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "getAction", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lkb/g;", "getHeaders", "()Lkb/g;", "getHeaders$annotations", "()V", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kb.u, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SimpleResponseHeader implements q {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String action;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final g headers;

    /* renamed from: kb.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f51394a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SimpleResponseHeader(int i10, String str, Integer num, String str2, String str3, g gVar, R0 r02) {
        if ((i10 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i10 & 2) == 0) {
            this.statusCode = null;
        } else {
            this.statusCode = num;
        }
        if ((i10 & 4) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i10 & 8) == 0) {
            this.action = null;
        } else {
            this.action = str3;
        }
        if ((i10 & 16) == 0) {
            this.headers = null;
        } else {
            this.headers = gVar;
        }
    }

    public static final /* synthetic */ void c(SimpleResponseHeader self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.type != null) {
            output.t(serialDesc, 0, W0.f25599a, self.type);
        }
        if (output.o(serialDesc, 1) || self.statusCode != null) {
            output.t(serialDesc, 1, W.f25597a, self.statusCode);
        }
        if (output.o(serialDesc, 2) || self.id != null) {
            output.t(serialDesc, 2, W0.f25599a, self.id);
        }
        if (output.o(serialDesc, 3) || self.action != null) {
            output.t(serialDesc, 3, W0.f25599a, self.action);
        }
        if (!output.o(serialDesc, 4) && self.headers == null) {
            return;
        }
        output.t(serialDesc, 4, i.f51359a, self.headers);
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleResponseHeader)) {
            return false;
        }
        SimpleResponseHeader simpleResponseHeader = (SimpleResponseHeader) other;
        return AbstractC6492s.d(this.type, simpleResponseHeader.type) && AbstractC6492s.d(this.statusCode, simpleResponseHeader.statusCode) && AbstractC6492s.d(this.id, simpleResponseHeader.id) && AbstractC6492s.d(this.action, simpleResponseHeader.action) && AbstractC6492s.d(this.headers, simpleResponseHeader.headers);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.headers;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "SimpleResponseHeader(type=" + this.type + ", statusCode=" + this.statusCode + ", id=" + this.id + ", action=" + this.action + ", headers=" + this.headers + ")";
    }
}
