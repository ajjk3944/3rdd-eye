package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n21 {
    public final TopicsManager a;

    public n21(TopicsManager topicsManager) {
        i30.m(topicsManager, "mTopicsManager");
        this.a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(defpackage.n21 r6, defpackage.zy r7, defpackage.oj r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.m21
            if (r0 == 0) goto L13
            r0 = r8
            m21 r0 = (defpackage.m21) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            m21 r0 = new m21
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            n21 r6 = r0.i
            defpackage.bd2.x(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.bd2.x(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.i = r6
            r0.l = r2
            kd r8 = new kd
            oj r0 = defpackage.uk2.r(r0)
            r8.<init>(r2, r0)
            r8.u()
            android.adservices.topics.TopicsManager r0 = r6.a
            i8 r1 = new i8
            r2 = 1
            r1.<init>(r2)
            sj r2 = new sj
            r2.<init>(r8)
            defpackage.tc0.s(r0, r7, r1, r2)
            java.lang.Object r8 = r8.t()
            rk r7 = defpackage.rk.f
            if (r8 != r7) goto L5f
            return r7
        L5f:
            android.adservices.topics.GetTopicsResponse r7 = defpackage.tc0.i(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            defpackage.i30.m(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = defpackage.tc0.n(r7)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = defpackage.tc0.j(r8)
            j21 r0 = new j21
            long r2 = defpackage.tc0.c(r8)
            long r4 = defpackage.tc0.u(r8)
            int r1 = defpackage.tc0.a(r8)
            r0.<init>(r1, r2, r4)
            r6.add(r0)
            goto L78
        L9b:
            az r7 = new az
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n21.c(n21, zy, oj):java.lang.Object");
    }

    public GetTopicsRequest a(zy zyVar) {
        i30.m(zyVar, "request");
        GetTopicsRequest getTopicsRequestBuild = tc0.e().setAdsSdkName("com.google.android.gms.ads").build();
        i30.l(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object b(zy zyVar, oj ojVar) {
        return c(this, zyVar, ojVar);
    }
}
