package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.am1;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.xl1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class U1 implements o60.e, nr0.a, sr, xl1.a, q71.a, jx0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24273c;

    public /* synthetic */ U1(Object obj, int i) {
        this.f24272b = i;
        this.f24273c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.xl1.a
    public xl1 a(gi1 gi1Var) {
        return am1.a.a((y70) this.f24273c, gi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.sr
    public void accept(Object obj) {
        ((c40.a) obj).a((Exception) this.f24273c);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        switch (this.f24272b) {
            case 1:
                ((bi1.b) obj).a((cv) this.f24273c);
                break;
            default:
                ((ed) obj).getClass();
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jx0.a
    public void a(g51 g51Var) {
        j71.a((j71) this.f24273c, g51Var);
    }

    @Override // com.yandex.mobile.ads.impl.o60.e
    public void a(o60.d dVar) {
        ((m60) this.f24273c).b(dVar);
    }

    @Override // com.yandex.mobile.ads.impl.q71.a
    public boolean a(x61 x61Var) {
        switch (this.f24272b) {
            case 4:
                return e41.d((e41) this.f24273c, x61Var);
            default:
                return la.c((la) this.f24273c, x61Var);
        }
    }
}
