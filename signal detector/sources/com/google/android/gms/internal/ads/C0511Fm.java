package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511Fm {

    /* renamed from: a, reason: collision with root package name */
    public final C0427An f8181a;

    /* renamed from: b, reason: collision with root package name */
    public final C1547mn f8182b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC0477Dm f8183c = null;

    public C0511Fm(C0427An c0427An, C1547mn c1547mn) {
        this.f8181a = c0427An;
        this.f8182b = c1547mn;
    }

    public static final int b(Context context, int i, String str) throws NumberFormatException {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        return u2.f.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC0828Yg interfaceC0828YgA = this.f8181a.a(q2.d1.a(), null, null);
        interfaceC0828YgA.b0().setVisibility(4);
        interfaceC0828YgA.b0().setContentDescription("policy_validator");
        interfaceC0828YgA.g0("/sendMessageToSdk", new C1858sb(9, this));
        interfaceC0828YgA.g0("/hideValidatorOverlay", new C0460Cm(this, windowManager, frameLayout));
        interfaceC0828YgA.g0("/open", new C0568Jb(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(interfaceC0828YgA);
        C0460Cm c0460Cm = new C0460Cm(this, frameLayout, windowManager);
        C1547mn c1547mn = this.f8182b;
        c1547mn.b("/loadNativeAdPolicyViolations", new C0799Wl(c1547mn, weakReference, "/loadNativeAdPolicyViolations", c0460Cm));
        c1547mn.b("/showValidatorOverlay", new C0799Wl(c1547mn, new WeakReference(interfaceC0828YgA), "/showValidatorOverlay", C2128xb.f17599g));
        return interfaceC0828YgA.b0();
    }
}
