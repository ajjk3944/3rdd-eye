package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        AbstractC6492s.i(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        AbstractC6492s.h(systemService, "context.getSystemService…ementManager::class.java)");
        super(f.a(systemService));
    }
}
