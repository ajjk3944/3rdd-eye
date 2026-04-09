package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551d4 extends Y1 implements A2 {
    private static final C4551d4 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private M3 zzh;
    private int zzj;
    private int zzk;
    private Q3 zzm;
    private long zzp;
    private byte zzq = 2;
    private String zzi = "";
    private InterfaceC4582g2 zzl = AbstractC4516a2.k();
    private String zzn = "";
    private InterfaceC4582g2 zzo = AbstractC4516a2.k();

    static {
        C4551d4 c4551d4 = new C4551d4();
        zzd = c4551d4;
        AbstractC4516a2.p(C4551d4.class, c4551d4);
    }

    private C4551d4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzq);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007Л\bᐉ\u0006\tဈ\u0007\n\u001a\u000bဂ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C4529b4.class, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new C4551d4();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new C4540c4(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzq = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
