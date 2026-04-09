package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcfw extends FrameLayout implements zzcfe {
    private final zzcfe zza;
    private final zzcbo zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfw(zzcfe zzcfeVar, zzdsc zzdscVar) {
        super(zzcfeVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfeVar;
        this.zzb = new zzcbo(zzcfeVar.zzE(), this, this, zzdscVar);
        addView((View) zzcfeVar);
    }

    public static /* synthetic */ void zzaI(zzcfw zzcfwVar, boolean z10) {
        zzcfe zzcfeVar = zzcfwVar.zza;
        zzfrn zzfrnVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcfeVar);
        zzfrnVar.post(new zzcfs(zzcfeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void destroy() {
        final zzecx zzecxVarZzP;
        final zzecz zzeczVarZzQ = zzQ();
        if (zzeczVarZzQ != null) {
            zzfrn zzfrnVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfrnVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzC().zzi(zzeczVarZzQ.zza());
                }
            });
            zzcfe zzcfeVar = this.zza;
            Objects.requireNonNull(zzcfeVar);
            zzfrnVar.postDelayed(new zzcfs(zzcfeVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfv)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() || (zzecxVarZzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfu
                @Override // java.lang.Runnable
                public final void run() {
                    zzecxVarZzP.zzf(new zzcfv(this.zza));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", Constants.ENCODING, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfe
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfe
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final void zzC(zzcgg zzcggVar) {
        this.zza.zzC(zzcggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcev
    public final zzfbt zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgr
    public final zzavs zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzbao zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzbgb zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzcgw zzN() {
        return ((zzcgd) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgq
    public final zzcgy zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzecx zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzecz zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgh
    public final zzfbw zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzfcs zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final A4.a zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzW(zzfbt zzfbtVar, zzfbw zzfbwVar) {
        this.zza.zzW(zzfbtVar, zzfbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        ((zzcgd) this.zza).zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaD(boolean z10, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaY)).booleanValue()) {
            return false;
        }
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcfeVar.getParent()).removeView((View) zzcfeVar);
        }
        zzcfeVar.zzaD(z10, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zza.zzaJ(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaK(String str, String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaL(boolean z10, int i, boolean z11) {
        this.zza.zzaL(z10, i, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaM(boolean z10, int i, String str, String str2, boolean z11) {
        this.zza.zzaM(z10, i, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaN(boolean z10, int i, String str, boolean z11, boolean z12) {
        this.zza.zzaN(z10, i, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzac(boolean z10) {
        this.zza.zzac(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzag(String str, zzbkd zzbkdVar) {
        this.zza.zzag(str, zzbkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzah() {
        zzecz zzeczVarZzQ;
        zzecx zzecxVarZzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzv.zzr();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && (zzecxVarZzP = zzP()) != null) {
            zzecxVarZzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfw)).booleanValue() && (zzeczVarZzQ = zzQ()) != null && zzeczVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzC().zzg(zzeczVarZzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaj(zzcgy zzcgyVar) {
        this.zza.zzaj(zzcgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzak(zzbao zzbaoVar) {
        this.zza.zzak(zzbaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzao(boolean z10) {
        this.zza.zzao(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzap(zzbfz zzbfzVar) {
        this.zza.zzap(zzbfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaq(boolean z10) {
        this.zza.zzaq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzar(zzbgb zzbgbVar) {
        this.zza.zzar(zzbgbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzas(zzecx zzecxVar) {
        this.zza.zzas(zzecxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzat(zzecz zzeczVar) {
        this.zza.zzat(zzeczVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzav(boolean z10) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzax(boolean z10) {
        this.zza.zzax(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzay(boolean z10) {
        this.zza.zzay(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaz(String str, zzbkd zzbkdVar) {
        this.zza.zzaz(str, zzbkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzdi() {
        this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        this.zza.zzdr(zzazaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzee)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzee)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzbdo zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final zzbdp zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcbz
    public final VersionInfoParcel zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzcbo zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzcdl zzo(String str) {
        return this.zza.zzo(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzp(String str, JSONObject jSONObject) {
        ((zzcgd) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final zzcgg zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final String zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final void zzt(String str, zzcdl zzcdlVar) {
        this.zza.zzt(str, zzcdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv(boolean z10, long j4) {
        this.zza.zzv(z10, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgt
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzy(int i) {
    }
}
