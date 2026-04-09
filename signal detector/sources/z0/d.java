package z0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import q5.i;
import u1.v;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.f24443b = i;
    }

    @Override // z0.f
    public GetTopicsRequest a(C3014a c3014a) {
        switch (this.f24443b) {
            case 1:
                i.e(c3014a, "request");
                GetTopicsRequest getTopicsRequestBuild = v.d().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(c3014a.f24438a).build();
                i.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(c3014a);
        }
    }
}
