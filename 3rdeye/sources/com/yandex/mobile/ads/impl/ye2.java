package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ye2 implements gu {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35777a;

    /* renamed from: b, reason: collision with root package name */
    private final vs0 f35778b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f35779c;

    public /* synthetic */ ye2() {
        this(new Object(), new vs0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ye2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((gu) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ye2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((gu) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ye2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((gu) it.next()).onVideoResumed();
        }
    }

    public final void a(pe2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f35777a) {
            this.f35779c.add(listener);
        }
    }

    public final void b() {
        this.f35779c.clear();
        this.f35778b.a();
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoCompleted() {
        this.f35778b.a(new Z(this, 13));
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoError() {
        this.f35778b.a(new J2(this, 12));
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPaused() {
        this.f35778b.a(new I1(this, 3));
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPrepared() {
        this.f35778b.a(new N(this, 8));
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoResumed() {
        this.f35778b.a(new P0(this, 14));
    }

    private final HashSet a() {
        HashSet hashSet;
        synchronized (this.f35777a) {
            hashSet = new HashSet(this.f35779c);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ye2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((gu) it.next()).onVideoError();
        }
    }

    public ye2(Object lock, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(lock, "lock");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f35777a = lock;
        this.f35778b = mainThreadExecutor;
        this.f35779c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ye2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((gu) it.next()).onVideoCompleted();
        }
    }
}
