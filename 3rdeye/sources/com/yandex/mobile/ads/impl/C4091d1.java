package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ew1;

/* renamed from: com.yandex.mobile.ads.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4091d1 implements InterfaceC4133j1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4133j1
    public final InterfaceC4126i1 a(Activity activity, RelativeLayout rootLayout, C4188r1 listener, C4070a1 eventController, Intent intent, Window window, C4236y0 c4236y0) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(intent, "intent");
        kotlin.jvm.internal.l.f(window, "window");
        if (c4236y0 == null) {
            return null;
        }
        a8<?> a8VarC = c4236y0.c();
        C4072a3 c4072a3B = c4236y0.b();
        h61 h61VarE = c4236y0.e();
        av1 av1VarG = c4236y0.g();
        a8<?> a8Var = a8VarC != null ? a8VarC : null;
        String str = a8Var != null ? (String) a8Var.I() : null;
        ew1 ew1VarA = ew1.a.a();
        Context context = window.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        du1 du1VarA = ew1VarA.a(context);
        if (av1VarG != null && str != null && str.length() != 0) {
            zc0 zc0Var = new zc0(a8VarC, str, av1VarG);
            return new C4084c1(activity, rootLayout, listener, window, zc0Var, du1VarA, new ff1(activity, zc0Var.a(), listener), new qc0(activity), new cd0(zc0Var.a().n()));
        }
        if (h61VarE != null) {
            return new C4112g1(activity, rootLayout, window, h61VarE, a8VarC, listener, eventController, c4072a3B, c4236y0.f(), du1VarA, new qc0(activity), new cd0(c4072a3B.b()));
        }
        return null;
    }
}
