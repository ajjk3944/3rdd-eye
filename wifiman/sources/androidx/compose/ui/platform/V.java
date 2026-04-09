package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class V implements w1 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f29318a;

    public V(ViewConfiguration viewConfiguration) {
        this.f29318a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.w1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.w1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.w1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.w1
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? Y.f29319a.b(this.f29318a) : super.d();
    }

    @Override // androidx.compose.ui.platform.w1
    public float f() {
        return this.f29318a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.w1
    public float g() {
        return this.f29318a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.w1
    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? Y.f29319a.a(this.f29318a) : super.h();
    }
}
