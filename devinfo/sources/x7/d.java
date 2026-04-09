package x7;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface d {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    boolean b(ByteBuffer byteBuffer, a8.g gVar);

    ImageHeaderParser$ImageType c(InputStream inputStream);

    int d(InputStream inputStream, a8.g gVar);

    boolean e(InputStream inputStream, a8.g gVar);

    int f(ByteBuffer byteBuffer, a8.g gVar);
}
