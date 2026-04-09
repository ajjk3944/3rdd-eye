package com.google.android.gms.internal.ads;

import N7.C1154e9;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcns implements zzazb {
    private zzcfe zza;
    private final Executor zzb;
    private final zzcne zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnh zzg = new zzcnh();

    public zzcns(Executor executor, zzcne zzcneVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcneVar;
        this.zzd = clock;
    }

    public static /* synthetic */ void zza(zzcns zzcnsVar, JSONObject jSONObject) {
        String strI = C1154e9.i("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze(strI);
        zzcnsVar.zza.zzp("AFMA_updateActiveView", jSONObject);
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcns.zza(this.zza, jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e4);
        }
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        boolean z10 = this.zzf ? false : zzazaVar.zzj;
        zzcnh zzcnhVar = this.zzg;
        zzcnhVar.zza = z10;
        zzcnhVar.zzd = this.zzd.elapsedRealtime();
        zzcnhVar.zzf = zzazaVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }
}
