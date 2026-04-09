package okhttp3;

import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.p;
import java.io.File;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/MediaType;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "()J", "Lej/f;", "sink", "LYg/J;", "h", "(Lej/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaType f56169b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f56170c;

    @Override // okhttp3.RequestBody
    public long a() {
        return this.f56170c.length();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public MediaType getF56169b() {
        return this.f56169b;
    }

    @Override // okhttp3.RequestBody
    public void h(InterfaceC5482f sink) {
        AbstractC6492s.i(sink, "sink");
        InterfaceC5476D interfaceC5476DJ = p.j(this.f56170c);
        try {
            sink.e0(interfaceC5476DJ);
            AbstractC6329b.a(interfaceC5476DJ, null);
        } finally {
        }
    }
}
