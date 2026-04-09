package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzuj implements zzwa {
    private final zzady zza;
    private zzadt zzb;
    private zzadu zzc;

    public zzuj(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzaep zzaepVar) throws IOException {
        zzadt zzadtVar = this.zzb;
        zzadtVar.getClass();
        zzadu zzaduVar = this.zzc;
        zzaduVar.getClass();
        return zzadtVar.zzb(zzaduVar, zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        zzadu zzaduVar = this.zzc;
        if (zzaduVar != null) {
            return zzaduVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzc() {
        zzadt zzadtVar = this.zzb;
        if (zzadtVar != null && (zzadtVar instanceof zzaic)) {
            ((zzaic) zzadtVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzd(zzl zzlVar, Uri uri, Map map, long j4, long j10, zzadw zzadwVar) throws IOException {
        zzadj zzadjVar = new zzadj(zzlVar, j4, j10);
        this.zzc = zzadjVar;
        if (this.zzb != null) {
            return;
        }
        zzadt[] zzadtVarArrZza = this.zza.zza(uri, map);
        int length = zzadtVarArrZza.length;
        zzfyc zzfycVarZzi = zzfyf.zzi(length);
        boolean z10 = true;
        if (length == 1) {
            this.zzb = zzadtVarArrZza[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzadt zzadtVar = zzadtVarArrZza[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzadjVar.zzf() == j4) {
                    }
                } catch (Throwable th) {
                    if (this.zzb == null && zzadjVar.zzf() != j4) {
                        z10 = false;
                    }
                    zzdd.zzf(z10);
                    zzadjVar.zzj();
                    throw th;
                }
                if (zzadtVar.zzi(zzadjVar)) {
                    this.zzb = zzadtVar;
                    zzdd.zzf(true);
                    zzadjVar.zzj();
                    break;
                } else {
                    zzfycVarZzi.zzh(zzadtVar.zzd());
                    boolean z11 = this.zzb != null || zzadjVar.zzf() == j4;
                    zzdd.zzf(z11);
                    zzadjVar.zzj();
                    i++;
                }
            }
            if (this.zzb == null) {
                Iterator it = zzfyv.zzc(zzfyf.zzm(zzadtVarArrZza), new zzfut() { // from class: com.google.android.gms.internal.ads.zzui
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        zzadt zzadtVar2 = (zzadt) obj;
                        zzadtVar2.zzc();
                        return zzadtVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzfuw.zzc(sb, it, ", ");
                throw new zzxl(C1154e9.i("None of the available extractors (", sb.toString(), ") could read the stream."), uri, zzfycVarZzi.zzi());
            }
        }
        this.zzb.zze(zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzf(long j4, long j10) {
        zzadt zzadtVar = this.zzb;
        zzadtVar.getClass();
        zzadtVar.zzf(j4, j10);
    }
}
