package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import c9.C2097r;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class db0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f26038a;

    /* renamed from: b, reason: collision with root package name */
    private final pa1 f26039b;

    /* renamed from: c, reason: collision with root package name */
    private final jb1 f26040c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f26041d;

    public static final class b implements rd2 {

        /* renamed from: a, reason: collision with root package name */
        private final C4198s4 f26045a;

        /* renamed from: b, reason: collision with root package name */
        private final je2 f26046b;

        /* renamed from: c, reason: collision with root package name */
        private final pa1 f26047c;

        /* renamed from: d, reason: collision with root package name */
        private final Iterator<b9.l<String, String>> f26048d;

        /* renamed from: e, reason: collision with root package name */
        private final yv f26049e;

        public b(C4198s4 adLoadingPhasesManager, je2 videoLoadListener, pa1 nativeVideoCacheManager, Iterator<b9.l<String, String>> urlToRequests, yv debugEventsReporter) {
            kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
            kotlin.jvm.internal.l.f(videoLoadListener, "videoLoadListener");
            kotlin.jvm.internal.l.f(nativeVideoCacheManager, "nativeVideoCacheManager");
            kotlin.jvm.internal.l.f(urlToRequests, "urlToRequests");
            kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
            this.f26045a = adLoadingPhasesManager;
            this.f26046b = videoLoadListener;
            this.f26047c = nativeVideoCacheManager;
            this.f26048d = urlToRequests;
            this.f26049e = debugEventsReporter;
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void a() {
            if (this.f26048d.hasNext()) {
                b9.l<String, String> next = this.f26048d.next();
                String str = next.f18083b;
                String str2 = next.f18084c;
                this.f26047c.a(str, new b(this.f26045a, this.f26046b, this.f26047c, this.f26048d, this.f26049e), str2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void b() {
            this.f26049e.a(xv.f35434f);
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void c() {
            a();
        }
    }

    public /* synthetic */ db0(Context context, C4198s4 c4198s4) {
        this(context, c4198s4, new pa1(context), new jb1());
    }

    public final void a() {
        synchronized (this.f26041d) {
            this.f26039b.a();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public db0(Context context, C4198s4 adLoadingPhasesManager, pa1 nativeVideoCacheManager, jb1 nativeVideoUrlsProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(nativeVideoCacheManager, "nativeVideoCacheManager");
        kotlin.jvm.internal.l.f(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f26038a = adLoadingPhasesManager;
        this.f26039b = nativeVideoCacheManager;
        this.f26040c = nativeVideoUrlsProvider;
        this.f26041d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j41 nativeAdBlock, va1 videoLoadListener, yv debugEventsReporter) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(videoLoadListener, "videoLoadListener");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        synchronized (this.f26041d) {
            try {
                List<b9.l<String, String>> listA = this.f26040c.a(nativeAdBlock.c());
                if (listA.isEmpty()) {
                    videoLoadListener.a();
                } else {
                    a aVar = new a(this.f26038a, videoLoadListener, this.f26039b, C2097r.l0(listA).iterator(), debugEventsReporter);
                    C4198s4 c4198s4 = this.f26038a;
                    EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32467q;
                    c4198s4.getClass();
                    kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
                    c4198s4.a(adLoadingPhaseType, null);
                    b9.l lVar = (b9.l) C2097r.p0(listA);
                    this.f26039b.a((String) lVar.f18083b, aVar, (String) lVar.f18084c);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final class a implements rd2 {

        /* renamed from: a, reason: collision with root package name */
        private final C4198s4 f26042a;

        /* renamed from: b, reason: collision with root package name */
        private final je2 f26043b;

        /* renamed from: c, reason: collision with root package name */
        private final b f26044c;

        public a(C4198s4 adLoadingPhasesManager, va1 videoLoadListener, pa1 nativeVideoCacheManager, Iterator urlToRequests, yv debugEventsReporter) {
            kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
            kotlin.jvm.internal.l.f(videoLoadListener, "videoLoadListener");
            kotlin.jvm.internal.l.f(nativeVideoCacheManager, "nativeVideoCacheManager");
            kotlin.jvm.internal.l.f(urlToRequests, "urlToRequests");
            kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
            this.f26042a = adLoadingPhasesManager;
            this.f26043b = videoLoadListener;
            this.f26044c = new b(adLoadingPhasesManager, videoLoadListener, nativeVideoCacheManager, urlToRequests, debugEventsReporter);
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void a() {
            this.f26042a.a(EnumC4191r4.f32467q);
            this.f26043b.a();
            this.f26044c.a();
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void b() {
            this.f26042a.a(EnumC4191r4.f32467q);
            this.f26043b.a();
            this.f26044c.b();
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void c() {
        }
    }

    public final void a(String requestId) {
        kotlin.jvm.internal.l.f(requestId, "requestId");
        synchronized (this.f26041d) {
            this.f26039b.a(requestId);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
