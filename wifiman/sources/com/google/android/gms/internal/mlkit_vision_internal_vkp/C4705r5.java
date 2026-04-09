package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4705r5 extends AbstractC4516a2 implements A2 {
    private static final C4705r5 zzb;
    private int zzd;
    private long zze;
    private int zzh;
    private int zzi;
    private C4618j5 zzl;
    private B1 zzm;
    private D5 zzn;
    private String zzo;
    private InterfaceC4582g2 zzp;
    private InterfaceC4582g2 zzq;
    private B1 zzr;
    private String zzs;
    private byte zzt = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC4582g2 zzj = AbstractC4516a2.k();
    private String zzk = "";

    static {
        C4705r5 c4705r5 = new C4705r5();
        zzb = c4705r5;
        AbstractC4516a2.p(C4705r5.class, c4705r5);
    }

    private C4705r5() {
        B1 b12 = B1.f35555b;
        this.zzm = b12;
        this.zzo = "";
        this.zzp = AbstractC4516a2.k();
        this.zzq = AbstractC4516a2.k();
        this.zzr = b12;
        this.zzs = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zzd", "zze", "zzp", C4695q5.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzm", "zzn", "zzl", "zzr", "zzo", "zzs", "zzq", C4651m5.class});
        }
        if (i11 == 3) {
            return new C4705r5();
        }
        AbstractC4662n5 abstractC4662n5 = null;
        if (i11 == 4) {
            return new C4673o5(abstractC4662n5);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
