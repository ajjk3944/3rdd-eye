package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c9.C2091l;
import com.yandex.mobile.ads.impl.a22;
import com.yandex.mobile.ads.impl.jd;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.qd;
import com.yandex.mobile.ads.impl.rp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class md extends lh1 {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f30347f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30348g = 0;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f30349d;

    /* renamed from: e, reason: collision with root package name */
    private final rp f30350e;

    public static final class a implements x62 {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f30351a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f30352b;

        public a(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            kotlin.jvm.internal.l.f(trustManager, "trustManager");
            kotlin.jvm.internal.l.f(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f30351a = trustManager;
            this.f30352b = findByIssuerAndSignatureMethod;
        }

        @Override // com.yandex.mobile.ads.impl.x62
        public final X509Certificate a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            kotlin.jvm.internal.l.f(cert, "cert");
            try {
                Object objInvoke = this.f30352b.invoke(this.f30351a, cert);
                kotlin.jvm.internal.l.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e4) {
                throw new AssertionError("unable to get issues and signature", e4);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f30351a, aVar.f30351a) && kotlin.jvm.internal.l.b(this.f30352b, aVar.f30352b);
        }

        public final int hashCode() {
            return this.f30352b.hashCode() + (this.f30351a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f30351a + ", findByIssuerAndSignatureMethod=" + this.f30352b + ")";
        }
    }

    static {
        f30347f = lh1.a.b() && Build.VERSION.SDK_INT < 30;
    }

    public md() {
        int i = a22.f24395h;
        a22 a22VarA = a22.a.a("com.android.org.conscrypt");
        int i10 = qd.f32142g;
        ArrayList arrayListL = C2091l.l(new z02[]{a22VarA, new s00(qd.a.a())});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((z02) next).a()) {
                arrayList.add(next);
            }
        }
        this.f30349d = arrayList;
        this.f30350e = rp.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final yn a(X509TrustManager trustManager) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        jd jdVarA = jd.a.a(trustManager);
        return jdVarA != null ? jdVarA : new qk(b(trustManager));
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final x62 b(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(trustManager);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(SSLSocket sslSocket, String str, List<gm1> protocols) {
        Object next;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        Iterator it = this.f30349d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((z02) next).a(sslSocket)) {
                    break;
                }
            }
        }
        z02 z02Var = (z02) next;
        if (z02Var != null) {
            z02Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(Socket socket, InetSocketAddress address, int i) throws IOException {
        kotlin.jvm.internal.l.f(socket, "socket");
        kotlin.jvm.internal.l.f(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e4);
            }
            throw e4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final String b(SSLSocket sslSocket) {
        Object next;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        Iterator it = this.f30349d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z02) next).a(sslSocket)) {
                break;
            }
        }
        z02 z02Var = (z02) next;
        if (z02Var != null) {
            return z02Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final Object b() {
        return this.f30350e.a();
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final boolean a(String hostname) {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(Object obj, String message) {
        kotlin.jvm.internal.l.f(message, "message");
        if (this.f30350e.a(obj)) {
            return;
        }
        lh1.a(5, message, (Throwable) null);
    }
}
