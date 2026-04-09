package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06887k extends AbstractC1949j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, Flags.CD, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C06887k(AnonymousClass76 anonymousClass76, O7 o72) {
        super(anonymousClass76, o72);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private C1952j3 A01(Runnable runnable) {
        return new C1952j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o82) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = o82.A03();
        if (jSONObjectA03.has(A03(22, 12, 71))) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String strA03 = A03(36, 38, 101);
                this.A02.A0F().A5g(C1286Vm.A01(AdErrorType.UNKNOWN_ERROR, strA03).A03().getErrorCode(), strA03);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC2010k8 interfaceC2010k8, JSONObject jSONObject, C1246Tx c1246Tx) {
        this.A0C = false;
        C1951j2 c1951j2 = new C1951j2(this, interfaceC2010k8, AbstractC1325Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c1951j2, c1246Tx.A05());
        interfaceC2010k8.AAt(this.A02, this.A09, this.A08.A08, A01(c1951j2), jSONObject, c1246Tx);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0R(N1 n12, C1245Tw c1245Tw, C1243Tu c1243Tu, final O8 o82) throws JSONException {
        this.A02.A0F().A4Y();
        final InterfaceC2010k8 interfaceC2010k8 = (InterfaceC2010k8) n12;
        if (interfaceC2010k8.AKL()) {
            final List<JSONObject> listA04 = A04(o82);
            A06(interfaceC2010k8, listA04.get(0), o82.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC2010k8, listA04, o82);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2010k8, o82.A03(), o82.A01());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0Y(boolean z10) {
        super.A0Y(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2010k8 interfaceC2010k8, List list, O8 o82) {
        A06(interfaceC2010k8, (JSONObject) list.get(1), o82.A01());
    }
}
