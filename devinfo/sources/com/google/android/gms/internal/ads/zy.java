package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zy extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f19233a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az f19234b;

    public zy(az azVar) {
        this.f19234b = azVar;
    }

    public final void a(Socket socket) throws SocketException {
        az azVar = this.f19234b;
        int i4 = azVar.f9501r;
        if (i4 > 0) {
            socket.setReceiveBufferSize(i4);
        }
        azVar.f9502s.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i4) throws IOException {
        Socket socketCreateSocket = this.f19233a.createSocket(str, i4);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f19233a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f19233a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i4, InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f19233a.createSocket(str, i4, inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i4) throws IOException {
        Socket socketCreateSocket = this.f19233a.createSocket(inetAddress, i4);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i10) throws IOException {
        Socket socketCreateSocket = this.f19233a.createSocket(inetAddress, i4, inetAddress2, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i4, boolean z3) throws IOException {
        Socket socketCreateSocket = this.f19233a.createSocket(socket, str, i4, z3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
