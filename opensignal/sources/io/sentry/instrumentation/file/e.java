package io.sentry.instrumentation.file;

import io.sentry.c4;
import io.sentry.i1;
import io.sentry.x5;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kg.r;

/* loaded from: classes.dex */
public final class e extends FileInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f12343a;

    /* renamed from: d, reason: collision with root package name */
    public final b f12344d;

    public e(r rVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f12344d = new b((i1) rVar.f14396d, (File) rVar.f14395a, (x5) rVar.f14398r);
        this.f12343a = (FileInputStream) rVar.f14397g;
    }

    public static r b(File file, FileInputStream fileInputStream) {
        i1 i1VarL = io.sentry.util.g.f12810a ? c4.c().l() : c4.c().h();
        i1 i1VarQ = i1VarL != null ? i1VarL.q("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new r(file, i1VarQ, fileInputStream, c4.c().k());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12344d.b(this.f12343a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() throws IOException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f12344d.d(new androidx.media3.exoplayer.trackselection.h(this, 25, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.f12344d.d(new c(this, j))).longValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(r rVar) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) rVar.f14397g;
        try {
            super(fileInputStream.getFD());
            this.f12344d = new b((i1) rVar.f14396d, (File) rVar.f14395a, (x5) rVar.f14398r);
            this.f12343a = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.f12344d.d(new androidx.media3.exoplayer.trackselection.h(this, 24, bArr))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return ((Integer) this.f12344d.d(new d(this, bArr, i10, i11, 0))).intValue();
    }
}
