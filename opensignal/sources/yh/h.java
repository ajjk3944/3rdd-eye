package yh;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import y9.u;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public final u B;
    public boolean D = false;
    public int E = 0;
    public final ScheduledExecutorService F;
    public final ArrayList G;

    /* renamed from: a, reason: collision with root package name */
    public final DatagramSocket f26292a;

    /* renamed from: d, reason: collision with root package name */
    public final InetAddress f26293d;

    /* renamed from: g, reason: collision with root package name */
    public final int f26294g;

    /* renamed from: r, reason: collision with root package name */
    public final int f26295r;

    /* renamed from: x, reason: collision with root package name */
    public final int f26296x;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f26297y;

    public h(DatagramSocket datagramSocket, InetAddress inetAddress, int i10, int i11, int i12, int i13, boolean z10, Integer num, Integer num2, Integer num3, u uVar, ThreadFactory threadFactory) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        if (i10 < 1) {
            throw new IllegalArgumentException("Must send more than 0 packets");
        }
        this.f26292a = datagramSocket;
        this.f26293d = inetAddress;
        this.f26294g = i13;
        this.f26295r = i10;
        this.f26296x = 1000000 * i12;
        this.f26297y = new long[i10];
        this.B = uVar;
        this.F = Executors.newScheduledThreadPool(1, threadFactory);
        ch.n.b("TTQoSHelperFunctions", "initialiseDataList: with packetPayloadSize: " + i11 + " randomizePayload: " + z10);
        boolean z12 = (num == null || num.intValue() != 2 || num2 == null || num2.intValue() <= 0 || num3 == null || num3.intValue() == 0) ? false : true;
        ch.n.b("TTQoSHelperFunctions", "prepareVerificationPackets: " + z12);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f26295r; i15++) {
            if (!z12 || i14 >= num2.intValue()) {
                z11 = false;
            } else {
                z11 = i15 % (num3.intValue() < 0 ? i.f26298g.nextInt(Math.abs(num3.intValue())) + 1 : num3.intValue()) == 0;
                if (z11) {
                    i14++;
                }
            }
            byte[] bArr = new byte[i11];
            if (z10) {
                i.f26298g.nextBytes(bArr);
                bArr[6] = 0;
                bArr[7] = 0;
                bArr[24] = 0;
                bArr[25] = 0;
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (z11 && num != null) {
                bArr[25] = num.byteValue();
            }
            arrayList.add(bArr);
        }
        ch.n.b("TTQoSHelperFunctions", "Prepared packets to send: " + arrayList.size() + " containing " + i14 + " verification packets.");
    }

    public final void a() throws IOException {
        byte[] bArr = (byte[]) this.G.get(this.E);
        bArr[0] = (byte) this.E;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.f26293d, this.f26294g);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f26292a.send(datagramPacket);
        this.f26297y[this.E] = jElapsedRealtimeNanos;
        ch.n.b("TTQoSHelperFunctions", "Sent packet    : " + this.E + " = " + Arrays.toString(datagramPacket.getData()));
        this.E = this.E + 1;
    }

    public final ScheduledFuture b() {
        int i10 = this.f26296x;
        if (i10 < 0) {
            throw new IllegalArgumentException("Attempted to start sending UDP with negative packet delay");
        }
        if (i10 != 0) {
            return this.F.scheduleAtFixedRate(this, 0L, i10, TimeUnit.NANOSECONDS);
        }
        long[] jArr = this.f26297y;
        while (this.E < this.f26295r) {
            try {
                a();
            } catch (IOException unused) {
                jArr[0] = -32768;
            } catch (Exception unused2) {
                jArr[0] = -1;
            }
        }
        u uVar = this.B;
        ArrayList arrayList = this.G;
        ((i) uVar.f25996d).f26299a = jArr;
        ((i) uVar.f25996d).f26300b = arrayList;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long[] jArr = this.f26297y;
        if (this.D) {
            return;
        }
        try {
            int i10 = this.E;
            if (i10 > 0) {
                long j = jArr[i10 - 1] + this.f26296x;
                while (SystemClock.elapsedRealtimeNanos() < j) {
                    Thread.sleep(0L, 100000);
                }
            }
            a();
            if (this.E == this.f26295r) {
                this.D = true;
            }
        } catch (IOException unused) {
            jArr[0] = -32768;
            this.D = true;
        } catch (Exception unused2) {
            jArr[0] = -1;
            this.D = true;
        }
        if (this.D) {
            u uVar = this.B;
            ArrayList arrayList = this.G;
            ((i) uVar.f25996d).f26299a = jArr;
            ((i) uVar.f25996d).f26300b = arrayList;
        }
    }
}
