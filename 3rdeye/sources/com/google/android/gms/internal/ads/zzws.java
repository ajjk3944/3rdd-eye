package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzws {
    private final zzen zza = new zzen(32);
    private zzwr zzb;
    private zzwr zzc;
    private zzwr zzd;
    private long zze;
    private final zzzm zzf;

    public zzws(zzzm zzzmVar) {
        this.zzf = zzzmVar;
        zzwr zzwrVar = new zzwr(0L, 65536);
        this.zzb = zzwrVar;
        this.zzc = zzwrVar;
        this.zzd = zzwrVar;
    }

    private final int zzi(int i) {
        zzwr zzwrVar = this.zzd;
        if (zzwrVar.zzc == null) {
            zzzf zzzfVarZzb = this.zzf.zzb();
            zzwr zzwrVar2 = new zzwr(this.zzd.zzb, 65536);
            zzwrVar.zzc = zzzfVarZzb;
            zzwrVar.zzd = zzwrVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwr zzj(zzwr zzwrVar, long j4) {
        while (j4 >= zzwrVar.zzb) {
            zzwrVar = zzwrVar.zzd;
        }
        return zzwrVar;
    }

    private static zzwr zzk(zzwr zzwrVar, long j4, ByteBuffer byteBuffer, int i) {
        zzwr zzwrVarZzj = zzj(zzwrVar, j4);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzwrVarZzj.zzb - j4));
            byteBuffer.put(zzwrVarZzj.zzc.zza, zzwrVarZzj.zza(j4), iMin);
            i -= iMin;
            j4 += iMin;
            if (j4 == zzwrVarZzj.zzb) {
                zzwrVarZzj = zzwrVarZzj.zzd;
            }
        }
        return zzwrVarZzj;
    }

    private static zzwr zzl(zzwr zzwrVar, long j4, byte[] bArr, int i) {
        zzwr zzwrVarZzj = zzj(zzwrVar, j4);
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzwrVarZzj.zzb - j4));
            System.arraycopy(zzwrVarZzj.zzc.zza, zzwrVarZzj.zza(j4), bArr, i - i10, iMin);
            i10 -= iMin;
            j4 += iMin;
            if (j4 == zzwrVarZzj.zzb) {
                zzwrVarZzj = zzwrVarZzj.zzd;
            }
        }
        return zzwrVarZzj;
    }

    private static zzwr zzm(zzwr zzwrVar, zzhs zzhsVar, zzwu zzwuVar, zzen zzenVar) {
        zzwr zzwrVarZzl;
        int iZzq;
        if (zzhsVar.zzl()) {
            long j4 = zzwuVar.zzb;
            zzenVar.zzI(1);
            zzwr zzwrVarZzl2 = zzl(zzwrVar, j4, zzenVar.zzN(), 1);
            long j10 = j4 + 1;
            byte b10 = zzenVar.zzN()[0];
            int i = b10 & 128;
            int i10 = b10 & 127;
            zzhp zzhpVar = zzhsVar.zzb;
            byte[] bArr = zzhpVar.zza;
            if (bArr == null) {
                zzhpVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i != 0;
            zzwrVarZzl = zzl(zzwrVarZzl2, j10, zzhpVar.zza, i10);
            long j11 = j10 + i10;
            if (z10) {
                zzenVar.zzI(2);
                zzwrVarZzl = zzl(zzwrVarZzl, j11, zzenVar.zzN(), 2);
                j11 += 2;
                iZzq = zzenVar.zzq();
            } else {
                iZzq = 1;
            }
            int[] iArr = zzhpVar.zzd;
            if (iArr == null || iArr.length < iZzq) {
                iArr = new int[iZzq];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhpVar.zze;
            if (iArr3 == null || iArr3.length < iZzq) {
                iArr3 = new int[iZzq];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i11 = iZzq * 6;
                zzenVar.zzI(i11);
                zzwrVarZzl = zzl(zzwrVarZzl, j11, zzenVar.zzN(), i11);
                j11 += i11;
                zzenVar.zzL(0);
                for (int i12 = 0; i12 < iZzq; i12++) {
                    iArr2[i12] = zzenVar.zzq();
                    iArr4[i12] = zzenVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwuVar.zza - ((int) (j11 - zzwuVar.zzb));
            }
            zzaey zzaeyVar = zzwuVar.zzc;
            String str = zzex.zza;
            zzhpVar.zzc(iZzq, iArr2, iArr4, zzaeyVar.zzb, zzhpVar.zza, zzaeyVar.zza, zzaeyVar.zzc, zzaeyVar.zzd);
            long j12 = zzwuVar.zzb;
            int i13 = (int) (j11 - j12);
            zzwuVar.zzb = j12 + i13;
            zzwuVar.zza -= i13;
        } else {
            zzwrVarZzl = zzwrVar;
        }
        if (!zzhsVar.zze()) {
            zzhsVar.zzj(zzwuVar.zza);
            return zzk(zzwrVarZzl, zzwuVar.zzb, zzhsVar.zzc, zzwuVar.zza);
        }
        zzenVar.zzI(4);
        zzwr zzwrVarZzl3 = zzl(zzwrVarZzl, zzwuVar.zzb, zzenVar.zzN(), 4);
        int iZzp = zzenVar.zzp();
        zzwuVar.zzb += 4;
        zzwuVar.zza -= 4;
        zzhsVar.zzj(iZzp);
        zzwr zzwrVarZzk = zzk(zzwrVarZzl3, zzwuVar.zzb, zzhsVar.zzc, iZzp);
        zzwuVar.zzb += iZzp;
        int i14 = zzwuVar.zza - iZzp;
        zzwuVar.zza = i14;
        ByteBuffer byteBuffer = zzhsVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            zzhsVar.zzf = ByteBuffer.allocate(i14);
        } else {
            zzhsVar.zzf.clear();
        }
        return zzk(zzwrVarZzk, zzwuVar.zzb, zzhsVar.zzf, zzwuVar.zza);
    }

    private final void zzn(int i) {
        long j4 = this.zze + i;
        this.zze = j4;
        zzwr zzwrVar = this.zzd;
        if (j4 == zzwrVar.zzb) {
            this.zzd = zzwrVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i, boolean z10) throws IOException {
        int iZzi = zzi(i);
        zzwr zzwrVar = this.zzd;
        int iZza = zzlVar.zza(zzwrVar.zzc.zza, zzwrVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j4) {
        zzwr zzwrVar;
        if (j4 != -1) {
            while (true) {
                zzwrVar = this.zzb;
                if (j4 < zzwrVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwrVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwrVar.zza) {
                this.zzc = zzwrVar;
            }
        }
    }

    public final void zzd(zzhs zzhsVar, zzwu zzwuVar) {
        zzm(this.zzc, zzhsVar, zzwuVar, this.zza);
    }

    public final void zze(zzhs zzhsVar, zzwu zzwuVar) {
        this.zzc = zzm(this.zzc, zzhsVar, zzwuVar, this.zza);
    }

    public final void zzf() {
        zzwr zzwrVar = this.zzb;
        if (zzwrVar.zzc != null) {
            this.zzf.zzd(zzwrVar);
            zzwrVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwr zzwrVar2 = this.zzb;
        this.zzc = zzwrVar2;
        this.zzd = zzwrVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzenVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzwr zzwrVar = this.zzd;
            zzenVar.zzH(zzwrVar.zzc.zza, zzwrVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
