package com.yandex.mobile.ads.impl;

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

/* loaded from: classes3.dex */
public final class mr {

    /* renamed from: a, reason: collision with root package name */
    private final List<lr> f30491a;

    /* renamed from: b, reason: collision with root package name */
    private int f30492b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30493c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30494d;

    public mr(List<lr> connectionSpecs) {
        kotlin.jvm.internal.l.f(connectionSpecs, "connectionSpecs");
        this.f30491a = connectionSpecs;
    }

    public final lr a(SSLSocket sslSocket) throws IOException {
        boolean z10;
        lr lrVar;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        int i = this.f30492b;
        int size = this.f30491a.size();
        while (true) {
            z10 = true;
            if (i >= size) {
                lrVar = null;
                break;
            }
            lrVar = this.f30491a.get(i);
            if (lrVar.a(sslSocket)) {
                this.f30492b = i + 1;
                break;
            }
            i++;
        }
        if (lrVar != null) {
            int i10 = this.f30492b;
            int size2 = this.f30491a.size();
            while (true) {
                if (i10 >= size2) {
                    z10 = false;
                    break;
                }
                if (this.f30491a.get(i10).a(sslSocket)) {
                    break;
                }
                i10++;
            }
            this.f30493c = z10;
            lrVar.a(sslSocket, this.f30494d);
            return lrVar;
        }
        boolean z11 = this.f30494d;
        List<lr> list = this.f30491a;
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        kotlin.jvm.internal.l.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.l.e(string, "toString(...)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z11 + ", modes=" + list + ", supported protocols=" + string);
    }

    public final boolean a(IOException e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        this.f30494d = true;
        if (!this.f30493c || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }
}
