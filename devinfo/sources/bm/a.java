package bm;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import cm.h;
import cm.k;
import cm.n;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2341e;

    /* renamed from: c, reason: collision with root package name */
    public Context f2342c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2343d;

    static {
        f2341e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i4 = 0;
        ArrayList arrayListY = m.Y(new n[]{Build.VERSION.SDK_INT >= 29 ? new cm.a() : null, new cm.m(cm.e.f2959f), new cm.m(k.f2971a), new cm.m(h.f2969a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListY.size();
        while (i4 < size) {
            Object obj = arrayListY.get(i4);
            i4++;
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f2343d = arrayList;
    }

    @Override // bm.d
    public final void a(Context context) {
        this.f2342c = context;
    }

    @Override // bm.d
    public final Context b() {
        return this.f2342c;
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
    public final fm.d d(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // bm.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        nk.k.e(list, "protocols");
        ArrayList arrayList = this.f2343d;
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
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f2343d;
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // bm.e
    public final boolean i(String str) {
        nk.k.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // bm.e
    public final void j(String str, int i4, Throwable th2) {
        nk.k.e(str, PglCryptUtils.KEY_MESSAGE);
        if (i4 == 5) {
            boolean z3 = c.f2346e;
            Log.w("OkHttp", str, th2);
        } else {
            boolean z10 = c.f2346e;
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // bm.e
    public final void k(String str, Object obj) {
        nk.k.e(str, PglCryptUtils.KEY_MESSAGE);
        if (Build.VERSION.SDK_INT < 30) {
            super.k(str, obj);
        } else {
            nk.k.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // bm.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
