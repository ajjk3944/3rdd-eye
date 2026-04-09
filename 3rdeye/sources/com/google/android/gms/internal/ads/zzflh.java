package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflh extends zzfld {
    private final zzflf zza;
    private zzfnq zzc;
    private zzfmp zzd;
    private final String zzg;
    private final zzfmd zzb = new zzfmd();
    private boolean zze = false;
    private boolean zzf = false;

    public zzflh(zzfle zzfleVar, zzflf zzflfVar, String str) {
        this.zza = zzflfVar;
        this.zzg = str;
        zzk(null);
        if (zzflfVar.zzd() == zzflg.HTML || zzflfVar.zzd() == zzflg.JAVASCRIPT) {
            this.zzd = new zzfmq(str, zzflfVar.zza());
        } else {
            this.zzd = new zzfmt(str, zzflfVar.zzi(), null);
        }
        this.zzd.zzo();
        zzflz.zza().zzd(this);
        this.zzd.zzf(zzfleVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfnq(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zzb(View view, zzflk zzflkVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzflkVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzflz.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zzd(View view) {
        if (this.zzf || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzb();
        Collection<zzflh> collectionZzc = zzflz.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzflh zzflhVar : collectionZzc) {
            if (zzflhVar != this && zzflhVar.zzf() == view) {
                zzflhVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfld
    public final void zze() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzflz.zza().zzf(this);
        this.zzd.zzl(zzfmh.zzb().zza());
        this.zzd.zzg(zzflx.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfmp zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
