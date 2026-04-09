package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzccy extends zzark {
    static final zzccy zzb = new zzccy();

    @Override // com.google.android.gms.internal.ads.zzark
    public final zzaro zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzarq() : "mvhd".equals(str) ? new zzarr() : new zzars(str);
    }
}
