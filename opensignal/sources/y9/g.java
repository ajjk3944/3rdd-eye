package y9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f25922a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    boolean b();

    boolean c();

    void d(ByteBuffer byteBuffer);

    void e();

    e f(e eVar);

    void flush();

    void reset();
}
