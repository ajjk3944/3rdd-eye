package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610nw extends C0.q {

    /* renamed from: c, reason: collision with root package name */
    public final long f15846c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15847d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15848e;

    public C1610nw(int i, long j6) {
        super(i, 1);
        this.f15846c = j6;
        this.f15847d = new ArrayList();
        this.f15848e = new ArrayList();
    }

    public final C2257zw o(int i) {
        ArrayList arrayList = this.f15847d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2257zw c2257zw = (C2257zw) arrayList.get(i3);
            if (c2257zw.f1097b == i) {
                return c2257zw;
            }
        }
        return null;
    }

    public final C1610nw p(int i) {
        ArrayList arrayList = this.f15848e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1610nw c1610nw = (C1610nw) arrayList.get(i3);
            if (c1610nw.f1097b == i) {
                return c1610nw;
            }
        }
        return null;
    }

    @Override // C0.q
    public final String toString() {
        String strM = C0.q.m(this.f1097b);
        String string = Arrays.toString(this.f15847d.toArray());
        String string2 = Arrays.toString(this.f15848e.toArray());
        int length = strM.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        A.f.w(sb, strM, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
