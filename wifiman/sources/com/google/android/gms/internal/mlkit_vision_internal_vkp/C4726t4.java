package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4726t4 extends Y1 implements A2 {
    private static final C4726t4 zzd;
    private int zze;
    private C4617j4 zzf;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private long zzo;
    private long zzp;
    private long zzq;
    private float zzr;
    private C4672o4 zzs;
    private byte zzt = 2;
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();
    private InterfaceC4582g2 zzm = AbstractC4516a2.k();
    private InterfaceC4582g2 zzn = AbstractC4516a2.k();

    static {
        C4726t4 c4726t4 = new C4726t4();
        zzd = c4726t4;
        AbstractC4516a2.p(C4726t4.class, c4726t4);
    }

    private C4726t4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005\u000eဉ\n", new Object[]{"zze", "zzf", "zzg", C4715s4.class, "zzh", "zzi", "zzj", "zzk", "zzm", C4650m4.class, "zzn", C4595h4.class, "zzp", "zzr", "zzq", "zzo", "zzl", "zzs"});
        }
        if (i11 == 3) {
            return new C4726t4();
        }
        AbstractC4562e4 abstractC4562e4 = null;
        if (i11 == 4) {
            return new C4628k4(abstractC4562e4);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
