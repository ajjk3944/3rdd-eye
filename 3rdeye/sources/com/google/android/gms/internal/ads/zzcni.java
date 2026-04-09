package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.singular.sdk.internal.SingularParamsBase;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcni implements zzazb, zzcwm, com.google.android.gms.ads.internal.overlay.zzr, zzcwl {
    private final zzcnd zza;
    private final zzcne zzb;
    private final zzbpg zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnh zzh = new zzcnh();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcni(zzbpd zzbpdVar, zzcne zzcneVar, Executor executor, zzcnd zzcndVar, Clock clock) {
        this.zza = zzcndVar;
        zzboo zzbooVar = zzbor.zza;
        this.zzd = zzbpdVar.zza("google.afma.activeView.handleUpdate", zzbooVar, zzbooVar);
        this.zzb = zzcneVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcfe) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdj(Context context) {
        this.zzh.zze = SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY;
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(zzaza zzazaVar) {
        zzcnh zzcnhVar = this.zzh;
        zzcnhVar.zza = zzazaVar.zzj;
        zzcnhVar.zzf = zzazaVar;
        zzg();
    }

    public final synchronized void zzg() {
        try {
            if (this.zzj.get() == null) {
                zzj();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcnh zzcnhVar = this.zzh;
                zzcnhVar.zzd = this.zzf.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcnhVar);
                for (final zzcfe zzcfeVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                        @Override // java.lang.Runnable
                        public final void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String strI = C1154e9.i("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zze(strI);
                            zzcfeVar.zzp("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcag.zzb(this.zzd.zzc(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzh(zzcfe zzcfeVar) {
        this.zzc.add(zzcfeVar);
        this.zza.zzd(zzcfeVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final synchronized void zzs() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw(int i) {
    }
}
