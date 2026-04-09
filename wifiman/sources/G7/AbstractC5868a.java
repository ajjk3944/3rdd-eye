package g7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5868a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1773a f47723a = new C1773a(null);

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    public static final class C1773a {
        public /* synthetic */ C1773a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1773a() {
        }
    }

    protected final FloatBuffer a(int i10) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        AbstractC6492s.h(floatBufferAsFloatBuffer, "asFloatBuffer(...)");
        return floatBufferAsFloatBuffer;
    }

    protected final FloatBuffer b(FloatBuffer buffer, int i10) {
        AbstractC6492s.i(buffer, "buffer");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.rewind();
        buffer.rewind();
        floatBufferAsFloatBuffer.put(buffer);
        floatBufferAsFloatBuffer.rewind();
        AbstractC6492s.f(floatBufferAsFloatBuffer);
        return floatBufferAsFloatBuffer;
    }
}
