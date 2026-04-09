package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.un;
import com.yandex.mobile.ads.impl.vz1;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class P2 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24226b;

    public /* synthetic */ P2(int i) {
        this.f24226b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24226b) {
            case 0:
                return n00.f.a((List) obj, (List) obj2);
            case 1:
                return sj2.a((oj2) obj, (oj2) obj2);
            case 2:
                return un.a.a((un.a) obj, (un.a) obj2);
            case 3:
                return vz1.b((vz1.a) obj, (vz1.a) obj2);
            default:
                return br0.a((zm) obj, (zm) obj2);
        }
    }
}
