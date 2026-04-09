package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wz1 extends fn {
    public static final wz1 F = new wz1(new vz1());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f18248w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f18249x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f18250y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f18251z;

    static {
        String str = bq0.f9768a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        Integer.toString(1003, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, 36);
        Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1010, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public wz1(vz1 vz1Var) {
        super(vz1Var);
        this.f18248w = vz1Var.f17798w;
        this.f18249x = vz1Var.f17799x;
        this.f18250y = vz1Var.f17800y;
        this.f18251z = vz1Var.f17801z;
        this.A = vz1Var.A;
        this.B = vz1Var.B;
        this.C = vz1Var.C;
        this.D = vz1Var.D;
        this.E = vz1Var.E;
    }

    @Override // com.google.android.gms.internal.ads.fn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wz1.class == obj.getClass()) {
            wz1 wz1Var = (wz1) obj;
            if (super.equals(wz1Var) && this.f18248w == wz1Var.f18248w && this.f18249x == wz1Var.f18249x && this.f18250y == wz1Var.f18250y && this.f18251z == wz1Var.f18251z && this.A == wz1Var.A && this.B == wz1Var.B && this.C == wz1Var.C) {
                SparseBooleanArray sparseBooleanArray = wz1Var.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            SparseArray sparseArray = wz1Var.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i10);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                oz1 oz1Var = (oz1) entry.getKey();
                                                if (!map2.containsKey(oz1Var) || !Objects.equals(entry.getValue(), map2.get(oz1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i4)) < 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fn
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f18248w ? 1 : 0)) * 961) + (this.f18249x ? 1 : 0)) * 961) + (this.f18250y ? 1 : 0)) * 28629151) + (this.f18251z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
