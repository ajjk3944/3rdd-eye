package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class wh0 extends hk {

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f34970a;

    /* renamed from: b, reason: collision with root package name */
    private final ae1 f34971b = new ae1();

    public wh0(SSLSocketFactory sSLSocketFactory) {
        this.f34970a = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.hk
    public final mh0 a(op1<?> request, Map<String, String> additionalHeaders) throws NoSuchAlgorithmException, IOException, th, KeyStoreException {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(additionalHeaders, "additionalHeaders");
        int iJ = request.j();
        int i = wd1.f34912c;
        vd1 vd1VarA = wd1.a(iJ, iJ, this.f34970a);
        pp1 request2 = this.f34971b.a(request, additionalHeaders);
        kotlin.jvm.internal.l.f(request2, "request");
        pq1 pq1VarB = new tn1(vd1VarA, request2, false).b();
        int iD = pq1VarB.d();
        TreeMap requestHeaders = pq1VarB.g().c();
        kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : requestHeaders.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new ef0(str, (String) it.next()));
            }
        }
        if (request.f() == 4 || ((100 <= iD && iD < 200) || iD == 204 || iD == 304)) {
            return new mh0(iD, arrayList, -1, null);
        }
        tq1 tq1VarA = pq1VarB.a();
        int iA = tq1VarA != null ? (int) tq1VarA.a() : 0;
        tq1 tq1VarA2 = pq1VarB.a();
        return new mh0(iD, arrayList, iA, tq1VarA2 != null ? tq1VarA2.c().L0() : null);
    }
}
