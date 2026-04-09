package com.zipoapps.ads.banner;

import B4.i;

/* compiled from: BannerSize.kt */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final R7.e f36974a;

    /* compiled from: BannerSize.kt */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final int f36975b;

        public a(int i) {
            super(R7.e.ADAPTIVE);
            this.f36975b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f36975b == ((a) obj).f36975b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f36975b * 31;
        }

        public final String toString() {
            return i.j(new StringBuilder("Adaptive(widthDp="), this.f36975b, ", maxHeightDp=null)");
        }
    }

    /* compiled from: BannerSize.kt */
    /* renamed from: com.zipoapps.ads.banner.b$b, reason: collision with other inner class name */
    public static final class C0429b extends b {

        /* renamed from: b, reason: collision with root package name */
        public final int f36976b;

        public C0429b(int i) {
            super(R7.e.ADAPTIVE_ANCHORED);
            this.f36976b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0429b) && this.f36976b == ((C0429b) obj).f36976b;
        }

        public final int hashCode() {
            return this.f36976b;
        }

        public final String toString() {
            return i.j(new StringBuilder("AdaptiveAnchored(widthDp="), this.f36976b, ")");
        }
    }

    /* compiled from: BannerSize.kt */
    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36977b = new c(R7.e.BANNER);
    }

    /* compiled from: BannerSize.kt */
    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final d f36978b = new d(R7.e.FULL_BANNER);
    }

    /* compiled from: BannerSize.kt */
    public static final class e extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final e f36979b = new e(R7.e.LARGE_BANNER);
    }

    /* compiled from: BannerSize.kt */
    public static final class f extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final f f36980b = new f(R7.e.LEADERBOARD);
    }

    /* compiled from: BannerSize.kt */
    public static final class g extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final g f36981b = new g(R7.e.MEDIUM_RECTANGLE);
    }

    public b(R7.e eVar) {
        this.f36974a = eVar;
    }
}
