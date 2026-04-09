package mh;

import android.os.SystemClock;
import ch.n;
import i.g0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.NotYetConnectedException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import zc.c1;
import zc.o2;
import zc.r;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16750a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16751d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16752g;

    public j(r rVar, long j) {
        this.f16751d = j;
        Objects.requireNonNull(rVar);
        this.f16752g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16750a) {
            case 0:
                n.b("UdpTest", "Running udpPingReceiver.start();");
                d dVar = (d) this.f16752g;
                long j = this.f16751d;
                ScheduledExecutorService scheduledExecutorService = dVar.f16728g;
                g0 g0Var = dVar.f16724c;
                boolean z10 = dVar.j;
                b bVar = dVar.f16725d;
                if (!dVar.f16729h.get()) {
                    n.g("UdpPingReceiver", "A test is Already Running, will abort");
                    return;
                }
                scheduledExecutorService.schedule(new b4.e(23, dVar), dVar.f16726e, TimeUnit.MILLISECONDS);
                dVar.f16727f = new ArrayList(bVar.D * bVar.f16705g);
                int i10 = bVar.f16703a + (z10 ? 9 : 0);
                n.b("UdpPingReceiver", h0.b.h(i10, "Expected received buffer size bytes: "));
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(i10).order(ByteOrder.BIG_ENDIAN);
                dVar.f16729h = new AtomicBoolean(false);
                g0Var.getClass();
                n.b("PingReceiverListener", "onPingStarted() called");
                ((l) g0Var.f11051a).f16768r.q("START_RECEIVING_THREAD", null);
                while (dVar.c()) {
                    try {
                        try {
                            byteBufferOrder.clear();
                            c cVar = new c(byteBufferOrder, z10, dVar.f16723b.read(byteBufferOrder));
                            dVar.f16730i.getClass();
                            cVar.f16717h = TimeUnit.MICROSECONDS.convert(SystemClock.elapsedRealtimeNanos() - j, TimeUnit.NANOSECONDS);
                            dVar.d(cVar);
                            g0Var.I(cVar);
                        } catch (IOException e4) {
                            e = e4;
                            n.e("UdpPingReceiver", e);
                            dVar.b();
                            scheduledExecutorService.shutdownNow();
                            g0Var.G(e);
                            n.b("UdpPingReceiver", "Finally reached closing the socket");
                        } catch (NotYetConnectedException e10) {
                            e = e10;
                            n.e("UdpPingReceiver", e);
                            dVar.b();
                            scheduledExecutorService.shutdownNow();
                            g0Var.G(e);
                            n.b("UdpPingReceiver", "Finally reached closing the socket");
                        } catch (Exception e11) {
                            a aVar = dVar.f16722a;
                            if (aVar != null) {
                                aVar.c(e11);
                            }
                            n.e("UdpPingReceiver", e11);
                            dVar.b();
                            scheduledExecutorService.shutdownNow();
                            g0Var.G(e11);
                            n.b("UdpPingReceiver", "Finally reached closing the socket");
                        }
                    } catch (Throwable th2) {
                        n.b("UdpPingReceiver", "Finally reached closing the socket");
                        dVar.a();
                        throw th2;
                    }
                }
                dVar.b();
                scheduledExecutorService.shutdownNow();
                n.b("UdpPingReceiver", "Finally reached closing the socket");
                dVar.a();
                return;
            case 1:
                ((r) this.f16752g).y1(this.f16751d);
                return;
            default:
                o2 o2Var = (o2) this.f16752g;
                r rVar = ((c1) o2Var.f1504d).J;
                c1.d(rVar);
                rVar.v1(this.f16751d);
                o2Var.f27057y = null;
                return;
        }
    }

    public j(o2 o2Var, long j) {
        this.f16751d = j;
        Objects.requireNonNull(o2Var);
        this.f16752g = o2Var;
    }

    public j(d dVar, long j) {
        this.f16752g = dVar;
        this.f16751d = j;
    }
}
