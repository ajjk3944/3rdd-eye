package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgnn {
    public static final zzgws zza = zzgws.zzb(new byte[0]);

    public static final zzgws zza(int i) {
        return zzgws.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzgws zzb(int i) {
        return zzgws.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
