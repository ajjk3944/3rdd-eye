package bm;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import cm.h;
import cm.k;
import cm.n;
import cm.o;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import rl.t;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2346e;

    /* renamed from: c, reason: collision with root package name */
    public Context f2347c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2348d;

    static {
        f2346e = Build.VERSION.SDK_INT < 29;
    }

    public c() throws ClassNotFoundException {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = cm.c.f2956a;
            cm.c.a(t.class.getName(), 5, "unable to load android socket classes", e2);
            oVar = null;
        }
        int i4 = 0;
        ArrayList arrayListY = m.Y(new n[]{oVar, new cm.m(cm.e.f2959f), new cm.m(k.f2971a), new cm.m(h.f2969a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListY.size();
        while (i4 < size) {
            Object obj = arrayListY.get(i4);
            i4++;
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f2348d = arrayList;
    }

    @Override // bm.d
    public final void a(Context context) {
        this.f2347c = context;
    }

    @Override // bm.d
    public final Context b() {
        return this.f2347c;
    }

    @Override // bm.e
    public final a.a c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        cm.b bVar = x509TrustManagerExtensions != null ? new cm.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new fm.a(d(x509TrustManager));
    }

    @Override // bm.e
    public final fm.d d(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // bm.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        nk.k.e(list, "protocols");
        ArrayList arrayList = this.f2348d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((n) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // bm.e
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i4) throws IOException {
        nk.k.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i4);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // bm.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f2348d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((n) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // bm.e
    public final boolean i(String str) {
        nk.k.e(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // bm.e
    public final void j(String str, int i4, Throwable th2) {
        nk.k.e(str, PglCryptUtils.KEY_MESSAGE);
        if (i4 == 5) {
            Log.w("OkHttp", str, th2);
        } else {
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // bm.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
