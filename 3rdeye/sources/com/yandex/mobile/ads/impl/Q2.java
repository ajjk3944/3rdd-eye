package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n00;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Q2 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24236b;

    public /* synthetic */ Q2(int i) {
        this.f24236b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24236b) {
            case 0:
                return n00.h.a((List<n00.h>) obj, (List<n00.h>) obj2);
            case 1:
                return n00.h.a((n00.h) obj, (n00.h) obj2);
            default:
                return n00.b((Integer) obj, (Integer) obj2);
        }
    }
}
