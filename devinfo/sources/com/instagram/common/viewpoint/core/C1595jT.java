package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.jT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1595jT extends NQ implements Serializable {
    public static byte[] A0E = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A08;
    public boolean A09;
    public final List<AbstractC1601jd> A0D;
    public final ArrayList<Integer> A0C = new ArrayList<>();
    public boolean A0A = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public String A05 = A02(280, 2, 22);
    public final String A0B = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{93, 88, 79, 117, 126, 119, 127, 120, 73, 102, 119, 100, 119, 123, 101, 17, 26, 19, 27, 28, 23, 22, 45, 19, 22, 1, 45, 17, 29, 7, 28, 6, 54, 61, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, 127, 100, 84, 104, 103, 100, 120, 110, 84, 127, 98, 102, 110, 118, 113, 123, 122, 103, 64, 107, 112, 64, 109, 122, 111, 112, 109, 107, 64, 115, 112, 126, 123, 122, 123, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 86, 80, 67, 94, 108, 92, 93, 95, 74, 12, 27, 14, 17, 12, 10, 33, 24, 23, 12, 13, 10, 33, 23, 19, 14, 12, 27, 13, 13, 23, 17, 16, 33, 17, 16, 18, 7, 17, 10, 13, 21, 61, 17, 7, 1, 13, 12, 6, 61, 3, 6, 61, 13, 12, 61, 3, 6, 61, 16, 7, 18, 13, 16, 22, 11, 12, 5, 14, 21, 18, 10, 34, 14, 24, 30, 18, 19, 25, 34, 28, 25, 34, 18, 19, 34, 11, 20, 25, 24, 18, 34, 13, 17, 28, 4, 31, 28, 30, 22, 34, 24, 15, 15, 18, 15, 3, 0, 28, 25, 4, 47, 22, 31, 2, 19, 21, 47, 6, 25, 21, 7, 72, 78};
    }

    public C1595jT(List<AbstractC1601jd> list) {
        this.A0D = list;
    }

    public static C1595jT A00(JSONObject jSONObject, C1436gi c1436gi) throws JSONException {
        return A01(jSONObject, c1436gi, false);
    }

    public static C1595jT A01(JSONObject jSONObject, C1436gi c1436gi, boolean z3) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            if (z3) {
                arrayList.add(C03137n.A00(jSONArray.getJSONObject(i4), c1436gi));
            } else {
                arrayList.add(C03117l.A00(jSONArray.getJSONObject(i4), c1436gi));
            }
        }
        C1595jT c1595jT = new C1595jT(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c1595jT.A05 = chainingParams.toString();
        c1595jT.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c1595jT.A04 = chainingParams.optInt(A02(32, 24, AppLovinMediationAdapter.ERROR_CHILD_USER), 0);
        c1595jT.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c1595jT.A03 = chainingParams.optInt(A02(124, 22, 58), 0);
        c1595jT.A09 = chainingParams.optBoolean(A02(226, 38, 88), true);
        c1595jT.A08 = chainingParams.optBoolean(A02(196, 30, 71), true);
        c1595jT.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c1595jT.A1P(chainingParams);
        c1595jT.A0A = chainingParams.optBoolean(A02(264, 16, 85), false);
        c1595jT.A07 = chainingParams.optBoolean(A02(168, 28, 91), false);
        c1595jT.A06 = chainingParams.optBoolean(A02(146, 22, 22), false);
        JSONArray jSONArrayOptJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                c1595jT.A0C.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10, 0)));
            }
        }
        return c1595jT;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0o() {
        return 2;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0p() {
        return this.A04 + this.A02;
    }

    public final int A22() {
        return this.A00;
    }

    public final int A23() {
        return this.A01;
    }

    public final int A24() {
        return this.A02;
    }

    public final int A25() {
        return this.A03;
    }

    public final AbstractC1601jd A26() {
        if (!this.A0D.isEmpty()) {
            return this.A0D.get(0);
        }
        return null;
    }

    public final AbstractC1601jd A27(int i4) {
        return this.A0D.get(i4);
    }

    public final String A28() {
        return this.A0B;
    }

    public final String A29() {
        return this.A05;
    }

    public final String A2A() {
        AbstractC1601jd firstAdDataBundle = A26();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A2E();
        }
        return null;
    }

    public final ArrayList<Integer> A2B() {
        return this.A0C;
    }

    public final void A2C(int i4) {
        this.A0D.remove(i4);
        this.A01--;
    }

    public final boolean A2D() {
        return this.A00 == 0;
    }

    public final boolean A2E() {
        return this.A06;
    }

    public final boolean A2F() {
        return this.A07;
    }

    public final boolean A2G() {
        return this.A08;
    }

    public final boolean A2H() {
        return this.A09;
    }

    public final boolean A2I() {
        return this.A0A;
    }

    public final boolean A2J(int i4) {
        return i4 >= 0 && i4 < this.A0D.size();
    }
}
