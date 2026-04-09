package com.zipoapps.premiumhelper.toto;

import U9.x;
import c9.C2097r;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;

/* compiled from: TotoServiceRepository.kt */
/* loaded from: classes3.dex */
public final class TotoServiceRepositoryKt {
    private static final X509TrustManager findX509TrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            l.e(trustManagers, "getTrustManagers(...)");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) C2097r.q0(arrayList);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x.a enableTls12OnPreLollipop(x.a aVar) {
        return aVar;
    }
}
