package com.yandex.mobile.ads.impl;

import L0.InterfaceC0788t;
import android.os.Bundle;
import android.view.View;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class I0 implements gv0.f, em.a, InterfaceC0788t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24138b;

    public /* synthetic */ I0(int i) {
        this.f24138b = i;
    }

    @Override // com.yandex.mobile.ads.impl.gv0.f
    public int a(Object obj) {
        return gv0.a((yu0) obj);
    }

    @Override // L0.InterfaceC0788t
    public L0.X d(View view, L0.X x10) {
        return cd0.a(view, x10);
    }

    @Override // com.yandex.mobile.ads.impl.em.a
    public em fromBundle(Bundle bundle) {
        switch (this.f24138b) {
            case 1:
                return b22.b(bundle);
            case 2:
            default:
                return C4246z4.a(bundle);
            case 3:
                return v42.b.a(bundle);
            case 4:
                return xv0.b.a(bundle);
        }
    }
}
