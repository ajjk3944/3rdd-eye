package Lg;

import java.io.IOException;
import java.net.DatagramPacket;

/* loaded from: classes4.dex */
class s extends Thread {

    /* renamed from: b, reason: collision with root package name */
    static Ej.b f11814b = Ej.c.i(s.class);

    /* renamed from: a, reason: collision with root package name */
    private final l f11815a;

    s(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SocketListener(");
        sb2.append(lVar != null ? lVar.G0() : "");
        sb2.append(")");
        super(sb2.toString());
        setDaemon(true);
        this.f11815a = lVar;
    }

    private void a() throws InterruptedException {
        long j10 = this.f11815a.f11740j;
        if (j10 > 0) {
            try {
                Thread.sleep(j10);
            } catch (InterruptedException e10) {
                f11814b.r(getName() + ".run() interrupted ", e10);
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException, IOException {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f11815a.W0() && !this.f11815a.V0()) {
                a();
                datagramPacket.setLength(8972);
                this.f11815a.L0().receive(datagramPacket);
                if (this.f11815a.W0() || this.f11815a.V0() || this.f11815a.X0() || this.f11815a.isClosed()) {
                    break;
                }
                try {
                    if (!this.f11815a.F0().D(datagramPacket)) {
                        c cVar = new c(datagramPacket);
                        if (cVar.s()) {
                            if (f11814b.m()) {
                                f11814b.g("{}.run() JmDNS in:{}", getName(), cVar.E(true));
                            }
                            if (cVar.p()) {
                                int port = datagramPacket.getPort();
                                int i10 = javax.jmdns.impl.constants.a.f50178c;
                                if (port != i10) {
                                    this.f11815a.N0(cVar, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                l lVar = this.f11815a;
                                lVar.N0(cVar, lVar.C0(), i10);
                            } else {
                                this.f11815a.P0(cVar);
                            }
                        } else if (f11814b.isDebugEnabled()) {
                            f11814b.c("{}.run() JmDNS in message with error code: {}", getName(), cVar.E(true));
                        }
                    }
                } catch (IOException e10) {
                    f11814b.r(getName() + ".run() exception ", e10);
                }
            }
        } catch (IOException e11) {
            if (!this.f11815a.W0() && !this.f11815a.V0() && !this.f11815a.X0() && !this.f11815a.isClosed()) {
                f11814b.r(getName() + ".run() exception ", e11);
                this.f11815a.c1();
            }
        }
        f11814b.d("{}.run() exiting.", getName());
    }
}
