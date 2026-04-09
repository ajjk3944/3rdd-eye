package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes3.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f40423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40424b;

    public Yh(C4927ri c4927ri, UserProfile userProfile) {
        this.f40424b = c4927ri;
        this.f40423a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40424b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportUserProfile(this.f40423a);
    }
}
