package t1;

import I9.g;
import Q9.r;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;

/* compiled from: TopicsManagerImplCommon.kt */
@SuppressLint({"NewApi"})
/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5599f extends g {

    /* renamed from: b, reason: collision with root package name */
    public final TopicsManager f46378b;

    /* compiled from: TopicsManagerImplCommon.kt */
    @h9.e(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    /* renamed from: t1.f$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public C5599f f46379l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f46380m;

        /* renamed from: o, reason: collision with root package name */
        public int f46382o;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f46380m = obj;
            this.f46382o |= RecyclerView.UNDEFINED_DURATION;
            return C5599f.k0(C5599f.this, null, this);
        }
    }

    public C5599f(TopicsManager mTopicsManager) {
        l.f(mTopicsManager, "mTopicsManager");
        this.f46378b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k0(t1.C5599f r6, t1.C5594a r7, f9.InterfaceC4347e<? super t1.C5595b> r8) {
        /*
            boolean r0 = r8 instanceof t1.C5599f.a
            if (r0 == 0) goto L13
            r0 = r8
            t1.f$a r0 = (t1.C5599f.a) r0
            int r1 = r0.f46382o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46382o = r1
            goto L18
        L13:
            t1.f$a r0 = new t1.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f46380m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f46382o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t1.f r6 = r0.f46379l
            b9.n.b(r8)
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            b9.n.b(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.i0(r7)
            r0.f46379l = r6
            r0.f46382o = r3
            A9.j r8 = new A9.j
            f9.e r0 = com.google.gson.internal.c.r(r0)
            r8.<init>(r3, r0)
            r8.s()
            android.adservices.topics.TopicsManager r0 = r6.f46378b
            s1.b r2 = new s1.b
            r2.<init>()
            G0.g r3 = new G0.g
            r3.<init>(r8)
            O8.b.g(r0, r7, r2, r3)
            java.lang.Object r8 = r8.r()
            if (r8 != r1) goto L5e
            return r1
        L5e:
            android.adservices.topics.GetTopicsResponse r7 = K6.C0707a.c(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            kotlin.jvm.internal.l.f(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = O8.b.d(r7)
            java.util.Iterator r7 = r7.iterator()
        L77:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9a
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = O8.c.e(r8)
            t1.c r0 = new t1.c
            long r1 = com.applovin.impl.sdk.u.a(r8)
            long r3 = Q9.r.a(r8)
            int r5 = K6.C0707a.b(r8)
            r0.<init>(r1, r3, r5)
            r6.add(r0)
            goto L77
        L9a:
            t1.b r7 = new t1.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C5599f.k0(t1.f, t1.a, f9.e):java.lang.Object");
    }

    public GetTopicsRequest i0(C5594a request) {
        l.f(request, "request");
        GetTopicsRequest getTopicsRequestBuild = r.b().setAdsSdkName(request.f46372a).build();
        l.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object j0(C5594a c5594a, InterfaceC4347e<? super C5595b> interfaceC4347e) {
        return k0(this, c5594a, interfaceC4347e);
    }
}
