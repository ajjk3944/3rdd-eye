package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class rn1 {

    /* renamed from: a, reason: collision with root package name */
    private final it1 f32722a;

    /* renamed from: b, reason: collision with root package name */
    private final C4148l2 f32723b;

    public rn1(it1 schedulePlaylistItemsProvider, C4148l2 adBreakStatusController) {
        kotlin.jvm.internal.l.f(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        this.f32722a = schedulePlaylistItemsProvider;
        this.f32723b = adBreakStatusController;
    }

    public final zs a(long j4) {
        Iterator it = this.f32722a.a().iterator();
        while (it.hasNext()) {
            yi1 yi1Var = (yi1) it.next();
            zs zsVarA = yi1Var.a();
            boolean z10 = Math.abs(yi1Var.b() - j4) < 200;
            EnumC4141k2 enumC4141k2A = this.f32723b.a(zsVarA);
            if (z10 && EnumC4141k2.f29472d == enumC4141k2A) {
                return zsVarA;
            }
        }
        return null;
    }
}
