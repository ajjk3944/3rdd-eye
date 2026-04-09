package com.applovin.impl;

import d0.AbstractC4254A;
import r.InterfaceC5503a;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class G0 implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18804a;

    public /* synthetic */ G0(int i) {
        this.f18804a = i;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f18804a) {
            case 0:
                return q2.d((v4) obj);
            case 1:
                return com.applovin.impl.sdk.ad.b.m((v4) obj);
            case 2:
                return com.applovin.impl.sdk.ad.b.k((v4) obj);
            case 3:
                try {
                    return f0.c.k(d0.D.k((AbstractC4254A) obj), null);
                } catch (d0.y e4) {
                    C.S.h("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e4);
                    return null;
                }
            default:
                int i = C5670z.h.f46992h;
                return Boolean.FALSE;
        }
    }
}
