package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class a92 {

    /* renamed from: a, reason: collision with root package name */
    private final a f24559a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24560b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24561c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f24562d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f24563e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f24564f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f24565g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24566h;
        public static final a i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f24567j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f24568k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f24569l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f24570m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f24571n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f24572o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f24573p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f24574q;

        /* renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ a[] f24575r;

        /* renamed from: b, reason: collision with root package name */
        private final String f24576b;

        static {
            a aVar = new a(0, "SUCCESS", "success");
            f24561c = aVar;
            a aVar2 = new a(1, "APPLICATION_INACTIVE", "application_inactive");
            f24562d = aVar2;
            a aVar3 = new a(2, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
            f24563e = aVar3;
            a aVar4 = new a(3, "NO_AD_VIEW", "no_ad_view");
            f24564f = aVar4;
            a aVar5 = new a(4, "NO_VISIBLE_ADS", "no_visible_ads");
            f24565g = aVar5;
            a aVar6 = new a(5, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
            f24566h = aVar6;
            a aVar7 = new a(6, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
            i = aVar7;
            a aVar8 = new a(7, "NOT_ADDED_TO_HIERARCHY", "not_added_to_hierarchy");
            f24567j = aVar8;
            a aVar9 = new a(8, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
            f24568k = aVar9;
            a aVar10 = new a(9, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
            f24569l = aVar10;
            a aVar11 = new a(10, "REQUIRED_ASSET_IS_NOT_SUBVIEW", "required_asset_is_not_subview");
            f24570m = aVar11;
            a aVar12 = new a(11, "SUPERVIEW_NULL", "superview_null");
            f24571n = aVar12;
            a aVar13 = new a(12, "SUPERVIEW_HIDDEN", "superview_hidden");
            f24572o = aVar13;
            a aVar14 = new a(13, "TOO_SMALL", "too_small");
            f24573p = aVar14;
            a aVar15 = new a(14, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
            f24574q = aVar15;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
            f24575r = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i10, String str, String str2) {
            this.f24576b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24575r.clone();
        }

        public final String a() {
            return this.f24576b;
        }
    }

    public a92(a status, String str) {
        kotlin.jvm.internal.l.f(status, "status");
        this.f24559a = status;
        this.f24560b = str;
    }

    public static a92 a(a92 a92Var) {
        a status = a.f24565g;
        String str = a92Var.f24560b;
        kotlin.jvm.internal.l.f(status, "status");
        return new a92(status, str);
    }

    public final a b() {
        return this.f24559a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a92)) {
            return false;
        }
        a92 a92Var = (a92) obj;
        return this.f24559a == a92Var.f24559a && kotlin.jvm.internal.l.b(this.f24560b, a92Var.f24560b);
    }

    public final int hashCode() {
        int iHashCode = this.f24559a.hashCode() * 31;
        String str = this.f24560b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ValidationResult(status=" + this.f24559a + ", description=" + this.f24560b + ")";
    }

    public final String a() {
        return this.f24560b;
    }
}
