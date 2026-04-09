package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ab0 {

    /* renamed from: a, reason: collision with root package name */
    public final wc0 f9293a;

    /* renamed from: b, reason: collision with root package name */
    public final hc0 f9294b;

    /* renamed from: c, reason: collision with root package name */
    public ya0 f9295c = null;

    public ab0(wc0 wc0Var, hc0 hc0Var) {
        this.f9293a = wc0Var;
        this.f9294b = hc0Var;
    }

    public static final int b(Context context, int i4, String str) throws NumberFormatException {
        try {
            i4 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        za.d dVar = va.r.g.f36157a;
        return za.d.b(i4, context);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        qz qzVarA = this.f9293a.a(va.c3.a(), null, null);
        qzVarA.N().setVisibility(4);
        qzVarA.N().setContentDescription("policy_validator");
        qzVarA.Z("/sendMessageToSdk", new co(9, this));
        qzVarA.Z("/hideValidatorOverlay", new xa0(this, windowManager, frameLayout));
        qzVarA.Z("/open", new uo(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(qzVarA);
        xa0 xa0Var = new xa0(this, frameLayout, windowManager);
        hc0 hc0Var = this.f9294b;
        hc0Var.b("/loadNativeAdPolicyViolations", new q90(hc0Var, weakReference, "/loadNativeAdPolicyViolations", xa0Var));
        hc0Var.b("/showValidatorOverlay", new q90(hc0Var, new WeakReference(qzVarA), "/showValidatorOverlay", io.g));
        return qzVarA.N();
    }
}
