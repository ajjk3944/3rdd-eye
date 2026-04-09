package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeta implements zzetu {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetb zzc = new zzetb(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgdm zzd;
    private final ScheduledExecutorService zze;
    private final zzejm zzf;
    private final Context zzg;
    private final zzfco zzh;
    private final zzeji zzi;
    private final zzdps zzj;
    private final zzdui zzk;
    private final int zzl;

    public zzeta(zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, String str, zzejm zzejmVar, Context context, zzfco zzfcoVar, zzeji zzejiVar, zzdps zzdpsVar, zzdui zzduiVar, int i) {
        this.zzd = zzgdmVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejmVar;
        this.zzg = context;
        this.zzh = zzfcoVar;
        this.zzi = zzejiVar;
        this.zzj = zzdpsVar;
        this.zzk = zzduiVar;
        this.zzl = i;
    }

    public static /* synthetic */ A4.a zzc(zzeta zzetaVar) {
        zzeta zzetaVar2;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlg)).booleanValue() ? zzetaVar.zzh.zzf.toLowerCase(Locale.ROOT) : zzetaVar.zzh.zzf;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbN)).booleanValue() ? zzetaVar.zzk.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbW)).booleanValue()) {
            zzetaVar2 = zzetaVar;
            zzetaVar2.zzi(arrayList, zzetaVar2.zzf.zza(zzetaVar2.zza, lowerCase));
        } else {
            zzejm zzejmVar = zzetaVar.zzf;
            for (Map.Entry entry : ((zzfyi) zzejmVar.zzb(zzetaVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                zzeta zzetaVar3 = zzetaVar;
                arrayList.add(zzetaVar3.zzg(str, (List) entry.getValue(), zzetaVar.zzf(str), true, true));
                zzetaVar = zzetaVar3;
            }
            zzetaVar2 = zzetaVar;
            zzetaVar2.zzi(arrayList, zzejmVar.zzc());
        }
        return zzgdb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = zzeta.zzb;
                JSONArray jSONArray = new JSONArray();
                for (A4.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzetb(jSONArray.toString(), bundleZzg);
            }
        }, zzetaVar2.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ A4.a zzd(final com.google.android.gms.internal.ads.zzeta r7, java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws android.os.RemoteException {
        /*
            com.google.android.gms.internal.ads.zzcai r3 = new com.google.android.gms.internal.ads.zzcai
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.internal.ads.zzbdc.zzbO
            com.google.android.gms.internal.ads.zzbda r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzeji r12 = r7.zzi
            r12.zzb(r8)
            com.google.android.gms.internal.ads.zzbrn r12 = r12.zza(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdps r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbrn r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzbE
            com.google.android.gms.internal.ads.zzbda r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r9.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.ads.zzejp.zzb(r8, r3)
            goto Lb9
        L4d:
            throw r1
        L4e:
            com.google.android.gms.internal.ads.zzejp r0 = new com.google.android.gms.internal.ads.zzejp
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzv.zzD()
            long r4 = r12.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.internal.ads.zzbdc.zzbJ
            com.google.android.gms.internal.ads.zzbda r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r12.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8a
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzesz r12 = new com.google.android.gms.internal.ads.zzesz
            r12.<init>()
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzbC
            com.google.android.gms.internal.ads.zzbda r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8a:
            if (r11 == 0) goto Lb6
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.internal.ads.zzbdc.zzbQ
            com.google.android.gms.internal.ads.zzbda r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r11.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Laf
            com.google.android.gms.internal.ads.zzgdm r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzesw r0 = new com.google.android.gms.internal.ads.zzesw
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lb9
        Laf:
            r1 = r7
            r4 = r9
            r7 = r10
            r1.zzh(r2, r7, r4, r0)
            goto Lb9
        Lb6:
            r0.zzd()
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeta.zzd(com.google.android.gms.internal.ads.zzeta, java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):A4.a");
    }

    public static /* synthetic */ void zze(zzeta zzetaVar, zzbrn zzbrnVar, Bundle bundle, List list, zzejp zzejpVar, zzcai zzcaiVar) {
        try {
            zzetaVar.zzh(zzbrnVar, bundle, list, zzejpVar);
        } catch (RemoteException e4) {
            zzcaiVar.zzd(e4);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgcs zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgch zzgchVar = new zzgch() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzgch
            public final A4.a zza() {
                return zzeta.zzd(this.zza, str, list, bundle, z10, z11);
            }
        };
        zzgdm zzgdmVar = this.zzd;
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzgdb.zzk(zzgchVar, zzgdmVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbJ)).booleanValue()) {
            zzgcsVarZzw = (zzgcs) zzgdb.zzo(zzgcsVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgcs) zzgdb.zze(zzgcsVarZzw, Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzeta.zzb;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznj)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgdmVar);
    }

    private final void zzh(zzbrn zzbrnVar, Bundle bundle, List list, zzejp zzejpVar) throws RemoteException {
        zzbrnVar.zzh(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejpVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzejq zzejqVar = (zzejq) ((Map.Entry) it.next()).getValue();
            String str = zzejqVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejqVar.zze), zzf(str), zzejqVar.zzb, zzejqVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        if (this.zzl == 2) {
            return zzgdb.zzh(zzc);
        }
        zzfco zzfcoVar = this.zzh;
        if (zzfcoVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbP)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcoVar.zzd)))) {
                return zzgdb.zzh(zzc);
            }
        }
        return zzgdb.zzk(new zzgch() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzgch
            public final A4.a zza() {
                return zzeta.zzc(this.zza);
            }
        }, this.zzd);
    }
}
