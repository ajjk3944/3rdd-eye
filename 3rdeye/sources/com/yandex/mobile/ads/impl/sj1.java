package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class sj1 extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33090b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f33091a;

    public static final class a {
        private a() {
        }

        public static final String[] a(SSLSocketFactory sSLSocketFactory) {
            int i = sj1.f33090b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public static final String[] b(SSLSocketFactory sSLSocketFactory) {
            int i = sj1.f33090b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public sj1(SSLSocketFactory delegate) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f33091a = delegate;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String arg0, int i) throws IOException {
        kotlin.jvm.internal.l.f(arg0, "arg0");
        Socket socketCreateSocket = this.f33091a.createSocket(arg0, i);
        String[] strArrA = a.a(this.f33091a);
        kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return a.a(this.f33091a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return a.b(this.f33091a);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String arg0, int i, InetAddress arg2, int i10) throws IOException {
        kotlin.jvm.internal.l.f(arg0, "arg0");
        kotlin.jvm.internal.l.f(arg2, "arg2");
        Socket socketCreateSocket = this.f33091a.createSocket(arg0, i, arg2, i10);
        String[] strArrA = a.a(this.f33091a);
        kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress arg0, int i) throws IOException {
        kotlin.jvm.internal.l.f(arg0, "arg0");
        Socket socketCreateSocket = this.f33091a.createSocket(arg0, i);
        String[] strArrA = a.a(this.f33091a);
        kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress arg0, int i, InetAddress arg2, int i10) throws IOException {
        kotlin.jvm.internal.l.f(arg0, "arg0");
        kotlin.jvm.internal.l.f(arg2, "arg2");
        Socket socketCreateSocket = this.f33091a.createSocket(arg0, i, arg2, i10);
        String[] strArrA = a.a(this.f33091a);
        kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket arg0, String arg1, int i, boolean z10) throws IOException {
        kotlin.jvm.internal.l.f(arg0, "arg0");
        kotlin.jvm.internal.l.f(arg1, "arg1");
        Socket socketCreateSocket = this.f33091a.createSocket(arg0, arg1, i, z10);
        String[] strArrA = a.a(this.f33091a);
        kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }
}
