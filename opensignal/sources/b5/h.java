package b5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface h extends androidx.media3.common.l {
    void close();

    default Map k() {
        return Collections.EMPTY_MAP;
    }

    Uri o();

    long t(k kVar);

    void w(b0 b0Var);
}
