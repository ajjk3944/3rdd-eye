package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements io.sentry.util.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12384a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5 f12385d;

    public /* synthetic */ j5(x5 x5Var, int i10) {
        this.f12384a = i10;
        this.f12385d = x5Var;
    }

    @Override // io.sentry.util.d
    public final Object e() {
        switch (this.f12384a) {
            case 0:
                return x5.a(this.f12385d);
            case 1:
                x5 x5Var = this.f12385d;
                x5Var.getClass();
                return new d2(x5Var);
            case 2:
                return x5.b(this.f12385d);
            default:
                return Boolean.valueOf(sm.f.K(this.f12385d, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ j5(sm.f fVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f12384a = 3;
        this.f12385d = sentryAndroidOptions;
    }
}
