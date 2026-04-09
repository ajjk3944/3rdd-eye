package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes3.dex */
public final class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f39998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39999b;

    public Q0(C4859p1 c4859p1, UserProfile userProfile) {
        this.f39999b = c4859p1;
        this.f39998a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f39999b).reportUserProfile(this.f39998a);
    }
}
