package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.lh1;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class id implements z02 {

    public static final class a {
        public static id a() {
            if (b()) {
                return new id();
            }
            return null;
        }

        public static boolean b() {
            int i = lh1.f30001c;
            return "Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.z02
    @SuppressLint({"NewApi"})
    public final void a(SSLSocket sslSocket, String str, List<? extends gm1> protocols) throws IOException {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i = lh1.f30001c;
            sSLParameters.setApplicationProtocols((String[]) lh1.a.a(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.z02
    @SuppressLint({"NewApi"})
    public final String b(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a() {
        return a.b();
    }
}
