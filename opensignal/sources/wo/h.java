package wo;

import android.os.Bundle;
import br.l;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24583a = new LinkedHashMap();

    public final Bundle a(long j) {
        return (Bundle) this.f24583a.get(Long.valueOf(j));
    }

    public final void b(Bundle bundle, long j) {
        l.e(bundle, "state");
        this.f24583a.put(Long.valueOf(j), bundle);
    }
}
