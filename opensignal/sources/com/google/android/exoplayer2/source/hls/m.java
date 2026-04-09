package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ma.d0;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class m extends ab.m {

    /* renamed from: h0, reason: collision with root package name */
    public static final AtomicInteger f4490h0 = new AtomicInteger();
    public final int G;
    public final int H;
    public final Uri I;
    public final boolean J;
    public final int K;
    public final pb.n L;
    public final na.c M;
    public final n N;
    public final boolean O;
    public final boolean P;
    public final qb.u Q;
    public final k R;
    public final List S;
    public final DrmInitData T;
    public final ua.b U;
    public final fb.f V;
    public final boolean W;
    public final boolean X;
    public n Y;
    public u Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f4491a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4492b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile boolean f4493c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4494d0;

    /* renamed from: e0, reason: collision with root package name */
    public h0 f4495e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4496f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4497g0;

    public m(k kVar, pb.n nVar, na.c cVar, Format format, boolean z10, pb.n nVar2, na.c cVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j, long j7, long j10, int i11, boolean z12, int i12, boolean z13, boolean z14, qb.u uVar, DrmInitData drmInitData, n nVar3, ua.b bVar, fb.f fVar, boolean z15) {
        super(nVar, cVar, format, i10, obj, j, j7, j10);
        this.W = z10;
        this.K = i11;
        this.f4497g0 = z12;
        this.H = i12;
        this.M = cVar2;
        this.L = nVar2;
        this.f4492b0 = cVar2 != null;
        this.X = z11;
        this.I = uri;
        this.O = z14;
        this.Q = uVar;
        this.P = z13;
        this.R = kVar;
        this.S = list;
        this.T = drmInitData;
        this.N = nVar3;
        this.U = bVar;
        this.V = fVar;
        this.J = z15;
        f0 f0Var = h0.f19336d;
        this.f4495e0 = u0.f19383x;
        this.G = f4490h0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (xu.l.a0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // ab.m
    public final boolean b() {
        throw null;
    }

    @Override // pb.j0
    public final void c() throws InterruptedIOException {
        n nVar;
        this.Z.getClass();
        if (this.Y == null && (nVar = this.N) != null) {
            ca.k kVar = ((b) nVar).f4474a;
            if ((kVar instanceof d0) || (kVar instanceof ja.i)) {
                this.Y = nVar;
                this.f4492b0 = false;
            }
        }
        na.c cVar = this.M;
        pb.n nVar2 = this.L;
        if (this.f4492b0) {
            nVar2.getClass();
            cVar.getClass();
            e(nVar2, cVar, this.X);
            this.f4491a0 = 0;
            this.f4492b0 = false;
        }
        if (this.f4493c0) {
            return;
        }
        if (!this.P) {
            try {
                qb.u uVar = this.Q;
                boolean z10 = this.O;
                long j = this.B;
                synchronized (uVar) {
                    try {
                        qb.b.j(uVar.f20824a == 9223372036854775806L);
                        if (uVar.f20825b == -9223372036854775807L) {
                            if (z10) {
                                uVar.f20827d.set(Long.valueOf(j));
                            } else {
                                while (uVar.f20825b == -9223372036854775807L) {
                                    uVar.wait();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                e(this.E, this.f302d, this.W);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        this.f4494d0 = !this.f4493c0;
    }

    @Override // pb.j0
    public final void d() {
        this.f4493c0 = true;
    }

    public final void e(pb.n nVar, na.c cVar, boolean z10) {
        na.c cVarE;
        long j;
        if (z10) {
            z = this.f4491a0 != 0;
            cVarE = cVar;
        } else {
            cVarE = cVar.e(this.f4491a0);
        }
        try {
            ca.h hVarH = h(nVar, cVarE);
            if (z) {
                hVarH.m(this.f4491a0);
            }
            while (!this.f4493c0 && ((b) this.Y).f4474a.f(hVarH, b.f4473d) == 0) {
                try {
                    try {
                    } catch (EOFException e4) {
                        if ((this.f304r.f4026x & 16384) == 0) {
                            throw e4;
                        }
                        ((b) this.Y).f4474a.c(0L, 0L);
                        j = hVarH.f3478r;
                    }
                } catch (Throwable th2) {
                    this.f4491a0 = (int) (hVarH.f3478r - cVar.f17419c);
                    throw th2;
                }
            }
            j = hVarH.f3478r;
            this.f4491a0 = (int) (j - cVar.f17419c);
        } finally {
            qb.v.g(nVar);
        }
    }

    public final int g(int i10) {
        qb.b.j(!this.J);
        if (i10 >= this.f4495e0.size()) {
            return 0;
        }
        return ((Integer) this.f4495e0.get(i10)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ca.h h(pb.n r15, na.c r16) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.m.h(pb.n, na.c):ca.h");
    }
}
