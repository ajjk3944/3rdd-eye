package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539Hg extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f8983a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0556Ig f8984b;

    public C0539Hg(C0556Ig c0556Ig) {
        this.f8984b = c0556Ig;
    }

    public final void a(Socket socket) throws SocketException {
        C0556Ig c0556Ig = this.f8984b;
        int i = c0556Ig.f9126F;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c0556Ig.f9127G.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f8983a.createSocket(str, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f8983a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f8983a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i3) throws IOException {
        Socket socketCreateSocket = this.f8983a.createSocket(str, i, inetAddress, i3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f8983a.createSocket(inetAddress, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i3) throws IOException {
        Socket socketCreateSocket = this.f8983a.createSocket(inetAddress, i, inetAddress2, i3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z6) throws IOException {
        Socket socketCreateSocket = this.f8983a.createSocket(socket, str, i, z6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
