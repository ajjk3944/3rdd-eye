package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes3.dex */
public final class k90 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f29561a;

    /* renamed from: b, reason: collision with root package name */
    private lt f29562b;

    /* renamed from: c, reason: collision with root package name */
    private final de2 f29563c;

    /* renamed from: d, reason: collision with root package name */
    private final d90 f29564d;

    /* renamed from: e, reason: collision with root package name */
    private fj f29565e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f29566f;

    public /* synthetic */ k90(C4072a3 c4072a3, ViewGroup viewGroup, lt ltVar, de2 de2Var) {
        this(c4072a3, viewGroup, ltVar, de2Var, new d90(c4072a3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a() {
        return true;
    }

    public final void b() {
        fj fjVar = this.f29565e;
        if (fjVar != null) {
            fjVar.a();
        } else {
            kotlin.jvm.internal.l.l("contentController");
            throw null;
        }
    }

    public final void a(Context context, a8 response, pz1 nativeAdPrivate, List preloadedDivKitDesigns) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(response, "response");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        fj fjVarA = this.f29564d.a(context, response, nativeAdPrivate, preloadedDivKitDesigns, this.f29561a, this.f29562b, this.f29566f, this.f29563c);
        this.f29565e = fjVarA;
        fjVarA.a(null, new j90());
    }

    public k90(C4072a3 adConfiguration, ViewGroup view, lt adEventListener, de2 videoEventController, d90 contentControllerCreator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(contentControllerCreator, "contentControllerCreator");
        this.f29561a = view;
        this.f29562b = adEventListener;
        this.f29563c = videoEventController;
        this.f29564d = contentControllerCreator;
        this.f29566f = new E1();
    }
}
