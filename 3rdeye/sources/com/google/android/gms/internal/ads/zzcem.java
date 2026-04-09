package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcem extends zzcbq implements zzhj, zzmr {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdx zzc;
    private final zzyu zzd;
    private final zzcby zze;
    private final WeakReference zzf;
    private final zzwo zzg;
    private zziy zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbp zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdz zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcem(android.content.Context r4, com.google.android.gms.internal.ads.zzcby r5, com.google.android.gms.internal.ads.zzcbz r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcem.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcby, com.google.android.gms.internal.ads.zzcbz, java.lang.Integer):void");
    }

    public static /* synthetic */ zzgj zzW(zzcem zzcemVar, String str, boolean z10) {
        zzcem zzcemVar2 = true != z10 ? null : zzcemVar;
        zzcby zzcbyVar = zzcemVar.zze;
        return new zzcep(str, zzcemVar2, zzcbyVar.zzd, zzcbyVar.zze, zzcbyVar.zzm, zzcbyVar.zzn);
    }

    public static /* synthetic */ zzgj zzX(zzcem zzcemVar, String str, boolean z10) {
        zzcem zzcemVar2 = true != z10 ? null : zzcemVar;
        zzcby zzcbyVar = zzcemVar.zze;
        zzcdw zzcdwVar = new zzcdw(str, zzcemVar2, zzcbyVar.zzd, zzcbyVar.zze, zzcbyVar.zzh);
        zzcemVar.zzu.add(new WeakReference(zzcdwVar));
        return zzcdwVar;
    }

    public static /* synthetic */ zzgj zzY(zzcem zzcemVar, String str, boolean z10) {
        zzgr zzgrVar = new zzgr();
        zzgrVar.zzf(str);
        zzgrVar.zze(true != z10 ? null : zzcemVar);
        zzcby zzcbyVar = zzcemVar.zze;
        zzgrVar.zzc(zzcbyVar.zzd);
        zzgrVar.zzd(zzcbyVar.zze);
        zzgrVar.zzb(true);
        return zzgrVar.zza();
    }

    public static /* synthetic */ zzgj zzZ(zzcem zzcemVar, zzgi zzgiVar) {
        zzgj zzgjVarZza = zzgiVar.zza();
        zzcej zzcejVar = new zzcej(zzcemVar);
        return new zzcdz(zzcemVar.zzb, zzgjVarZza, zzcemVar.zzo, zzcemVar.zzp, zzcemVar, zzcejVar);
    }

    public static /* synthetic */ void zzab(zzcem zzcemVar, boolean z10, long j4) {
        zzcbp zzcbpVar = zzcemVar.zzk;
        if (zzcbpVar != null) {
            zzcbpVar.zzi(z10, j4);
        }
    }

    public static /* synthetic */ zzma[] zzac(zzcem zzcemVar, Handler handler, zzaci zzaciVar, zzqh zzqhVar, zzxn zzxnVar, zzuf zzufVar) {
        zztr zztrVar = zztr.zza;
        Context context = zzcemVar.zzb;
        zzru zzruVar = new zzru(context, new zzsx(context, null, null), zztrVar, false, handler, zzqhVar, new zzrc(context).zzc());
        zzaay zzaayVar = new zzaay(context);
        zzaayVar.zzg(zztrVar);
        zzaayVar.zze(handler);
        zzaayVar.zzf(zzaciVar);
        return new zzma[]{zzruVar, zzaayVar.zzh()};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcbq.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j4 = this.zzn;
                    Map mapZze = ((zzhe) arrayList.remove(0)).zze();
                    long j10 = 0;
                    if (mapZze != null) {
                        Iterator it = mapZze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfuk.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j4 + j10;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzvj zzvzVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzvzVar = zzaa(uriArr[0]);
            } else {
                zzvj[] zzvjVarArr = new zzvj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvjVarArr[i] = zzaa(uriArr[i]);
                }
                zzvzVar = new zzvz(false, false, new zzus(), zzvjVarArr);
            }
            this.zzh.zzC(zzvzVar);
            this.zzh.zzq();
            zzcbq.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzH() {
        zziy zziyVar = this.zzh;
        if (zziyVar != null) {
            zziyVar.zzB(this);
            this.zzh.zzA();
            this.zzh = null;
            zzcbq.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzI(long j4) {
        this.zzh.zza(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzK(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzL(zzcbp zzcbpVar) {
        this.zzk = zzcbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzN(int i) {
        this.zzc.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzQ(boolean z10) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzyu zzyuVar = this.zzd;
            zzyh zzyhVarZzc = zzyuVar.zzf().zzc();
            zzyhVarZzc.zzx(i, !z10);
            zzyuVar.zzl(zzyhVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdw zzcdwVar = (zzcdw) ((WeakReference) it.next()).get();
            if (zzcdwVar != null) {
                zzcdwVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzS(Surface surface, boolean z10) {
        zziy zziyVar = this.zzh;
        if (zziyVar != null) {
            zziyVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzT(float f10, boolean z10) {
        zziy zziyVar = this.zzh;
        if (zziyVar != null) {
            zziyVar.zzt(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final boolean zzV() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zza(zzgj zzgjVar, zzgo zzgoVar, boolean z10, int i) {
        this.zzl += i;
    }

    public final zzvj zzaa(Uri uri) {
        zzad zzadVar = new zzad();
        zzadVar.zzb(uri);
        zzap zzapVarZzc = zzadVar.zzc();
        zzwo zzwoVar = this.zzg;
        zzwoVar.zza(this.zze.zzf);
        return zzwoVar.zzb(zzapVarZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd(zzgj zzgjVar, zzgo zzgoVar, boolean z10) {
        if (zzgjVar instanceof zzhe) {
            synchronized (this.zzq) {
                this.zzs.add((zzhe) zzgjVar);
            }
        } else if (zzgjVar instanceof zzcdz) {
            this.zzt = (zzcdz) zzgjVar;
            final zzcbz zzcbzVar = (zzcbz) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue() && zzcbzVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcei
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcem.zza;
                        zzcbzVar.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zze(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
        zzcbz zzcbzVar = (zzcbz) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue() || zzcbzVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzzVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcbzVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzh(zzmp zzmpVar, int i, long j4) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzj(zzmp zzmpVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z10) {
        zzcbp zzcbpVar = this.zzk;
        if (zzcbpVar != null) {
            if (this.zze.zzj) {
                zzcbpVar.zzl("onLoadException", iOException);
            } else {
                zzcbpVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzk(zzmp zzmpVar, int i) {
        zzcbp zzcbpVar = this.zzk;
        if (zzcbpVar != null) {
            zzcbpVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzl(zzmp zzmpVar, zzba zzbaVar) {
        zzcbp zzcbpVar = this.zzk;
        if (zzcbpVar != null) {
            zzcbpVar.zzk("onPlayerError", zzbaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzn(zzmp zzmpVar, Object obj, long j4) {
        zzcbp zzcbpVar = this.zzk;
        if (zzcbpVar != null) {
            zzcbpVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzp(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
        zzcbz zzcbzVar = (zzcbz) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue() || zzcbzVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzzVar.zzz));
        map.put("bitRate", String.valueOf(zzzVar.zzj));
        map.put("resolution", zzzVar.zzv + "x" + zzzVar.zzw);
        String str = zzzVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcbzVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzq(zzmp zzmpVar, zzcd zzcdVar) {
        zzcbp zzcbpVar = this.zzk;
        if (zzcbpVar != null) {
            zzcbpVar.zzD(zzcdVar.zzb, zzcdVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final int zzt() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzv() {
        return this.zzh.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzy() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final long zzz() {
        return this.zzh.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzg(zzmp zzmpVar, zzvd zzvdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzi(zzbh zzbhVar, zzmq zzmqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzo(zzmp zzmpVar, zzid zzidVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzb(zzgj zzgjVar, zzgo zzgoVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzc(zzgj zzgjVar, zzgo zzgoVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzf(zzmp zzmpVar, int i, long j4, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzm(zzmp zzmpVar, zzbf zzbfVar, zzbf zzbfVar2, int i) {
    }
}
