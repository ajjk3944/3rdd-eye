package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgej {
    private final OutputStream zza;

    private zzgej(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgej zzb(OutputStream outputStream) {
        return new zzgej(outputStream);
    }

    public final void zza(zzgub zzgubVar) throws IOException {
        try {
            zzgubVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
