package rb;

import Vi.n;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;
import rb.PayloadBody;
import rb.SupportPinTraceMeta;

@n
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002- BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b+\u0010\u0018¨\u0006."}, d2 = {"Lrb/c;", "Lrb/f;", "", "seen0", "Lrb/d;", "meta", "Lrb/b;", "payload", "", "namespace", "type", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILrb/d;Lrb/b;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(Lrb/c;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Lrb/d;", "getMeta", "()Lrb/d;", SnmpConfigurator.O_COMMUNITY, "Lrb/b;", "getPayload", "()Lrb/b;", "d", "Ljava/lang/String;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rb.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class SupportPinTraceBody extends f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SupportPinTraceMeta meta;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PayloadBody payload;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String namespace;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: rb.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f60213a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SupportPinTraceBody(int i10, SupportPinTraceMeta supportPinTraceMeta, PayloadBody payloadBody, String str, String str2, R0 r02) {
        super(i10, r02);
        this.meta = (i10 & 1) == 0 ? new SupportPinTraceMeta((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : supportPinTraceMeta;
        if ((i10 & 2) == 0) {
            this.payload = new PayloadBody((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.payload = payloadBody;
        }
        if ((i10 & 4) == 0) {
            this.namespace = "unifi:core:supportpin";
        } else {
            this.namespace = str;
        }
        if ((i10 & 8) == 0) {
            this.type = "event";
        } else {
            this.type = str2;
        }
    }

    public static final /* synthetic */ void g(SupportPinTraceBody self, Yi.d output, Xi.f serialDesc) {
        f.d(self, output, serialDesc);
        if (output.o(serialDesc, 0) || !AbstractC6492s.d(self.meta, new SupportPinTraceMeta((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            output.q(serialDesc, 0, SupportPinTraceMeta.a.f60219a, self.meta);
        }
        if (output.o(serialDesc, 1) || !AbstractC6492s.d(self.payload, new PayloadBody((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            output.q(serialDesc, 1, PayloadBody.a.f60208a, self.payload);
        }
        if (output.o(serialDesc, 2) || !AbstractC6492s.d(self.getNamespace(), "unifi:core:supportpin")) {
            output.y(serialDesc, 2, self.getNamespace());
        }
        if (!output.o(serialDesc, 3) && AbstractC6492s.d(self.getType(), "event")) {
            return;
        }
        output.y(serialDesc, 3, self.getType());
    }

    /* renamed from: e, reason: from getter */
    public String getNamespace() {
        return this.namespace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportPinTraceBody)) {
            return false;
        }
        SupportPinTraceBody supportPinTraceBody = (SupportPinTraceBody) other;
        return AbstractC6492s.d(this.meta, supportPinTraceBody.meta) && AbstractC6492s.d(this.payload, supportPinTraceBody.payload);
    }

    /* renamed from: f, reason: from getter */
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.meta.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "SupportPinTraceBody(meta=" + this.meta + ", payload=" + this.payload + ")";
    }
}
