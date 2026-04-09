package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdpb {
    private final zzcvp zza;
    private final zzddu zzb;
    private final zzcwy zzc;
    private final zzcxl zzd;
    private final zzcxx zze;
    private final zzdas zzf;
    private final Executor zzg;
    private final zzddq zzh;
    private final zzcni zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxy zzk;
    private final zzavs zzl;
    private final zzdaj zzm;
    private final zzebs zzn;
    private final zzfjq zzo;
    private final zzdsc zzp;
    private final zzcml zzq;
    private final zzdph zzr;

    public zzdpb(zzcvp zzcvpVar, zzcwy zzcwyVar, zzcxl zzcxlVar, zzcxx zzcxxVar, zzdas zzdasVar, Executor executor, zzddq zzddqVar, zzcni zzcniVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar, zzavs zzavsVar, zzdaj zzdajVar, zzebs zzebsVar, zzfjq zzfjqVar, zzdsc zzdscVar, zzddu zzdduVar, zzcml zzcmlVar, zzdph zzdphVar) {
        this.zza = zzcvpVar;
        this.zzc = zzcwyVar;
        this.zzd = zzcxlVar;
        this.zze = zzcxxVar;
        this.zzf = zzdasVar;
        this.zzg = executor;
        this.zzh = zzddqVar;
        this.zzi = zzcniVar;
        this.zzj = zzbVar;
        this.zzk = zzbxyVar;
        this.zzl = zzavsVar;
        this.zzm = zzdajVar;
        this.zzn = zzebsVar;
        this.zzo = zzfjqVar;
        this.zzp = zzdscVar;
        this.zzb = zzdduVar;
        this.zzq = zzcmlVar;
        this.zzr = zzdphVar;
    }

    public static /* synthetic */ boolean zzh(zzdpb zzdpbVar, View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkn)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdpbVar.zzr.zzb(motionEvent);
        }
        zzdpbVar.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public static final A4.a zzj(zzcfe zzcfeVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcr)).booleanValue()) {
            C1154e9.l(bundle, zzdrk.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcai zzcaiVar = new zzcai();
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str3, String str4) {
                zzcai zzcaiVar2 = zzcaiVar;
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcr)).booleanValue()) {
                        C1154e9.l(bundle, zzdrk.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcaiVar2.zzc(null);
                    return;
                }
                zzcaiVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfeVar.zzae(str, str2, null);
        return zzcaiVar;
    }

    public final void zzi(final zzcfe zzcfeVar, boolean z10, zzbkg zzbkgVar, Bundle bundle) {
        zzavn zzavnVarZzc;
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(bundle, zzdrk.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcfeVar.zzN().zzX(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zza.onAdClicked();
            }
        }, this.zzd, this.zze, new zzbiv() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzbiv
            public final void zzb(String str, String str2) {
                this.zza.zzf.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final void zzg() {
                this.zza.zzc.zzb();
            }
        }, z10, zzbkgVar, this.zzj, new zzdpa(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcfeVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdpb.zzh(this.zza, view, motionEvent);
                return false;
            }
        });
        zzcfeVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzj.zza();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcR)).booleanValue() && (zzavnVarZzc = this.zzl.zzc()) != null) {
            zzavnVarZzc.zzo(zzcfeVar.zzF());
        }
        zzddq zzddqVar = this.zzh;
        Executor executor = this.zzg;
        zzddqVar.zzo(zzcfeVar, executor);
        zzddqVar.zzo(new zzazb() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // com.google.android.gms.internal.ads.zzazb
            public final void zzdr(zzaza zzazaVar) {
                zzcgw zzcgwVarZzN = zzcfeVar.zzN();
                Rect rect = zzazaVar.zzd;
                zzcgwVarZzN.zzr(rect.left, rect.top, false);
            }
        }, executor);
        zzddqVar.zza(zzcfeVar.zzF());
        zzcfeVar.zzag("/trackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzi.zzh(zzcfeVar);
            }
        });
        this.zzi.zzi(zzcfeVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(bundle, zzdrk.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
