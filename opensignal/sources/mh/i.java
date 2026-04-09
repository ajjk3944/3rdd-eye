package mh;

import h7.r1;
import java.net.DatagramPacket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.DatagramChannel;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f16739a;

    /* renamed from: b, reason: collision with root package name */
    public final DatagramChannel f16740b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16741c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16742d;

    /* renamed from: e, reason: collision with root package name */
    public final r1 f16743e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16744f;

    /* renamed from: g, reason: collision with root package name */
    public final yh.c f16745g;

    /* renamed from: h, reason: collision with root package name */
    public int f16746h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Random f16747i = new Random();
    public final c[] j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public ScheduledFuture f16748l;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadFactory f16749m;

    public i(b bVar, DatagramChannel datagramChannel, byte[] bArr, r1 r1Var, a aVar, yh.c cVar, ThreadFactory threadFactory) {
        int i10 = 0;
        this.f16740b = datagramChannel;
        this.f16741c = bVar;
        this.f16742d = bArr;
        this.f16743e = r1Var;
        this.f16739a = aVar;
        this.f16745g = cVar;
        int i11 = bVar.f16706r;
        int i12 = bVar.f16703a;
        this.f16744f = 1000.0d / (((i11 * 1000) * 1.0d) / ((bVar.E + i12) * 8));
        this.k = bVar.J == 2 && bVar.K > 0 && bVar.L != 0;
        if (bVar.H) {
            this.j = new c[bVar.f16705g];
            while (true) {
                c[] cVarArr = this.j;
                if (i10 >= cVarArr.length) {
                    break;
                }
                cVarArr[i10] = a(i12, i10);
                i10++;
            }
        }
        this.f16749m = threadFactory;
    }

    public static DatagramPacket b(c cVar) {
        int i10 = cVar.f16711b;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[i10], i10);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i10).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(cVar.f16718i);
        byteBufferOrder.putShort((short) cVar.f16713d);
        byteBufferOrder.putShort((short) cVar.f16714e);
        byteBufferOrder.putLong(cVar.f16715f);
        byteBufferOrder.putLong(cVar.f16716g);
        byteBufferOrder.put((byte) cVar.f16712c);
        byteBufferOrder.put((byte) cVar.f16710a);
        int iRemaining = byteBufferOrder.remaining();
        byte[] bArr = new byte[iRemaining];
        c.f16709o.nextBytes(bArr);
        byteBufferOrder.put(bArr);
        cVar.j = bArr;
        if (iRemaining >= 6) {
            System.arraycopy(bArr, 0, cVar.f16721n, 0, 6);
        }
        datagramPacket.setData(byteBufferOrder.array());
        return datagramPacket;
    }

    public final c a(int i10, int i11) {
        int i12;
        c cVar = new c();
        cVar.f16710a = 1;
        cVar.f16712c = 1;
        cVar.f16719l = 0L;
        cVar.f16720m = 0;
        cVar.f16721n = new byte[6];
        cVar.f16711b = i10;
        cVar.f16718i = this.f16742d;
        cVar.f16713d = i11;
        cVar.f16714e = 0;
        b bVar = this.f16741c;
        int i13 = bVar.D;
        int i14 = bVar.I;
        cVar.f16712c = i13;
        if (!this.k) {
            cVar.f16710a = i14;
            return cVar;
        }
        int iNextInt = bVar.L;
        if (iNextInt < 0) {
            iNextInt = this.f16747i.nextInt(Math.abs(iNextInt)) + 1;
        }
        if (i11 % iNextInt != 0 || (i12 = this.f16746h) >= bVar.K) {
            cVar.f16710a = i14;
            return cVar;
        }
        cVar.f16710a = bVar.J;
        this.f16746h = i12 + 1;
        return cVar;
    }
}
