package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaks implements zzadw {
    private final zzadw zzb;
    private final zzakp zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzaks(zzadw zzadwVar, zzakp zzakpVar) {
        this.zzb = zzadwVar;
        this.zzc = zzakpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzG() {
        this.zzb.zzG();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzaku) sparseArray.valueAt(i)).zzb(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzP(zzaes zzaesVar) {
        this.zzb.zzP(zzaesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final zzaez zzw(int i, int i10) {
        if (i10 != 3) {
            this.zze = true;
            return this.zzb.zzw(i, i10);
        }
        SparseArray sparseArray = this.zzd;
        zzaku zzakuVar = (zzaku) sparseArray.get(i);
        if (zzakuVar != null) {
            return zzakuVar;
        }
        zzaku zzakuVar2 = new zzaku(this.zzb.zzw(i, 3), this.zzc);
        sparseArray.put(i, zzakuVar2);
        return zzakuVar2;
    }
}
