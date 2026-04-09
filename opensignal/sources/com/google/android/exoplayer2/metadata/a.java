package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g;
import java.util.ArrayList;
import pa.b;
import pa.c;
import pa.d;
import qb.v;

/* loaded from: classes.dex */
public final class a extends g implements Handler.Callback {
    public final b H;
    public final d I;
    public final Handler J;
    public final c K;
    public ic.a L;
    public boolean M;
    public boolean N;
    public long O;
    public long P;
    public Metadata Q;

    public a(d dVar, Looper looper) {
        Handler handler;
        super(5);
        this.I = dVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = v.f20828a;
            handler = new Handler(looper, this);
        }
        this.J = handler;
        this.H = b.f20352a;
        this.K = new c(1);
        this.P = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.l1
    public final int f(Format format) {
        if (this.H.b(format)) {
            return format.f4021a0 == null ? 4 : 2;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.I.onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean i() {
        return this.N;
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public final void k() {
        this.Q = null;
        this.P = -9223372036854775807L;
        this.L = null;
    }

    @Override // com.google.android.exoplayer2.g
    public final void m(long j, boolean z10) {
        this.Q = null;
        this.P = -9223372036854775807L;
        this.M = false;
        this.N = false;
    }

    @Override // com.google.android.exoplayer2.g
    public final void q(Format[] formatArr, long j, long j7) {
        this.L = this.H.a(formatArr[0]);
    }

    @Override // com.google.android.exoplayer2.g
    public final void s(long j, long j7) {
        boolean z10 = true;
        while (z10) {
            if (!this.M && this.Q == null) {
                c cVar = this.K;
                cVar.p();
                io.sentry.internal.debugmeta.c cVar2 = this.f4137d;
                cVar2.c();
                int iR = r(cVar2, cVar, 0);
                if (iR == -4) {
                    if (cVar.g(4)) {
                        this.M = true;
                    } else {
                        cVar.E = this.O;
                        cVar.s();
                        ic.a aVar = this.L;
                        int i10 = v.f20828a;
                        Metadata metadataL = aVar.l(cVar);
                        if (metadataL != null) {
                            ArrayList arrayList = new ArrayList(metadataL.f4241a.length);
                            w(metadataL, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new Metadata(arrayList);
                                this.P = cVar.f26793y;
                            }
                        }
                    }
                } else if (iR == -5) {
                    Format format = (Format) cVar2.f12354g;
                    format.getClass();
                    this.O = format.L;
                }
            }
            Metadata metadata = this.Q;
            if (metadata == null || this.P > j) {
                z10 = false;
            } else {
                Handler handler = this.J;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.I.onMetadata(metadata);
                }
                this.Q = null;
                this.P = -9223372036854775807L;
                z10 = true;
            }
            if (this.M && this.Q == null) {
                this.N = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.google.android.exoplayer2.metadata.Metadata r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r7.f4241a
            int r2 = r1.length
            if (r0 >= r2) goto L48
            r2 = r1[r0]
            com.google.android.exoplayer2.Format r2 = r2.a()
            if (r2 == 0) goto L40
            pa.b r3 = r6.H
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L40
            ic.a r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.b()
            r1.getClass()
            pa.c r3 = r6.K
            r3.p()
            int r4 = r1.length
            r3.r(r4)
            java.nio.ByteBuffer r4 = r3.f26791r
            int r5 = qb.v.f20828a
            r4.put(r1)
            r3.s()
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.l(r3)
            if (r1 == 0) goto L45
            r6.w(r1, r8)
            goto L45
        L40:
            r1 = r1[r0]
            r8.add(r1)
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.a.w(com.google.android.exoplayer2.metadata.Metadata, java.util.ArrayList):void");
    }
}
