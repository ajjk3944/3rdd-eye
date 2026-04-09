package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f25629a;

    /* renamed from: b, reason: collision with root package name */
    private final ej0 f25630b;

    /* renamed from: c, reason: collision with root package name */
    private final ww0 f25631c;

    /* renamed from: d, reason: collision with root package name */
    private final c91 f25632d;

    /* renamed from: e, reason: collision with root package name */
    private final j81 f25633e;

    /* renamed from: f, reason: collision with root package name */
    private final mp1 f25634f;

    public cg(a8<?> adResponse, ej0 imageProvider, ww0 mediaViewAdapterCreator, c91 nativeMediaContent, j81 nativeForcePauseObserver, mp1 reporter, fv customAssetTracker) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(customAssetTracker, "customAssetTracker");
        this.f25629a = adResponse;
        this.f25630b = imageProvider;
        this.f25631c = mediaViewAdapterCreator;
        this.f25632d = nativeMediaContent;
        this.f25633e = nativeForcePauseObserver;
        this.f25634f = reporter;
    }

    public final pi0 a(ImageView imageView) {
        xa0 xa0Var;
        if (imageView != null) {
            Context context = imageView.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            xa0Var = new xa0(imageView, new vi0(context, new t81(this.f25629a), this.f25630b));
        } else {
            xa0Var = null;
        }
        if (xa0Var != null) {
            return new pi0(xa0Var);
        }
        return null;
    }

    public final nu0 a(ImageView imageView, CustomizableMediaView customizableMediaView) {
        rj0 rj0Var = imageView != null ? new rj0(imageView, this.f25630b, this.f25629a) : null;
        vw0 vw0VarA = customizableMediaView != null ? this.f25631c.a(customizableMediaView, this.f25630b, this.f25632d, this.f25633e) : null;
        if (rj0Var == null && vw0VarA == null) {
            return null;
        }
        return new nu0(rj0Var, vw0VarA);
    }

    public final az a(View view) {
        fn1 fn1Var = view instanceof gn1 ? new fn1(view, this.f25634f) : null;
        if (fn1Var != null) {
            return new az(fn1Var);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.bg<?> a(android.view.View r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.l.f(r4, r0)
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case -1034364087: goto L6b;
                case -891985903: goto L62;
                case -410956671: goto L4e;
                case 100313435: goto L29;
                case 103772132: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L8c
        Lf:
            java.lang.String r0 = "media"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            boolean r4 = r3 instanceof com.monetization.ads.nativeads.CustomizableMediaView
            if (r4 == 0) goto L1f
            r4 = r3
            com.monetization.ads.nativeads.CustomizableMediaView r4 = (com.monetization.ads.nativeads.CustomizableMediaView) r4
            goto L20
        L1f:
            r4 = r1
        L20:
            if (r4 == 0) goto L8c
            com.monetization.ads.nativeads.CustomizableMediaView r3 = (com.monetization.ads.nativeads.CustomizableMediaView) r3
            com.yandex.mobile.ads.impl.nu0 r3 = r2.a(r1, r3)
            return r3
        L29:
            java.lang.String r0 = "image"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L32
            goto L8c
        L32:
            boolean r4 = r3 instanceof android.widget.ImageView
            if (r4 == 0) goto L3a
            r4 = r3
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            goto L3b
        L3a:
            r4 = r1
        L3b:
            if (r4 == 0) goto L8c
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.yandex.mobile.ads.impl.rj0 r4 = new com.yandex.mobile.ads.impl.rj0
            com.yandex.mobile.ads.impl.ej0 r0 = r2.f25630b
            com.yandex.mobile.ads.impl.a8<?> r1 = r2.f25629a
            r4.<init>(r3, r0, r1)
            com.yandex.mobile.ads.impl.pi0 r3 = new com.yandex.mobile.ads.impl.pi0
            r3.<init>(r4)
            return r3
        L4e:
            java.lang.String r0 = "container"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L57
            goto L8c
        L57:
            com.yandex.mobile.ads.impl.ns1 r4 = new com.yandex.mobile.ads.impl.ns1
            r4.<init>(r3)
            com.yandex.mobile.ads.impl.az r3 = new com.yandex.mobile.ads.impl.az
            r3.<init>(r4)
            return r3
        L62:
            java.lang.String r0 = "string"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L74
            goto L8c
        L6b:
            java.lang.String r0 = "number"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L74
            goto L8c
        L74:
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L7c
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L7d
        L7c:
            r4 = r1
        L7d:
            if (r4 == 0) goto L8c
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.yandex.mobile.ads.impl.j42 r4 = new com.yandex.mobile.ads.impl.j42
            r4.<init>(r3)
            com.yandex.mobile.ads.impl.az r3 = new com.yandex.mobile.ads.impl.az
            r3.<init>(r4)
            return r3
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cg.a(android.view.View, java.lang.String):com.yandex.mobile.ads.impl.bg");
    }
}
