package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f6291a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f6292b;

    /* renamed from: c, reason: collision with root package name */
    private a f6293c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f6292b = null;
        this.f6291a = messageDigest;
        this.f6293c = aVar;
        if (messageDigest != null) {
            this.f6292b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i3) {
        super.write(cArr, i, i3);
        MessageDigest messageDigest = this.f6291a;
        if (messageDigest != null) {
            messageDigest.update(this.f6292b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f6291a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i, int i3) {
        super.write(str, i, i3);
        if (this.f6291a != null) {
            a aVar = this.f6293c;
            if (aVar == null || aVar.a(str)) {
                this.f6291a.update(this.f6292b.encode(CharBuffer.wrap(str, i, i3 + i)).array());
            }
        }
    }
}
