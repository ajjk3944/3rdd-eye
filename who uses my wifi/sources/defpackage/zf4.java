package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface zf4 {
    ByteBuffer B(int i);

    void I(int i);

    int b();

    void c0(Bundle bundle);

    void d(int i, int i2, long j, int i3);

    MediaFormat e();

    void f(int i);

    void g();

    default boolean j(k34 k34Var) {
        return false;
    }

    void k();

    void m(int i, long j);

    void n(int i, yu3 yu3Var, long j, int i2);

    void o();

    void q(Surface surface);

    int r(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer z(int i);
}
