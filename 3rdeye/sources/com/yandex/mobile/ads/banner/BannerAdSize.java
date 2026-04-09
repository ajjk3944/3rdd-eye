package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.i22;
import com.yandex.mobile.ads.impl.lb0;
import com.yandex.mobile.ads.impl.ts;
import com.yandex.mobile.ads.impl.vy1;
import com.yandex.mobile.ads.impl.zk1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BannerAdSize extends zk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23944a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final vy1 f23945b;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final BannerAdSize fixedSize(Context context, int i, int i10) {
            l.f(context, "context");
            return new BannerAdSize(new lb0(i, i10, vy1.a.f34738c));
        }

        public final BannerAdSize inlineSize(Context context, int i, int i10) {
            l.f(context, "context");
            return new BannerAdSize(new lb0(i, i10, vy1.a.f34739d));
        }

        public final BannerAdSize stickySize(Context context, int i) {
            l.f(context, "context");
            ts coreBannerAdSize = i22.a(context, i);
            l.f(coreBannerAdSize, "coreBannerAdSize");
            return new BannerAdSize(coreBannerAdSize.a());
        }

        private a() {
        }
    }

    public BannerAdSize(vy1 sizeInfo) {
        l.f(sizeInfo, "sizeInfo");
        this.f23945b = sizeInfo;
    }

    public static final BannerAdSize fixedSize(Context context, int i, int i10) {
        return f23944a.fixedSize(context, i, i10);
    }

    public static final BannerAdSize inlineSize(Context context, int i, int i10) {
        return f23944a.inlineSize(context, i, i10);
    }

    public static final BannerAdSize stickySize(Context context, int i) {
        return f23944a.stickySize(context, i);
    }

    public final vy1 a() {
        return this.f23945b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !BannerAdSize.class.equals(obj.getClass())) {
            return false;
        }
        return l.b(this.f23945b, ((BannerAdSize) obj).f23945b);
    }

    public final int getHeight() {
        return this.f23945b.getHeight();
    }

    public final int getHeightInPixels(Context context) {
        l.f(context, "context");
        return this.f23945b.b(context);
    }

    public final int getWidth() {
        return this.f23945b.getWidth();
    }

    public final int getWidthInPixels(Context context) {
        l.f(context, "context");
        return this.f23945b.d(context);
    }

    public int hashCode() {
        return this.f23945b.hashCode();
    }

    public String toString() {
        return this.f23945b.toString();
    }

    public final int getHeight(Context context) {
        l.f(context, "context");
        return this.f23945b.a(context);
    }

    public final int getWidth(Context context) {
        l.f(context, "context");
        return this.f23945b.c(context);
    }
}
