package com.google.android.gms.internal.ads;

import N7.C1094a9;
import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzqk extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzqk(int i, int i10, int i11, int i12, int i13, zzz zzzVar, boolean z10, Exception exc) {
        String strValueOf = String.valueOf(zzzVar);
        StringBuilder sbI = s.i("AudioTrack init failed ", i, " Config(", i10, ", ");
        C1094a9.k(sbI, i11, ", ", i12, ", ");
        sbI.append(i13);
        sbI.append(") ");
        sbI.append(strValueOf);
        sbI.append(true != z10 ? "" : " (recoverable)");
        super(sbI.toString(), exc);
        this.zza = i;
        this.zzb = z10;
    }
}
