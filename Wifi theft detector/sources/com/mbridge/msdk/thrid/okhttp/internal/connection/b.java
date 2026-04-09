package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
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
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f17662a;

    /* renamed from: b, reason: collision with root package name */
    private int f17663b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17664c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17665d;

    public b(List<j> list) {
        this.f17662a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f17663b; i10 < this.f17662a.size(); i10++) {
            if (this.f17662a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f17663b;
        int size = this.f17662a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f17662a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f17663b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f17664c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(jVar, sSLSocket, this.f17665d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f17665d + ", modes=" + this.f17662a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f17665d = true;
        if (!this.f17664c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
