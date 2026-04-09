package i0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2377a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f20487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20488b;

    public C2377a(f fVar) {
        this.f20488b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j7 = this.f20487a;
            f fVar = this.f20488b;
            if (j7 != j6) {
                if (j7 >= 0 && j6 >= j7 + fVar.f20491a.available()) {
                    return -1;
                }
                fVar.b(j6);
                this.f20487a = j6;
            }
            if (i3 > fVar.f20491a.available()) {
                i3 = fVar.f20491a.available();
            }
            int i6 = fVar.read(bArr, i, i3);
            if (i6 >= 0) {
                this.f20487a += i6;
                return i6;
            }
        } catch (IOException unused) {
        }
        this.f20487a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
