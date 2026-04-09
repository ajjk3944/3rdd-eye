package com.vungle.ads;

import com.vungle.ads.AbstractC4062u;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.vungle.ads.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4060s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4062u f23840c;

    public /* synthetic */ RunnableC4060s(AbstractC4062u abstractC4062u, int i) {
        this.f23839b = i;
        this.f23840c = abstractC4062u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23839b) {
            case 0:
                AbstractC4062u.a.m129onAdStart$lambda0(this.f23840c);
                break;
            default:
                AbstractC4062u.a.m128onAdRewarded$lambda4(this.f23840c);
                break;
        }
    }
}
