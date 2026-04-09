package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: com.yandex.mobile.ads.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4188r1 implements InterfaceC4105f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f32400a;

    /* renamed from: b, reason: collision with root package name */
    private final f8 f32401b;

    public C4188r1(Activity activity, f8 f8Var) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f32400a = activity;
        this.f32401b = f8Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4105f1
    public final void a() {
        this.f32400a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4105f1
    public final void a(int i, Bundle bundle) {
        f8 f8Var = this.f32401b;
        if (f8Var != null) {
            f8Var.a(i, bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4105f1
    public final void a(int i) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f32400a.setRequestedOrientation(i);
            }
        } catch (Exception unused) {
            fp0.a(new Object[0]);
        }
    }
}
