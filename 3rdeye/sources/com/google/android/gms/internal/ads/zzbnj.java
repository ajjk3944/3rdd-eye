package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbnj implements zzbnb, zzbna {
    private final zzcfe zza;

    public zzbnj(Context context, VersionInfoParcel versionInfoParcel, zzavs zzavsVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcfq {
        com.google.android.gms.ads.internal.zzv.zzB();
        zzcfe zzcfeVarZza = zzcfr.zza(context, zzcgy.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbca.zza(), null, null, null, null, null);
        this.zza = zzcfeVarZza;
        zzcfeVarZza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmz.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmz.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmz.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbng
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadData(str, "text/html", Constants.ENCODING);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.loadData(str2, "text/html", Constants.ENCODING);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzboi zzj() {
        return new zzboi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzk(final zzbnm zzbnmVar) {
        zzcgw zzcgwVarZzN = this.zza.zzN();
        Objects.requireNonNull(zzbnmVar);
        zzcgwVarZzN.zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzbne
            @Override // com.google.android.gms.internal.ads.zzcgv
            public final void zza() {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
                zzbnm zzbnmVar2 = zzbnmVar;
                final long j4 = zzbnmVar2.zzc;
                final ArrayList arrayList = zzbnmVar2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j4));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzfrn zzfrnVar = com.google.android.gms.ads.internal.util.zzs.zza;
                final zzbog zzbogVar = zzbnmVar2.zza;
                final zzbof zzbofVar = zzbnmVar2.zzd;
                final zzbnb zzbnbVar = zzbnmVar2.zze;
                zzfrnVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbog.zzi(zzbogVar, zzbofVar, zzbnbVar, arrayList, j4);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzbmz.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzq(String str, zzbkd zzbkdVar) {
        this.zza.zzag(str, new zzbni(this, zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzr(String str, final zzbkd zzbkdVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbnc
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbkd zzbkdVar2 = (zzbkd) obj;
                if (zzbkdVar2 instanceof zzbni) {
                    return ((zzbni) zzbkdVar2).zzb.equals(zzbkdVar);
                }
                return false;
            }
        });
    }
}
