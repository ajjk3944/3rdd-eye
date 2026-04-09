package androidx.work;

import T1.z;
import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements I1.b<u> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16848a = m.g("WrkMgrInitializer");

    @Override // I1.b
    public final u create(Context context) {
        m.e().a(f16848a, "Initializing WorkManager with default configuration.");
        z.d(context, new b(new b.a()));
        return z.c(context);
    }

    @Override // I1.b
    public final List<Class<? extends I1.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
