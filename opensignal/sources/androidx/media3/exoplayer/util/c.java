package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1937a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1938b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1939c;

    /* renamed from: d, reason: collision with root package name */
    public static long f1940d;

    public static long a() throws UnknownHostException {
        char c4;
        long j;
        synchronized (f1938b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c4 = 0;
                j = jCurrentTimeMillis;
            } else {
                long j7 = jCurrentTimeMillis / 1000;
                long j10 = jCurrentTimeMillis - (j7 * 1000);
                c4 = 0;
                j = jCurrentTimeMillis;
                bArr[40] = (byte) (r14 >> 24);
                bArr[41] = (byte) (r14 >> 16);
                bArr[42] = (byte) (r14 >> 8);
                bArr[43] = (byte) (j7 + 2208988800L);
                long j11 = (j10 * 4294967296L) / 1000;
                bArr[44] = (byte) (j11 >> 24);
                bArr[45] = (byte) (j11 >> 16);
                bArr[46] = (byte) (j11 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j12 = (jElapsedRealtime2 - jElapsedRealtime) + j;
            byte b2 = bArr[c4];
            int i10 = bArr[1] & 255;
            long jD = d(24, bArr);
            long jD2 = d(32, bArr);
            long jD3 = d(40, bArr);
            b((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i10, jD3);
            long j13 = (j12 + (((jD3 - j12) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j13;
        } finally {
        }
    }

    public static void b(byte b2, byte b10, int i10, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(h0.b.h(b10, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(h0.b.h(i10, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(int i10, byte[] bArr) {
        long jC = c(i10, bArr);
        long jC2 = c(i10 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
