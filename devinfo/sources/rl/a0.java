package rl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final hm.g f33028a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f33029b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33030c;

    /* renamed from: d, reason: collision with root package name */
    public InputStreamReader f33031d;

    public a0(hm.g gVar, Charset charset) {
        nk.k.e(gVar, "source");
        nk.k.e(charset, "charset");
        this.f33028a = gVar;
        this.f33029b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33030c = true;
        InputStreamReader inputStreamReader = this.f33031d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f33028a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i4, int i10) throws IOException {
        nk.k.e(cArr, "cbuf");
        if (this.f33030c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f33031d;
        if (inputStreamReader == null) {
            hm.g gVar = this.f33028a;
            inputStreamReader = new InputStreamReader(gVar.inputStream(), sl.h.f(gVar, this.f33029b));
            this.f33031d = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i4, i10);
    }
}
