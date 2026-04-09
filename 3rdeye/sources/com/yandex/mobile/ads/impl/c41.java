package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import c9.C2092m;
import c9.C2097r;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c41 {

    /* renamed from: a, reason: collision with root package name */
    private final qi0 f25528a;

    /* renamed from: b, reason: collision with root package name */
    private final ou0 f25529b;

    /* renamed from: c, reason: collision with root package name */
    private final jg f25530c;

    /* renamed from: d, reason: collision with root package name */
    private final pg f25531d;

    public /* synthetic */ c41(Context context) {
        hj0 hj0Var = new hj0();
        qi0 qi0Var = new qi0(context, hj0Var);
        this(context, hj0Var, qi0Var, new ou0(qi0Var), new jg(), new pg());
    }

    public final List<ag<? extends Object>> a(MediatedNativeAdAssets nativeAdAssets, Map<String, Bitmap> imageValues) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        return C2097r.n0(C2092m.W(a(nativeAdAssets.getAge(), "age"), a(nativeAdAssets.getBody(), "body"), a(nativeAdAssets.getCallToAction(), "call_to_action"), a(nativeAdAssets.getDomain(), "domain"), a(this.f25528a.a(imageValues, nativeAdAssets.getFavicon()), "favicon"), a(this.f25528a.a(imageValues, nativeAdAssets.getIcon()), "icon"), a(this.f25529b.a(imageValues, nativeAdAssets.getImage(), nativeAdAssets.getMedia()), "media"), a(nativeAdAssets.getPrice(), "price"), a(String.valueOf(nativeAdAssets.getRating()), "rating"), a(nativeAdAssets.getReviewCount(), "review_count"), a(nativeAdAssets.getSponsored(), "sponsored"), a(nativeAdAssets.getTitle(), AppIntroBaseFragmentKt.ARG_TITLE), a(nativeAdAssets.getWarning(), "warning"), a(this.f25528a.a(imageValues, nativeAdAssets.getFeedback()), "feedback")));
    }

    public c41(Context context, hj0 imageSizeValidator, qi0 imageAssetConverter, ou0 mediaAssetConverter, jg assetCreatorProvider, pg assetValueValidatorProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageSizeValidator, "imageSizeValidator");
        kotlin.jvm.internal.l.f(imageAssetConverter, "imageAssetConverter");
        kotlin.jvm.internal.l.f(mediaAssetConverter, "mediaAssetConverter");
        kotlin.jvm.internal.l.f(assetCreatorProvider, "assetCreatorProvider");
        kotlin.jvm.internal.l.f(assetValueValidatorProvider, "assetValueValidatorProvider");
        this.f25528a = imageAssetConverter;
        this.f25529b = mediaAssetConverter;
        this.f25530c = assetCreatorProvider;
        this.f25531d = assetValueValidatorProvider;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.mobile.ads.impl.ag a(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.pg r0 = r7.f25531d
            r0.getClass()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.l.f(r9, r0)
            int r0 = r9.hashCode()
            r1 = -1074675180(0xffffffffbff1c214, float:-1.8887353)
            java.lang.String r2 = "favicon"
            java.lang.String r3 = "feedback"
            java.lang.String r4 = "icon"
            java.lang.String r5 = "media"
            if (r0 == r1) goto L50
            r1 = -191501435(0xfffffffff495eb85, float:-9.502309E31)
            if (r0 == r1) goto L49
            r1 = 3226745(0x313c79, float:4.521633E-39)
            if (r0 == r1) goto L42
            r1 = 103772132(0x62f6fe4, float:3.2996046E-35)
            if (r0 == r1) goto L2b
            goto L56
        L2b:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L32
            goto L56
        L32:
            com.yandex.mobile.ads.impl.ru0 r0 = new com.yandex.mobile.ads.impl.ru0
            com.yandex.mobile.ads.impl.ri0 r1 = new com.yandex.mobile.ads.impl.ri0
            r1.<init>()
            com.yandex.mobile.ads.impl.rw0 r6 = new com.yandex.mobile.ads.impl.rw0
            r6.<init>()
            r0.<init>(r1, r6)
            goto L61
        L42:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L5c
            goto L56
        L49:
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L5c
            goto L56
        L50:
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L5c
        L56:
            com.yandex.mobile.ads.impl.q22 r0 = new com.yandex.mobile.ads.impl.q22
            r0.<init>()
            goto L61
        L5c:
            com.yandex.mobile.ads.impl.ri0 r0 = new com.yandex.mobile.ads.impl.ri0
            r0.<init>()
        L61:
            if (r8 == 0) goto Ld9
            boolean r0 = r0.a(r8)
            if (r0 == 0) goto Ld9
            com.yandex.mobile.ads.impl.jg r0 = r7.f25530c
            r0.getClass()
            int r0 = r9.hashCode()
            switch(r0) {
                case -1678958759: goto Lc1;
                case -1074675180: goto Lb4;
                case -938102371: goto La0;
                case -807286424: goto L97;
                case -191501435: goto L8a;
                case 3226745: goto L83;
                case 103772132: goto L76;
                default: goto L75;
            }
        L75:
            goto Lc9
        L76:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L7d
            goto Lc9
        L7d:
            com.yandex.mobile.ads.impl.pu0 r0 = new com.yandex.mobile.ads.impl.pu0
            r0.<init>()
            goto Ld4
        L83:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto Lbb
            goto Lc9
        L8a:
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L91
            goto Lc9
        L91:
            com.yandex.mobile.ads.impl.va0 r0 = new com.yandex.mobile.ads.impl.va0
            r0.<init>()
            goto Ld4
        L97:
            java.lang.String r0 = "review_count"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto La9
            goto Lc9
        La0:
            java.lang.String r0 = "rating"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto La9
            goto Lc9
        La9:
            com.yandex.mobile.ads.impl.md1 r0 = new com.yandex.mobile.ads.impl.md1
            com.yandex.mobile.ads.impl.lr1 r1 = new com.yandex.mobile.ads.impl.lr1
            r1.<init>()
            r0.<init>(r1)
            goto Ld4
        Lb4:
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto Lbb
            goto Lc9
        Lbb:
            com.yandex.mobile.ads.impl.kj0 r0 = new com.yandex.mobile.ads.impl.kj0
            r0.<init>()
            goto Ld4
        Lc1:
            java.lang.String r0 = "close_button"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lcf
        Lc9:
            com.yandex.mobile.ads.impl.p22 r0 = new com.yandex.mobile.ads.impl.p22
            r0.<init>()
            goto Ld4
        Lcf:
            com.yandex.mobile.ads.impl.jp r0 = new com.yandex.mobile.ads.impl.jp
            r0.<init>()
        Ld4:
            com.yandex.mobile.ads.impl.ag r8 = r0.a(r8, r9)
            return r8
        Ld9:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c41.a(java.lang.Object, java.lang.String):com.yandex.mobile.ads.impl.ag");
    }
}
