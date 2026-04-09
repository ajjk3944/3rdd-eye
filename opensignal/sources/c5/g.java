package c5;

import androidx.media3.common.MediaLibraryInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g extends a {
    public ByteBuffer B;
    public final int D;

    /* renamed from: g, reason: collision with root package name */
    public final c f3305g;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f3306r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3307x;

    /* renamed from: y, reason: collision with root package name */
    public long f3308y;

    static {
        MediaLibraryInfo.registerModule("media3.decoder");
    }

    public g(int i10) {
        super(0);
        this.f3305g = new c();
        this.D = i10;
    }

    public void p() {
        this.f3295d = 0;
        ByteBuffer byteBuffer = this.f3306r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.B;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3307x = false;
    }

    public final ByteBuffer q(int i10) {
        int i11 = this.D;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f3306r;
        throw new f("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void r(int i10) {
        ByteBuffer byteBuffer = this.f3306r;
        if (byteBuffer == null) {
            this.f3306r = q(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f3306r = byteBuffer;
            return;
        }
        ByteBuffer byteBufferQ = q(i11);
        byteBufferQ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferQ.put(byteBuffer);
        }
        this.f3306r = byteBufferQ;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f3306r;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.B;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
