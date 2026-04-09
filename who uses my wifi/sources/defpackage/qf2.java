package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface qf2 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ce2 a(ce2 ce2Var);

    void b();

    ByteBuffer c();

    boolean e();

    void f(ByteBuffer byteBuffer);

    void g();

    boolean h();

    void j();

    default long d(long j) {
        return j;
    }
}
