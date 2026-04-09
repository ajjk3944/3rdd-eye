package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class su0 extends mv0 {

    /* renamed from: c, reason: collision with root package name */
    public final long f16547c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16548d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16549e;

    public su0(int i4, long j) {
        super(i4, 0);
        this.f16547c = j;
        this.f16548d = new ArrayList();
        this.f16549e = new ArrayList();
    }

    public final dv0 i(int i4) {
        ArrayList arrayList = this.f16548d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            dv0 dv0Var = (dv0) arrayList.get(i10);
            if (dv0Var.f14029b == i4) {
                return dv0Var;
            }
        }
        return null;
    }

    public final su0 j(int i4) {
        ArrayList arrayList = this.f16549e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            su0 su0Var = (su0) arrayList.get(i10);
            if (su0Var.f14029b == i4) {
                return su0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final String toString() {
        String strG = mv0.g(this.f14029b);
        String string = Arrays.toString(this.f16548d.toArray());
        String string2 = Arrays.toString(this.f16549e.toArray());
        int length = strG.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        je.u.B(sb2, strG, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }
}
