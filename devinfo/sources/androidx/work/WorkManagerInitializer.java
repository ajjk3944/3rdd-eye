package androidx.work;

import android.content.Context;
import h6.b;
import java.util.Collections;
import java.util.List;
import nk.k;
import t6.v;
import t6.x;
import u6.r;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1599a = v.g("WrkMgrInitializer");

    @Override // h6.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // h6.b
    public final Object create(Context context) {
        v.e().a(f1599a, "Initializing WorkManager with default configuration.");
        t6.b bVar = new t6.b(new x());
        k.e(context, "context");
        synchronized (r.f35174p) {
            try {
                r rVar = r.f35172n;
                if (rVar != null && r.f35173o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (rVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (r.f35173o == null) {
                        r.f35173o = t.i(applicationContext, bVar);
                    }
                    r.f35172n = r.f35173o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r.D(context);
    }
}
