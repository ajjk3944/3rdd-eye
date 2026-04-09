package z4;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f37866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37867b;

    public a(f fVar) {
        this.f37867b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i4, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j8 = this.f37866a;
            f fVar = this.f37867b;
            if (j8 != j) {
                if (j8 >= 0 && j >= j8 + fVar.f37870a.available()) {
                    return -1;
                }
                fVar.e(j);
                this.f37866a = j;
            }
            if (i10 > fVar.f37870a.available()) {
                i10 = fVar.f37870a.available();
            }
            int i11 = fVar.read(bArr, i4, i10);
            if (i11 >= 0) {
                this.f37866a += i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f37866a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
