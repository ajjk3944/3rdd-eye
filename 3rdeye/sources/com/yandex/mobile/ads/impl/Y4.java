package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.nr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y4 implements nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24332d;

    public /* synthetic */ Y4(int i, int i10, Object obj) {
        this.f24330b = i10;
        this.f24331c = obj;
        this.f24332d = i;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public final void invoke(Object obj) {
        switch (this.f24330b) {
            case 0:
                int i = this.f24332d;
                ((ed) obj).getClass();
                break;
            case 1:
                int i10 = this.f24332d;
                ((ed) obj).getClass();
                break;
            default:
                m60.a((th1) this.f24331c, this.f24332d, (bi1.b) obj);
                break;
        }
    }
}
