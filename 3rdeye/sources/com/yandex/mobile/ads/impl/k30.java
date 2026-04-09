package com.yandex.mobile.ads.impl;

import c9.C2091l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes3.dex */
final class k30 implements l30 {
    @Override // com.yandex.mobile.ads.impl.l30
    public final List<InetAddress> a(String hostname) throws UnknownHostException {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.l.e(allByName, "getAllByName(...)");
            return C2091l.t(allByName);
        } catch (NullPointerException e4) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e4);
            throw unknownHostException;
        }
    }
}
