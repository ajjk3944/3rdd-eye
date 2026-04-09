package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.View;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.sz;
import com.yandex.mobile.ads.impl.xo;
import java.lang.reflect.Constructor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class L2 implements sr, em.a, nr0.a, sz.a.InterfaceC0419a, xo, ym {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24180b;

    public /* synthetic */ L2(int i) {
        this.f24180b = i;
    }

    @Override // com.yandex.mobile.ads.impl.xo
    public View.OnClickListener a(ag agVar, ir0 ir0Var, InterfaceC4217v2 interfaceC4217v2, x61 x61Var, qo1 qo1Var, bc0 bc0Var) {
        return xo.a.a(agVar, ir0Var, interfaceC4217v2, x61Var, qo1Var, bc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.sr
    public void accept(Object obj) {
        ((c40.a) obj).a(3);
    }

    @Override // com.yandex.mobile.ads.impl.em.a
    public em fromBundle(Bundle bundle) {
        switch (this.f24180b) {
            case 1:
                return av.a(bundle);
            case 2:
                return l52.a(bundle);
            case 3:
                return m42.b(bundle);
            case 4:
            default:
                return q52.a(bundle);
            case 5:
                return mg1.b(bundle);
            case 6:
                return o62.a.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        ((bi1.b) obj).onRenderedFirstFrame();
    }

    @Override // com.yandex.mobile.ads.impl.ym
    public String a(sv svVar) {
        return M4.a(svVar);
    }

    @Override // com.yandex.mobile.ads.impl.sz.a.InterfaceC0419a
    public Constructor a() {
        return sz.c();
    }
}
