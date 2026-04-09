package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzars extends zzhff {
    public zzars(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhff
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
