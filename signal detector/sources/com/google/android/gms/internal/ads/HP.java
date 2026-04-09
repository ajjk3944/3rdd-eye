package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class HP extends FM {

    /* renamed from: j, reason: collision with root package name */
    public long f8918j;

    /* renamed from: k, reason: collision with root package name */
    public int f8919k;

    /* renamed from: l, reason: collision with root package name */
    public int f8920l;

    @Override // com.google.android.gms.internal.ads.FM
    public final void o() {
        super.o();
        this.f8919k = 0;
    }

    public final int t() {
        return this.f8919k;
    }

    public final boolean u() {
        return this.f8919k > 0;
    }

    public final boolean v(FM fm) {
        ByteBuffer byteBuffer;
        AbstractC0582Jp.m(!fm.n(1073741824));
        AbstractC0582Jp.m(!fm.n(268435456));
        AbstractC0582Jp.m(!fm.n(4));
        if (u()) {
            if (this.f8919k >= this.f8920l) {
                return false;
            }
            ByteBuffer byteBuffer2 = fm.f8093e;
            if (byteBuffer2 != null && (byteBuffer = this.f8093e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f8919k;
        this.f8919k = i + 1;
        if (i == 0) {
            this.f8095g = fm.f8095g;
            if (fm.n(1)) {
                this.f1097b = 1;
            }
        }
        ByteBuffer byteBuffer3 = fm.f8093e;
        if (byteBuffer3 != null) {
            p(byteBuffer3.remaining());
            this.f8093e.put(byteBuffer3);
        }
        this.f8918j = fm.f8095g;
        return true;
    }
}
