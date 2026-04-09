package com.lefan.ads.banner;

import A3.z;
import a.AbstractC0241a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C0717Ro;
import j2.C2550f;
import j2.C2551g;
import j2.C2553i;
import p4.AbstractC2782i;
import q5.i;
import r4.InterfaceC2878a;

/* loaded from: classes.dex */
public final class BannerView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18749c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f18750a;

    /* renamed from: b, reason: collision with root package name */
    public C2553i f18751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.ad_banner_layout, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2782i.f22888a, 0, 0);
        this.f18750a = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(BannerView bannerView) {
        C2553i c2553i = new C2553i(bannerView.getContext());
        bannerView.f18751b = c2553i;
        c2553i.setAdSize(bannerView.getAdSize());
        C2553i c2553i2 = bannerView.f18751b;
        if (c2553i2 != null) {
            String str = bannerView.f18750a;
            i.b(str);
            c2553i2.setAdUnitId(str);
        }
        bannerView.removeAllViews();
        bannerView.addView(bannerView.f18751b);
        C2553i c2553i3 = bannerView.f18751b;
        if (c2553i3 != null) {
            c2553i3.setAdListener(new C0717Ro(bannerView));
        }
        C2551g c2551g = new C2551g(new C2550f(1));
        C2553i c2553i4 = bannerView.f18751b;
        if (c2553i4 != null) {
            c2553i4.b(c2551g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final j2.C2552h getAdSize() {
        /*
            r5 = this;
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            int r1 = r5.getWidth()
            r2 = 1
            if (r1 >= r2) goto L20
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            goto L24
        L20:
            int r1 = r5.getWidth()
        L24:
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = (int) r1
            android.content.Context r1 = r5.getContext()
            j2.h r3 = j2.C2552h.i
            W2.e r3 = u2.f.f23795b
            r3 = -1
            if (r1 != 0) goto L33
            goto L5a
        L33:
            android.content.Context r4 = r1.getApplicationContext()
            if (r4 == 0) goto L3d
            android.content.Context r1 = r1.getApplicationContext()
        L3d:
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L5a
            android.util.DisplayMetrics r4 = r1.getDisplayMetrics()
            if (r4 == 0) goto L5a
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L5a
            int r1 = r4.heightPixels
            float r1 = (float) r1
            float r4 = r4.density
            float r1 = r1 / r4
            int r1 = java.lang.Math.round(r1)
            goto L5b
        L5a:
            r1 = r3
        L5b:
            if (r1 != r3) goto L60
            j2.h r0 = j2.C2552h.f21339k
            goto Lb8
        L60:
            float r1 = (float) r1
            r3 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            r3 = 90
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 655(0x28f, float:9.18E-43)
            if (r0 <= r3) goto L7f
            float r3 = (float) r0
            r4 = 1144389632(0x44360000, float:728.0)
            float r3 = r3 / r4
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            goto La8
        L7f:
            r3 = 632(0x278, float:8.86E-43)
            if (r0 <= r3) goto L86
            r3 = 81
            goto La8
        L86:
            r3 = 526(0x20e, float:7.37E-43)
            if (r0 <= r3) goto L96
            float r3 = (float) r0
            r4 = 1139408896(0x43ea0000, float:468.0)
            float r3 = r3 / r4
            r4 = 1114636288(0x42700000, float:60.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            goto La8
        L96:
            r3 = 432(0x1b0, float:6.05E-43)
            if (r0 <= r3) goto L9d
            r3 = 68
            goto La8
        L9d:
            float r3 = (float) r0
            r4 = 1134559232(0x43a00000, float:320.0)
            float r3 = r3 / r4
            r4 = 1112014848(0x42480000, float:50.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
        La8:
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 50
            int r1 = java.lang.Math.max(r1, r3)
            j2.h r3 = new j2.h
            r3.<init>(r0, r1)
            r0 = r3
        Lb8:
            r0.f21343d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.ads.banner.BannerView.getAdSize():j2.h");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18750a == null) {
            System.out.println((Object) "日志：admob bannerid为空");
        } else if (AbstractC0241a.j(getContext(), "Banner_ad_pair")) {
            post(new z(18, this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2553i c2553i = this.f18751b;
        if (c2553i != null) {
            c2553i.a();
        }
        this.f18751b = null;
    }

    public final void setCallback(InterfaceC2878a interfaceC2878a) {
        i.e(interfaceC2878a, "bannerCallback");
    }
}
