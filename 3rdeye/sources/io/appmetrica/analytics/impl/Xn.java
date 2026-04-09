package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Xn {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f40398c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f40399a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f40400b = 0;

    public Xn(int[] iArr) {
        for (int i : iArr) {
            this.f40399a.put(i, new HashMap());
        }
    }
}
