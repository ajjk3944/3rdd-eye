package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.dq0;
import ia.C4468d;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class lh1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile lh1 f29999a;

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f30000b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30001c = 0;

    public static final class a {
        private a() {
        }

        public static ArrayList a(List protocols) {
            kotlin.jvm.internal.l.f(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((gm1) obj) != gm1.f27817d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((gm1) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            kotlin.jvm.internal.l.f(protocols, "protocols");
            C4468d c4468d = new C4468d();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c4468d.C0(str.length());
                c4468d.R0(str);
            }
            return c4468d.F(c4468d.f38643c);
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static boolean b() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }

        public static lh1 a() {
            return lh1.f29999a;
        }
    }

    static {
        lh1 eq0Var;
        lh1 lh1VarA;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            kd.a();
            lh1VarA = hd.f28185e ? new hd() : null;
            if (lh1VarA == null) {
                eq0Var = md.f30347f ? new md() : null;
                kotlin.jvm.internal.l.c(eq0Var);
                lh1VarA = eq0Var;
            }
        } else {
            eq0Var = eq0.f26988d ? new eq0() : null;
            if (eq0Var != null) {
                lh1VarA = eq0Var;
            } else {
                lh1VarA = dq0.b.a();
                if (lh1VarA == null) {
                    lh1VarA = new lh1();
                }
            }
        }
        f29999a = lh1VarA;
        f30000b = Logger.getLogger(vd1.class.getName());
    }

    public static SSLSocketFactory c(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            kotlin.jvm.internal.l.e(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            kotlin.jvm.internal.l.e(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public void a(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
    }

    public x62 b(X509TrustManager trustManager) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        kotlin.jvm.internal.l.e(acceptedIssuers, "getAcceptedIssuers(...)");
        return new sk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public yn a(X509TrustManager trustManager) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        return new qk(b(trustManager));
    }

    public String b(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        return null;
    }

    public void a(SSLSocket sslSocket, String str, List<gm1> protocols) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
    }

    public Object b() {
        if (f30000b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void a(Socket socket, InetSocketAddress address, int i) throws IOException {
        kotlin.jvm.internal.l.f(socket, "socket");
        kotlin.jvm.internal.l.f(address, "address");
        socket.connect(address, i);
    }

    public static X509TrustManager c() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.l.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        kotlin.jvm.internal.l.e(string, "toString(...)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public boolean a(String hostname) {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        return true;
    }

    public static void a(int i, String message, Throwable th) {
        kotlin.jvm.internal.l.f(message, "message");
        f30000b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(Object obj, String message) {
        kotlin.jvm.internal.l.f(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, message, (Throwable) obj);
    }
}
