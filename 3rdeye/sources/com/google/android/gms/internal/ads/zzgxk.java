package com.google.android.gms.internal.ads;

import androidx.work.s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
class zzgxk extends zzgxj {
    protected final byte[] zza;

    public zzgxk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxn) || zzd() != ((zzgxn) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgxk)) {
            return obj.equals(this);
        }
        zzgxk zzgxkVar = (zzgxk) obj;
        int iZzr = zzr();
        int iZzr2 = zzgxkVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgxkVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public void zze(byte[] bArr, int i, int i10, int i11) {
        System.arraycopy(this.zza, i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxj
    public final boolean zzg(zzgxn zzgxnVar, int i, int i10) {
        if (i10 > zzgxnVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i10 + zzd());
        }
        int i11 = i + i10;
        if (i11 > zzgxnVar.zzd()) {
            int iZzd = zzgxnVar.zzd();
            StringBuilder sbI = s.i("Ran off end of other: ", i, ", ", i10, ", ");
            sbI.append(iZzd);
            throw new IllegalArgumentException(sbI.toString());
        }
        if (!(zzgxnVar instanceof zzgxk)) {
            return zzgxnVar.zzk(i, i11).equals(zzk(0, i10));
        }
        zzgxk zzgxkVar = (zzgxk) zzgxnVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgxkVar.zza;
        int iZzc = zzc() + i10;
        int iZzc2 = zzc();
        int iZzc3 = zzgxkVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzi(int i, int i10, int i11) {
        return zzgzi.zzb(i, this.zza, zzc() + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzj(int i, int i10, int i11) {
        int iZzc = zzc() + i10;
        return zzhbx.zzf(i, this.zza, iZzc, i11 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxn zzk(int i, int i10) {
        int iZzq = zzgxn.zzq(i, i10, zzd());
        return iZzq == 0 ? zzgxn.zzb : new zzgxh(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxt zzl() {
        return zzgxt.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final void zzo(zzgxe zzgxeVar) throws IOException {
        zzgxeVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhbx.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}
