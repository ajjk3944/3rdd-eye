package mh;

import android.os.Looper;
import ch.n;
import i.g0;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f16722a;

    /* renamed from: b, reason: collision with root package name */
    public final DatagramChannel f16723b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f16724c;

    /* renamed from: d, reason: collision with root package name */
    public final b f16725d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16726e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f16727f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f16728g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h, reason: collision with root package name */
    public AtomicBoolean f16729h = new AtomicBoolean(true);

    /* renamed from: i, reason: collision with root package name */
    public final yh.c f16730i;
    public final boolean j;

    public d(b bVar, DatagramChannel datagramChannel, g0 g0Var, a aVar, yh.c cVar, boolean z10) {
        long j;
        this.f16724c = g0Var;
        this.f16722a = aVar;
        this.f16730i = cVar;
        this.j = z10;
        this.f16725d = bVar;
        this.f16723b = datagramChannel;
        int i10 = bVar.E;
        int i11 = bVar.f16706r;
        if (i11 > 0) {
            j = ((i10 + bVar.f16703a) * (bVar.f16705g * 8)) / i11;
        } else {
            j = 0;
        }
        n.b("UdpPingReceiver", c7.a.m(j, "Expected test time "));
        long j7 = (long) ((j * 1.2f) + 5000.0f);
        this.f16726e = j7;
        n.b("UdpPingReceiver", c7.a.m(j7, "mAllowedTestTime test time "));
    }

    public final void a() {
        g0 g0Var = this.f16724c;
        StringBuilder sb2 = new StringBuilder("closeSocket() called From thread: ");
        sb2.append(Thread.currentThread().getId());
        sb2.append(" isMainThread [");
        sb2.append(Looper.myLooper() == Looper.getMainLooper());
        sb2.append("]");
        n.b("UdpPingReceiver", sb2.toString());
        DatagramChannel datagramChannel = this.f16723b;
        if (datagramChannel != null) {
            try {
                n.b("PingReceiverListener", "onSocketClosed");
                l lVar = (l) g0Var.f11051a;
                DatagramChannel datagramChannel2 = lVar.f16761i;
                if (datagramChannel2 != null && datagramChannel2.isOpen()) {
                    lVar.f16768r.q("SOCKET_CLOSED", null);
                }
                datagramChannel.disconnect();
                datagramChannel.close();
            } catch (IOException e4) {
                n.e("UdpPingReceiver", e4);
                g0Var.G(e4);
            }
        }
    }

    public final void b() {
        if (this.f16729h.getAndSet(true)) {
            return;
        }
        ArrayList arrayList = this.f16727f;
        g0 g0Var = this.f16724c;
        g0Var.getClass();
        n.b("PingReceiverListener", "onPingResult() called with: result size = [" + arrayList.size() + "]");
        arrayList.toString();
        n.a();
        Collections.reverse(arrayList);
        l lVar = (l) g0Var.f11051a;
        lVar.f16759g = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            lVar.f16757e[(lVar.f16754b.D * cVar.f16713d) + cVar.f16714e] = cVar.f16717h;
        }
        lVar.j.countDown();
    }

    public abstract boolean c();

    public void d(c cVar) {
        this.f16727f.add(cVar);
    }
}
