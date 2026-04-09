package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class xq {

    /* renamed from: a, reason: collision with root package name */
    private final kt f35379a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35380b;

    /* renamed from: c, reason: collision with root package name */
    private final x31 f35381c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35382b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f35383c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f35384d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f35385e;

        static {
            a aVar = new a(0, "FAVICON");
            f35382b = aVar;
            a aVar2 = new a(1, "ICON");
            f35383c = aVar2;
            a aVar3 = new a(2, "THUMB");
            f35384d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f35385e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35385e.clone();
        }
    }

    public xq(kt nativeAdAssets, int i, x31 nativeAdAdditionalViewProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        this.f35379a = nativeAdAssets;
        this.f35380b = i;
        this.f35381c = nativeAdAdditionalViewProvider;
    }

    public final ImageView a(View parentView) {
        kotlin.jvm.internal.l.f(parentView, "parentView");
        return a(parentView, a.f35382b, this.f35379a.e());
    }

    public final ImageView b(View parentView) {
        kotlin.jvm.internal.l.f(parentView, "parentView");
        return a(parentView, a.f35383c, this.f35379a.g());
    }

    private final ImageView a(View container, a aVar, mt mtVar) {
        a aVar2;
        mt mtVarG = this.f35379a.g();
        mt mtVarE = this.f35379a.e();
        if (mtVarG != null) {
            aVar2 = a.f35383c;
        } else if (mtVarE != null) {
            aVar2 = a.f35382b;
        } else {
            aVar2 = a.f35384d;
        }
        if (mtVar == null || aVar2 != aVar) {
            return null;
        }
        int iD = mtVar.d();
        int iB = mtVar.b();
        int i = this.f35380b;
        if (i <= iD && i <= iB) {
            this.f35381c.getClass();
            kotlin.jvm.internal.l.f(container, "container");
            return (ImageView) container.findViewById(R.id.icon_large);
        }
        this.f35381c.getClass();
        kotlin.jvm.internal.l.f(container, "container");
        return (ImageView) container.findViewById(R.id.icon_small);
    }
}
