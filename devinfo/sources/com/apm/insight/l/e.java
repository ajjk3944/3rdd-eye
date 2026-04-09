package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f3333a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f3334b;

    /* renamed from: c, reason: collision with root package name */
    private a f3335c;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f3334b = null;
        this.f3333a = messageDigest;
        this.f3335c = aVar;
        if (messageDigest != null) {
            this.f3334b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i4, int i10) {
        super.write(cArr, i4, i10);
        MessageDigest messageDigest = this.f3333a;
        if (messageDigest != null) {
            messageDigest.update(this.f3334b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i4) {
        super.write(i4);
        MessageDigest messageDigest = this.f3333a;
        if (messageDigest != null) {
            messageDigest.update((byte) i4);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i4, int i10) {
        super.write(str, i4, i10);
        if (this.f3333a != null) {
            a aVar = this.f3335c;
            if (aVar == null || aVar.a(str)) {
                this.f3333a.update(this.f3334b.encode(CharBuffer.wrap(str, i4, i10 + i4)).array());
            }
        }
    }
}
