package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class x21 extends sn {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f35153g = {fa.a(x21.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* renamed from: c, reason: collision with root package name */
    private final h31 f35154c;

    /* renamed from: d, reason: collision with root package name */
    private final a31 f35155d;

    /* renamed from: e, reason: collision with root package name */
    private final ao1 f35156e;

    /* renamed from: f, reason: collision with root package name */
    private a f35157f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35158b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f35159c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f35160d;

        static {
            a aVar = new a(0, "LEFT");
            f35158b = aVar;
            a aVar2 = new a(1, "RIGHT");
            f35159c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f35160d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35160d.clone();
        }
    }

    public x21(Q1.f viewPager, h31 multiBannerSwiper, a31 multiBannerEventTracker) {
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        kotlin.jvm.internal.l.f(multiBannerSwiper, "multiBannerSwiper");
        kotlin.jvm.internal.l.f(multiBannerEventTracker, "multiBannerEventTracker");
        this.f35154c = multiBannerSwiper;
        this.f35155d = multiBannerEventTracker;
        this.f35156e = bo1.a(viewPager);
        this.f35157f = a.f35158b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1992A c1992a;
        Q1.f fVar = (Q1.f) this.f35156e.getValue(this, f35153g[0]);
        if (fVar != null) {
            if (jh2.b(fVar) > 0) {
                RecyclerView.h adapter = fVar.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = fVar.getCurrentItem();
                    if (currentItem == 0) {
                        this.f35157f = a.f35158b;
                    } else if (currentItem == itemCount - 1) {
                        this.f35157f = a.f35159c;
                    }
                } else {
                    a();
                }
                int iOrdinal = this.f35157f.ordinal();
                if (iOrdinal == 0) {
                    this.f35154c.a();
                } else if (iOrdinal == 1) {
                    this.f35154c.b();
                }
                this.f35155d.a();
            }
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            a();
        }
    }
}
