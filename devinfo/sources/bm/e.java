package bm;

import android.os.Build;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import je.u;
import nk.k;
import rl.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f2349a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2350b;

    static {
        try {
            for (Map.Entry entry : cm.c.f2957b.entrySet()) {
                cm.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        } catch (UnsatisfiedLinkError e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        }
        e aVar = a.f2341e ? new a() : null;
        if (aVar == null) {
            aVar = c.f2346e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(u.r(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f2349a = aVar;
        f2350b = Logger.getLogger(t.class.getName());
    }

    public abstract a.a c(X509TrustManager x509TrustManager);

    public fm.d d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new fm.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i4) throws IOException {
        k.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i4);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f2350b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i4, Throwable th2);

    public void k(String str, Object obj) {
        k.e(str, PglCryptUtils.KEY_MESSAGE);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        k.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
