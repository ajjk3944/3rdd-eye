package androidx.work;

import J0.b;
import S4.r;
import V0.m;
import W0.k;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5663a = m.h("WrkMgrInitializer");

    @Override // J0.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // J0.b
    public final Object b(Context context) {
        m.f().a(f5663a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.H(context, new V0.b(new r(4)));
        return k.G(context);
    }
}
