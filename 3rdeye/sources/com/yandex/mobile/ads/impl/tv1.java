package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
final class tv1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vw0 f33780b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CustomizableMediaView f33781c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ sw0 f33782d;

    public tv1(vw0 vw0Var, CustomizableMediaView customizableMediaView, sw0 sw0Var) {
        this.f33780b = vw0Var;
        this.f33781c = customizableMediaView;
        this.f33782d = sw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33780b.b(this.f33781c, this.f33782d);
    }
}
