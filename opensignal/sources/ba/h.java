package ba;

import android.os.Looper;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2490a = new f();

    b9.e a(Looper looper, d dVar, Format format);

    Class b(Format format);

    default void prepare() {
    }

    default void release() {
    }
}
