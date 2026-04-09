package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public i(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) g.a());
        kotlin.jvm.internal.p.d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(h.a(systemService));
    }
}
