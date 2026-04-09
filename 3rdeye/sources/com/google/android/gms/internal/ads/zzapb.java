package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzapb implements zzapa {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapb(FileChannel fileChannel, long j4, long j10) {
        this.zza = fileChannel;
        this.zzb = j4;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzb(MessageDigest[] messageDigestArr, long j4, int i) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j4, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
