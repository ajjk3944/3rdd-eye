package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzru extends zztp implements zzlb {
    private final Context zzb;
    private final zzqg zzc;
    private final zzqo zzd;
    private final zztb zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzz zzi;
    private zzz zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzru(Context context, zztd zztdVar, zztr zztrVar, boolean z10, Handler handler, zzqh zzqhVar, zzqo zzqoVar) {
        super(1, zztdVar, zztrVar, false, 44100.0f);
        zzrt zzrtVar = null;
        zztb zztbVar = Build.VERSION.SDK_INT >= 35 ? new zztb(zzta.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqoVar;
        this.zze = zztbVar;
        this.zzo = -1000;
        this.zzc = new zzqg(handler, zzqhVar);
        zzqoVar.zzq(new zzrs(this, zzrtVar));
    }

    private final int zzaW(zzti zztiVar, zzz zzzVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zztiVar.zza) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && zzex.zzN(this.zzb))) {
            return zzzVar.zzp;
        }
        return -1;
    }

    private static List zzaX(zztr zztrVar, zzz zzzVar, boolean z10, zzqo zzqoVar) throws zztw {
        zzti zztiVarZza;
        return zzzVar.zzo == null ? zzfyf.zzn() : (!zzqoVar.zzA(zzzVar) || (zztiVarZza = zzuc.zza()) == null) ? zzuc.zze(zztrVar, zzzVar, false, false) : zzfyf.zzo(zztiVarZza);
    }

    private final void zzaY() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzb = Math.max(this.zzk, jZzb);
            }
            this.zzk = jZzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzA() {
        zztb zztbVar;
        this.zzd.zzk();
        if (Build.VERSION.SDK_INT < 35 || (zztbVar = this.zze) == null) {
            return;
        }
        zztbVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzE() {
        zzaY();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        int iMax = -1;
        for (zzz zzzVar2 : zzzVarArr) {
            int i = zzzVar2.zzH;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        if (zzcU() == 2) {
            zzaY();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final int zzaa(zztr zztrVar, zzz zzzVar) throws zztw {
        int i;
        boolean z10;
        String str = zzzVar.zzo;
        if (!zzay.zzh(str)) {
            return 128;
        }
        int i10 = zzzVar.zzN;
        boolean zZzaU = zztp.zzaU(zzzVar);
        int i11 = 1;
        if (!zZzaU || (i10 != 0 && zzuc.zza() == null)) {
            i = 0;
        } else {
            zzqo zzqoVar = this.zzd;
            zzps zzpsVarZzd = zzqoVar.zzd(zzzVar);
            if (zzpsVarZzd.zzb) {
                i = true != zzpsVarZzd.zzc ? AdRequest.MAX_CONTENT_URL_LENGTH : 1536;
                if (zzpsVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzqoVar.zzA(zzzVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzA(zzzVar)) {
            zzqo zzqoVar2 = this.zzd;
            if (zzqoVar2.zzA(zzex.zzA(2, zzzVar.zzG, zzzVar.zzH))) {
                List listZzaX = zzaX(zztrVar, zzzVar, false, zzqoVar2);
                if (!listZzaX.isEmpty()) {
                    if (zZzaU) {
                        zzti zztiVar = (zzti) listZzaX.get(0);
                        boolean zZzf = zztiVar.zzf(zzzVar);
                        if (zZzf) {
                            z10 = true;
                        } else {
                            for (int i12 = 1; i12 < listZzaX.size(); i12++) {
                                zzti zztiVar2 = (zzti) listZzaX.get(i12);
                                if (zztiVar2.zzf(zzzVar)) {
                                    z10 = false;
                                    zZzf = true;
                                    zztiVar = zztiVar2;
                                    break;
                                }
                            }
                            z10 = true;
                        }
                        int i13 = true != zZzf ? 3 : 4;
                        int i14 = 8;
                        if (zZzf && zztiVar.zzg(zzzVar)) {
                            i14 = 16;
                        }
                        return i13 | i14 | 32 | (true != zztiVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128) | i;
                    }
                    i11 = 2;
                }
            }
        }
        return i11 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i10;
        zzie zzieVarZzc = zztiVar.zzc(zzzVar, zzzVar2);
        int i11 = zzieVarZzc.zze;
        if (zzaO(zzzVar2)) {
            i11 |= Constants.QUEUE_ELEMENT_MAX_SIZE;
        }
        if (zzaW(zztiVar, zzzVar2) > this.zzf) {
            i11 |= 64;
        }
        String str = zztiVar.zza;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = zzieVarZzc.zzd;
        }
        return new zzie(str, zzzVar, zzzVar2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzac(zzkv zzkvVar) throws zzin {
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzi = zzzVar;
        zzie zzieVarZzac = super.zzac(zzkvVar);
        this.zzc.zzw(zzzVar, zzieVarZzac);
        return zzieVarZzac;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zztp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zztc zzag(com.google.android.gms.internal.ads.zzti r10, com.google.android.gms.internal.ads.zzz r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzru.zzag(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztc");
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final List zzah(zztr zztrVar, zzz zzzVar, boolean z10) throws zztw {
        return zzuc.zzf(zzaX(zztrVar, zzzVar, false, this.zzd), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzak(zzhs zzhsVar) {
        zzz zzzVar;
        if (Build.VERSION.SDK_INT < 29 || (zzzVar = zzhsVar.zza) == null || !Objects.equals(zzzVar.zzo, "audio/opus") || !zzaN()) {
            return;
        }
        ByteBuffer byteBuffer = zzhsVar.zzf;
        byteBuffer.getClass();
        zzz zzzVar2 = zzhsVar.zza;
        zzzVar2.getClass();
        int i = zzzVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzal(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzn(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzam(String str, zztc zztcVar, long j4, long j10) {
        this.zzc.zzs(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzan(String str) {
        this.zzc.zzt(str);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzao(zzz zzzVar, MediaFormat mediaFormat) throws zzin {
        int i;
        zzz zzzVar2 = this.zzj;
        int[] iArr = null;
        boolean z10 = true;
        if (zzzVar2 != null) {
            zzzVar = zzzVar2;
        } else if (zzaB() != null) {
            mediaFormat.getClass();
            int iZzn = "audio/raw".equals(zzzVar.zzo) ? zzzVar.zzI : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzex.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzx zzxVar = new zzx();
            zzxVar.zzah("audio/raw");
            zzxVar.zzab(iZzn);
            zzxVar.zzM(zzzVar.zzJ);
            zzxVar.zzN(zzzVar.zzK);
            zzxVar.zzaa(zzzVar.zzl);
            zzxVar.zzS(zzzVar.zza);
            zzxVar.zzU(zzzVar.zzb);
            zzxVar.zzV(zzzVar.zzc);
            zzxVar.zzW(zzzVar.zzd);
            zzxVar.zzaj(zzzVar.zze);
            zzxVar.zzaf(zzzVar.zzf);
            zzxVar.zzD(mediaFormat.getInteger("channel-count"));
            zzxVar.zzai(mediaFormat.getInteger("sample-rate"));
            zzz zzzVarZzan = zzxVar.zzan();
            if (this.zzg && zzzVarZzan.zzG == 6 && (i = zzzVar.zzG) < 6) {
                iArr = new int[i];
                for (int i10 = 0; i10 < i; i10++) {
                    iArr[i10] = i10;
                }
            } else if (this.zzh) {
                int i11 = zzzVarZzan.zzG;
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzzVar = zzzVarZzan;
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                if (zzaN()) {
                    zzn();
                }
                if (i12 < 29) {
                    z10 = false;
                }
                zzdd.zzf(z10);
            }
            this.zzd.zze(zzzVar, 0, iArr);
        } catch (zzqj e4) {
            throw zzcX(e4, e4.zza, false, 5001);
        }
    }

    public final void zzap() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaq() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzar() throws zzin {
        try {
            this.zzd.zzj();
        } catch (zzqn e4) {
            throw zzcX(e4, e4.zzc, e4.zzb, true != zzaN() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzas(long j4, long j10, zztf zztfVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, zzz zzzVar) throws zzin {
        byteBuffer.getClass();
        if (this.zzj != null && (i10 & 2) != 0) {
            zztfVar.getClass();
            zztfVar.zzo(i, false);
            return true;
        }
        if (z10) {
            if (zztfVar != null) {
                zztfVar.zzo(i, false);
            }
            ((zztp) this).zza.zzf += i11;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j11, i11)) {
                return false;
            }
            if (zztfVar != null) {
                zztfVar.zzo(i, false);
            }
            ((zztp) this).zza.zze += i11;
            return true;
        } catch (zzqk e4) {
            zzz zzzVar2 = this.zzi;
            if (zzaN()) {
                zzn();
            }
            throw zzcX(e4, zzzVar2, e4.zzb, 5001);
        } catch (zzqn e10) {
            if (zzaN()) {
                zzn();
            }
            throw zzcX(e10, zzzVar, e10.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzat(zzz zzzVar) {
        zzn();
        return this.zzd.zzA(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzbb zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzbb zzbbVar) {
        this.zzd.zzs(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final boolean zzj() {
        boolean z10 = this.zzn;
        this.zzn = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public final void zzu(int i, Object obj) throws zzin {
        zztb zztbVar;
        if (i == 2) {
            zzqo zzqoVar = this.zzd;
            obj.getClass();
            zzqoVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zze zzeVar = (zze) obj;
            zzqo zzqoVar2 = this.zzd;
            zzeVar.getClass();
            zzqoVar2.zzm(zzeVar);
            return;
        }
        if (i == 6) {
            zzf zzfVar = (zzf) obj;
            zzqo zzqoVar3 = this.zzd;
            zzfVar.getClass();
            zzqoVar3.zzo(zzfVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zztf zztfVarZzaB = zzaB();
            if (zztfVarZzaB == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zztfVarZzaB.zzq(bundle);
            return;
        }
        if (i == 9) {
            zzqo zzqoVar4 = this.zzd;
            obj.getClass();
            zzqoVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzu(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzn(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zztbVar = this.zze) == null) {
                return;
            }
            zztbVar.zzd(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzu(((zztp) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzy(boolean z10, boolean z11) throws zzin {
        super.zzy(z10, z11);
        this.zzc.zzv(((zztp) this).zza);
        zzn();
        zzqo zzqoVar = this.zzd;
        zzqoVar.zzt(zzo());
        zzqoVar.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzz(long j4, boolean z10) throws zzin {
        super.zzz(j4, z10);
        this.zzd.zzf();
        this.zzk = j4;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final zzlb zzl() {
        return this;
    }
}
