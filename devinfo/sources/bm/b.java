package bm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements fm.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2344a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2345b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f2344a = x509TrustManager;
        this.f2345b = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f2344a, bVar.f2344a) && k.a(this.f2345b, bVar.f2345b);
    }

    @Override // fm.d
    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f2345b.invoke(this.f2344a, x509Certificate);
            k.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.f2345b.hashCode() + (this.f2344a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f2344a + ", findByIssuerAndSignatureMethod=" + this.f2345b + ')';
    }
}
