package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfc extends zzff {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfc(int i, long j4) {
        super(i, null);
        this.zza = j4;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzff
    public final String toString() {
        List list = this.zzb;
        return zzff.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzfc zza(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfc zzfcVar = (zzfc) list.get(i10);
            if (zzfcVar.zzd == i) {
                return zzfcVar;
            }
        }
        return null;
    }

    public final zzfd zzb(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfd zzfdVar = (zzfd) list.get(i10);
            if (zzfdVar.zzd == i) {
                return zzfdVar;
            }
        }
        return null;
    }

    public final void zzc(zzfc zzfcVar) {
        this.zzc.add(zzfcVar);
    }

    public final void zzd(zzfd zzfdVar) {
        this.zzb.add(zzfdVar);
    }
}
