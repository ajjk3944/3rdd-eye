package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgcl extends zzgcb {
    private List zza;

    public zzgcl(zzfya zzfyaVar, boolean z10) {
        super(zzfyaVar, z10, true);
        List listZzb = zzfyaVar.isEmpty() ? Collections.EMPTY_LIST : zzfyv.zzb(zzfyaVar.size());
        for (int i = 0; i < zzfyaVar.size(); i++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzx(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgck(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzy() {
        List list = this.zza;
        if (list != null) {
            zzc(zzD(list));
        }
    }
}
