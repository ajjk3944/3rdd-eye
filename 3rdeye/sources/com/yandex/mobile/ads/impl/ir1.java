package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class ir1 extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28846a;

    public ir1(FileOutputStream fileOutputStream, int i) {
        super(fileOutputStream, i);
    }

    public final void a(OutputStream outputStream) {
        if (!this.f28846a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f28846a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f28846a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = s82.f32899a;
        throw th;
    }

    public ir1(OutputStream outputStream) {
        super(outputStream);
    }
}
