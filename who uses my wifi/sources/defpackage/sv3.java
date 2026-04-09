package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class sv3 {
    public static final v34 a = v34.a(new byte[0]);

    public static final v34 a(int i) {
        return v34.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final v34 b(int i) {
        return v34.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
