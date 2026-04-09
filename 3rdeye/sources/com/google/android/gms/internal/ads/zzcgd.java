package com.google.android.gms.internal.ads;

import A2.l;
import F3.h;
import S1.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfrn;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.k0;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
final class zzcgd extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfe {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcgg zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbgb zzE;
    private zzbfz zzF;
    private zzbao zzG;
    private int zzH;
    private int zzI;
    private zzbdo zzJ;
    private final zzbdo zzK;
    private zzbdo zzL;
    private final zzbdp zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbca zzY;
    private boolean zzZ;
    private final zzcgx zzb;
    private final zzavs zzc;
    private final zzfcs zzd;
    private final zzbej zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfbt zzk;
    private zzfbw zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfm zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzecz zzq;
    private zzecx zzr;
    private zzcgy zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcgd(zzcgx zzcgxVar, zzcgy zzcgyVar, String str, boolean z10, boolean z11, zzavs zzavsVar, zzbej zzbejVar, VersionInfoParcel versionInfoParcel, zzbdr zzbdrVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbca zzbcaVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzfcs zzfcsVar) {
        zzfbw zzfbwVar2;
        super(zzcgxVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcgxVar;
        this.zzs = zzcgyVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzavsVar;
        this.zzd = zzfcsVar;
        this.zze = zzbejVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzv.zzr();
        DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        this.zzi = displayMetricsZzu;
        this.zzj = displayMetricsZzu.density;
        this.zzY = zzbcaVar;
        this.zzk = zzfbtVar;
        this.zzl = zzfbwVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcgxVar.zza(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlP)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to enable Javascript.", e4);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlO)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznq)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.zzr().zzc(zzcgxVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzv.zzr();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfrn zzfrnVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaX)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgk(this, new zzcgj(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbdp zzbdpVar = new zzbdp(new zzbdr(true, "make_wv", this.zzt));
        this.zzM = zzbdpVar;
        zzbdpVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue() && (zzfbwVar2 = this.zzl) != null && zzfbwVar2.zzb != null) {
            zzbdpVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdpVar.zza();
        zzbdo zzbdoVarZzf = zzbdr.zzf();
        this.zzK = zzbdoVarZzf;
        zzbdpVar.zzb("native:view_create", zzbdoVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzcgxVar);
        com.google.android.gms.ads.internal.zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzfbt zzfbtVar = this.zzk;
        if (zzfbtVar != null && zzfbtVar.zzam) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzv.zzp().zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbd(boolean z10) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z10 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfy
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcgd zzcgdVar = this.zza;
                    String str3 = this.zzb;
                    super/*android.webkit.WebView*/.loadUrl("about:blank");
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbdj.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcdl) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbdp zzbdpVar = this.zzM;
        if (zzbdpVar == null) {
            return;
        }
        zzbdr zzbdrVarZza = zzbdpVar.zza();
        zzbdh zzbdhVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg();
        if (zzbdhVarZzg != null) {
            zzbdhVarZzg.zzf(zzbdrVarZza);
        }
    }

