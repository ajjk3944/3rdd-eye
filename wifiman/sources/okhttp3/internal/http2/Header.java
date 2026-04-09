package okhttp3.internal.http2;

import ej.h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lej/h;", "name", "value", "<init>", "(Lej/h;Lej/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lej/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lej/h;", SnmpConfigurator.O_BIND_ADDRESS, "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lej/h;", SnmpConfigurator.O_COMMUNITY, "I", "hpackSize", "d", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Header {

    /* renamed from: e, reason: collision with root package name */
    public static final h f56514e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f56515f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f56516g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f56517h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f56518i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f56519j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final h name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final h value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int hpackSize;

    static {
        h.a aVar = h.f46470d;
        f56514e = aVar.d(":");
        f56515f = aVar.d(":status");
        f56516g = aVar.d(":method");
        f56517h = aVar.d(":path");
        f56518i = aVar.d(":scheme");
        f56519j = aVar.d(":authority");
    }

    public Header(h name, h value) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.b0() + 32 + value.b0();
    }

    /* renamed from: a, reason: from getter */
    public final h getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final h getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return AbstractC6492s.d(this.name, header.name) && AbstractC6492s.d(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.q0() + ": " + this.value.q0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String name, String value) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(value, "value");
        h.a aVar = h.f46470d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h name, String value) {
        this(name, h.f46470d.d(value));
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(value, "value");
    }
}
