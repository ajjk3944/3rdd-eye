package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public abstract class yn {

    public static final class a {
        public static yn a(X509TrustManager trustManager) {
            kotlin.jvm.internal.l.f(trustManager, "trustManager");
            return lh1.f29999a.a(trustManager);
        }
    }

    public abstract List a(String str, List list) throws SSLPeerUnverifiedException;
}
