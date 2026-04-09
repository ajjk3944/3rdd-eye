package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class FM extends C0.q {

    /* renamed from: c, reason: collision with root package name */
    public TP f8091c;

    /* renamed from: d, reason: collision with root package name */
    public final OL f8092d = new OL();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f8093e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8094f;

    /* renamed from: g, reason: collision with root package name */
    public long f8095g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f8096h;
    public final int i;

    static {
        AbstractC2102x2.a("media3.decoder");
    }

    public FM(int i) {
        this.i = i;
    }

    public void o() {
        this.f1097b = 0;
        ByteBuffer byteBuffer = this.f8093e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f8096h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f8094f = false;
    }

    public final void p(int i) {
        ByteBuffer byteBuffer = this.f8093e;
        if (byteBuffer == null) {
            this.f8093e = s(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i + iPosition;
        if (iCapacity >= i3) {
            this.f8093e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferS = s(i3);
        byteBufferS.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferS.put(byteBuffer);
        }
        this.f8093e = byteBufferS;
    }

    public final boolean q() {
        return n(1073741824);
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f8093e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f8096h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer s(int i) {
        int i3 = this.i;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f8093e;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(iCapacity).length() + 21 + String.valueOf(i).length() + 1);
        AbstractC2763b.h(sb, "Buffer too small (", iCapacity, " < ", i);
        sb.append(")");
        throw new C1745qM(sb.toString());
    }
}
