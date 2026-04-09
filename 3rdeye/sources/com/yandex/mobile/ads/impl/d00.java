package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class d00 {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f25893a;

    /* renamed from: b, reason: collision with root package name */
    private final pa1 f25894b;

    /* renamed from: c, reason: collision with root package name */
    private final jb1 f25895c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25896d;

    public /* synthetic */ d00(Context context, C4198s4 c4198s4) {
        this(context, c4198s4, new pa1(context), new jb1());
    }

    public final void a() {
        synchronized (this.f25896d) {
            this.f25894b.a();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public d00(Context context, C4198s4 adLoadingPhasesManager, pa1 nativeVideoCacheManager, jb1 nativeVideoUrlsProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(nativeVideoCacheManager, "nativeVideoCacheManager");
        kotlin.jvm.internal.l.f(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f25893a = adLoadingPhasesManager;
        this.f25894b = nativeVideoCacheManager;
        this.f25895c = nativeVideoUrlsProvider;
        this.f25896d = new Object();
    }

    public final void a(j41 nativeAdBlock, va1 videoLoadListener, yv debugEventsReporter) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(videoLoadListener, "videoLoadListener");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        synchronized (this.f25896d) {
            try {
                SortedSet<String> sortedSetB = this.f25895c.b(nativeAdBlock.c());
                if (sortedSetB.isEmpty()) {
                    videoLoadListener.a();
                } else {
                    a aVar = new a(this.f25893a, sortedSetB.size(), videoLoadListener, debugEventsReporter);
                    C4198s4 c4198s4 = this.f25893a;
                    EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32467q;
                    c4198s4.getClass();
                    kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
                    c4198s4.a(adLoadingPhaseType, null);
                    for (String url : sortedSetB) {
                        pa1 pa1Var = this.f25894b;
                        pa1Var.getClass();
                        kotlin.jvm.internal.l.f(url, "url");
                        pa1Var.a(url, aVar, String.valueOf(hi0.a()));
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final class a implements rd2 {

        /* renamed from: a, reason: collision with root package name */
        private final C4198s4 f25897a;

        /* renamed from: b, reason: collision with root package name */
        private final je2 f25898b;

        /* renamed from: c, reason: collision with root package name */
        private final yv f25899c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicInteger f25900d;

        public a(C4198s4 adLoadingPhasesManager, int i, va1 videoLoadListener, yv debugEventsReporter) {
            kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
            kotlin.jvm.internal.l.f(videoLoadListener, "videoLoadListener");
            kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
            this.f25897a = adLoadingPhasesManager;
            this.f25898b = videoLoadListener;
            this.f25899c = debugEventsReporter;
            this.f25900d = new AtomicInteger(i);
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void a() {
            if (this.f25900d.decrementAndGet() == 0) {
                this.f25897a.a(EnumC4191r4.f32467q);
                this.f25898b.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void b() {
            if (this.f25900d.getAndSet(0) > 0) {
                this.f25897a.a(EnumC4191r4.f32467q);
                this.f25899c.a(xv.f35434f);
                this.f25898b.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.rd2
        public final void c() {
        }
    }
}
