package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;

    @Nullable
    private zzaeu zzb;

    @Nullable
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzj zzjVar, Uri uri, Map map, long j10, long j11, zzaex zzaexVar) throws IOException {
        zzael zzaelVar = new zzael(zzjVar, j10, j11);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzaeuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzaeuVarArrZzb.length;
        zzguc zzgucVarZzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzaeuVarArrZzb[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                zzaeu zzaeuVar = zzaeuVarArrZzb[i10];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaelVar.zzn() == j10) {
                    }
                } catch (Throwable th) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j10);
                    zzaelVar.zzl();
                    throw th;
                }
                if (zzaeuVar.zza(zzaelVar)) {
                    this.zzb = zzaeuVar;
                    zzgrc.zzi(true);
                    zzaelVar.zzl();
                    break;
                } else {
                    zzgucVarZzv.zzh(zzaeuVar.zzb());
                    boolean z10 = this.zzb != null || zzaelVar.zzn() == j10;
                    zzgrc.zzi(z10);
                    zzaelVar.zzl();
                    i10++;
                }
            }
            if (this.zzb == null) {
                String strZzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzaeuVarArrZzb), zzvl.zza), ", ");
                StringBuilder sb = new StringBuilder(strZzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzd);
                sb.append(") could read the stream.");
                throw new zzyo(sb.toString(), uri, zzgucVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j10, long j11) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
