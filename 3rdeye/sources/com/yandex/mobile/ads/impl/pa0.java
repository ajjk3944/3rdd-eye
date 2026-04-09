package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class pa0 implements sm0 {

    /* renamed from: f, reason: collision with root package name */
    private static final int f31688f = R.drawable.monetization_ads_internal_instream_adtune_control_v2;

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f31689a;

    /* renamed from: b, reason: collision with root package name */
    private final eg f31690b;

    /* renamed from: c, reason: collision with root package name */
    private final zf2 f31691c;

    /* renamed from: d, reason: collision with root package name */
    private final rb f31692d;

    /* renamed from: e, reason: collision with root package name */
    private final m20 f31693e;

    public pa0(ag<?> agVar, eg assetClickConfigurator, zf2 videoTracker, rb adtuneRenderer, m20 divKitAdtuneRenderer) {
        kotlin.jvm.internal.l.f(assetClickConfigurator, "assetClickConfigurator");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(adtuneRenderer, "adtuneRenderer");
        kotlin.jvm.internal.l.f(divKitAdtuneRenderer, "divKitAdtuneRenderer");
        this.f31689a = agVar;
        this.f31690b = assetClickConfigurator;
        this.f31691c = videoTracker;
        this.f31692d = adtuneRenderer;
        this.f31693e = divKitAdtuneRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        ImageView imageViewH = uiElements.h();
        if (imageViewH != null) {
            Drawable drawable = imageViewH.getDrawable();
            if (drawable == null) {
                drawable = C5848a.getDrawable(imageViewH.getContext(), f31688f);
            }
            imageViewH.setImageDrawable(drawable);
            imageViewH.setVisibility(a() != null ? 0 : 8);
            ak akVarA = a();
            if (akVarA == null) {
                this.f31690b.a(imageViewH, this.f31689a);
                return;
            }
            Context context = imageViewH.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            imageViewH.setOnClickListener(new oa0(akVarA, this.f31692d, this.f31693e, this.f31691c, new ee2(context)));
        }
    }

    private final ak a() {
        InterfaceC4200t interfaceC4200t;
        ir0 ir0VarA;
        List<InterfaceC4200t> listA;
        Object next;
        ag<?> agVar = this.f31689a;
        if (agVar == null || (ir0VarA = agVar.a()) == null || (listA = ir0VarA.a()) == null) {
            interfaceC4200t = null;
        } else {
            Iterator<T> it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC4200t interfaceC4200t2 = (InterfaceC4200t) next;
                if (kotlin.jvm.internal.l.b(interfaceC4200t2.a(), "adtune") || kotlin.jvm.internal.l.b(interfaceC4200t2.a(), "divkit_adtune")) {
                    break;
                }
            }
            interfaceC4200t = (InterfaceC4200t) next;
        }
        if (interfaceC4200t instanceof ak) {
            return (ak) interfaceC4200t;
        }
        return null;
    }
}
