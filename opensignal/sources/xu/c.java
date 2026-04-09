package xu;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import lf.t1;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f25533e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25534c;

    /* renamed from: d, reason: collision with root package name */
    public final rq.f f25535d;

    static {
        boolean z10 = false;
        if (io.sentry.hints.i.P() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f25533e = z10;
    }

    public c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        yu.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new yu.n(cls);
        } catch (Exception e4) {
            n.f25563a.getClass();
            n.i("unable to load android socket classes", 5, e4);
            nVar = null;
        }
        ArrayList arrayListL0 = mq.l.l0(new yu.m[]{nVar, new yu.l(yu.f.f26462f), new yu.l(yu.j.f26469a), new yu.l(yu.h.f26468a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((yu.m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f25534c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f25535d = new rq.f(method3, method2, method);
    }

    @Override // xu.n
    public final t1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        yu.b bVar = x509TrustManagerExtensions != null ? new yu.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new bv.a(c(x509TrustManager));
    }

    @Override // xu.n
    public final bv.d c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // xu.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        br.l.e(list, "protocols");
        Iterator it = this.f25534c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((yu.m) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        yu.m mVar = (yu.m) next;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // xu.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        br.l.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // xu.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f25534c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((yu.m) next).a(sSLSocket)) {
                break;
            }
        }
        yu.m mVar = (yu.m) next;
        if (mVar != null) {
            return mVar.c(sSLSocket);
        }
        return null;
    }

    @Override // xu.n
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        rq.f fVar = this.f25535d;
        fVar.getClass();
        Method method = fVar.f21668a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = fVar.f21669b;
                br.l.b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // xu.n
    public final boolean h(String str) {
        br.l.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // xu.n
    public final void j(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        br.l.e(str, "message");
        rq.f fVar = this.f25535d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f21670c;
                br.l.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
