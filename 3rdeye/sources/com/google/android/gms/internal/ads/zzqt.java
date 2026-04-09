package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzqt extends zzco {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    @Override // com.google.android.gms.internal.ads.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqt.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzi(zzcl zzclVar) throws zzcm {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!zzex.zzK(i)) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i10 = zzclVar.zzc;
        boolean z10 = i10 != iArr.length;
        int i11 = 0;
        while (true) {
            int length = iArr.length;
            if (i11 >= length) {
                return z10 ? new zzcl(zzclVar.zzb, length, i) : zzcl.zza;
            }
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new zzcm(C1154e9.i("Channel map (", Arrays.toString(iArr), ") trying to access non-existent input channel."), zzclVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
