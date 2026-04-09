package okhttp3.internal.http;

import ej.InterfaceC5483g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "", "contentTypeString", "", "contentLength", "Lej/g;", "source", "<init>", "(Ljava/lang/String;JLej/g;)V", "p", "()J", "Lokhttp3/MediaType;", "s", "()Lokhttp3/MediaType;", SnmpConfigurator.O_PRIV_PROTOCOL, "()Lej/g;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", "J", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lej/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String contentTypeString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5483g source;

    public RealResponseBody(String str, long j10, InterfaceC5483g source) {
        AbstractC6492s.i(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: p, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: s */
    public MediaType getF56210c() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.b(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: y, reason: from getter */
    public InterfaceC5483g getSource() {
        return this.source;
    }
}
