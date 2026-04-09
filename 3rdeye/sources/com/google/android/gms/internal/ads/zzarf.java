package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzarf extends ByteArrayOutputStream {
    private final zzaqs zza;

    public zzarf(zzaqs zzaqsVar, int i) {
        this.zza = zzaqsVar;
        ((ByteArrayOutputStream) this).buf = zzaqsVar.zzb(Math.max(i, 256));
    }

    private final void zza(int i) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzaqs zzaqsVar = this.zza;
        int i11 = i10 + i;
        byte[] bArrZzb = zzaqsVar.zzb(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZzb, 0, ((ByteArrayOutputStream) this).count);
        zzaqsVar.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        zza(i10);
        super.write(bArr, i, i10);
    }
}
