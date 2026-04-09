package b5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class d0 extends c {
    public final DatagramPacket B;
    public Uri D;
    public DatagramSocket E;
    public MulticastSocket F;
    public InetAddress G;
    public boolean H;
    public int I;

    /* renamed from: x, reason: collision with root package name */
    public final int f2428x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f2429y;

    public d0() {
        super(true);
        this.f2428x = 8000;
        byte[] bArr = new byte[2000];
        this.f2429y = bArr;
        this.B = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // b5.h
    public final void close() throws IOException {
        this.D = null;
        MulticastSocket multicastSocket = this.F;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.G;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.F = null;
        }
        DatagramSocket datagramSocket = this.E;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.E = null;
        }
        this.G = null;
        this.I = 0;
        if (this.H) {
            this.H = false;
            e();
        }
    }

    @Override // b5.h
    public final Uri o() {
        return this.D;
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.I;
        DatagramPacket datagramPacket = this.B;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.E;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.I = length;
                a(length);
            } catch (SocketTimeoutException e4) {
                throw new c0(e4, 2002);
            } catch (IOException e10) {
                throw new c0(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.I;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f2429y, length2 - i13, bArr, i10, iMin);
        this.I -= iMin;
        return iMin;
    }

    @Override // b5.h
    public final long t(k kVar) throws IOException {
        Uri uri = kVar.f2443a;
        this.D = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.D.getPort();
        f(kVar);
        try {
            this.G = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.G, port);
            if (this.G.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.F = multicastSocket;
                multicastSocket.joinGroup(this.G);
                this.E = this.F;
            } else {
                this.E = new DatagramSocket(inetSocketAddress);
            }
            this.E.setSoTimeout(this.f2428x);
            this.H = true;
            h(kVar);
            return -1L;
        } catch (IOException e4) {
            throw new c0(e4, 2001);
        } catch (SecurityException e10) {
            throw new c0(e10, 2006);
        }
    }
}
