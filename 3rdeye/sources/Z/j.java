package Z;

import java.nio.ByteBuffer;

/* compiled from: AudioStream.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: AudioStream.java */
    public static class a extends Exception {
    }

    /* compiled from: AudioStream.java */
    public static abstract class b {
        public abstract int a();

        public abstract long b();
    }

    m read(ByteBuffer byteBuffer);
}
