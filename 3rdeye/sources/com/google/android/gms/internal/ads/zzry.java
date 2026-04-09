package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzry extends zzco {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzex.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.zzg);
        this.zzj += iMin / this.zzb.zze;
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i10 = i - iMin;
            int length = (this.zzi + i10) - this.zzh.length;
            ByteBuffer byteBufferZzj = zzj(length);
            int i11 = this.zzi;
            String str = zzex.zza;
            int iMax = Math.max(0, Math.min(length, i11));
            byteBufferZzj.put(this.zzh, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzj.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i10 - iMax2;
            int i13 = this.zzi - iMax;
            this.zzi = i13;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, iMax, bArr, 0, i13);
            byteBuffer.get(this.zzh, this.zzi, i12);
            this.zzi += i12;
            byteBufferZzj.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzi(zzcl zzclVar) throws zzcm {
        if (!zzex.zzK(zzclVar.zzd)) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcl.zza : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i10 = this.zzb.zze;
            this.zzh = new byte[i * i10];
            this.zzg = this.zzd * i10;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzl() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzm() {
        this.zzh = zzex.zzb;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i, int i10) {
        this.zzd = i;
        this.zze = i10;
    }
}
