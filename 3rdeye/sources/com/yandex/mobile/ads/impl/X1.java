package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.bn;
import com.yandex.mobile.ads.impl.dl;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.r50;
import com.yandex.mobile.ads.impl.vi0;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class X1 implements nr0.a, q71.a, dl.d, r50.b, bn.a, vi0.b, wg2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24312c;

    public /* synthetic */ X1(Object obj, int i) {
        this.f24311b = i;
        this.f24312c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.dl.d
    public long a(long j4) {
        return ((ub0) this.f24312c).a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        switch (this.f24311b) {
            case 0:
                ((bi1.b) obj).a((pf2) this.f24312c);
                break;
            default:
                ((bi1.b) obj).onCues((List) this.f24312c);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r50.b
    public r50 a(hn hnVar) {
        return t82.a((r50) ((r50.a) this.f24312c), hnVar);
    }

    @Override // com.yandex.mobile.ads.impl.wg2
    public vg2 a() {
        return yw.D((yw) this.f24312c);
    }

    @Override // com.yandex.mobile.ads.impl.bn.a
    public void a(long j4, long j10, long j11) {
        ((wl1) this.f24312c).a(j4, j10, j11);
    }

    @Override // com.yandex.mobile.ads.impl.vi0.b
    public void a(Bitmap bitmap) {
        xa0.a((xa0) this.f24312c, bitmap);
    }

    @Override // com.yandex.mobile.ads.impl.q71.a
    public boolean a(x61 x61Var) {
        switch (this.f24311b) {
            case 2:
                return e41.c((e41) this.f24312c, x61Var);
            default:
                return la.d((la) this.f24312c, x61Var);
        }
    }
}
