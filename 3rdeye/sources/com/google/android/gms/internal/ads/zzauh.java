package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzauh {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzauh(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zza[i] = (byte) i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b10 = bArr2[i11];
            i10 = (i10 + b10 + bArr[i11 % bArr.length]) & KotlinVersion.MAX_COMPONENT_VALUE;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b10;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i = this.zzb;
        int i10 = this.zzc;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            i = (i + 1) & KotlinVersion.MAX_COMPONENT_VALUE;
            byte b10 = bArr2[i];
            i10 = (i10 + b10) & KotlinVersion.MAX_COMPONENT_VALUE;
            bArr2[i] = bArr2[i10];
            bArr2[i10] = b10;
            bArr[i11] = (byte) (bArr2[(bArr2[i] + b10) & KotlinVersion.MAX_COMPONENT_VALUE] ^ bArr[i11]);
        }
        this.zzb = i;
        this.zzc = i10;
    }
}
