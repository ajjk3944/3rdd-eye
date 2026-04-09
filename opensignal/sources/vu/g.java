package vu;

import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d[] f24002a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f24003b;

    static {
        d dVar = new d(d.f23982i, "");
        cv.j jVar = d.f23979f;
        d dVar2 = new d(jVar, URLRequest.METHOD_GET);
        d dVar3 = new d(jVar, URLRequest.METHOD_POST);
        cv.j jVar2 = d.f23980g;
        d dVar4 = new d(jVar2, "/");
        d dVar5 = new d(jVar2, "/index.html");
        cv.j jVar3 = d.f23981h;
        d dVar6 = new d(jVar3, "http");
        d dVar7 = new d(jVar3, "https");
        cv.j jVar4 = d.f23978e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(jVar4, "200"), new d(jVar4, "204"), new d(jVar4, "206"), new d(jVar4, "304"), new d(jVar4, "400"), new d(jVar4, "404"), new d(jVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f24002a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(dVarArr[i10].f23983a)) {
                linkedHashMap.put(dVarArr[i10].f23983a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        br.l.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f24003b = mapUnmodifiableMap;
    }

    public static void a(cv.j jVar) throws IOException {
        br.l.e(jVar, "name");
        int iD = jVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = jVar.i(i10);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.q()));
            }
        }
    }
}
