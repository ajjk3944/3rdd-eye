package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03549i extends C1955pc implements AnonymousClass24 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C1826nW, C1811nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C03549i A0J = new C1814nK().A0p();

    @Deprecated
    public static final C03549i A0I = A0J;
    public static final String A0W = C5C.A0h(1000);
    public static final String A0Q = C5C.A0h(1001);
    public static final String A0R = C5C.A0h(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    public static final String A0T = C5C.A0h(1003);
    public static final String A0M = C5C.A0h(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
    public static final String A0N = C5C.A0h(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
    public static final String A0K = C5C.A0h(1006);
    public static final String A0V = C5C.A0h(1007);
    public static final String A0b = C5C.A0h(1008);
    public static final String A0O = C5C.A0h(1009);
    public static final String A0Z = C5C.A0h(TTAdConstant.IMAGE_MODE_1010);
    public static final String A0a = C5C.A0h(TTAdConstant.IMAGE_MODE_1011);
    public static final String A0Y = C5C.A0h(TTAdConstant.IMAGE_MODE_1012);
    public static final String A0X = C5C.A0h(1013);
    public static final String A0P = C5C.A0h(1014);
    public static final String A0L = C5C.A0h(1015);
    public static final String A0S = C5C.A0h(1016);
    public static final String A0U = C5C.A0h(1017);
    public static final AnonymousClass23<C03549i> A0H = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return new C1814nK(bundle).A0p();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C1826nW, C1811nH>> sparseArray, SparseArray<Map<C1826nW, C1811nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
            if (iIndexOfKey < 0 || !A0O(sparseArray.valueAt(i4), sparseArray2.valueAt(iIndexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C1826nW, C1811nH> map, Map<C1826nW, C1811nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C1826nW, C1811nH> entry : map.entrySet()) {
            C1826nW key = entry.getKey();
            if (!map2.containsKey(key) || !C5C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C03549i(C1814nK c1814nK) {
        super(c1814nK);
        this.A0C = c1814nK.A0C;
        this.A06 = c1814nK.A06;
        this.A07 = c1814nK.A07;
        this.A05 = c1814nK.A05;
        this.A09 = c1814nK.A09;
        this.A02 = c1814nK.A02;
        this.A03 = c1814nK.A03;
        this.A00 = c1814nK.A00;
        this.A01 = c1814nK.A01;
        this.A08 = c1814nK.A08;
        this.A0B = c1814nK.A0B;
        this.A0D = c1814nK.A0D;
        this.A04 = c1814nK.A04;
        this.A0E = c1814nK.A0E;
        this.A0F = c1814nK.A0F;
        this.A0A = c1814nK.A0A;
    }

    public static C03549i A02(Context context) {
        return new C1814nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C1814nK A0P() {
        return new C1814nK(this);
    }

    @Deprecated
    public final C1811nH A0Q(int i4, C1826nW c1826nW) {
        Map<C1826nW, C1811nH> map = this.A0E.get(i4);
        if (map != null) {
            return map.get(c1826nW);
        }
        return null;
    }

    public final boolean A0R(int i4) {
        return this.A0F.get(i4);
    }

    @Deprecated
    public final boolean A0S(int i4, C1826nW c1826nW) {
        Map<C1826nW, C1811nH> map = this.A0E.get(i4);
        return map != null && map.containsKey(c1826nW);
    }

    @Override // com.instagram.common.viewpoint.core.C1955pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C03549i c03549i = (C03549i) obj;
                if (super.equals(c03549i) && this.A0C == c03549i.A0C && this.A06 == c03549i.A06 && this.A07 == c03549i.A07 && this.A05 == c03549i.A05 && this.A09 == c03549i.A09 && this.A02 == c03549i.A02 && this.A03 == c03549i.A03 && this.A00 == c03549i.A00 && this.A01 == c03549i.A01 && this.A08 == c03549i.A08 && this.A0B == c03549i.A0B && this.A0D == c03549i.A0D && this.A04 == c03549i.A04 && A0N(this.A0F, c03549i.A0F) && A0M(this.A0E, c03549i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C1955pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
