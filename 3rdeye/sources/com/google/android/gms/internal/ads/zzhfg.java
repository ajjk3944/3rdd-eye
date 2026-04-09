package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzhfg extends zzhfj implements zzaro {
    protected final String zza = "moov";

    public zzhfg(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final void zzb(zzhfk zzhfkVar, ByteBuffer byteBuffer, long j4, zzarl zzarlVar) throws IOException {
        zzhfkVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhfkVar;
        this.zze = zzhfkVar.zzb();
        zzhfkVar.zze(zzhfkVar.zzb() + j4);
        this.zzf = zzhfkVar.zzb();
        this.zzb = zzarlVar;
    }
}
