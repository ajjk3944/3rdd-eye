package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.cq1;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.j21;
import com.yandex.mobile.ads.impl.mq1;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.ny;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.rq1;
import com.yandex.mobile.ads.impl.vn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class K0 implements gv0.f, nr0.a, ny.a, cq1.b, q71.a, rq1.a, mq1.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24165c;

    public /* synthetic */ K0(Object obj, int i) {
        this.f24164b = i;
        this.f24165c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.gv0.f
    public int a(Object obj) {
        return gv0.a((dc0) this.f24165c, (yu0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        switch (this.f24164b) {
            case 1:
                ((bi1.b) obj).a((aw0) this.f24165c);
                break;
            default:
                ((bi1.b) obj).a((yz0) this.f24165c);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public void a(fi2 fi2Var) {
        j21.a((j21.a) this.f24165c, fi2Var);
    }

    @Override // com.yandex.mobile.ads.impl.mq1.b
    public void a(mq1 mq1Var, int i) {
        ((t30) this.f24165c).a(mq1Var, i);
    }

    @Override // com.yandex.mobile.ads.impl.ny.a
    public void a(ny nyVar) {
        ((vn) this.f24165c).a((vn.b) nyVar);
    }

    @Override // com.yandex.mobile.ads.impl.cq1.b
    public boolean a(op1 op1Var) {
        return aq1.a(this.f24165c, op1Var);
    }

    @Override // com.yandex.mobile.ads.impl.q71.a
    public boolean a(x61 x61Var) {
        switch (this.f24164b) {
            case 5:
                return e41.b((e41) this.f24165c, x61Var);
            default:
                return la.b((la) this.f24165c, x61Var);
        }
    }
}
