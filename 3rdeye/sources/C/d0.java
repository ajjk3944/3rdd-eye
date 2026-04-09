package C;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;

/* compiled from: SurfaceOutput.java */
/* loaded from: classes.dex */
public interface d0 extends Closeable {

    /* compiled from: SurfaceOutput.java */
    public static abstract class a {
        public abstract androidx.camera.core.impl.J a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    /* compiled from: SurfaceOutput.java */
    public static abstract class b {
        public abstract int a();

        public abstract d0 b();
    }

    void M(float[] fArr, float[] fArr2);

    int getFormat();

    Size getSize();

    void i(float[] fArr, float[] fArr2);

    Surface n0(H.c cVar, K0.b bVar);
}
