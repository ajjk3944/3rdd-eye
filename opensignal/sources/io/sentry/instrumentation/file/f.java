package io.sentry.instrumentation.file;

import io.sentry.c4;
import io.sentry.i1;
import io.sentry.x5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kg.r;

/* loaded from: classes.dex */
public final class f extends FileOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f12345a;

    /* renamed from: d, reason: collision with root package name */
    public final b f12346d;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(r rVar) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) rVar.f14397g;
        try {
            super(fileOutputStream.getFD());
            this.f12346d = new b((i1) rVar.f14396d, (File) rVar.f14395a, (x5) rVar.f14398r);
            this.f12345a = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static r b(File file, FileOutputStream fileOutputStream, boolean z10) {
        i1 i1VarL = io.sentry.util.g.f12810a ? c4.c().l() : c4.c().h();
        i1 i1VarQ = i1VarL != null ? i1VarL.q("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z10);
        }
        return new r(file, i1VarQ, fileOutputStream, c4.c().k());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12346d.b(this.f12345a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f12346d.d(new com.google.android.exoplayer2.r(i10, 3, this));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f12346d.d(new androidx.media3.exoplayer.trackselection.h(this, 26, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f12346d.d(new d(this, bArr, i10, i11, 1));
    }
}
