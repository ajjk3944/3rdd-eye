package a0;

import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: Api26Impl.java */
/* loaded from: classes.dex */
public final class b {
    public static MediaMuxer a(FileDescriptor fileDescriptor, int i) throws IOException {
        return new MediaMuxer(fileDescriptor, i);
    }
}
