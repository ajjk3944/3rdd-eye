package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033dC extends AbstractC1087eC implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C1033dC f13741b = new C1033dC(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1033dC f13742c = new C1033dC(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13743a;

    public /* synthetic */ C1033dC(int i) {
        this.f13743a = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f13743a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f13743a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
