package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jd extends qn1 {
    private static final jd zzA;
    private static volatile po1 zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        jd jdVar = new jd();
        zzA = jdVar;
        qn1.u(jd.class, jdVar);
    }

    public static id A() {
        return (id) zzA.r();
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void F() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 256;
        this.zzj = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 512;
        this.zzk = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= Buffer.SEGMENTING_THRESHOLD;
        this.zzn = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= Segment.SIZE;
        this.zzo = j;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzp = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zza |= 65536;
        this.zzv = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zza |= 131072;
        this.zzw = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zza |= 262144;
        this.zzx = j;
    }

    public final /* synthetic */ void T(int i4) {
        this.zzh = i4 - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void U(int i4) {
        this.zzl = i4 - 1;
        this.zza |= Segment.SHARE_MINIMUM;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            qc qcVar = qc.f15299m;
            return new to1(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", qcVar, "zzi", "zzj", "zzk", "zzl", qcVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iC == 3) {
            return new jd();
        }
        if (iC == 4) {
            return new id(zzA);
        }
        if (iC == 5) {
            return zzA;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzB;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (jd.class) {
            try {
                pn1Var = zzB;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzA);
                    zzB = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