    private final synchronized void zzbj() {
        Boolean boolZzl = com.google.android.gms.ads.internal.zzv.zzp().zzl();
        this.zzy = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void destroy() {
        try {
            zzbi();
            this.zzQ.zza();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzl();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzA().zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkZ)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activityZza = this.zzb.zza();
            if (activityZza != null && activityZza.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzla)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcad.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzl();
                        com.google.android.gms.ads.internal.zzv.zzA().zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzaE()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcga
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrl");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzaE()) {
                this.zzQ.zzc();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z10 = this.zzC;
            zzcfm zzcfmVar = this.zzo;
            if (zzcfmVar != null && zzcfmVar.zzW()) {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
                z10 = true;
            }
            zzbd(z10);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfm zzcfmVar;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    this.zzQ.zzd();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcfmVar = this.zzo) != null && zzcfmVar.zzW() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlo)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.zzr();
            com.google.android.gms.ads.internal.util.zzs.zzU(getContext(), intent);
        } catch (ActivityNotFoundException e4) {
            String strF = Oo.f("Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze(strF);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zZzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaZ) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgd.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmN)).booleanValue() && l.B("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Muting webview");
                int i10 = R1.d.f11635a;
                if (!k.f11861f.d()) {
                    throw k.a();
                }
                R1.d.c(this).f11864a.setAudioMuted(true);
            }
        } catch (Exception e4) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not pause webview.", e4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmQ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmN)).booleanValue() && l.B("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Unmuting webview");
                int i10 = R1.d.f11635a;
                if (!k.f11861f.d()) {
                    throw k.a();
                }
                R1.d.c(this).f11864a.setAudioMuted(false);
            }
        } catch (Exception e4) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not resume webview.", e4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmQ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdL)).booleanValue() && this.zzo.zzT();
        if ((!this.zzo.zzW() || this.zzo.zzU()) && !z10) {
            zzavs zzavsVar = this.zzc;
            if (zzavsVar != null) {
                zzavsVar.zzd(motionEvent);
            }
            zzbej zzbejVar = this.zze;
            if (zzbejVar != null) {
                zzbejVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbgb zzbgbVar = this.zzE;
                    if (zzbgbVar != null) {
                        zzbgbVar.zzd(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfm) {
            this.zzo = (zzcfm) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not stop loading webview.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzC(zzcgg zzcggVar) {
        if (this.zzB == null) {
            this.zzB = zzcggVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcev
    public final zzfbt zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgr
    public final zzavs zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzbao zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzbgb zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final /* synthetic */ zzcgw zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgq
    public final synchronized zzcgy zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzecx zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzecz zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgh
    public final zzfbw zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzfcs zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final A4.a zzT() {
        zzbej zzbejVar = this.zze;
        return zzbejVar == null ? zzgdb.zzh(null) : zzbejVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzW(zzfbt zzfbtVar, zzfbw zzfbwVar) {
        this.zzk = zzfbtVar;
        this.zzl = zzfbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzY() {
        zzbg();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzZ(int i) {
        if (i == 0) {
            zzbdp zzbdpVar = this.zzM;
            zzbdj.zza(zzbdpVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        zzbdp zzbdpVar2 = this.zzM;
        zzbdpVar2.zza();
        zzbdpVar2.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaA(String str, Predicate predicate) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzS(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaD(final boolean z10, final int i) {
        destroy();
        zzbbz zzbbzVar = new zzbbz() { // from class: com.google.android.gms.internal.ads.zzcfz
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                int i10 = zzcgd.zza;
                zzbch.zzbl.zza zzaVarZzb = zzbch.zzbl.zzb();
                boolean zZzf = zzaVarZzb.zzf();
                boolean z11 = z10;
                if (zZzf != z11) {
                    zzaVarZzb.zzd(z11);
                }
                zzaVarZzb.zze(i);
                zzaVar.zzab(zzaVarZzb.zzbr());
            }
        };
        zzbca zzbcaVar = this.zzY;
        zzbcaVar.zzb(zzbbzVar);
        zzbcaVar.zzc(k0.CONFIGURATION_ERROR);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        this.zzo.zzv(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaK(String str, String str2, int i) throws NumberFormatException {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaL(boolean z10, int i, boolean z11) throws NumberFormatException {
        this.zzo.zzx(z10, i, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaM(boolean z10, int i, String str, String str2, boolean z11) throws NumberFormatException {
        this.zzo.zzz(z10, i, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaN(boolean z10, int i, String str, boolean z11, boolean z12) throws NumberFormatException {
        this.zzo.zzA(z10, i, str, z11, z12);
    }

    public final zzcfm zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaV(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaW(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaX("javascript:".concat(str));
            return;
        }
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaV(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzy(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaZ() throws org.json.JSONException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcfm r0 = r10.zzo
            boolean r0 = r0.zzV()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcfm r0 = r10.zzo
            boolean r0 = r0.zzW()
            if (r0 == 0) goto L86
        L11:
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.internal.ads.zzcgx r2 = r10.zzb
            android.app.Activity r2 = r2.zza()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            com.google.android.gms.ads.internal.zzv.zzr()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzR(r2)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r6)
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            com.google.android.gms.ads.internal.zzv.zzr()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L87
            int r2 = r10.zzR
            if (r2 != r5) goto L87
            int r2 = r10.zzT
            if (r2 != r6) goto L87
            int r2 = r10.zzU
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzah
            com.google.android.gms.internal.ads.zzbda r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.zzV
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.zzS
            if (r2 != r4) goto La5
            int r2 = r10.zzR
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzah
            com.google.android.gms.internal.ads.zzbda r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.zzV
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbss r3 = new com.google.android.gms.internal.ads.zzbss
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzj(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgd.zzaZ():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbdp zzbdpVar = this.zzM;
            zzbdj.zza(zzbdpVar.zza(), this.zzK, "aes2");
            zzbdpVar.zza();
            zzbdo zzbdoVarZzf = zzbdr.zzf();
            this.zzJ = zzbdoVarZzf;
            zzbdpVar.zzb("native:view_show", zzbdoVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzab() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzv.zzt().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzv.zzt().zza()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(getContext())));
        zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzac(boolean z10) {
        this.zzo.zzm(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzae(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzaE()) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzae);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e4) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to build MRAID_ENV", e4);
                        str4 = null;
                    }
                    super.loadDataWithBaseURL(str, zzcgp.zzb(str2, str4), "text/html", Constants.ENCODING, null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaf() {
        if (this.zzL == null) {
            zzbdp zzbdpVar = this.zzM;
            zzbdpVar.zza();
            zzbdo zzbdoVarZzf = zzbdr.zzf();
            this.zzL = zzbdoVarZzf;
            zzbdpVar.zzb("native:view_load", zzbdoVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzag(String str, zzbkd zzbkdVar) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzB(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaj(zzcgy zzcgyVar) {
        this.zzs = zzcgyVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzak(zzbao zzbaoVar) {
        this.zzG = zzbaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzal(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzan(Context context) {
        zzcgx zzcgxVar = this.zzb;
        zzcgxVar.setBaseContext(context);
        this.zzQ.zze(zzcgxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzao(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzV(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzap(zzbfz zzbfzVar) {
        this.zzF = zzbfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaq(boolean z10) {
        try {
            boolean z11 = this.zzw;
            this.zzw = z10;
            zzba();
            if (z10 != z11) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaf)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbss(this, "").zzl(true != z10 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzar(zzbgb zzbgbVar) {
        this.zzE = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzas(zzecx zzecxVar) {
        this.zzr = zzecxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzat(zzecz zzeczVar) {
        this.zzq = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzau(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzav(boolean z10) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzax(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z10 ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzay(boolean z10) {
        if (z10) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaz(String str, zzbkd zzbkdVar) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzR(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzb(String str, String str2) {
        zzaW(h.i(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbb.zzb().zzo(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzdi() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzazaVar.zzj;
            this.zzC = z10;
        }
        zzbd(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbD = j6.l.d("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbD.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(string));
        zzaW(sbD.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzbdo zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final zzbdp zzl() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcbz
    public final VersionInfoParcel zzm() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzcbo zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized zzcdl zzo(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcdl) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzp(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized zzcgg zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized String zzr() {
        zzfbw zzfbwVar = this.zzl;
        if (zzfbwVar == null) {
            return null;
        }
        return zzfbwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzt(String str, zzcdl zzcdlVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcdlVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv(boolean z10, long j4) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        map.put("duration", Long.toString(j4));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzw() {
        zzbfz zzbfzVar = this.zzF;
        if (zzbfzVar != null) {
            final zzdms zzdmsVar = (zzdms) zzbfzVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmq
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmsVar.zzd();
                    } catch (RemoteException e4) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzz(boolean z10) {
        this.zzo.zzF(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgt
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzy(int i) {
    }
}
