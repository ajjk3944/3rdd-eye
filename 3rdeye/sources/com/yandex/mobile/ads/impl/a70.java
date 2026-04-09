package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class a70 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f24449b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a70 f24450c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24451d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final z60 f24452a;

    public static final class a {
        public static a70 a() {
            a70 a70Var;
            a70 a70Var2 = a70.f24450c;
            if (a70Var2 != null) {
                return a70Var2;
            }
            synchronized (a70.f24449b) {
                a70Var = a70.f24450c;
                if (a70Var == null) {
                    a70Var = new a70(0);
                    a70.f24450c = a70Var;
                }
            }
            return a70Var;
        }
    }

    private a70() {
        this.f24452a = new z60(af2.a());
    }

    public final ia1 a(mb2<?> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        return this.f24452a.get(videoAdInfo);
    }

    public /* synthetic */ a70(int i) {
        this();
    }

    public final void a(mb2 videoAdInfo, d70 exoVideoAdPlayer) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(exoVideoAdPlayer, "exoVideoAdPlayer");
        this.f24452a.put(videoAdInfo, exoVideoAdPlayer);
    }
}
