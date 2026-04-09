package U2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class D extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f12388b;

    public D(ByteBuffer byteBuffer) {
        this.f12388b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f12388b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i, int i10) {
        ByteBuffer byteBuffer = this.f12388b;
        if (j4 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j4);
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
