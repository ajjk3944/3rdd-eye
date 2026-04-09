package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.n00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class E0 implements sr, em.a, zd0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24096b;

    public /* synthetic */ E0(int i) {
        this.f24096b = i;
    }

    @Override // com.yandex.mobile.ads.impl.sr
    public void accept(Object obj) {
        switch (this.f24096b) {
            case 0:
                et1.a((et1.b) obj);
                break;
            default:
                ((c40.a) obj).c();
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zd0
    public Object apply(Object obj) {
        return new zy((dp) obj);
    }

    @Override // com.yandex.mobile.ads.impl.em.a
    public em fromBundle(Bundle bundle) {
        switch (this.f24096b) {
            case 1:
                return aw0.a(bundle);
            case 2:
                return dc0.a(bundle);
            case 3:
            case 4:
            default:
                return xv0.a(bundle);
            case 5:
                return n00.d.a(bundle);
        }
    }
}
