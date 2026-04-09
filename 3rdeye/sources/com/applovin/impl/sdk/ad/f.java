package com.applovin.impl.sdk.ad;

import com.applovin.impl.v4;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21078b;

    public /* synthetic */ f(b bVar, int i) {
        this.f21077a = i;
        this.f21078b = bVar;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f21077a) {
            case 0:
                return this.f21078b.i((v4) obj);
            default:
                return this.f21078b.q((v4) obj);
        }
    }
}
