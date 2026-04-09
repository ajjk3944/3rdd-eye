package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pj2;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class F3 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24108b;

    public /* synthetic */ F3(int i) {
        this.f24108b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24108b) {
            case 0:
                return pj2.a.a((pj2.a) obj, (pj2.a) obj2);
            case 1:
                return n00.a((Integer) obj, (Integer) obj2);
            default:
                return ok.a((dc0) obj, (dc0) obj2);
        }
    }
}
