package com.yandex.mobile.ads.impl;

import L0.I;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class cd0 {

    /* renamed from: a, reason: collision with root package name */
    private final ns f25600a;

    public cd0(ns nsVar) {
        this.f25600a = nsVar;
    }

    public final void a(Window window, RelativeLayout rootView) {
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(rootView, "rootView");
        L0.U.a(window, false);
        if (ba.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        } else if (ba.a(28)) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (!ba.a(28) || this.f25600a == ns.i) {
            return;
        }
        a(rootView);
    }

    private static void a(RelativeLayout relativeLayout) {
        I0 i02 = new I0(2);
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        I.d.u(relativeLayout, i02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0.X a(View v10, L0.X windowInsets) {
        kotlin.jvm.internal.l.f(v10, "v");
        kotlin.jvm.internal.l.f(windowInsets, "windowInsets");
        C0.e eVarF = windowInsets.f3850a.f(135);
        kotlin.jvm.internal.l.e(eVarF, "getInsets(...)");
        v10.setPadding(eVarF.f801a, eVarF.f802b, eVarF.f803c, eVarF.f804d);
        return L0.X.f3849b;
    }
}
