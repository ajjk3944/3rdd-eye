package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class in1 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12391e;

    /* renamed from: f, reason: collision with root package name */
    public final DatagramPacket f12392f;
    public Uri g;

    /* renamed from: h, reason: collision with root package name */
    public DatagramSocket f12393h;

    /* renamed from: i, reason: collision with root package name */
    public MulticastSocket f12394i;
    public InetAddress j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12395k;

    /* renamed from: l, reason: collision with root package name */
    public int f12396l;

    public in1() {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f12391e = bArr;
        this.f12392f = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws IOException {
        Uri uri = gb1Var.f11479a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        c(gb1Var);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f12394i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.f12393h = this.f12394i;
            } else {
                this.f12393h = new DatagramSocket(inetSocketAddress);
            }
            this.f12393h.setSoTimeout(8000);
            this.f12395k = true;
            e(gb1Var);
            return -1L;
        } catch (IOException e2) {
            throw new tm1(AdError.INTERNAL_ERROR_CODE, e2);
        } catch (SecurityException e10) {
            throw new tm1(AdError.INTERNAL_ERROR_2006, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f12396l;
        DatagramPacket datagramPacket = this.f12392f;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f12393h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f12396l = length;
                g(length);
            } catch (SocketTimeoutException e2) {
                throw new tm1(AdError.CACHE_ERROR_CODE, e2);
            } catch (IOException e10) {
                throw new tm1(AdError.INTERNAL_ERROR_CODE, e10);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f12396l;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f12391e, length2 - i12, bArr, i4, iMin);
        this.f12396l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() throws IOException {
        InetAddress inetAddress;
        this.g = null;
        MulticastSocket multicastSocket = this.f12394i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f12394i = null;
        }
        DatagramSocket datagramSocket = this.f12393h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12393h = null;
        }
        this.j = null;
        this.f12396l = 0;
        if (this.f12395k) {
            this.f12395k = false;
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.g;
    }
}
