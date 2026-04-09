package xu;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import lf.t1;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f25529d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25530c;

    static {
        f25529d = io.sentry.hints.i.P() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListL0 = mq.l.l0(new yu.m[]{(!io.sentry.hints.i.P() || Build.VERSION.SDK_INT < 29) ? null : new yu.a(), new yu.l(yu.f.f26462f), new yu.l(yu.j.f26469a), new yu.l(yu.h.f26468a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((yu.m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f25530c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        br.l.e(list, "protocols");
        Iterator it = this.f25530c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f25530c.iterator();
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
    public final boolean h(String str) {
        br.l.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
