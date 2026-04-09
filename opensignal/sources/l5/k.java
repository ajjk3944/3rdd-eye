package l5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface k {
    void a(rb.f fVar, Handler handler);

    MediaFormat b();

    void c(Bundle bundle);

    void d(int i10, long j);

    int e();

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void g(int i10, boolean z10);

    ByteBuffer h(int i10);

    void i(Surface surface);

    ByteBuffer j(int i10);

    void k(int i10, int i11, long j, int i12);

    void l(int i10, c5.c cVar, long j);

    void release();

    void setVideoScalingMode(int i10);
}
