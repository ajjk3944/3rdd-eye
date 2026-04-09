package da;

import U9.y;
import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c9.C2091l;
import da.h;
import ea.i;
import ea.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;

/* compiled from: Android10Platform.kt */
/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f37577d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37578c;

    static {
        f37577d = h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListL = C2091l.l(new j[]{(!h.a.c() || Build.VERSION.SDK_INT < 29) ? null : new ea.a(), new i(ea.f.f37782f), new i(ea.h.f37789a), new i(ea.g.f37788a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j) next).a()) {
                arrayList.add(next);
            }
        }
        this.f37578c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        Object next;
        l.f(protocols, "protocols");
        Iterator it = this.f37578c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f37578c.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean h(String hostname) {
        l.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
