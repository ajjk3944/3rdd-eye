package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgei {
    private final InputStream zza;

    private zzgei(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgei zzb(byte[] bArr) {
        return new zzgei(new ByteArrayInputStream(bArr));
    }

    public final zzgub zza() throws IOException {
        try {
            return zzgub.zzg(this.zza, zzgyf.zza());
        } finally {
            this.zza.close();
        }
    }
}
