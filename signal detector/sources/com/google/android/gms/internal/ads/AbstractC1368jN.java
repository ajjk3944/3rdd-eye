package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.jN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1368jN implements U4 {

    /* renamed from: h, reason: collision with root package name */
    public static final C1476lN f14930h = C1476lN.t(AbstractC1368jN.class);

    /* renamed from: a, reason: collision with root package name */
    public final String f14931a;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f14934d;

    /* renamed from: e, reason: collision with root package name */
    public long f14935e;

    /* renamed from: g, reason: collision with root package name */
    public C1756qg f14937g;

    /* renamed from: f, reason: collision with root package name */
    public long f14936f = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14933c = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14932b = true;

    public AbstractC1368jN(String str) {
        this.f14931a = str;
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void a(C1756qg c1756qg, ByteBuffer byteBuffer, long j6, R4 r42) {
        this.f14935e = c1756qg.b();
        byteBuffer.remaining();
        this.f14936f = j6;
        this.f14937g = c1756qg;
        c1756qg.f16390a.position((int) (c1756qg.b() + j6));
        this.f14933c = false;
        this.f14932b = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f14933c) {
                return;
            }
            try {
                C1476lN c1476lN = f14930h;
                String str = this.f14931a;
                c1476lN.h(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C1756qg c1756qg = this.f14937g;
                long j6 = this.f14935e;
                long j7 = this.f14936f;
                ByteBuffer byteBuffer = c1756qg.f16390a;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j6);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j7);
                byteBuffer.position(iPosition);
                this.f14934d = byteBufferSlice;
                this.f14933c = true;
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            C1476lN c1476lN = f14930h;
            String str = this.f14931a;
            c1476lN.h(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f14934d;
            if (byteBuffer != null) {
                this.f14932b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f14934d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
