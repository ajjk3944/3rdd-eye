package ea;

import N7.H7;
import ea.i;
import javax.net.ssl.SSLSocket;
import y9.n;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class e implements i.a {
    @Override // ea.i.a
    public final boolean b(SSLSocket sSLSocket) {
        return n.a0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // ea.i.a
    public final j c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(H7.o(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(superclass);
    }
}
