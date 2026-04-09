package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f5114a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f5115b;

    /* renamed from: c, reason: collision with root package name */
    private a f5116c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f5115b = null;
        this.f5114a = messageDigest;
        this.f5116c = aVar;
        if (messageDigest != null) {
            this.f5115b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f5114a;
        if (messageDigest != null) {
            messageDigest.update(this.f5115b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f5114a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f5114a != null) {
            a aVar = this.f5116c;
            if (aVar == null || aVar.a(str)) {
                this.f5114a.update(this.f5115b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }
}
