package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbsr extends zzbss implements zzbkd {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfe zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbck zzk;
    private float zzl;
    private int zzm;

    public zzbsr(zzcfe zzcfeVar, Context context, zzbck zzbckVar) {
        super(zzcfeVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfeVar;
        this.zzi = context;
        this.zzk = zzbckVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcfe zzcfeVar = this.zzh;
        Activity activityZzi = zzcfeVar.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzv.zzr();
            int[] iArrZzR = com.google.android.gms.ads.internal.util.zzs.zzR(activityZzi);
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzR[0]);
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzR[1]);
        }
        if (zzcfeVar.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcfeVar.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsq zzbsqVar = new zzbsq();
        zzbck zzbckVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsqVar.zze(zzbckVar.zza(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsqVar.zzc(zzbckVar.zza(intent2));
        zzbsqVar.zza(zzbckVar.zzb());
        zzbsqVar.zzd(zzbckVar.zzc());
        zzbsqVar.zzb(true);
        boolean z10 = zzbsqVar.zza;
        boolean z11 = zzbsqVar.zzb;
        boolean z12 = zzbsqVar.zzc;
        boolean z13 = zzbsqVar.zzd;
        try {
            jSONObjectPut = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", zzbsqVar.zze);
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e4);
            jSONObjectPut = null;
        }
        zzcfeVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcfeVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Dispatching Ready Event.");
        }
        zzi(zzcfeVar.zzm().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.internal.zzv.zzr()
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = com.google.android.gms.ads.internal.util.zzs.zzS(r1)
            r1 = r1[r2]
            goto L15
        L14:
            r1 = r2
        L15:
            com.google.android.gms.internal.ads.zzcfe r3 = r8.zzh
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            if (r4 == 0) goto L27
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            boolean r4 = r4.zzi()
            if (r4 != 0) goto L75
        L27:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.internal.ads.zzbdc.zzag
            com.google.android.gms.internal.ads.zzbda r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            if (r4 != 0) goto L51
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            if (r4 == 0) goto L50
            com.google.android.gms.internal.ads.zzcgy r4 = r3.zzO()
            int r4 = r4.zzb
            goto L51
        L50:
            r4 = r2
        L51:
            if (r5 != 0) goto L60
            com.google.android.gms.internal.ads.zzcgy r5 = r3.zzO()
            if (r5 == 0) goto L61
            com.google.android.gms.internal.ads.zzcgy r2 = r3.zzO()
            int r2 = r2.zza
            goto L61
        L60:
            r2 = r5
        L61:
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbb.zzb()
            int r4 = r5.zzb(r0, r4)
            r8.zzf = r4
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbb.zzb()
            int r0 = r4.zzb(r0, r2)
            r8.zzg = r0
        L75:
            int r0 = r10 - r1
            int r1 = r8.zzf
            int r2 = r8.zzg
            r8.zzg(r9, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcgw r0 = r3.zzN()
            r0.zzE(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsr.zzb(int, int):void");
    }
}
