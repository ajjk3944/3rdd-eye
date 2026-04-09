package da;

import U9.y;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c9.C2091l;
import da.h;
import ea.i;
import ea.j;
import ea.k;
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
import kotlin.jvm.internal.l;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f37579e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37580c;

    /* renamed from: d, reason: collision with root package name */
    public final N2.g f37581d;

    /* compiled from: AndroidPlatform.kt */
    public static final class a implements ga.e {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f37582a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f37583b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f37582a = x509TrustManager;
            this.f37583b = method;
        }

        @Override // ga.e
        public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = this.f37583b.invoke(this.f37582a, x509Certificate);
                l.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
            return l.b(this.f37582a, aVar.f37582a) && l.b(this.f37583b, aVar.f37583b);
        }

        public final int hashCode() {
            return this.f37583b.hashCode() + (this.f37582a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f37582a + ", findByIssuerAndSignatureMethod=" + this.f37583b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.a.c() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f37579e = z10;
    }

    public b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        k kVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            kVar = new k(cls);
        } catch (Exception e4) {
            h.f37600a.getClass();
            h.i(5, "unable to load android socket classes", e4);
            kVar = null;
        }
        ArrayList arrayListL = C2091l.l(new j[]{kVar, new i(ea.f.f37782f), new i(ea.h.f37789a), new i(ea.g.f37788a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j) next).a()) {
                arrayList.add(next);
            }
        }
        this.f37580c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod(com.vungle.ads.internal.presenter.g.OPEN, String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f37581d = new N2.g(method3, method, method2);
    }

    @Override // da.h
    public final ga.c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ea.b bVar = x509TrustManagerExtensions != null ? new ea.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new ga.a(c(x509TrustManager));
    }

    @Override // da.h
    public final ga.e c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // da.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        Object next;
        l.f(protocols, "protocols");
        Iterator it = this.f37580c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((j) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            jVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // da.h
    public final void e(Socket socket, InetSocketAddress address, int i) throws IOException {
        l.f(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // da.h
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f37580c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j) next).b(sSLSocket)) {
                break;
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.c(sSLSocket);
        }
        return null;
    }

    @Override // da.h
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        N2.g gVar = this.f37581d;
        gVar.getClass();
        Method method = (Method) gVar.f4484b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = (Method) gVar.f4485c;
                l.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // da.h
    public final boolean h(String hostname) {
        l.f(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // da.h
    public final void k(Object obj, String message) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l.f(message, "message");
        N2.g gVar = this.f37581d;
        gVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) gVar.f4486d;
                l.c(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        h.j(this, message, 4);
    }
}
