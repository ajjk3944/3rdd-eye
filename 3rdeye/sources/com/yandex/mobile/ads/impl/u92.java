package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class u92 {

    /* renamed from: a, reason: collision with root package name */
    private final C4078b2 f33980a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f33981b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C4078b2 f33982a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f33983b;

        public a(C4078b2 adBreak) {
            kotlin.jvm.internal.l.f(adBreak, "adBreak");
            this.f33982a = adBreak;
            pd2.a(adBreak);
        }

        public final C4078b2 a() {
            return this.f33982a;
        }

        public final Map<String, String> b() {
            return this.f33983b;
        }

        public final a c() {
            this.f33983b = null;
            return this;
        }
    }

    private u92(a aVar) {
        this.f33980a = aVar.a();
        this.f33981b = aVar.b();
    }

    public final C4078b2 a() {
        return this.f33980a;
    }

    public final Map<String, String> b() {
        return this.f33981b;
    }

    public /* synthetic */ u92(a aVar, int i) {
        this(aVar);
    }
}
