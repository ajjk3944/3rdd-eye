package q5;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import e4.e0;
import nk.k;
import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32189b;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context, int i4) {
        this.f32189b = i4;
        switch (i4) {
            case 1:
                TopicsManager topicsManager = TopicsManager.get(context);
                k.d(topicsManager, "get(context)");
                super(topicsManager);
                break;
            case 2:
                Object systemService = context.getSystemService((Class<Object>) u.d());
                k.d(systemService, "context.getSystemService…opicsManager::class.java)");
                super(u.b(systemService));
                break;
            case 3:
                Object systemService2 = context.getSystemService((Class<Object>) u.d());
                k.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                super(u.b(systemService2));
                break;
            case 4:
                Object systemService3 = context.getSystemService((Class<Object>) u.d());
                k.d(systemService3, "context.getSystemService…opicsManager::class.java)");
                super(u.b(systemService3));
                break;
            default:
                TopicsManager topicsManager2 = TopicsManager.get(context);
                k.d(topicsManager2, "get(context)");
                super(topicsManager2);
                break;
        }
    }

    @Override // q5.g
    public GetTopicsRequest H(b bVar) {
        switch (this.f32189b) {
            case 0:
                k.e(bVar, "request");
                return e0.a(bVar);
            case 1:
                k.e(bVar, "request");
                return e0.a(bVar);
            case 2:
                k.e(bVar, "request");
                return e0.a(bVar);
            case 3:
            default:
                return super.H(bVar);
            case 4:
                k.e(bVar, "request");
                return e0.a(bVar);
        }
    }

    @Override // q5.g
    public c I(GetTopicsResponse getTopicsResponse) {
        switch (this.f32189b) {
            case 0:
                k.e(getTopicsResponse, "response");
                return j4.e.b(getTopicsResponse);
            case 1:
            default:
                return super.I(getTopicsResponse);
            case 2:
                k.e(getTopicsResponse, "response");
                return j4.e.b(getTopicsResponse);
        }
    }
}
