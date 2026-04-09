package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class WK extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12205e;

    /* renamed from: f, reason: collision with root package name */
    public final DatagramPacket f12206f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f12207g;

    /* renamed from: h, reason: collision with root package name */
    public DatagramSocket f12208h;
    public MulticastSocket i;

    /* renamed from: j, reason: collision with root package name */
    public InetAddress f12209j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12210k;

    /* renamed from: l, reason: collision with root package name */
    public int f12211l;

    public WK() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f12205e = bArr;
        this.f12206f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws IOException {
        Uri uri = te.f11361a;
        this.f12207g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f12207g.getPort();
        b(te);
        try {
            this.f12209j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f12209j, port);
            if (this.f12209j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.f12209j);
                this.f12208h = this.i;
            } else {
                this.f12208h = new DatagramSocket(inetSocketAddress);
            }
            this.f12208h.setSoTimeout(8000);
            this.f12210k = true;
            e(te);
            return -1L;
        } catch (IOException e6) {
            throw new IK(e6, 2001);
        } catch (SecurityException e7) {
            throw new IK(e7, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        int i6 = this.f12211l;
        DatagramPacket datagramPacket = this.f12206f;
        if (i6 == 0) {
            try {
                DatagramSocket datagramSocket = this.f12208h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f12211l = length;
                g(length);
            } catch (SocketTimeoutException e6) {
                throw new IK(e6, 2002);
            } catch (IOException e7) {
                throw new IK(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f12211l;
        int iMin = Math.min(i7, i3);
        System.arraycopy(this.f12205e, length2 - i7, bArr, i, iMin);
        this.f12211l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f12207g;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() throws IOException {
        InetAddress inetAddress;
        this.f12207g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f12209j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.i = null;
        }
        DatagramSocket datagramSocket = this.f12208h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12208h = null;
        }
        this.f12209j = null;
        this.f12211l = 0;
        if (this.f12210k) {
            this.f12210k = false;
            j();
        }
    }
}
