package u1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class D extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f23716a;

    public D(ByteBuffer byteBuffer) {
        this.f23716a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f23716a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i3) {
        ByteBuffer byteBuffer = this.f23716a;
        if (j6 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int iMin = Math.min(i3, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
