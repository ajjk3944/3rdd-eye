package yl;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d[] f37697a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f37698b;

    static {
        d dVar = new d(d.f37679i, "");
        hm.h hVar = d.f37677f;
        d dVar2 = new d(hVar, "GET");
        d dVar3 = new d(hVar, "POST");
        hm.h hVar2 = d.g;
        d dVar4 = new d(hVar2, "/");
        d dVar5 = new d(hVar2, "/index.html");
        hm.h hVar3 = d.f37678h;
        d dVar6 = new d(hVar3, "http");
        d dVar7 = new d(hVar3, "https");
        hm.h hVar4 = d.f37676e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(hVar4, "200"), new d(hVar4, "204"), new d(hVar4, "206"), new d(hVar4, "304"), new d(hVar4, "400"), new d(hVar4, "404"), new d(hVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f37697a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i4 = 0; i4 < 61; i4++) {
            if (!linkedHashMap.containsKey(dVarArr[i4].f37680a)) {
                linkedHashMap.put(dVarArr[i4].f37680a, Integer.valueOf(i4));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        nk.k.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        f37698b = mapUnmodifiableMap;
    }

    public static void a(hm.h hVar) throws IOException {
        nk.k.e(hVar, "name");
        int iA = hVar.a();
        for (int i4 = 0; i4 < iA; i4++) {
            byte bD = hVar.d(i4);
            if (65 <= bD && bD < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(hVar.j()));
            }
        }
    }
}
