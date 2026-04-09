package com.yandex.mobile.ads.impl;

import android.view.Display;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.ge2;
import com.yandex.mobile.ads.impl.j21;
import com.yandex.mobile.ads.impl.m60;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.rq1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class R1 implements nr0.a, v80, ge2.b.a, rq1.b, zd0, q71.a, ig1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24245c;

    public /* synthetic */ R1(Object obj, int i) {
        this.f24244b = i;
        this.f24245c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.ig1
    public void a() {
        wc2.b((wc2) this.f24245c);
    }

    @Override // com.yandex.mobile.ads.impl.zd0
    public Object apply(Object obj) {
        return ((jc0) this.f24245c).a((i52) obj);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        switch (this.f24244b) {
            case 0:
                ((m60) this.f24245c).d((bi1.b) obj);
                break;
            default:
                ((m60.b) this.f24245c).a((bi1.b) obj);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.v80
    public void a(int i) {
        b90.a((b90) this.f24245c, i);
    }

    @Override // com.yandex.mobile.ads.impl.ge2.b.a
    public void a(Display display) {
        ((ge2) this.f24245c).a(display);
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public void a(Object obj) {
        j21.a((j21.a) this.f24245c, (String) obj);
    }

    @Override // com.yandex.mobile.ads.impl.q71.a
    public boolean a(x61 x61Var) {
        return la.e((la) this.f24245c, x61Var);
    }
}
