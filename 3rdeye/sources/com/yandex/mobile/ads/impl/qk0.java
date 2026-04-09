package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class qk0 {

    /* renamed from: a, reason: collision with root package name */
    private final rh2 f32237a;

    /* renamed from: b, reason: collision with root package name */
    private final ul f32238b;

    /* renamed from: c, reason: collision with root package name */
    private final j10 f32239c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<FrameLayout, WeakReference<tl>> f32240d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakHashMap<FrameLayout, WeakReference<sk0>> f32241e;

    public /* synthetic */ qk0() {
        this(new rh2(), new ul(), new j10());
    }

    public final void a(FrameLayout adView) {
        kotlin.jvm.internal.l.f(adView, "adView");
        WeakReference<tl> weakReference = this.f32240d.get(adView);
        tl tlVar = weakReference != null ? weakReference.get() : null;
        if (tlVar != null) {
            this.f32240d.remove(adView);
            adView.removeView(tlVar);
        }
        WeakReference<sk0> weakReference2 = this.f32241e.get(adView);
        sk0 sk0Var = weakReference2 != null ? weakReference2.get() : null;
        if (sk0Var != null) {
            this.f32241e.remove(adView);
            adView.removeView(sk0Var);
        }
    }

    public qk0(rh2 descriptionCreator, ul borderViewManager, j10 dimensionConverter) {
        kotlin.jvm.internal.l.f(descriptionCreator, "descriptionCreator");
        kotlin.jvm.internal.l.f(borderViewManager, "borderViewManager");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f32237a = descriptionCreator;
        this.f32238b = borderViewManager;
        this.f32239c = dimensionConverter;
        this.f32240d = new WeakHashMap<>();
        this.f32241e = new WeakHashMap<>();
    }

    public final void a(FrameLayout adView, a92 validationResult, boolean z10) {
        sk0 sk0Var;
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        kotlin.jvm.internal.l.f(adView, "adView");
        WeakReference<tl> weakReference = this.f32240d.get(adView);
        tl tlVar = weakReference != null ? weakReference.get() : null;
        if (tlVar == null) {
            Context context = adView.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            tlVar = new tl(context, this.f32239c, new z40());
            this.f32240d.put(adView, new WeakReference<>(tlVar));
            adView.addView(tlVar);
        }
        this.f32238b.getClass();
        tlVar.setColor(z10 ? -65536 : -16711936);
        if (z10) {
            WeakReference<sk0> weakReference2 = this.f32241e.get(adView);
            sk0Var = weakReference2 != null ? weakReference2.get() : null;
            if (sk0Var == null) {
                Context context2 = adView.getContext();
                kotlin.jvm.internal.l.e(context2, "getContext(...)");
                sk0Var = new sk0(context2, new j10());
                this.f32241e.put(adView, new WeakReference<>(sk0Var));
                adView.addView(sk0Var);
            }
            this.f32237a.getClass();
            sk0Var.setDescription(rh2.a(validationResult));
            return;
        }
        WeakReference<sk0> weakReference3 = this.f32241e.get(adView);
        sk0Var = weakReference3 != null ? weakReference3.get() : null;
        if (sk0Var != null) {
            this.f32241e.remove(adView);
            adView.removeView(sk0Var);
        }
    }
}
