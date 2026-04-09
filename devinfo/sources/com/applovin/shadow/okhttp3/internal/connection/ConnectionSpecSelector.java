package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.ConnectionSpec;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        k.e(list, "connectionSpecs");
        this.connectionSpecs = list;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i4 = this.nextModeIndex; i4 < size; i4++) {
            if (this.connectionSpecs.get(i4).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        k.e(sSLSocket, "sslSocket");
        int i4 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i4 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i4);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.nextModeIndex = i4 + 1;
                break;
            }
            i4++;
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sSLSocket);
            connectionSpec.apply$okhttp(sSLSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isFallback);
        sb2.append(", modes=");
        sb2.append(this.connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        k.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        k.d(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean connectionFailed(IOException iOException) {
        k.e(iOException, "e");
        this.isFallback = true;
        if (!this.isFallbackPossible || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
