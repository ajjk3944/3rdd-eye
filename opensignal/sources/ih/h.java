package ih;

import ch.n;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h extends e {
    public final long D;
    public final int E;
    public final ArrayList F;
    public final ArrayList G;
    public final int H;
    public Timer I;
    public final AtomicBoolean J;
    public int K;
    public final yh.c L;
    public final io.sentry.internal.debugmeta.c M;
    public final ThreadFactory N;

    public h(long j, int i10, dh.e eVar, yh.c cVar, io.sentry.internal.debugmeta.c cVar2, ThreadFactory threadFactory) {
        super(j, i10, eVar);
        this.G = new ArrayList();
        this.J = new AtomicBoolean(false);
        this.K = 0;
        this.F = eVar.j;
        this.H = eVar.f7357n;
        this.D = eVar.f7358o;
        this.E = eVar.f7359p;
        this.L = cVar;
        this.M = cVar2;
        this.N = threadFactory;
    }

    public static void m(h hVar) {
        n.b("LatencyTest", "[provisionallyFinishEarly]");
        int i10 = hVar.f11375h - 1;
        hVar.f11375h = i10;
        if (i10 != 0 || hVar.I == null) {
            return;
        }
        n.b("LatencyTest", "   -> finishing now");
        Timer timer = hVar.I;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        hVar.I = timer2;
        try {
            if (hVar.f11369b.f7360q) {
                timer2.schedule(new fm.b(hVar, d.LATENCY, 1), 0L);
            } else {
                timer2.schedule(new f(0, hVar), 0L);
            }
        } catch (Exception e4) {
            n.e("LatencyTest", e4);
        }
    }

    public static int n(URL url) {
        int port = url.getPort();
        return port != -1 ? port : url.getProtocol().equals("https") ? 443 : 80;
    }

    public final HttpURLConnection o(String str) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("User-Agent", "Android Application:");
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(this.E);
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
