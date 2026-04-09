package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public final class gi1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f27762a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f27763b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f27764a;

        static {
            LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f27764a = logSessionId;
        }
    }

    static {
        if (s82.f32899a < 31) {
            new gi1();
        } else {
            int i = a.f27763b;
        }
    }

    public gi1() {
        this((a) null);
        zf.b(s82.f32899a < 31);
    }

    public final LogSessionId a() {
        a aVar = this.f27762a;
        aVar.getClass();
        return aVar.f27764a;
    }

    public gi1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private gi1(a aVar) {
        this.f27762a = aVar;
    }
}
