package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzux implements zzgj {
    private final zzgj zza;
    private final int zzb;
    private final zzuw zzc;
    private final byte[] zzd;
    private int zze;

    public zzux(zzgj zzgjVar, int i, zzuw zzuwVar) {
        zzdd.zzd(i > 0);
        this.zza = zzgjVar;
        this.zzb = i;
        this.zzc = zzuwVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.zze;
        if (i11 == 0) {
            zzgj zzgjVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i12 = 0;
            if (zzgjVar.zza(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iZza = zzgjVar.zza(bArr3, i12, i14);
                        if (iZza != -1) {
                            i12 += iZza;
                            i14 -= iZza;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr3[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.zzc.zza(new zzen(bArr3, i13));
                    }
                }
                i11 = this.zzb;
                this.zze = i11;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i, Math.min(i11, i10));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
        zzhjVar.getClass();
        this.zza.zzf(zzhjVar);
    }
}
