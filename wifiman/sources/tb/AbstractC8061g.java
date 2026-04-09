package tb;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: tb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8061g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        AbstractC6492s.f(byteBufferAllocate);
        return byteBufferAllocate;
    }
}
