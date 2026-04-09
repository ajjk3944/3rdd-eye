package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;

/* loaded from: classes3.dex */
public final class cx0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f25796a;

    /* renamed from: b, reason: collision with root package name */
    private final dx0 f25797b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25798c;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CustomizableMediaView f25800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vw0.a f25801c;

        public a(CustomizableMediaView customizableMediaView, vw0.a aVar) {
            this.f25800b = customizableMediaView;
            this.f25801c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            cx0.this.f25797b.a(this.f25800b, this.f25801c.a());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cx0(Context context, C4072a3 c4072a3) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, new dx0(applicationContext, c4072a3));
    }

    public final void a(CustomizableMediaView mediaView, vw0.a type) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(type, "type");
        if (this.f25798c) {
            if (this.f25796a.b() == ns.f30991g) {
                jh2.a(mediaView, new a(mediaView, type));
            }
            this.f25798c = false;
        }
    }

    public cx0(Context context, C4072a3 adConfiguration, dx0 mediaViewSizeInfoController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mediaViewSizeInfoController, "mediaViewSizeInfoController");
        this.f25796a = adConfiguration;
        this.f25797b = mediaViewSizeInfoController;
        this.f25798c = true;
    }
}
