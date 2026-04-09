package com.google.android.gms.internal.ads;

import L0.I;
import L0.S;
import android.annotation.TargetApi;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.singular.sdk.internal.SingularParamsBase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzcfm extends WebViewClient implements zzcgw {
    public static final /* synthetic */ int zzb = 0;
    private zzdsc zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzecd zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbxy zza;
    private final zzcfe zzc;
    private final zzbca zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcgu zzi;
    private zzcgv zzj;
    private zzbit zzk;
    private zzbiv zzl;
    private zzddw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbsr zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbsm zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfR)).split(StringUtils.COMMA)));

    public zzcfm(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z10, zzbsr zzbsrVar, zzbsm zzbsmVar, zzecd zzecdVar) {
        this.zzd = zzbcaVar;
        this.zzc = zzcfeVar;
        this.zzs = z10;
        this.zzx = zzbsrVar;
        this.zzG = zzecdVar;
    }

    private static WebResourceResponse zzY() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaW)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzr();
        com.google.android.gms.ads.internal.zzv.zzr();
        r1 = r10.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        r12 = r1.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0120, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzr();
        r1 = r10.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
    
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        if (r3 >= r1.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        if (r1[r3].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r5 = r1[r3].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
    
        if (r5.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        r6 = r5[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0161, code lost:
    
        r0 = r10.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        r3 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
    
        if (r3.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018c, code lost:
    
        if (r3.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0198, code lost:
    
        if (r3.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019a, code lost:
    
        r1.put(r3.getKey(), r3.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:
    
        r6 = com.google.android.gms.ads.internal.zzv.zzs().zzb(r12, r13, r10.getResponseCode(), r10.getResponseMessage(), r1, r10.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zzZ(java.lang.String r19, java.util.Map r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfm.zzZ(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbkd) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(final View view, final zzbxy zzbxyVar, final int i) {
        if (!zzbxyVar.zzi() || i <= 0) {
            return;
        }
        zzbxyVar.zzg(view);
        if (zzbxyVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzac(view, zzbxyVar, i - 1);
                }
            }, 100L);
        }
    }

    private static final boolean zzad(zzcfe zzcfeVar) {
        return zzcfeVar.zzD() != null && zzcfeVar.zzD().zzb();
    }

    private static final boolean zzae(boolean z10, zzcfe zzcfeVar) {
        return (!z10 || zzcfeVar.zzO().zzi() || zzcfeVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    public static /* synthetic */ void zzh(zzcfm zzcfmVar) throws JSONException {
        zzcfe zzcfeVar = zzcfmVar.zzc;
        zzcfeVar.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcfeVar.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzz();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzn(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcfe zzcfeVar = this.zzc;
                if (zzcfeVar.zzaE()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcfeVar.zzX();
                    return;
                }
                this.zzB = true;
                zzcgv zzcgvVar = this.zzj;
                if (zzcgvVar != null) {
                    zzcgvVar.zza();
                    this.zzj = null;
                }
                zzk();
                zzcfe zzcfeVar2 = this.zzc;
                if (zzcfeVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmg)).booleanValue()) {
                        zzcfeVar2.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzn(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxy zzbxyVar = this.zza;
                        if (zzbxyVar != null) {
                            zzbxyVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzddw zzddwVar = this.zzm;
                    if (zzddwVar != null) {
                        zzddwVar.zzdf();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcfe zzcfeVar = this.zzc;
            if (zzcfeVar.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzavs zzavsVarZzI = zzcfeVar.zzI();
                    zzfcs zzfcsVarZzS = zzcfeVar.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmk)).booleanValue() || zzfcsVarZzS == null) {
                        if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                            uriZza = zzavsVarZzI.zza(uriZza, zzcfeVar.getContext(), (View) zzcfeVar, zzcfeVar.zzi());
                        }
                    } else if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                        uriZza = zzfcsVarZzS.zza(uriZza, zzcfeVar.getContext(), (View) zzcfeVar, zzcfeVar.zzi());
                    }
                } catch (zzavt unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzc()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null);
                    zzcfe zzcfeVar2 = this.zzc;
                    zzv(zzcVar, true, false, zzcfeVar2 != null ? zzcfeVar2.zzr() : "");
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(boolean z10, int i, String str, boolean z11, boolean z12) throws NumberFormatException {
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean zZzae = zzae(zZzaF, zzcfeVar);
        boolean z13 = true;
        if (!zZzae && z11) {
            z13 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzae ? null : this.zzg;
        zzcfl zzcflVar = zZzaF ? null : new zzcfl(zzcfeVar, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzecd zzecdVar = null;
        zzbiv zzbivVar = this.zzl;
        boolean z14 = z13;
        zzcfl zzcflVar2 = zzcflVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzm = zzcfeVar.zzm();
        zzddw zzddwVar = z14 ? null : this.zzm;
        if (zzad(zzcfeVar)) {
            zzecdVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(zzaVar, zzcflVar2, zzbitVar, zzbivVar, zzadVar, zzcfeVar, z10, i, str, versionInfoParcelZzm, zzddwVar, zzecdVar, z12));
    }

    public final void zzB(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbkdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzC(zzcgu zzcguVar) {
        this.zzi = zzcguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzD(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzE(int i, int i10) {
        zzbsm zzbsmVar = this.zzz;
        if (zzbsmVar != null) {
            zzbsmVar.zze(i, i10);
        }
    }

    public final void zzF(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzG(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzH(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzI() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzcfm.zzh(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzJ(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzK(zzcgv zzcgvVar) {
        this.zzj = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzL(zzbxy zzbxyVar) {
        this.zza = zzbxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzM(zzcml zzcmlVar, zzebs zzebsVar, zzfjq zzfjqVar) {
        zzQ("/click");
        if (zzebsVar != null && zzfjqVar != null) {
            zzB("/click", new zzfcw(this.zzm, zzcmlVar, zzfjqVar, zzebsVar));
            return;
        }
        zzddw zzddwVar = this.zzm;
        zzbkd zzbkdVar = zzbkc.zza;
        zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzN(zzcml zzcmlVar) {
        zzQ("/click");
        zzddw zzddwVar = this.zzm;
        zzbkd zzbkdVar = zzbkc.zza;
        zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzO(zzcml zzcmlVar, zzebs zzebsVar, zzdsc zzdscVar) {
        zzQ("/open");
        zzB("/open", new zzbkp(this.zzy, this.zzz, zzebsVar, zzdscVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzP(zzfbt zzfbtVar) {
        zzcfe zzcfeVar = this.zzc;
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfeVar.getContext())) {
            zzQ("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbkj(zzcfeVar.getContext(), zzfbtVar.zzaw));
        }
    }

    public final void zzQ(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzR(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbkdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzS(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbkd> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbkd zzbkdVar : list) {
                    if (predicate.apply(zzbkdVar)) {
                        arrayList.add(zzbkdVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzT() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzU() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final boolean zzV() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzW() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzX(com.google.android.gms.ads.internal.client.zza zzaVar, zzbit zzbitVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z10, zzbkg zzbkgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbst zzbstVar, zzbxy zzbxyVar, final zzebs zzebsVar, final zzfjq zzfjqVar, zzdsc zzdscVar, zzbkx zzbkxVar, zzddw zzddwVar, zzbkw zzbkwVar, zzbkq zzbkqVar, zzbke zzbkeVar, zzcml zzcmlVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxyVar, null) : zzbVar;
        zzcfe zzcfeVar = this.zzc;
        this.zzz = new zzbsm(zzcfeVar, zzbstVar);
        this.zza = zzbxyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbd)).booleanValue()) {
            zzB("/adMetadata", new zzbis(zzbitVar));
        }
        if (zzbivVar != null) {
            zzB("/appEvent", new zzbiu(zzbivVar));
        }
        zzB("/backButton", zzbkc.zzj);
        zzB("/refresh", zzbkc.zzk);
        zzB("/canOpenApp", zzbkc.zzb);
        zzB("/canOpenURLs", zzbkc.zza);
        zzB("/canOpenIntents", zzbkc.zzc);
        zzB("/close", zzbkc.zzd);
        zzB("/customClose", zzbkc.zze);
        zzB("/instrument", zzbkc.zzn);
        zzB("/delayPageLoaded", zzbkc.zzp);
        zzB("/delayPageClosed", zzbkc.zzq);
        zzB("/getLocationInfo", zzbkc.zzr);
        zzB("/log", zzbkc.zzg);
        zzB("/mraid", new zzbkk(zzbVar2, this.zzz, zzbstVar));
        zzbsr zzbsrVar = this.zzx;
        if (zzbsrVar != null) {
            zzB("/mraidLoaded", zzbsrVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbkp(zzbVar3, this.zzz, zzebsVar, zzdscVar, zzcmlVar));
        zzB("/precache", new zzcdm());
        zzB("/touch", zzbkc.zzi);
        zzB("/video", zzbkc.zzl);
        zzB("/videoMeta", zzbkc.zzm);
        if (zzebsVar == null || zzfjqVar == null) {
            zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
            zzB("/httpTrack", zzbkc.zzf);
        } else {
            zzB("/click", new zzfcw(zzddwVar, zzcmlVar, zzfjqVar, zzebsVar));
            zzB("/httpTrack", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzfcx
                @Override // com.google.android.gms.internal.ads.zzbkd
                public final void zza(Object obj, Map map) {
                    zzcev zzcevVar = (zzcev) obj;
                    String str = (String) map.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
                    if (str == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfbt zzfbtVarZzD = zzcevVar.zzD();
                    if (zzfbtVarZzD != null && !zzfbtVarZzD.zzai) {
                        zzfjqVar.zzd(str, zzfbtVarZzD.zzax, null, null);
                        return;
                    }
                    zzfbw zzfbwVarZzR = ((zzcgh) zzcevVar).zzR();
                    if (zzfbwVarZzR != null) {
                        zzebsVar.zzd(new zzebu(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis(), zzfbwVarZzR.zzb, str, 2));
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfeVar.getContext())) {
            Map map = new HashMap();
            if (zzcfeVar.zzD() != null) {
                map = zzcfeVar.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbkj(zzcfeVar.getContext(), map));
        }
        if (zzbkgVar != null) {
            zzB("/setInterstitialProperties", new zzbkf(zzbkgVar));
        }
        if (zzbkxVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkxVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjz)).booleanValue() && zzbkwVar != null) {
            zzB("/shareSheet", zzbkwVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjE)).booleanValue() && zzbkqVar != null) {
            zzB("/inspectorOutOfContextTest", zzbkqVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjI)).booleanValue() && zzbkeVar != null) {
            zzB("/inspectorStorage", zzbkeVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlL)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbkc.zzu);
            zzB("/presentPlayStoreOverlay", zzbkc.zzv);
            zzB("/expandPlayStoreOverlay", zzbkc.zzw);
            zzB("/collapsePlayStoreOverlay", zzbkc.zzx);
            zzB("/closePlayStoreOverlay", zzbkc.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdz)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbkc.zzA);
            zzB("/resetPAID", zzbkc.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmf)).booleanValue() && zzcfeVar.zzD() != null && zzcfeVar.zzD().zzar) {
            zzB("/writeToLocalStorage", zzbkc.zzB);
            zzB("/clearLocalStorageKeys", zzbkc.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbitVar;
        this.zzl = zzbivVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzddwVar;
        this.zzA = zzdscVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ae A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01ba, B:50:0x016f, B:97:0x0298, B:100:0x02a8, B:102:0x02ae, B:104:0x02bc, B:86:0x0223, B:87:0x0249, B:85:0x01fe, B:49:0x014b, B:32:0x00db, B:88:0x024a, B:90:0x0254, B:92:0x025a, B:94:0x028d), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3 A[Catch: all -> 0x01ae, TryCatch #7 {all -> 0x01ae, blocks: (B:71:0x0193, B:73:0x01a5, B:77:0x01b0, B:81:0x01e1, B:83:0x01f3, B:84:0x01fa), top: B:111:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01ba, B:50:0x016f, B:97:0x0298, B:100:0x02a8, B:102:0x02ae, B:104:0x02bc, B:86:0x0223, B:87:0x0249, B:85:0x01fe, B:49:0x014b, B:32:0x00db, B:88:0x024a, B:90:0x0254, B:92:0x025a, B:94:0x028d), top: B:112:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfm.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final zzdsc zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue()) {
                zzcfe zzcfeVar = this.zzc;
                if (zzcfeVar.zzl() != null) {
                    zzbdj.zza(zzcfeVar.zzl().zza(), zzcfeVar.zzk(), "awfllc");
                }
            }
            zzcgu zzcguVar = this.zzi;
            boolean z10 = false;
            if (!this.zzC && !this.zzo) {
                z10 = true;
            }
            zzcguVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzbxyVar.zzf();
            this.zza = null;
        }
        zzab();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbsm zzbsmVar = this.zzz;
                if (zzbsmVar != null) {
                    zzbsmVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzm(boolean z10) {
        this.zzE = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzn(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgQ)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = zzcfm.zzb;
                    com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfQ)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfS)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgdb.zzr(com.google.android.gms.ads.internal.zzv.zzr().zzb(uri), new zzcfk(this, list, path, uri), zzcad.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzQ(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzo() {
        zzbca zzbcaVar = this.zzd;
        if (zzbcaVar != null) {
            zzbcaVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzq() {
        this.zzD--;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzr(int i, int i10, boolean z10) {
        zzbsr zzbsrVar = this.zzx;
        if (zzbsrVar != null) {
            zzbsrVar.zzb(i, i10);
        }
        zzbsm zzbsmVar = this.zzz;
        if (zzbsmVar != null) {
            zzbsmVar.zzd(i, i10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzs() {
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzcfe zzcfeVar = this.zzc;
            WebView webViewZzG = zzcfeVar.zzG();
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (webViewZzG.isAttachedToWindow()) {
                zzac(webViewZzG, zzbxyVar, 10);
                return;
            }
            zzab();
            zzcfj zzcfjVar = new zzcfj(this, zzbxyVar);
            this.zzH = zzcfjVar;
            ((View) zzcfeVar).addOnAttachStateChangeListener(zzcfjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzu();
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        boolean z12;
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean z13 = false;
        boolean z14 = zzae(zZzaF, zzcfeVar) || z11;
        if (z14 || !z10) {
            z12 = zZzaF;
            z13 = true;
        } else {
            z12 = zZzaF;
        }
        zzy(new AdOverlayInfoParcel(zzcVar, z14 ? null : this.zzg, z12 ? null : this.zzh, this.zzw, zzcfeVar.zzm(), zzcfeVar, z13 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) throws NumberFormatException {
        zzecd zzecdVar = this.zzG;
        zzcfe zzcfeVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcfeVar, zzcfeVar.zzm(), str, str2, 14, zzecdVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbth] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z10, int i, boolean z11) throws NumberFormatException {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzddw zzddwVar;
        ?? r9;
        int i10;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z12;
        zzcfe zzcfeVar = this.zzc;
        boolean zZzae = zzae(zzcfeVar.zzaF(), zzcfeVar);
        boolean z13 = true;
        if (!zZzae && z11) {
            z13 = false;
        }
        if (zZzae) {
            zzaVar = null;
            zzddwVar = null;
        } else {
            zzaVar = this.zzg;
            zzddwVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzddw zzddwVar2 = zzddwVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzm = zzcfeVar.zzm();
        zzddw zzddwVar3 = z13 ? zzddwVar2 : this.zzm;
        if (zzad(zzcfeVar)) {
            r9 = this.zzG;
            z12 = z10;
            i10 = i;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzddwVar2;
            i10 = i;
            zzaVar2 = zzaVar;
            z12 = z10;
        }
        zzy(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcfeVar, z12, i10, versionInfoParcelZzm, zzddwVar3, r9));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbsm zzbsmVar = this.zzz;
        boolean zZzf = zzbsmVar != null ? zzbsmVar.zzf() : false;
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZzf, this.zzA);
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxyVar.zzh(str);
        }
    }

    public final void zzz(boolean z10, int i, String str, String str2, boolean z11) throws NumberFormatException {
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean zZzae = zzae(zZzaF, zzcfeVar);
        boolean z12 = true;
        if (!zZzae && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzae ? null : this.zzg;
        zzcfl zzcflVar = zZzaF ? null : new zzcfl(zzcfeVar, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzecd zzecdVar = null;
        zzbiv zzbivVar = this.zzl;
        boolean z13 = z12;
        zzcfl zzcflVar2 = zzcflVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzm = zzcfeVar.zzm();
        zzddw zzddwVar = z13 ? null : this.zzm;
        if (zzad(zzcfeVar)) {
            zzecdVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(zzaVar, zzcflVar2, zzbitVar, zzbivVar, zzadVar, zzcfeVar, z10, i, str, str2, versionInfoParcelZzm, zzddwVar, zzecdVar));
    }
}
