package com.android.billingclient.api;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

/* loaded from: classes.dex */
final class zzcl implements zzch {
    private zzku zzb;
    private final zzcn zzc;

    public zzcl(Context context, zzku zzkuVar) {
        this.zzc = new zzcn(context);
        this.zzb = zzkuVar;
    }

    @Override // com.android.billingclient.api.zzch
    public final void zza(@Nullable zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.zzb);
            zzliVarZzc.zza(zzjzVar);
            this.zzc.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzb(@Nullable zzjz zzjzVar, int i10) {
        try {
            zzks zzksVar = (zzks) this.zzb.zzn();
            zzksVar.zza(i10);
            this.zzb = (zzku) zzksVar.zzf();
            zza(zzjzVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzc(@Nullable zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.zzb);
            zzliVarZzc.zzm(zzkdVar);
            this.zzc.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzd(@Nullable zzkd zzkdVar, int i10) {
        try {
            zzks zzksVar = (zzks) this.zzb.zzn();
            zzksVar.zza(i10);
            this.zzb = (zzku) zzksVar.zzf();
            zzc(zzkdVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zze(zzkl zzklVar) {
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.zzb);
            zzliVarZzc.zzn(zzklVar);
            this.zzc.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzf(zzlq zzlqVar) {
        try {
            zzcn zzcnVar = this.zzc;
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.zzb);
            zzliVarZzc.zzp(zzlqVar);
            zzcnVar.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzg(@Nullable zzlu zzluVar) {
        if (zzluVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.zzb);
            zzliVarZzc.zzq(zzluVar);
            this.zzc.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }
}
