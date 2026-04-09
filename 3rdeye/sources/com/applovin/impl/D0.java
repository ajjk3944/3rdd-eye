package com.applovin.impl;

import java.util.List;
import r.InterfaceC5503a;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18795a;

    public /* synthetic */ D0(int i) {
        this.f18795a = i;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f18795a) {
            case 0:
                return q2.f((v4) obj);
            case 1:
                return q2.e((v4) obj);
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            default:
                int i = C5670z.g.f46985g;
                return Boolean.FALSE;
        }
    }
}
