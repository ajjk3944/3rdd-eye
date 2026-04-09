package q5;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import e4.e0;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f32194a;

    public g(TopicsManager topicsManager) {
        this.f32194a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object J(q5.g r4, q5.b r5, ck.c<? super q5.c> r6) {
        /*
            boolean r0 = r6 instanceof q5.f
            if (r0 == 0) goto L13
            r0 = r6
            q5.f r0 = (q5.f) r0
            int r1 = r0.f32193d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32193d = r1
            goto L18
        L13:
            q5.f r0 = new q5.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32191b
            int r1 = r0.f32193d
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            q5.g r4 = r0.f32190a
            ci.b.D(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ci.b.D(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.H(r5)
            r0.f32190a = r4
            r0.f32193d = r2
            xk.h r6 = new xk.h
            ck.c r0 = a.a.r(r0)
            r6.<init>(r2, r0)
            r6.s()
            android.adservices.topics.TopicsManager r0 = r4.f32194a
            com.applovin.impl.da r1 = new com.applovin.impl.da
            r2 = 1
            r1.<init>(r2)
            a4.e r2 = new a4.e
            r2.<init>(r6)
            r0.getTopics(r5, r1, r2)
            java.lang.Object r6 = r6.r()
            dk.a r5 = dk.a.f22275a
            if (r6 != r5) goto L5f
            return r5
        L5f:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            q5.c r4 = r4.I(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.g.J(q5.g, q5.b, ck.c):java.lang.Object");
    }

    public GetTopicsRequest H(b bVar) {
        k.e(bVar, "request");
        return e0.b(bVar);
    }

    public c I(GetTopicsResponse getTopicsResponse) {
        k.e(getTopicsResponse, "response");
        return j4.e.a(getTopicsResponse);
    }

    @Override // com.bumptech.glide.d
    public Object q(b bVar, ck.c<? super c> cVar) {
        return J(this, bVar, cVar);
    }
}
