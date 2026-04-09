package fb;

import Mj.w;
import Rj.y;
import aj.AbstractC3866G;
import gb.AuthorizeNcaRequest;
import gg.AbstractC5912b;
import gg.z;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0013\u0010\u000bJ9\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0016\u0010\u000eJE\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0017\u0010\u0012J;\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0018\u0010\u000bJ9\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u001a\u0010\u000eJE\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u001b\u0010\u0012J;\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u001c\u0010\u000bJ9\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u001d\u0010\u0015J/\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u001e\u0010\u000eJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lfb/p;", "", "", "url", "", "Laj/G;", "header", "Lgg/z;", "LMj/w;", "Lokhttp3/ResponseBody;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Ljava/util/Map;)Lgg/z;", "Lgg/b;", "i", "(Ljava/lang/String;Ljava/util/Map;)Lgg/b;", "Lokhttp3/RequestBody;", "body", SnmpConfigurator.O_OPERATION, "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/z;", "m", "p", "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/b;", "h", "f", SnmpConfigurator.O_COMMUNITY, "k", "q", "j", "d", "l", "g", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;)Lgg/z;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;)Lgg/b;", "Lgb/c;", "authRequest", SnmpConfigurator.O_CONTEXT_NAME, "(Lgb/c;)Lgg/z;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface p {
    @Rj.f
    z<w<ResponseBody>> a(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.b
    z<w<ResponseBody>> b(@y String url);

    @Rj.n
    z<w<ResponseBody>> c(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.p
    z<w<ResponseBody>> d(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.b
    AbstractC5912b e(@y String url);

    @Rj.n
    z<w<ResponseBody>> f(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.p
    AbstractC5912b g(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.o
    AbstractC5912b h(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.f
    AbstractC5912b i(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.p
    z<w<ResponseBody>> j(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.n
    AbstractC5912b k(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.p
    AbstractC5912b l(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.o
    z<w<ResponseBody>> m(@y String url, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.o("/api/auth/nca")
    z<ResponseBody> n(@Rj.a AuthorizeNcaRequest authRequest);

    @Rj.o
    z<w<ResponseBody>> o(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.o
    AbstractC5912b p(@y String url, @Rj.a RequestBody body, @Rj.j Map<String, AbstractC3866G> header);

    @Rj.n
    AbstractC5912b q(@y String url, @Rj.j Map<String, AbstractC3866G> header);
}
