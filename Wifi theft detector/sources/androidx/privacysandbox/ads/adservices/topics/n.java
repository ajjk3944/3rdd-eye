package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) g.a());
        kotlin.jvm.internal.p.d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(h.a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public GetTopicsRequest c(b request) {
        kotlin.jvm.internal.p.e(request, "request");
        GetTopicsRequest getTopicsRequestBuild = j.a().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
        kotlin.jvm.internal.p.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
