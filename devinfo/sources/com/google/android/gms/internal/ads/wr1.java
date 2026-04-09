package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class wr1 implements ab {

    /* renamed from: h, reason: collision with root package name */
    public static final yr1 f18149h = yr1.s(wr1.class);

    /* renamed from: a, reason: collision with root package name */
    public final String f18150a;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f18153d;

    /* renamed from: e, reason: collision with root package name */
    public long f18154e;
    public iy g;

    /* renamed from: f, reason: collision with root package name */
    public long f18155f = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18152c = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18151b = true;

    public wr1(String str) {
        this.f18150a = str;
    }

    public final synchronized void a() {
        try {
            if (this.f18152c) {
                return;
            }
            try {
                yr1 yr1Var = f18149h;
                String str = this.f18150a;
                yr1Var.i(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                iy iyVar = this.g;
                long j = this.f18154e;
                long j8 = this.f18155f;
                ByteBuffer byteBuffer = iyVar.f12537a;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j8);
                byteBuffer.position(iPosition);
                this.f18153d = byteBufferSlice;
                this.f18152c = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.ab
    public final void c(iy iyVar, ByteBuffer byteBuffer, long j, xa xaVar) {
        this.f18154e = iyVar.e();
        byteBuffer.remaining();
        this.f18155f = j;
        this.g = iyVar;
        iyVar.f12537a.position((int) (iyVar.e() + j));
        this.f18152c = false;
        this.f18151b = false;
        d();
    }

    public final synchronized void d() {
        try {
            a();
            yr1 yr1Var = f18149h;
            String str = this.f18150a;
            yr1Var.i(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f18153d;
            if (byteBuffer != null) {
                this.f18151b = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f18153d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
