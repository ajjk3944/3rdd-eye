package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ll0 {

    /* renamed from: a, reason: collision with root package name */
    private final il0 f30030a;

    public interface a {
        void a(ArrayList arrayList);
    }

    public ll0(vu1 sdkEnvironmentModule, sb2 videoAdLoader) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdLoader, "videoAdLoader");
        this.f30030a = new il0(sdkEnvironmentModule, videoAdLoader);
    }

    public final void a(Context context, ArrayList adBreaks, a instreamAdBreaksLoadListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        kotlin.jvm.internal.l.f(instreamAdBreaksLoadListener, "instreamAdBreaksLoadListener");
        b bVar = new b(instreamAdBreaksLoadListener, new AtomicInteger(adBreaks.size()));
        Iterator it = adBreaks.iterator();
        while (it.hasNext()) {
            this.f30030a.a(context, (C4078b2) it.next(), bVar);
        }
    }

    public static final class b implements xp1<zs> {

        /* renamed from: a, reason: collision with root package name */
        private final a f30031a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f30032b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f30033c;

        public b(a instreamAdBreaksLoadListener, AtomicInteger instreamAdCounter) {
            kotlin.jvm.internal.l.f(instreamAdBreaksLoadListener, "instreamAdBreaksLoadListener");
            kotlin.jvm.internal.l.f(instreamAdCounter, "instreamAdCounter");
            this.f30031a = instreamAdBreaksLoadListener;
            this.f30032b = instreamAdCounter;
            this.f30033c = new ArrayList();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(fb2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            if (this.f30032b.decrementAndGet() == 0) {
                this.f30031a.a(this.f30033c);
            }
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(zs zsVar) {
            zs coreInstreamAdBreak = zsVar;
            kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
            this.f30033c.add(coreInstreamAdBreak);
            if (this.f30032b.decrementAndGet() == 0) {
                this.f30031a.a(this.f30033c);
            }
        }
    }
}
