package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class io0 implements fg2 {

    /* renamed from: a, reason: collision with root package name */
    private final pm0 f28767a;

    public io0(pm0 instreamAdViewsHolderManager) {
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        this.f28767a = instreamAdViewsHolderManager;
    }

    @Override // com.yandex.mobile.ads.impl.fg2
    public final List<kb2> a() {
        List<kb2> listA;
        om0 om0VarA = this.f28767a.a();
        return (om0VarA == null || (listA = om0VarA.a()) == null) ? C2099t.f18581b : listA;
    }

    @Override // com.yandex.mobile.ads.impl.fg2
    public final View getView() {
        om0 om0VarA = this.f28767a.a();
        if (om0VarA != null) {
            return om0VarA.b();
        }
        return null;
    }
}
