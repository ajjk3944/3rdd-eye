package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qn {

    /* renamed from: a, reason: collision with root package name */
    public final int f15377a;

    /* renamed from: b, reason: collision with root package name */
    public final ii f15378b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15379c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15380d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f15381e;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public qn(ii iiVar, boolean z3, int[] iArr, boolean[] zArr) {
        int i4 = iiVar.f12337a;
        this.f15377a = i4;
        mq0.m(i4 == iArr.length && i4 == zArr.length);
        this.f15378b = iiVar;
        this.f15379c = z3 && i4 > 1;
        this.f15380d = (int[]) iArr.clone();
        this.f15381e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qn.class == obj.getClass()) {
            qn qnVar = (qn) obj;
            if (this.f15379c == qnVar.f15379c && this.f15378b.equals(qnVar.f15378b) && Arrays.equals(this.f15380d, qnVar.f15380d) && Arrays.equals(this.f15381e, qnVar.f15381e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15381e) + ((Arrays.hashCode(this.f15380d) + (((this.f15378b.hashCode() * 31) + (this.f15379c ? 1 : 0)) * 31)) * 31);
    }
}
