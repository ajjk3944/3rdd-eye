package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.C4246z4;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class J0 implements gv0.f, di0.a, em.a, ws, sr, zd0, hf0.a, nr0.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24150b;

    public /* synthetic */ J0(int i) {
        this.f24150b = i;
    }

    @Override // com.yandex.mobile.ads.impl.gv0.f
    public int a(Object obj) {
        return gv0.b((yu0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.sr
    public void accept(Object obj) {
        ((c40.a) obj).b();
    }

    @Override // com.yandex.mobile.ads.impl.zd0
    public Object apply(Object obj) {
        return r11.a((i52) obj);
    }

    @Override // com.yandex.mobile.ads.impl.em.a
    public em fromBundle(Bundle bundle) {
        switch (this.f24150b) {
            case 2:
                return en1.a(bundle);
            case 3:
            case 6:
            case 7:
            case 8:
            default:
                return C4246z4.a.a(bundle);
            case 4:
                return lq.a(bundle);
            case 5:
                return m52.a(bundle);
            case 9:
                return v42.d.a(bundle);
            case 10:
                return xv0.e.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public void onInitializationCompleted() {
        fw1.a();
    }

    @Override // com.yandex.mobile.ads.impl.hf0.a
    public Object a(String str) {
        return tc1.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.b
    public void a(Object obj, vb0 vb0Var) {
        zy.a((ed) obj, vb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.di0.a
    public boolean a(int i, int i10, int i11, int i12, int i13) {
        return di0.b(i, i10, i11, i12, i13);
    }
}
