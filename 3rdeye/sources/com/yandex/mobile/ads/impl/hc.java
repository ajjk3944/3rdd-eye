package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class hc implements lc {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f28169f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile hc f28170g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f28171h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f28172a;

    /* renamed from: b, reason: collision with root package name */
    private final mc f28173b;

    /* renamed from: c, reason: collision with root package name */
    private final nc f28174c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28175d;

    /* renamed from: e, reason: collision with root package name */
    private final xy f28176e;

    public static final class a {
        public static hc a(Context context) {
            hc hcVar;
            kotlin.jvm.internal.l.f(context, "context");
            hc hcVar2 = hc.f28170g;
            if (hcVar2 != null) {
                return hcVar2;
            }
            synchronized (hc.f28169f) {
                hcVar = hc.f28170g;
                if (hcVar == null) {
                    hcVar = new hc(context);
                    hc.f28170g = hcVar;
                }
            }
            return hcVar;
        }
    }

    public /* synthetic */ hc(Context context) {
        this(new Handler(Looper.getMainLooper()), new mc(), new nc(context), new pc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hc this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.e();
        this$0.f28173b.a();
    }

    private final void d() {
        this.f28172a.postDelayed(new N(this, 4), this.f28176e.a());
    }

    private final void e() {
        synchronized (f28169f) {
            this.f28172a.removeCallbacksAndMessages(null);
            this.f28175d = false;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void a(oc listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f28173b.b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.lc
    public final void a(gc advertisingInfoHolder) {
        kotlin.jvm.internal.l.f(advertisingInfoHolder, "advertisingInfoHolder");
        e();
        this.f28173b.b(advertisingInfoHolder);
    }

    public final void b(oc listener) {
        boolean z10;
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f28173b.a(listener);
        synchronized (f28169f) {
            try {
                if (this.f28175d) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f28175d = true;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            d();
            this.f28174c.a(this);
        }
    }

    private hc(Handler handler, mc mcVar, nc ncVar, pc pcVar) {
        this.f28172a = handler;
        this.f28173b = mcVar;
        this.f28174c = ncVar;
        pcVar.getClass();
        this.f28176e = pc.a();
    }

    @Override // com.yandex.mobile.ads.impl.lc
    public final void a() {
        e();
        this.f28173b.a();
    }
}
