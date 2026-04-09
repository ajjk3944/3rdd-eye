package com.applovin.impl.sdk.ad;

import com.applovin.impl.v4;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21086b;

    public /* synthetic */ i(Object obj, int i) {
        this.f21085a = i;
        this.f21086b = obj;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f21085a) {
            case 0:
                return b.a((e) this.f21086b, (v4) obj);
            default:
                return ((b) this.f21086b).c((v4) obj);
        }
    }
}
