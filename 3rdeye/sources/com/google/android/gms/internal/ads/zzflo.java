package com.google.android.gms.internal.ads;

import A2.l;
import S1.k;
import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflo {
    private final zzflq zza;
    private final WebView zzb;
    private zzfnq zzc;
    private final HashMap zzd;
    private final zzfmd zze;

    private zzflo(zzflq zzflqVar, WebView webView, boolean z10) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfmd();
        zzfmz.zza();
        this.zza = zzflqVar;
        this.zzb = webView;
        if (zza() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfld) it.next()).zzd(webView);
            }
            this.zzc = new zzfnq(webView);
        }
        if (!l.B("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzh();
        R1.d.a(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfln(this));
    }

    public static zzflo zzb(zzflq zzflqVar, WebView webView, boolean z10) {
        return new zzflo(zzflqVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzflo zzfloVar, String str) {
        HashMap map = zzfloVar.zzd;
        zzfld zzfldVar = (zzfld) map.get(str);
        if (zzfldVar != null) {
            zzfldVar.zzc();
            map.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zze(zzflo zzfloVar, String str) {
        zzfli zzfliVar = zzfli.DEFINED_BY_JAVASCRIPT;
        zzfll zzfllVar = zzfll.DEFINED_BY_JAVASCRIPT;
        zzflp zzflpVar = zzflp.JAVASCRIPT;
        zzflh zzflhVar = new zzflh(zzfle.zza(zzfliVar, zzfllVar, zzflpVar, zzflpVar, false), zzflf.zzb(zzfloVar.zza, zzfloVar.zzb, null, null), str);
        zzfloVar.zzd.put(str, zzflhVar);
        zzflhVar.zzd(zzfloVar.zza());
        for (zzfmc zzfmcVar : zzfloVar.zze.zza()) {
            zzflhVar.zzb((View) zzfmcVar.zzb().get(), zzfmcVar.zza(), zzfmcVar.zzc());
        }
        zzflhVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        WebView webView = this.zzb;
        int i = R1.d.f11635a;
        if (!k.f11859d.d()) {
            throw k.a();
        }
        R1.d.c(webView).f11864a.removeWebMessageListener("omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        zzfnq zzfnqVar = this.zzc;
        if (zzfnqVar == null) {
            return null;
        }
        return (View) zzfnqVar.get();
    }

    public final void zzf(View view, zzflk zzflkVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfld) it.next()).zzb(view, zzflkVar, "Ad overlay");
        }
        this.zze.zzb(view, zzflkVar, "Ad overlay");
    }

    public final void zzg(zzcfv zzcfvVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfld) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzflm(this, zzcfvVar, timer), 1000L);
    }
}
