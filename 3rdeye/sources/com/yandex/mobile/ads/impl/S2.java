package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.vz1;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class S2 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24254b;

    public /* synthetic */ S2(int i) {
        this.f24254b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24254b) {
            case 0:
                return n00.a.a((List<n00.a>) obj, (List<n00.a>) obj2);
            case 1:
                return t30.b.a((r30) obj, (r30) obj2);
            default:
                return vz1.a((vz1.a) obj, (vz1.a) obj2);
        }
    }
}
