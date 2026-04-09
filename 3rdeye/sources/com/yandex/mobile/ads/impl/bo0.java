package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class bo0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25353c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile bo0 f25354d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25355a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<fu, ys> f25356b;

    public static final class a {
        private a() {
        }

        public final bo0 a() {
            bo0 bo0Var;
            bo0 bo0Var2 = bo0.f25354d;
            if (bo0Var2 != null) {
                return bo0Var2;
            }
            synchronized (this) {
                bo0Var = bo0.f25354d;
                if (bo0Var == null) {
                    bo0Var = new bo0(0);
                    bo0.f25354d = bo0Var;
                }
            }
            return bo0Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private bo0() {
        this.f25355a = new Object();
        this.f25356b = new WeakHashMap<>();
    }

    public final void b(fu videoPlayer) {
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        synchronized (this.f25355a) {
            this.f25356b.remove(videoPlayer);
        }
    }

    public final ys a(fu videoPlayer) {
        ys ysVar;
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        synchronized (this.f25355a) {
            ysVar = this.f25356b.get(videoPlayer);
        }
        return ysVar;
    }

    public /* synthetic */ bo0(int i) {
        this();
    }

    public final void a(fu videoPlayer, ys adBinder) {
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        kotlin.jvm.internal.l.f(adBinder, "adBinder");
        synchronized (this.f25355a) {
            this.f25356b.put(videoPlayer, adBinder);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
