package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.vungle.ads.internal.presenter.g;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.C5537a;
import s.f;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbeh {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdsh zzd;
    private Runnable zze;
    private zzbee zzf;
    private i zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbeh(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdsh zzdshVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdshVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbdc.zzkd)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbee r0 = r6.zzf
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto L91
            s.i r0 = r6.zzg
            if (r0 == 0) goto L91
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto L91
            long r1 = r6.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()
            long r1 = r1.elapsedRealtime()
            long r3 = r6.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzkd
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L91
        L4d:
            s.i r1 = r6.zzg
            java.lang.String r2 = r6.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle     // Catch: android.os.RemoteException -> L79
            r4.<init>()     // Catch: android.os.RemoteException -> L79
            boolean r5 = r4.isEmpty()     // Catch: android.os.RemoteException -> L79
            if (r5 == 0) goto L69
            r4 = 0
        L69:
            s.e r5 = r1.f45896c
            b.b r1 = r1.f45895b
            if (r4 == 0) goto L76
            r3.putAll(r4)     // Catch: android.os.RemoteException -> L79
            r1.h(r5, r2, r3)     // Catch: android.os.RemoteException -> L79
            goto L79
        L76:
            r1.b(r5, r2)     // Catch: android.os.RemoteException -> L79
        L79:
            java.lang.Runnable r1 = r6.zze
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzke
            com.google.android.gms.internal.ads.zzbda r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L91:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbeh.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) throws JSONException {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkg));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e4);
        }
    }

    public final i zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(g.ERROR, str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    public final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkc)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbef
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, f fVar, String str, C5537a c5537a) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdsh zzdshVar = this.zzd;
        zzbee zzbeeVar = new zzbee(this, c5537a, zzdshVar);
        this.zzf = zzbeeVar;
        i iVarC = fVar.c(zzbeeVar);
        this.zzg = iVarC;
        if (iVarC == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzdshVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            i iVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zza());
            }
            iVar.a(jSONObject.toString());
            zzbeg zzbegVar = new zzbeg(this, str);
            if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbegVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbegVar);
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e4);
        }
    }

    public final void zzi(long j4) {
        this.zzj = j4;
    }
}
