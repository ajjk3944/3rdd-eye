package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaeb {
    public static zzav zza(zzadu zzaduVar, boolean z10) throws IOException {
        zzav zzavVarZza = new zzaej().zza(zzaduVar, z10 ? null : zzahc.zza);
        if (zzavVarZza == null || zzavVarZza.zza() == 0) {
            return null;
        }
        return zzavVarZza;
    }

    public static zzaed zzb(zzen zzenVar) {
        zzenVar.zzM(1);
        int iZzo = zzenVar.zzo();
        long jZzc = zzenVar.zzc();
        long j4 = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            long jZzt = zzenVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jZzt;
            jArrCopyOf2[i10] = zzenVar.zzt();
            zzenVar.zzM(2);
            i10++;
        }
        zzenVar.zzM((int) ((jZzc + j4) - zzenVar.zzc()));
        return new zzaed(jArrCopyOf, jArrCopyOf2);
    }
}
