package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.q71;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Q1 implements nr0.a, nr0.b, q71.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24235c;

    public /* synthetic */ Q1(Object obj, int i) {
        this.f24234b = i;
        this.f24235c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.b
    public void a(Object obj, vb0 vb0Var) {
        ((m60) this.f24235c).a((bi1.b) obj, vb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        switch (this.f24234b) {
            case 0:
                m60.d((th1) this.f24235c, (bi1.b) obj);
                break;
            default:
                ((bi1.b) obj).a((d10) this.f24235c);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q71.a
    public boolean a(x61 x61Var) {
        switch (this.f24234b) {
            case 3:
                return e41.a((e41) this.f24235c, x61Var);
            default:
                return la.a((la) this.f24235c, x61Var);
        }
    }
}
