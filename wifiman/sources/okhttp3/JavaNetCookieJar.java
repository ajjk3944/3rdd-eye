package okhttp3;

import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Cookie;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "header", "", "Lokhttp3/Cookie;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/util/List;", "cookies", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/HttpUrl;Ljava/util/List;)V", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Ljava/net/CookieHandler;", "Ljava/net/CookieHandler;", "cookieHandler", "okhttp-urlconnection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JavaNetCookieJar implements CookieJar {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CookieHandler cookieHandler;

    private final List c(HttpUrl url, String header) {
        ArrayList arrayList = new ArrayList();
        int length = header.length();
        int i10 = 0;
        while (i10 < length) {
            int iQ = Util.q(header, ";,", i10, length);
            int iP = Util.p(header, '=', i10, iQ);
            String strZ = Util.Z(header, i10, iP);
            if (!t.P(strZ, "$", false, 2, null)) {
                String strZ2 = iP < iQ ? Util.Z(header, iP + 1, iQ) : "";
                if (t.P(strZ2, "\"", false, 2, null) && t.B(strZ2, "\"", false, 2, null)) {
                    strZ2 = strZ2.substring(1, strZ2.length() - 1);
                    AbstractC6492s.h(strZ2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(new Cookie.Builder().d(strZ).e(strZ2).b(url.getHost()).a());
            }
            i10 = iQ + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void a(HttpUrl url, List cookies) throws IOException {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(Internal.a((Cookie) it.next(), true));
        }
        try {
            this.cookieHandler.put(url.u(), U.e(z.a("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            Platform platformG = Platform.INSTANCE.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            HttpUrl httpUrlS = url.s("/...");
            AbstractC6492s.f(httpUrlS);
            sb2.append(httpUrlS);
            platformG.k(sb2.toString(), 5, e10);
        }
    }

    @Override // okhttp3.CookieJar
    public List b(HttpUrl url) throws IOException {
        AbstractC6492s.i(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.cookieHandler.get(url.u(), U.h());
            AbstractC6492s.h(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (t.C("Cookie", key, true) || t.C("Cookie2", key, true)) {
                    AbstractC6492s.h(value, "value");
                    if (!value.isEmpty()) {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            AbstractC6492s.h(header, "header");
                            arrayList.addAll(c(url, header));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return AbstractC3689v.l();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC6492s.h(listUnmodifiableList, "{\n      Collections.unmo…fiableList(cookies)\n    }");
            return listUnmodifiableList;
        } catch (IOException e10) {
            Platform platformG = Platform.INSTANCE.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            HttpUrl httpUrlS = url.s("/...");
            AbstractC6492s.f(httpUrlS);
            sb2.append(httpUrlS);
            platformG.k(sb2.toString(), 5, e10);
            return AbstractC3689v.l();
        }
    }
}
