package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ym0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35918a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35919b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35920c;

    /* renamed from: d, reason: collision with root package name */
    private final float f35921d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f35922a;

        /* renamed from: b, reason: collision with root package name */
        private float f35923b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f35924c;

        /* renamed from: d, reason: collision with root package name */
        private float f35925d;

        public final a a(float f10) {
            this.f35923b = f10;
            return this;
        }

        public final float b() {
            return this.f35923b;
        }

        public final float c() {
            return this.f35925d;
        }

        public final boolean d() {
            return this.f35924c;
        }

        public final boolean e() {
            return this.f35922a;
        }

        public final void a(boolean z10) {
            this.f35924c = z10;
        }

        public final void b(float f10) {
            this.f35925d = f10;
        }

        public final ym0 a() {
            return new ym0(this);
        }

        public final a b(boolean z10) {
            this.f35922a = z10;
            return this;
        }
    }

    public /* synthetic */ ym0(a aVar) {
        this(aVar.e(), aVar.b(), aVar.d(), aVar.c());
    }

    public final float a() {
        return this.f35919b;
    }

    public final float b() {
        return this.f35921d;
    }

    public final boolean c() {
        return this.f35920c;
    }

    public final boolean d() {
        return this.f35918a;
    }

    private ym0(boolean z10, float f10, boolean z11, float f11) {
        this.f35918a = z10;
        this.f35919b = f10;
        this.f35920c = z11;
        this.f35921d = f11;
    }
}
