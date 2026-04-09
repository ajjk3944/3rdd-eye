package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class eq0 extends lh1 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f26988d;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numQ = property != null ? y9.m.Q(property) : null;
        boolean z10 = false;
        if (numQ == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numQ.intValue() >= 9) {
            z10 = true;
        }
        f26988d = z10;
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(SSLSocket sslSocket, String str, List<gm1> protocols) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((gm1) obj) != gm1.f27817d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gm1) it.next()).toString());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final String b(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
