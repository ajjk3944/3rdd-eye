package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzhfh extends zzhff implements zzaro {
    private int zzg;

    public zzhfh(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzarn.zzc(byteBuffer.get());
        zzarn.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
