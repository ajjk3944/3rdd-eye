package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes2.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i = this.zze;
        while (true) {
            int i10 = this.zze;
            if (i10 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i10);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i) {
                int i11 = iZzc + 1;
                this.zze = i11;
                if (i11 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i != iZzd) {
                    break;
                }
                i = this.zze;
            }
        }
        int i12 = this.zzf;
        if (i12 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i12 - 1;
        }
        return this.zzb.subSequence(i, iZzd).toString();
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
