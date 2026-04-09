package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1790x;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import i6.C4458a;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class p20 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final N7.U3 f31569a;

    /* renamed from: b, reason: collision with root package name */
    private final f20 f31570b;

    /* renamed from: c, reason: collision with root package name */
    private final j6.i f31571c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f31572d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1790x f31573e;

    /* renamed from: f, reason: collision with root package name */
    private final i30 f31574f;

    /* renamed from: g, reason: collision with root package name */
    private final c20 f31575g;

    public /* synthetic */ p20(N7.U3 u32, f20 f20Var, j6.i iVar, mp1 mp1Var, InterfaceC1790x interfaceC1790x) {
        this(u32, f20Var, iVar, mp1Var, interfaceC1790x, new i30(), new c20());
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView container = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(container, "container");
        try {
            Context context = container.getContext();
            i30 i30Var = this.f31574f;
            kotlin.jvm.internal.l.c(context);
            j6.i iVar = this.f31571c;
            InterfaceC1790x interfaceC1790x = this.f31573e;
            i30Var.getClass();
            C0675l c0675lA = i30.a(context, iVar, interfaceC1790x);
            container.addView(c0675lA);
            this.f31575g.getClass();
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            c0675lA.F(this.f31569a, new C4458a(string));
            p10.a(c0675lA).a(this.f31570b);
        } catch (Throwable th) {
            fp0.b(new Object[0]);
            this.f31572d.reportError("Failed to bind DivKit", th);
        }
    }

    public p20(N7.U3 divData, f20 divKitActionAdapter, j6.i divConfiguration, mp1 reporter, InterfaceC1790x interfaceC1790x, i30 divViewCreator, c20 divDataTagCreator) {
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(divKitActionAdapter, "divKitActionAdapter");
        kotlin.jvm.internal.l.f(divConfiguration, "divConfiguration");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divViewCreator, "divViewCreator");
        kotlin.jvm.internal.l.f(divDataTagCreator, "divDataTagCreator");
        this.f31569a = divData;
        this.f31570b = divKitActionAdapter;
        this.f31571c = divConfiguration;
        this.f31572d = reporter;
        this.f31573e = interfaceC1790x;
        this.f31574f = divViewCreator;
        this.f31575g = divDataTagCreator;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
