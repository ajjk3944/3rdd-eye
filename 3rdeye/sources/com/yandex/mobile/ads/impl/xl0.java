package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class xl0 implements dt {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35346a;

    /* renamed from: b, reason: collision with root package name */
    private final vs0 f35347b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f35348c;

    public /* synthetic */ xl0() {
        this(new Object(), new vs0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).i(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).g(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).c(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).b(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).e(videoAd);
        }
    }

    private final HashSet j(tn0 tn0Var) {
        HashSet hashSet;
        synchronized (this.f35346a) {
            Set set = (Set) this.f35348c.get(tn0Var);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    public final void a(tn0 videoAd, dt listener) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f35346a) {
            try {
                Set hashSet = (Set) this.f35348c.get(videoAd);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.f35348c.put(videoAd, hashSet);
                }
                hashSet.add(listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void g(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new E4(hashSetJ, videoAd, 2));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void h(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new E4(hashSetJ, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void i(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new I4(hashSetJ, videoAd, 0));
        }
    }

    public xl0(Object lock, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(lock, "lock");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f35346a = lock;
        this.f35347b = mainThreadExecutor;
        this.f35348c = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).a(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).d(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).f(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new G4(hashSetJ, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new F4(hashSetJ, videoAd, 0));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new E4(hashSetJ, videoAd, 0));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new F4(hashSetJ, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void f(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new G4(hashSetJ, videoAd, 0));
        }
    }

    public final void b(tn0 videoAd, dt listener) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f35346a) {
            try {
                Set set = (Set) this.f35348c.get(videoAd);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (listener.equals((dt) it.next())) {
                            it.remove();
                        }
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new I4(hashSetJ, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(tn0 videoAd, kc2 error) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(error, "error");
        HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new J4.h(hashSetJ, videoAd, error, 16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, tn0 videoAd, kc2 error) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        kotlin.jvm.internal.l.f(error, "$error");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(final tn0 videoAd, final float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        final HashSet hashSetJ = j(videoAd);
        if (hashSetJ != null) {
            this.f35347b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.H4
                @Override // java.lang.Runnable
                public final void run() {
                    xl0.a(hashSetJ, videoAd, f10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, tn0 videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).a(videoAd, f10);
        }
    }

    public final void a() {
        this.f35347b.a();
    }
}
