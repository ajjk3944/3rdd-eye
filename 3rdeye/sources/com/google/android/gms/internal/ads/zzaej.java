package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaej {
    private final zzen zza = new zzen(10);

    public final zzav zza(zzadu zzaduVar, zzaha zzahaVar) throws IOException {
        zzav zzavVarZza = null;
        int i = 0;
        while (true) {
            try {
                zzen zzenVar = this.zza;
                zzaduVar.zzh(zzenVar.zzN(), 0, 10);
                zzenVar.zzL(0);
                if (zzenVar.zzo() != 4801587) {
                    break;
                }
                zzenVar.zzM(3);
                int iZzl = zzenVar.zzl();
                int i10 = iZzl + 10;
                if (zzavVarZza == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(zzenVar.zzN(), 0, bArr, 0, 10);
                    zzaduVar.zzh(bArr, 10, iZzl);
                    zzavVarZza = zzahc.zza(bArr, i10, zzahaVar, new zzago());
                } else {
                    zzaduVar.zzg(iZzl);
                }
                i += i10;
            } catch (EOFException unused) {
            }
        }
        zzaduVar.zzj();
        zzaduVar.zzg(i);
        return zzavVarZza;
    }
}
