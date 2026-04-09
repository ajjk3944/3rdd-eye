package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class m72 extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final int f30296e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f30297f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f30298g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f30299h;
    private DatagramSocket i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f30300j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f30301k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30302l;

    /* renamed from: m, reason: collision with root package name */
    private int f30303m;

    public static final class a extends pv {
        public a(Exception exc, int i) {
            super(exc, i);
        }
    }

    public m72(int i) {
        super(true);
        this.f30296e = 8000;
        byte[] bArr = new byte[2000];
        this.f30297f = bArr;
        this.f30298g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        Uri uri = svVar.f33250a;
        this.f30299h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f30299h.getPort();
        b(svVar);
        try {
            this.f30301k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f30301k, port);
            if (this.f30301k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f30300j = multicastSocket;
                multicastSocket.joinGroup(this.f30301k);
                this.i = this.f30300j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.f30296e);
            this.f30302l = true;
            c(svVar);
            return -1L;
        } catch (IOException e4) {
            throw new a(e4, 2001);
        } catch (SecurityException e10) {
            throw new a(e10, 2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        this.f30299h = null;
        MulticastSocket multicastSocket = this.f30300j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f30301k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f30300j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.f30301k = null;
        this.f30303m = 0;
        if (this.f30302l) {
            this.f30302l = false;
            e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f30299h;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        if (this.f30303m == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f30298g);
                int length = this.f30298g.getLength();
                this.f30303m = length;
                c(length);
            } catch (SocketTimeoutException e4) {
                throw new a(e4, 2002);
            } catch (IOException e10) {
                throw new a(e10, 2001);
            }
        }
        int length2 = this.f30298g.getLength();
        int i11 = this.f30303m;
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f30297f, length2 - i11, bArr, i, iMin);
        this.f30303m -= iMin;
        return iMin;
    }
}
