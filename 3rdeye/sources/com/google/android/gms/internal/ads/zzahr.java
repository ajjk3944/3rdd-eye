package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzahr {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahy zzc = new zzahy();
    private zzahs zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadu zzaduVar, int i) throws IOException {
        zzaduVar.zzi(this.zza, 0, i);
        long j4 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j4 = (j4 << 8) | (r0[i10] & 255);
        }
        return j4;
    }

    public final void zza(zzahs zzahsVar) {
        this.zzd = zzahsVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadu r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzc(com.google.android.gms.internal.ads.zzadu):boolean");
    }
}
