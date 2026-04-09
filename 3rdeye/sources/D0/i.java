package d0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: EncodedData.java */
/* loaded from: classes.dex */
public interface i extends AutoCloseable {
    MediaCodec.BufferInfo R();

    boolean a0();

    long r0();

    long size();

    ByteBuffer w();
}
