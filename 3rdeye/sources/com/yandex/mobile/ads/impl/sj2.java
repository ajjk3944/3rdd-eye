package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class sj2 implements b32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<oj2> f33092b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f33093c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f33094d;

    public sj2(ArrayList arrayList) {
        this.f33092b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f33093c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            oj2 oj2Var = (oj2) arrayList.get(i);
            int i10 = i * 2;
            long[] jArr = this.f33093c;
            jArr[i10] = oj2Var.f31397b;
            jArr[i10 + 1] = oj2Var.f31398c;
        }
        long[] jArr2 = this.f33093c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f33094d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f33094d;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f33092b.size(); i++) {
            long[] jArr = this.f33093c;
            int i10 = i * 2;
            if (jArr[i10] <= j4 && j4 < jArr[i10 + 1]) {
                oj2 oj2Var = this.f33092b.get(i);
                av avVar = oj2Var.f31396a;
                if (avVar.f24824f == -3.4028235E38f) {
                    arrayList2.add(oj2Var);
                } else {
                    arrayList.add(avVar);
                }
            }
        }
        Collections.sort(arrayList2, new P2(1));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((oj2) arrayList2.get(i11)).f31396a.a().a(1, (-1) - i11).a());
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return this.f33094d.length;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        int iA = s82.a(this.f33094d, j4, false);
        if (iA < this.f33094d.length) {
            return iA;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(oj2 oj2Var, oj2 oj2Var2) {
        return Long.compare(oj2Var.f31397b, oj2Var2.f31397b);
    }
}
