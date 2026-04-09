package t1;

import Q9.r;
import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.l;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5598e extends C5599f {
    @Override // t1.C5599f
    public final GetTopicsRequest i0(C5594a request) {
        l.f(request, "request");
        GetTopicsRequest getTopicsRequestBuild = r.b().setAdsSdkName(request.f46372a).setShouldRecordObservation(request.f46373b).build();
        l.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
