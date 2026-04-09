package z0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import h5.InterfaceC2370d;
import q5.i;
import u1.v;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f24448a;

    public f(TopicsManager topicsManager) {
        i.e(topicsManager, "mTopicsManager");
        this.f24448a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(z0.f r6, z0.C3014a r7, h5.InterfaceC2370d r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof z0.e
            if (r0 == 0) goto L13
            r0 = r8
            z0.e r0 = (z0.e) r0
            int r1 = r0.f24447g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24447g = r1
            goto L18
        L13:
            z0.e r0 = new z0.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f24445e
            int r1 = r0.f24447g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            z0.f r6 = r0.f24444d
            R2.a.H(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            R2.a.H(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.f24444d = r6
            r0.f24447g = r2
            z5.f r8 = new z5.f
            h5.d r0 = com.bumptech.glide.c.B(r0)
            r8.<init>(r2, r0)
            r8.t()
            android.adservices.topics.TopicsManager r0 = r6.f24448a
            p.a r1 = new p.a
            r2 = 1
            r1.<init>(r2)
            N.f r2 = new N.f
            r2.<init>(r8)
            u1.v.q(r0, r7, r1, r2)
            java.lang.Object r8 = r8.s()
            i5.a r7 = i5.EnumC2380a.f20635a
            if (r8 != r7) goto L5f
            return r7
        L5f:
            android.adservices.topics.GetTopicsResponse r7 = u1.v.h(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            q5.i.e(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = u1.v.l(r7)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = u1.v.i(r8)
            z0.c r0 = new z0.c
            long r1 = u1.v.b(r8)
            long r3 = u1.v.s(r8)
            int r5 = u1.v.a(r8)
            r0.<init>(r1, r3, r5)
            r6.add(r0)
            goto L78
        L9b:
            z0.b r7 = new z0.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.c(z0.f, z0.a, h5.d):java.lang.Object");
    }

    public GetTopicsRequest a(C3014a c3014a) {
        i.e(c3014a, "request");
        GetTopicsRequest getTopicsRequestBuild = v.d().setAdsSdkName("com.google.android.gms.ads").build();
        i.d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object b(C3014a c3014a, InterfaceC2370d interfaceC2370d) {
        return c(this, c3014a, interfaceC2370d);
    }
}
