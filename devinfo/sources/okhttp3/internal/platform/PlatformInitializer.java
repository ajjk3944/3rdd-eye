package okhttp3.internal.platform;

import android.content.Context;
import bm.d;
import bm.e;
import h6.b;
import java.util.List;
import nk.k;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class PlatformInitializer implements b {
    @Override // h6.b
    public final List a() {
        return s.f38317a;
    }

    @Override // h6.b
    public final Object create(Context context) {
        k.e(context, "context");
        e eVar = e.f2349a;
        Object obj = e.f2349a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f2349a;
    }
}
