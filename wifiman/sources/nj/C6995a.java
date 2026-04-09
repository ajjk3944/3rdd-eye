package nj;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: nj.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6995a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f54827a;

    /* renamed from: b, reason: collision with root package name */
    private int f54828b = 0;

    public C6995a(InputStream inputStream) {
        this.f54827a = inputStream;
    }

    public int a() {
        return this.f54828b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f54827a.read();
        if (i10 != -1) {
            this.f54828b++;
        }
        return i10;
    }
}
