package pb;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v0 extends h {
    public final DatagramPacket B;
    public Uri D;
    public DatagramSocket E;
    public MulticastSocket F;
    public InetAddress G;
    public InetSocketAddress H;
    public boolean I;
    public int J;

    /* renamed from: x, reason: collision with root package name */
    public final int f20435x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f20436y;

    public v0() {
        super(true);
        this.f20435x = 8000;
        byte[] bArr = new byte[2000];
        this.f20436y = bArr;
        this.B = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // pb.n
    public final void close() throws IOException {
        this.D = null;
        MulticastSocket multicastSocket = this.F;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.G);
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
        this.H = null;
        this.J = 0;
        if (this.I) {
            this.I = false;
            e();
        }
    }

    @Override // pb.n
    public final Uri o() {
        return this.D;
    }

    @Override // pb.n
    public final long q(na.c cVar) throws IOException {
        Uri uri = (Uri) cVar.f17422f;
        this.D = uri;
        String host = uri.getHost();
        int port = this.D.getPort();
        f(cVar);
        try {
            this.G = InetAddress.getByName(host);
            this.H = new InetSocketAddress(this.G, port);
            if (this.G.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.H);
                this.F = multicastSocket;
                multicastSocket.joinGroup(this.G);
                this.E = this.F;
            } else {
                this.E = new DatagramSocket(this.H);
            }
            this.E.setSoTimeout(this.f20435x);
            this.I = true;
            h(cVar);
            return -1L;
        } catch (IOException e4) {
            throw new v(e4, 2001);
        } catch (SecurityException e10) {
            throw new v(e10, 2006);
        }
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.J;
        DatagramPacket datagramPacket = this.B;
        if (i12 == 0) {
            try {
                this.E.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.J = length;
                a(length);
            } catch (SocketTimeoutException e4) {
                throw new v(e4, 2002);
            } catch (IOException e10) {
                throw new v(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.J;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f20436y, length2 - i13, bArr, i10, iMin);
        this.J -= iMin;
        return iMin;
    }
}
