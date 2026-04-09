package com.vungle.ads;

import com.vungle.ads.AbstractC4062u;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.vungle.ads.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4061t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4062u f23842c;

    public /* synthetic */ RunnableC4061t(AbstractC4062u abstractC4062u, int i) {
        this.f23841b = i;
        this.f23842c = abstractC4062u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23841b) {
            case 0:
                AbstractC4062u.a.m127onAdLeftApplication$lambda5(this.f23842c);
                break;
            default:
                AbstractC4062u.a.m126onAdImpression$lambda1(this.f23842c);
                break;
        }
    }
}
