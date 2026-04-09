package com.zipoapps.ads.banner;

import P7.H;
import R7.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.gson.internal.c;
import com.zipoapps.ads.banner.b;
import com.zipoapps.premiumhelper.e;
import i8.r;
import kotlin.jvm.internal.l;

/* compiled from: PhShimmerBannerAdView.kt */
/* loaded from: classes3.dex */
public final class PhShimmerBannerAdView extends H {

    /* renamed from: g, reason: collision with root package name */
    public final e f36959g;

    /* renamed from: h, reason: collision with root package name */
    public R7.a f36960h;

    /* compiled from: PhShimmerBannerAdView.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36961a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.ADAPTIVE_ANCHORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.LEADERBOARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.FULL_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.MEDIUM_RECTANGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.LARGE_BANNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f36961a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhShimmerBannerAdView(Context context, AttributeSet attributeSet) {
        e eVar;
        super(context, attributeSet, 0);
        l.f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f38631a);
        switch (typedArrayObtainStyledAttributes.getInt(0, 0)) {
            case 1:
                eVar = e.LARGE_BANNER;
                break;
            case 2:
                eVar = e.MEDIUM_RECTANGLE;
                break;
            case 3:
                eVar = e.FULL_BANNER;
                break;
            case 4:
                eVar = e.LEADERBOARD;
                break;
            case 5:
                eVar = e.ADAPTIVE;
                break;
            case 6:
                eVar = e.ADAPTIVE_ANCHORED;
                break;
            default:
                eVar = e.BANNER;
                break;
        }
        this.f36959g = eVar;
        typedArrayObtainStyledAttributes.recycle();
        setMinimumHeight(getMinHeight());
    }

    @Override // P7.H
    public final void e() {
        R7.a aVar = this.f36960h;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P7.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof R7.f
            if (r0 == 0) goto L13
            r0 = r5
            R7.f r0 = (R7.f) r0
            int r1 = r0.f11771p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11771p = r1
            goto L18
        L13:
            R7.f r0 = new R7.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11769n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f11771p
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.zipoapps.ads.banner.PhShimmerBannerAdView r1 = r0.f11768m
            com.zipoapps.ads.banner.PhShimmerBannerAdView r0 = r0.f11767l
            b9.n.b(r5)     // Catch: java.lang.Exception -> L75
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            b9.n.b(r5)
            R7.e r5 = r4.f36959g
            com.zipoapps.ads.banner.b r5 = r4.g(r5)
            com.zipoapps.premiumhelper.e$a r2 = com.zipoapps.premiumhelper.e.f37006D     // Catch: java.lang.Exception -> L75
            r2.getClass()     // Catch: java.lang.Exception -> L75
            com.zipoapps.premiumhelper.e r2 = com.zipoapps.premiumhelper.e.a.a()     // Catch: java.lang.Exception -> L75
            D9.G r2 = r2.f37035y     // Catch: java.lang.Exception -> L75
            java.lang.Object r2 = r2.f1157c     // Catch: java.lang.Exception -> L75
            com.zipoapps.ads.banner.a r2 = (com.zipoapps.ads.banner.a) r2     // Catch: java.lang.Exception -> L75
            r0.f11767l = r4     // Catch: java.lang.Exception -> L75
            r0.f11768m = r4     // Catch: java.lang.Exception -> L75
            r0.f11771p = r3     // Catch: java.lang.Exception -> L75
            r3 = 0
            java.lang.Object r5 = r2.a(r5, r3, r0)     // Catch: java.lang.Exception -> L75
            if (r5 != r1) goto L59
            return r1
        L59:
            r0 = r4
            r1 = r0
        L5b:
            R7.a r5 = (R7.a) r5     // Catch: java.lang.Exception -> L75
            r1.f36960h = r5     // Catch: java.lang.Exception -> L75
            R7.a r5 = r0.f36960h     // Catch: java.lang.Exception -> L75
            if (r5 == 0) goto L75
            P7.H$a r0 = new P7.H$a     // Catch: java.lang.Exception -> L75
            android.view.View r1 = r5.getView()     // Catch: java.lang.Exception -> L75
            java.lang.Integer r2 = r5.getWidth()     // Catch: java.lang.Exception -> L75
            java.lang.Integer r5 = r5.getHeight()     // Catch: java.lang.Exception -> L75
            r0.<init>(r1, r2, r5)     // Catch: java.lang.Exception -> L75
            return r0
        L75:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.ads.banner.PhShimmerBannerAdView.f(h9.c):java.lang.Object");
    }

    public final b g(e eVar) {
        switch (a.f36961a[eVar.ordinal()]) {
            case 1:
                return new b.C0429b(c.y(getWidth() / getResources().getDisplayMetrics().density));
            case 2:
                return new b.a(c.y(getWidth() / getResources().getDisplayMetrics().density));
            case 3:
                return b.f.f36980b;
            case 4:
                return b.d.f36978b;
            case 5:
                return b.g.f36981b;
            case 6:
                return b.e.f36979b;
            default:
                return b.c.f36977b;
        }
    }

    @Override // P7.H
    public int getMinHeight() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.ads.banner.a aVar = (com.zipoapps.ads.banner.a) e.a.a().f37035y.f1157c;
        b bannerSize = g(this.f36959g);
        aVar.getClass();
        l.f(bannerSize, "bannerSize");
        return aVar.f36968g.P(bannerSize);
    }
}
