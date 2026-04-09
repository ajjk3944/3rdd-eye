package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcct implements zzgj {
    private final Context zza;
    private final zzgj zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbm zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgo zzl;

    public zzcct(Context context, zzgj zzgjVar, String str, int i, zzhj zzhjVar, zzccs zzccsVar) {
        this.zza = context;
        this.zzb = zzgjVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeB)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeC)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i10) : this.zzb.zza(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        Long l5;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgoVar.zza;
        this.zzh = uri;
        this.zzl = zzgoVar;
        this.zzi = zzbbm.zza(uri);
        zzbbj zzbbjVarZzb = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzey)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgoVar.zze;
                this.zzi.zzi = zzfvv.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbbjVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
            }
            if (zzbbjVarZzb != null && zzbbjVarZzb.zze()) {
                this.zzj = zzbbjVarZzb.zzg();
                this.zzk = zzbbjVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbbjVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgoVar.zze;
            this.zzi.zzi = zzfvv.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeA);
            } else {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzez);
            }
            long jLongValue = l5.longValue();
            com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
            com.google.android.gms.ads.internal.zzv.zzd();
            Future futureZza = zzbbx.zza(this.zza, this.zzi);
            try {
                try {
                    zzbby zzbbyVar = (zzbby) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbbyVar.zzd();
                    this.zzj = zzbbyVar.zzf();
                    this.zzk = zzbbyVar.zze();
                    zzbbyVar.zza();
                    if (!zzg()) {
                        this.zzf = zzbbyVar.zzc();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgm zzgmVarZza = zzgoVar.zza();
            zzgmVarZza.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzgmVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
    }
}
