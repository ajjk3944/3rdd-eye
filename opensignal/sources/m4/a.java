package m4;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f16263a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f16264d;

    public a(f fVar) {
        this.f16264d = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j7 = this.f16263a;
            f fVar = this.f16264d;
            if (j7 != j) {
                if (j7 >= 0 && j >= j7 + fVar.f16265a.available()) {
                    return -1;
                }
                fVar.f(j);
                this.f16263a = j;
            }
            if (i11 > fVar.f16265a.available()) {
                i11 = fVar.f16265a.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f16263a += i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f16263a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
