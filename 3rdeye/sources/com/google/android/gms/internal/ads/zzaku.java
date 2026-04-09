package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaku implements zzaez {
    private final zzaez zza;
    private final zzakp zzb;
    private zzakr zzg;
    private zzz zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzex.zzb;
    private final zzen zzc = new zzen();

    public zzaku(zzaez zzaezVar, zzakp zzakpVar) {
        this.zza = zzaezVar;
        this.zzb = zzakpVar;
    }

    public static /* synthetic */ void zza(zzaku zzakuVar, long j4, int i, zzakj zzakjVar) {
        zzdd.zzb(zzakuVar.zzh);
        zzfyf zzfyfVar = zzakjVar.zza;
        long j10 = zzakjVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfyfVar.size());
        Iterator<E> it = zzfyfVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcu) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzen zzenVar = zzakuVar.zzc;
        int length = bArrMarshall.length;
        zzenVar.zzJ(bArrMarshall, length);
        zzaez zzaezVar = zzakuVar.zza;
        zzaezVar.zzr(zzenVar, length);
        long j11 = zzakjVar.zzb;
        if (j11 == -9223372036854775807L) {
            zzdd.zzf(zzakuVar.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j12 = zzakuVar.zzh.zzt;
            j4 = j12 == Long.MAX_VALUE ? j4 + j11 : j11 + j12;
        }
        zzaezVar.zzt(j4, i | 1, length, 0, null);
    }

    private final void zzc(int i) {
        int length = this.zzf.length;
        int i10 = this.zze;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.zzd;
        int iMax = Math.max(i11 + i11, i + i11);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i11);
        this.zzd = 0;
        this.zze = i11;
        this.zzf = bArr2;
    }

    public final void zzb(boolean z10) {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i, boolean z10) {
        return zzaex.zza(this, zzlVar, i, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i, boolean z10, int i10) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i, z10, 0);
        }
        zzc(i);
        int iZza = zzlVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
        String str = zzzVar.zzo;
        str.getClass();
        zzdd.zzd(zzay.zzb(str) == 3);
        if (!zzzVar.equals(this.zzh)) {
            this.zzh = zzzVar;
            zzakp zzakpVar = this.zzb;
            this.zzg = zzakpVar.zzc(zzzVar) ? zzakpVar.zzb(zzzVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzzVar);
            return;
        }
        zzaez zzaezVar = this.zza;
        zzx zzxVarZzb = zzzVar.zzb();
        zzxVarZzb.zzah("application/x-media3-cues");
        zzxVarZzb.zzE(str);
        zzxVarZzb.zzal(Long.MAX_VALUE);
        zzxVarZzb.zzI(this.zzb.zza(zzzVar));
        zzaezVar.zzm(zzxVarZzb.zzan());
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i) {
        zzaex.zzb(this, zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i, int i10) {
        if (this.zzg == null) {
            this.zza.zzs(zzenVar, i, i10);
            return;
        }
        zzc(i);
        zzenVar.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(final long j4, final int i, int i10, int i11, zzaey zzaeyVar) {
        if (this.zzg == null) {
            this.zza.zzt(j4, i, i10, i11, zzaeyVar);
            return;
        }
        zzdd.zze(zzaeyVar == null, "DRM on subtitles is not supported");
        int i12 = (this.zze - i11) - i10;
        try {
            this.zzg.zza(this.zzf, i12, i10, zzakq.zza(), new zzdn() { // from class: com.google.android.gms.internal.ads.zzakt
                @Override // com.google.android.gms.internal.ads.zzdn
                public final void zza(Object obj) {
                    zzaku.zza(this.zza, j4, i, (zzakj) obj);
                }
            });
        } catch (RuntimeException e4) {
            if (!this.zzi) {
                throw e4;
            }
            zzea.zzg("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e4);
        }
        int i13 = i12 + i10;
        this.zzd = i13;
        if (i13 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j4) {
    }
}
