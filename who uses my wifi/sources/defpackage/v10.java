package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface v10 extends Library {
    public static final /* synthetic */ int a = 0;

    static {
        if (Native.load("IPHlpAPI", v10.class, W32APIOptions.ASCII_OPTIONS) != null) {
            throw new ClassCastException();
        }
    }
}
