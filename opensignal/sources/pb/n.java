package pb;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface n extends k {
    void close();

    default Map k() {
        return Collections.EMPTY_MAP;
    }

    Uri o();

    long q(na.c cVar);

    void s(u0 u0Var);
}
