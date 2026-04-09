package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public interface zzcfe extends com.google.android.gms.ads.internal.client.zza, zzddw, zzcev, zzbmy, zzcgh, zzcgl, zzbnk, zzazb, zzcgo, com.google.android.gms.ads.internal.zzn, zzcgr, zzcgs, zzcbz, zzcgt {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i10);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbz
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbz
    void zzC(zzcgg zzcggVar);

    @Override // com.google.android.gms.internal.ads.zzcev
    zzfbt zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgt
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgr
    zzavs zzI();

    zzbao zzJ();

    zzbgb zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzcgw zzN();

    @Override // com.google.android.gms.internal.ads.zzcgq
    zzcgy zzO();

    zzecx zzP();

    zzecz zzQ();

    @Override // com.google.android.gms.internal.ads.zzcgh
    zzfbw zzR();

    zzfcs zzS();

    A4.a zzT();

    String zzU();

    List zzV();

    void zzW(zzfbt zzfbtVar, zzfbw zzfbwVar);

    void zzX();

    void zzY();

    void zzZ(int i);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z10, int i);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z10);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbkd zzbkdVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzcgy zzcgyVar);

    void zzak(zzbao zzbaoVar);

    void zzal(boolean z10);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z10);

    void zzap(zzbfz zzbfzVar);

    void zzaq(boolean z10);

    void zzar(zzbgb zzbgbVar);

    void zzas(zzecx zzecxVar);

    void zzat(zzecz zzeczVar);

    void zzau(int i);

    void zzav(boolean z10);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z10);

    void zzay(boolean z10);

    void zzaz(String str, zzbkd zzbkdVar);

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbz
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcbz
    zzbdp zzl();

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcbz
    VersionInfoParcel zzm();

    @Override // com.google.android.gms.internal.ads.zzcbz
    zzcgg zzq();

    @Override // com.google.android.gms.internal.ads.zzcbz
    void zzt(String str, zzcdl zzcdlVar);
}
