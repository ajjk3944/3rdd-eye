package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import s.C5537a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdrg implements zzdaq, com.google.android.gms.ads.internal.client.zza, zzcwl, zzcvv, zzcyh {
    private final Context zzc;
    private final zzfdg zzd;
    private final zzdsc zze;
    private final zzfcf zzf;
    private final zzfbt zzg;
    private final zzebs zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgU)).booleanValue();

    public zzdrg(Context context, zzfdg zzfdgVar, zzdsc zzdscVar, zzfcf zzfcfVar, zzfbt zzfbtVar, zzebs zzebsVar, String str) {
        this.zzc = context;
        this.zzd = zzfdgVar;
        this.zze = zzdscVar;
        this.zzf = zzfcfVar;
        this.zzg = zzfbtVar;
        this.zzh = zzebsVar;
        this.zzi = str;
    }

    private final zzdsb zzf(String str) {
        zzfcf zzfcfVar = this.zzf;
        zzfce zzfceVar = zzfcfVar.zzb;
        zzdsb zzdsbVarZza = this.zze.zza();
        zzdsbVarZza.zzd(zzfceVar.zzb);
        zzfbt zzfbtVar = this.zzg;
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzb("action", str);
        zzdsbVarZza.zzb("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfbtVar.zzt;
        if (!list.isEmpty()) {
            zzdsbVarZza.zzb("ancn", (String) list.get(0));
        }
        if (zzfbtVar.zzb()) {
            zzdsbVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zzc) ? "offline" : C5537a.ONLINE_EXTRAS_KEY);
            zzdsbVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()));
            zzdsbVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhb)).booleanValue()) {
            boolean zZzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfcfVar);
            zzdsbVarZza.zzb("scar", String.valueOf(zZzf));
            if (zZzf) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcfVar.zza.zza.zzd;
                zzdsbVarZza.zzb("ragent", zzmVar.zzp);
                zzdsbVarZza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdsbVarZza;
    }

    private final void zzg(zzdsb zzdsbVar) {
        if (!this.zzg.zzb()) {
            zzdsbVar.zzj();
            return;
        }
        this.zzh.zzd(new zzebu(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdsbVar.zze(), 2));
    }

    private final boolean zzh() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    private final boolean zzi() {
        String strZzq;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbD);
                    com.google.android.gms.ads.internal.zzv.zzr();
                    try {
                        strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zzc);
                    } catch (RemoteException unused) {
                        strZzq = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzq != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzq);
                        } catch (RuntimeException e4) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdsbVarZzf.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdsbVarZzf.zzb("areec", strZza);
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzd() {
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "blocked");
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
        if (zzi()) {
            zzf("adapter_shown").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        if (zzi()) {
            zzdsb zzdsbVarZzf = zzf("adapter_impression");
            zzdsbVarZzf.zzb("imp_type", String.valueOf(this.zzg.zze));
            boolean z10 = this.zzb.get();
            String str = CommonUrlParts.Values.FALSE_INTEGER;
            if (z10) {
                zzdsbVarZzf.zzb("po", "1");
                zzdsbVarZzf.zzb("pil", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - this.zzj));
            } else {
                zzdsbVarZzf.zzb("po", CommonUrlParts.Values.FALSE_INTEGER);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                com.google.android.gms.ads.internal.zzv.zzr();
                zzdsbVarZzf.zzb(Aa.f39095g, true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc) ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                if (true == this.zza.get()) {
                    str = "1";
                }
                zzdsbVarZzf.zzb("fg_show", str);
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zze(zzdgf zzdgfVar) {
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgfVar.getMessage())) {
                zzdsbVarZzf.zzb("msg", zzdgfVar.getMessage());
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        if (zzi() || this.zzg.zzb()) {
            zzdsb zzdsbVarZzf = zzf(AdSDKNotificationListener.IMPRESSION_EVENT);
            zzdsbVarZzf.zzb("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdsbVarZzf.zzb("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                com.google.android.gms.ads.internal.zzv.zzr();
                boolean zZzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc);
                String str = CommonUrlParts.Values.FALSE_INTEGER;
                zzdsbVarZzf.zzb(Aa.f39095g, true != zZzH ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                if (true == this.zza.get()) {
                    str = "1";
                }
                zzdsbVarZzf.zzb("fg_show", str);
            }
            zzg(zzdsbVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzu() {
        if (zzi()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            zzdsb zzdsbVarZzf = zzf("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzv.zzr();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc));
                zzdsbVarZzf.zzb(Aa.f39095g, true != atomicBoolean.get() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            zzdsbVarZzf.zzj();
        }
    }
}
