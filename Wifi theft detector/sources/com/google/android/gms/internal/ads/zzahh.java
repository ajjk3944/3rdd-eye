package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes2.dex */
final class zzahh extends zzahm {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzahh(zzagh zzaghVar) {
        super(zzaghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zza(zzer zzerVar) throws zzahl {
        if (this.zzc) {
            zzerVar.zzk(1);
        } else {
            int iZzs = zzerVar.zzs();
            int i10 = iZzs >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm(MimeTypes.AUDIO_MPEG);
                zztVar.zzE(1);
                zztVar.zzF(i11);
                this.zza.zzz(zztVar.zzM());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzl("video/x-flv");
                zztVar2.zzm(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                zztVar2.zzE(1);
                zztVar2.zzF(8000);
                this.zza.zzz(zztVar2.zzM());
                this.zzd = true;
            } else if (i10 != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i10);
                throw new zzahl(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zzb(zzer zzerVar, long j10) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzerVar.zzd();
            zzagh zzaghVar = this.zza;
            zzaghVar.zzc(zzerVar, iZzd);
            zzaghVar.zze(j10, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzerVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzerVar.zzd();
            zzagh zzaghVar2 = this.zza;
            zzaghVar2.zzc(zzerVar, iZzd2);
            zzaghVar2.zze(j10, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzerVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzerVar.zzm(bArr, 0, iZzd3);
        zzads zzadsVarZza = zzadt.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzl("video/x-flv");
        zztVar.zzm(MimeTypes.AUDIO_AAC);
        zztVar.zzj(zzadsVarZza.zzc);
        zztVar.zzE(zzadsVarZza.zzb);
        zztVar.zzF(zzadsVarZza.zza);
        zztVar.zzp(Collections.singletonList(bArr));
        this.zza.zzz(zztVar.zzM());
        this.zzd = true;
        return false;
    }
}
