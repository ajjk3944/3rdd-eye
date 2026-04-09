package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;
import java.util.List;

/* loaded from: classes3.dex */
public final class nu0 implements bg<sw0>, t00<sw0> {

    /* renamed from: a, reason: collision with root package name */
    private final rj0 f31016a;

    /* renamed from: b, reason: collision with root package name */
    private final vw0 f31017b;

    public nu0(rj0 rj0Var, vw0 vw0Var) {
        this.f31016a = rj0Var;
        this.f31017b = vw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void a() {
        vw0 vw0Var;
        rj0 rj0Var;
        ImageView imageView = (ImageView) a((ig2) this.f31016a);
        if (imageView != null && (rj0Var = this.f31016a) != null) {
            rj0Var.a(imageView);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ig2) this.f31017b);
        if (customizableMediaView == null || (vw0Var = this.f31017b) == null) {
            return;
        }
        vw0Var.a((vw0) customizableMediaView);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean b() {
        vw0 vw0Var = this.f31017b;
        if (vw0Var != null && vw0Var.b() != null) {
            return true;
        }
        rj0 rj0Var = this.f31016a;
        return (rj0Var == null || rj0Var.b() == null) ? false : true;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final yg2 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ig2) this.f31017b);
        ImageView imageView = (ImageView) a((ig2) this.f31016a);
        if (customizableMediaView != null) {
            return new yg2(customizableMediaView.getWidth(), customizableMediaView.getHeight());
        }
        if (imageView != null) {
            return new yg2(imageView.getWidth(), imageView.getHeight());
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean d() {
        vw0 vw0Var = this.f31017b;
        boolean z10 = vw0Var != null && jh2.a(vw0Var.b(), 100);
        rj0 rj0Var = this.f31016a;
        return z10 || (rj0Var != null && jh2.a(rj0Var.b(), 100));
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void destroy() {
        vw0 vw0Var = this.f31017b;
        if (vw0Var != null) {
            vw0Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean e() {
        rj0 rj0Var;
        vw0 vw0Var = this.f31017b;
        return (vw0Var != null && vw0Var.c()) || ((rj0Var = this.f31016a) != null && rj0Var.c());
    }

    public final vw0.a f() {
        vw0.a aVarD;
        vw0 vw0Var = this.f31017b;
        if (vw0Var != null && (aVarD = vw0Var.d()) != null) {
            return aVarD;
        }
        if (this.f31016a != null) {
            return vw0.a.f34722f;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void a(ag<sw0> asset, lg2 viewConfigurator) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        sw0 sw0VarD = asset.d();
        rj0 rj0Var = this.f31016a;
        if (rj0Var != null) {
            rj0Var.a((ag<?>) asset, viewConfigurator, (lg2) a((List) sw0VarD.a()));
        }
        vw0 vw0Var = this.f31017b;
        if (vw0Var != null) {
            vw0Var.a(asset, viewConfigurator, sw0VarD);
        }
    }

    @Override // com.yandex.mobile.ads.impl.t00
    public final void b(sw0 sw0Var) {
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        jj0 jj0VarA = a((List) mediaValue.a());
        ImageView imageView = (ImageView) a((ig2) this.f31016a);
        if (imageView != null && jj0VarA != null) {
            rj0 rj0Var = this.f31016a;
            if (rj0Var != null) {
                rj0Var.a(imageView, jj0VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ig2) this.f31017b);
        if (customizableMediaView == null) {
            return;
        }
        vw0 vw0Var = this.f31017b;
        if (vw0Var != null) {
            vw0Var.a(mediaValue);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final void c(sw0 sw0Var) {
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        jj0 jj0VarA = a((List) mediaValue.a());
        ImageView imageView = (ImageView) a((ig2) this.f31016a);
        if (imageView != null && jj0VarA != null) {
            rj0 rj0Var = this.f31016a;
            if (rj0Var != null) {
                rj0Var.a(imageView, jj0VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ig2) this.f31017b);
        if (customizableMediaView != null) {
            vw0 vw0Var = this.f31017b;
            if (vw0Var != null) {
                vw0Var.b(customizableMediaView, mediaValue);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    private static View a(ig2 ig2Var) {
        if (ig2Var != null) {
            return ig2Var.b();
        }
        return null;
    }

    private static jj0 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (jj0) list.get(0);
    }

    @Override // com.yandex.mobile.ads.impl.bg
    public final boolean a(sw0 sw0Var) {
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        rj0 rj0Var = this.f31016a;
        jj0 jj0VarA = a((List) mediaValue.a());
        View viewA = a((ig2) rj0Var);
        boolean z10 = (viewA == null || jj0VarA == null || rj0Var == null || !rj0Var.a(viewA, jj0VarA)) ? false : true;
        vw0 vw0Var = this.f31017b;
        View viewA2 = a((ig2) vw0Var);
        return z10 || (viewA2 != null && vw0Var != null && vw0Var.a((vw0) viewA2, (View) mediaValue));
    }
}
