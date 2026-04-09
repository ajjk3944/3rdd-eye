package com.zipoapps.premiumhelper.toto;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.l;

/* compiled from: Tls12SocketFactory.kt */
/* loaded from: classes3.dex */
public final class Tls12SocketFactory extends SSLSocketFactory {
    private final SSLSocketFactory delegate;
    private final String[] tlsV12Only;

    public Tls12SocketFactory(SSLSocketFactory delegate) {
        l.f(delegate, "delegate");
        this.delegate = delegate;
        this.tlsV12Only = new String[]{"TLSv1.2"};
    }

    private final Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.tlsV12Only);
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(socket, str, i, z10);
        l.e(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        l.e(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        l.e(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i);
        l.e(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i, inetAddress, i10);
        l.e(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i);
        l.e(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i, inetAddress2, i10);
        l.e(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }
}
