package j2;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f27238a;

    public n0(ViewConfiguration viewConfiguration) {
        this.f27238a = viewConfiguration;
    }

    @Override // j2.y1
    public final long a() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // j2.y1
    public final long b() {
        float f10 = 48;
        return com.google.android.gms.internal.play_billing.m1.a(f10, f10);
    }

    @Override // j2.y1
    public final float c() {
        return this.f27238a.getScaledMaximumFlingVelocity();
    }

    @Override // j2.y1
    public final float d() {
        return this.f27238a.getScaledTouchSlop();
    }
}
