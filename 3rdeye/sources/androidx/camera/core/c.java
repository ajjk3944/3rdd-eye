package androidx.camera.core;

import C.L;
import android.annotation.SuppressLint;
import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: ImageProxy.java */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {

    /* compiled from: ImageProxy.java */
    public interface a {
        ByteBuffer q();

        int r();

        int s();
    }

    int getFormat();

    int getHeight();

    Image getImage();

    int getWidth();

    L i0();

    @SuppressLint({"ArrayReturn"})
    a[] y();
}
