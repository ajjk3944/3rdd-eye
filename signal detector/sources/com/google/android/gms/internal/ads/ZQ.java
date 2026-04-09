package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ZQ extends C0414Aa {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f12894A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f12895B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f12896C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f12897D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f12898E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f12899w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f12900x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f12901y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f12902z;

    public ZQ() {
        this.f12897D = new SparseArray();
        this.f12898E = new SparseBooleanArray();
        this.f12899w = true;
        this.f12900x = true;
        this.f12901y = true;
        this.f12902z = true;
        this.f12894A = true;
        this.f12895B = true;
        this.f12896C = true;
    }

    public ZQ(C0884aR c0884aR) {
        a(c0884aR);
        this.f12899w = c0884aR.f13131w;
        this.f12900x = c0884aR.f13132x;
        this.f12901y = c0884aR.f13133y;
        this.f12902z = c0884aR.f13134z;
        this.f12894A = c0884aR.f13126A;
        this.f12895B = c0884aR.f13127B;
        this.f12896C = c0884aR.f13128C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c0884aR.f13129D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f12897D = sparseArray;
                this.f12898E = c0884aR.f13130E.clone();
                return;
            }
        }
    }
}
