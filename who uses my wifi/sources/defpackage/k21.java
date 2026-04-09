package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k21 extends n21 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k21(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.b = i;
    }

    @Override // defpackage.n21
    public GetTopicsRequest a(zy zyVar) {
        switch (this.b) {
            case 1:
                i30.m(zyVar, "request");
                GetTopicsRequest getTopicsRequestBuild = tc0.e().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(zyVar.a).build();
                i30.l(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(zyVar);
        }
    }
}
