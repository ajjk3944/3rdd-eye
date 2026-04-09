package xu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements bv.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f25531a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f25532b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f25531a = x509TrustManager;
        this.f25532b = method;
    }

    @Override // bv.d
    public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f25532b.invoke(this.f25531a, x509Certificate);
            br.l.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return br.l.a(this.f25531a, bVar.f25531a) && br.l.a(this.f25532b, bVar.f25532b);
    }

    public final int hashCode() {
        return this.f25532b.hashCode() + (this.f25531a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f25531a + ", findByIssuerAndSignatureMethod=" + this.f25532b + ')';
    }
}
