package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaqv extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzaqv(InputStream inputStream, long j4) {
        super(inputStream);
        this.zza = j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.zzb++;
        }
        return i;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = super.read(bArr, i, i10);
        if (i11 != -1) {
            this.zzb += i11;
        }
        return i11;
    }
}
