package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.zf2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class an1 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final zf2 f24752a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f24753b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final zf2.a f24754a;

        /* renamed from: b, reason: collision with root package name */
        private final float f24755b;

        public a(zf2.a trackerQuartile, float f10) {
            kotlin.jvm.internal.l.f(trackerQuartile, "trackerQuartile");
            this.f24754a = trackerQuartile;
            this.f24755b = f10;
        }

        public final float a() {
            return this.f24755b;
        }

        public final zf2.a b() {
            return this.f24754a;
        }
    }

    public an1(ag2 videoTracker) {
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        this.f24752a = videoTracker;
        this.f24753b = C2092m.X(new a(zf2.a.f36464b, 0.25f), new a(zf2.a.f36465c, 0.5f), new a(zf2.a.f36466d, 0.75f));
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        if (j4 != 0) {
            Iterator<a> it = this.f24753b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a() * j4 <= j10) {
                    this.f24752a.a(next.b());
                    it.remove();
                }
            }
        }
    }
}
