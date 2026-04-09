package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdkp implements zzdiu, zzdaq {
    private final zzbqd zza;
    private final zzcwj zzb;
    private final zzcyf zzc;
    private final zzcvp zzd;
    private final zzddu zze;
    private final Context zzf;
    private final zzfbt zzg;
    private final VersionInfoParcel zzh;
    private final zzfco zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbpz zzm;
    private final zzbqa zzn;

    public zzdkp(zzbpz zzbpzVar, zzbqa zzbqaVar, zzbqd zzbqdVar, zzcwj zzcwjVar, zzcyf zzcyfVar, zzcvp zzcvpVar, zzddu zzdduVar, Context context, zzfbt zzfbtVar, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar) {
        this.zzm = zzbpzVar;
        this.zzn = zzbqaVar;
        this.zza = zzbqdVar;
        this.zzb = zzcwjVar;
        this.zzc = zzcyfVar;
        this.zzd = zzcvpVar;
        this.zze = zzdduVar;
        this.zzf = context;
        this.zzg = zzfbtVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfcoVar;
    }

    private final void zzc(View view) {
        try {
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar != null && !zzbqdVar.zzA()) {
                zzbqdVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
                    this.zze.zzdf();
                    return;
                }
                return;
            }
            zzbpz zzbpzVar = this.zzm;
            if (zzbpzVar != null && !zzbpzVar.zzx()) {
                zzbpzVar.zzs(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
                    this.zze.zzdf();
                    return;
                }
                return;
            }
            zzbqa zzbqaVar = this.zzn;
            if (zzbqaVar == null || zzbqaVar.zzv()) {
                return;
            }
            zzbqaVar.zzq(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
                this.zze.zzdf();
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call handleClick", e4);
        }
    }

    private static final HashMap zzd(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.zzdiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzB(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkp.zzB(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzC(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar != null) {
                zzbqdVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzbpz zzbpzVar = this.zzm;
            if (zzbpzVar != null) {
                zzbpzVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbqa zzbqaVar = this.zzn;
            if (zzbqaVar != null) {
                zzbqaVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call untrackView", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzD() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzE() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzF(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        try {
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar == null || !zzbqdVar.zzB()) {
                return;
            }
            zzfbt zzfbtVar = this.zzg;
            if (zzfbtVar.zze != 4 && !zzfbtVar.zzaC) {
                return;
            }
            zzbqdVar.zzx();
            this.zzb.zza();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to report impression from an adapter", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzi() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzl(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzm(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzc(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzq(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzc(view2);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzv.zzu().zzn(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzf);
            }
            if (this.zzl) {
                zzbqd zzbqdVar = this.zza;
                if (zzbqdVar == null) {
                    zzbpz zzbpzVar = this.zzm;
                    if (zzbpzVar != null && !zzbpzVar.zzy()) {
                        zzbpzVar.zzt();
                        this.zzb.zza();
                        return;
                    }
                    zzbqa zzbqaVar = this.zzn;
                    if (zzbqaVar == null || zzbqaVar.zzw()) {
                        return;
                    }
                    zzbqaVar.zzr();
                    this.zzb.zza();
                    return;
                }
                zzfbt zzfbtVar = this.zzg;
                if (zzfbtVar.zzaC) {
                    if (zzbqdVar.zzB()) {
                        return;
                    }
                    zzbqdVar.zzx();
                    this.zzb.zza();
                    return;
                }
                if (zzbqdVar.zzB() && zzfbtVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbqdVar.zzx();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call recordImpression", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzy() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzz(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzA(zzbie zzbieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzo(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzw(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzx(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzv(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
