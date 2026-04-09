package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ri0 {
    static {
        Logger.getLogger(ri0.class.getName());
    }

    public static qi0 a(InputStream inputStream) {
        us0 us0Var = new us0();
        if (inputStream != null) {
            return new qi0(us0Var, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }
}
