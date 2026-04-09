package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class fh {

    /* renamed from: a, reason: collision with root package name */
    private final File f27323a;

    /* renamed from: b, reason: collision with root package name */
    private final File f27324b;

    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f27325a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27326b = false;

        public a(File file) throws FileNotFoundException {
            this.f27325a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f27326b) {
                return;
            }
            this.f27326b = true;
            this.f27325a.flush();
            try {
                this.f27325a.getFD().sync();
            } catch (IOException e4) {
                rs0.b("AtomicFile", "Failed to sync file descriptor:", e4);
            }
            this.f27325a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f27325a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f27325a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f27325a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i10) throws IOException {
            this.f27325a.write(bArr, i, i10);
        }
    }

    public fh(File file) {
        this.f27323a = file;
        this.f27324b = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.f27323a.delete();
        this.f27324b.delete();
    }

    public final boolean b() {
        return this.f27323a.exists() || this.f27324b.exists();
    }

    public final FileInputStream c() throws FileNotFoundException {
        if (this.f27324b.exists()) {
            this.f27323a.delete();
            this.f27324b.renameTo(this.f27323a);
        }
        return new FileInputStream(this.f27323a);
    }

    public final OutputStream d() throws IOException {
        if (this.f27323a.exists()) {
            if (this.f27324b.exists()) {
                this.f27323a.delete();
            } else if (!this.f27323a.renameTo(this.f27324b)) {
                rs0.d("AtomicFile", "Couldn't rename file " + this.f27323a + " to backup file " + this.f27324b);
            }
        }
        try {
            return new a(this.f27323a);
        } catch (FileNotFoundException e4) {
            File parentFile = this.f27323a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f27323a, e4);
            }
            try {
                return new a(this.f27323a);
            } catch (FileNotFoundException e10) {
                throw new IOException("Couldn't create " + this.f27323a, e10);
            }
        }
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f27324b.delete();
    }
}
