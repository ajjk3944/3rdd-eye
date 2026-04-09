package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements w1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4314a = k.f("WrkMgrInitializer");

    @Override // w1.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r create(Context context) {
        k.c().a(f4314a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        r.e(context, new a.b().a());
        return r.d(context);
    }

    @Override // w1.b
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
