package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflx implements zzfma {
    private static final zzflx zza = new zzflx(new zzfmb());
    private Date zzb;
    private boolean zzc;
    private final zzfmb zzd;
    private boolean zze;

    private zzflx(zzfmb zzfmbVar) {
        this.zzd = zzfmbVar;
    }

    public static zzflx zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc(boolean z10) {
        if (!this.zze && z10) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzflz.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzflh) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z10;
    }

    public final void zzd(Context context) {
        if (this.zzc) {
            return;
        }
        zzfmb zzfmbVar = this.zzd;
        zzfmbVar.zzd(context);
        zzfmbVar.zze(this);
        zzfmbVar.zzf();
        this.zze = zzfmbVar.zza;
        this.zzc = true;
    }
}
