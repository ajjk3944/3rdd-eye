package com.instagram.common.viewpoint.core;

import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.jmdns.impl.constants.DNSConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1598dC {
    public static byte[] A0K;
    public static String[] A0L = {"QJ7W4e4PJvclr77cDyA2o1qIxMihX3tE", "RH0qaB2vXSlWTV", "TMgHIdn8e0jRrsJAq9rOuGvMgMhVzLRj", "8zeB", "h3DHJTryp4843oQXq4V40YlaMfy8fMY9", "5EUDcWbBtTwBMpPZObVlQHA1Luk9oa", "lBOFkjXt9ejA3EivMitoOA5tI6ifJJ8U", "jkkICjKEbDq5EoZUmm0oqZxt7dyZ5DGY"};
    public static final AtomicInteger A0M;
    public static final AtomicInteger A0N;
    public InterfaceC1587d1 A02;
    public InterfaceC1596dA A03;
    public InterfaceC1597dB A04;
    public C1759fp A05;
    public final int A08;
    public final AbstractC1979jd A09;
    public final C1220Sx A0A;
    public final C1814gi A0B;
    public final VA A0C;
    public final VI A0D;
    public final C1585cz A0E;
    public final C0962It A0F;
    public final C1605dJ A0G;
    public final C1606dK A0H;
    public final LinkedList<C1595d9> A0J = new LinkedList<>();
    public Y2 A01 = new Y2();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-71, -79, -87, -83, -84, -87, -85, -67, -22, -32, -18, -21, -27, -32, -59, -22, -16, -31, -18, -30, -35, -33, -31, -12, -9, -27, -8, 3, 2, 5, 7, -4, 1, -6, -39, -4, 1, -4, 6, -5, -8, -9, -69, -70, -72, 6, -70, -68, -50, -37, -34, -52, -33, -22, -23, -20, -18, -29, -24, -31, -51, -18, -37, -20, -18, -33, -34, -94, -95, -97, -19, -95, -93, -75, -103, -84, -84, -103, -101, -96, -99, -100, -113, -114, -122, -83, -91, -16, -17, 2, -15, -10, -13, -14, -44, 0, -17, -5, -13, -46, -17, 2, -17, 6, 24, 21, 21, 8, 17, 23, -6, -7, -15, 24, 16, 28, 40, 23, 35, 27, 41, -52, -53, -98, -64, -47, -58, -45, -58, -47, -42, -83, -66, -46, -48, -62, -63, -123, -124, -126, -48, -124, -122, -104, -29, -30, -75, -41, -24, -35, -22, -35, -24, -19, -58, -39, -25, -23, -31, -39, -40, -100, -101, -103, -25, -101, -99, -81, 20, 19, -24, 17, 20, 24, 10, -21, 26, 17, 17, 24, 8, 23, 10, 10, 19, -5, 14, 10, 28, -51, -52, -54, 24, -52, -50, -83, -84, -124, -77, -86, -86, -79, -95, -80, -93, -93, -84, -108, -89, -93, -75, 102, 101, 99, -79, 101, 103, -82, -83, -107, -96, -85, -76, -92, -111, -92, -96, -93, 103, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 104, 122, 28, 27, 3, 14, 25, 34, 18, 4, 31, 22, 33, 33, 18, 27, -43, -44, -46, 32, -44, -39, -51, -44, -46, 32, -44, -42, -24, -71, -85, -87, -75, -76, -86, -91, -87, -82, -89, -76, -76, -85, -78, -81, -95, -80, 125, -79, -80, -92, -121, -95, -75, 100, 99, 97, -81, 99, 104, 99, 97, -81, 99, 101, 119, -9, -23, -8, -58, -27, -9, -23, -70, -72, -59, -9, -9, -23, -8, -9, -84, -85, -87, -9, -85, -80, -85, -87, -9, -85, -83, -31, -45, -30, -80, -49, -31, -45, -92, -94, -79, -35, -36, -44, -41, -43, -106, -107, -109, -31, -107, -102, -107, -109, -31, -107, -105, -77, -82, -77, -96, -85, -106, -107, -115, -76, -84, -58, -61, -67, -34, -47, -52, -51, -41, -83, -34, -51, -42, -36, -112, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -111, -93, -78, -91, -95, -77, -114, -95, -99, -96, -75, -112, -85, -113, -92, -85, -77, 100, 99, 97, -81, 99, 101, 119};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0i(Map<String, String> map) throws JSONException {
        String strA0A = A0A(87, 16, 86);
        if (map.containsKey(strA0A) && C1264Up.A20(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(strA0A));
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i10));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        C1919iT c1919iT = new C1919iT(this.A09.A2E(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        c1919iT.A06(Long.parseLong(string4));
                        arrayList.add(c1919iT);
                    }
                }
                String strA01 = C1918iS.A01(arrayList);
                HashMap map2 = new HashMap();
                map2.put(A0A(115, 6, 126), strA01);
                if (strA01 != null) {
                    this.A0C.ABy(this.A09.A2E(), map2);
                }
            } catch (Exception e10) {
                this.A0B.A08().ABC(A0A(274, 14, 14), DNSConstants.DNS_TTL, new C1227Te(e10));
            }
        }
        boolean zContainsKey = map.containsKey(strA0A);
        if (A0L[0].charAt(7) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[4] = "rUTki8v1ZwD35w0l1wx8OInXS6BY1neH";
        strArr[7] = "OANcXSK4xu3EG1xYwZDVITEIbLyQGtEs";
        if (zContainsKey) {
            map.remove(strA0A);
        }
        this.A0C.ABB(this.A09.A2E(), new C1471b9(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0N = new AtomicInteger();
        A0M = new AtomicInteger();
    }

    public C1598dC(C1814gi c1814gi, AbstractC1979jd abstractC1979jd, VA va, int i10) {
        this.A0B = c1814gi;
        this.A0C = va;
        this.A09 = abstractC1979jd;
        this.A08 = i10;
        this.A0F = new C0962It(this, c1814gi);
        this.A0A = new C1220Sx(this.A0B);
        this.A0D = new VI(abstractC1979jd.A2E(), va);
        this.A0E = new C1585cz(abstractC1979jd.A1D(), abstractC1979jd.A29().A0H().A09(), i10);
        this.A0H = AbstractC1607dL.A00(this.A0B, abstractC1979jd.A1H(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new C1605dJ(this.A0B, this, va, this.A0E, this.A0I, abstractC1979jd.A2E());
    }

    public static AtomicInteger A0B() {
        return A0M;
    }

    private void A0C() {
        A0F(new C1595d9(A0A(288, 22, 4), new String[]{this.A0I, A0A(1, 6, 67)}));
        String strReplace = Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1595d9(A0A(Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 26, 76), new String[]{strReplace, assets}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                C1595d9 c1595d9Poll = this.A0J.poll();
                if (c1595d9Poll != null) {
                    this.A0F.A0I(String.format(Locale.US, c1595d9Poll.A00, c1595d9Poll.A02));
                    if (c1595d9Poll.A01) {
                        this.A0D.A04(VH.A0L, null);
                        this.A0B.A0F().A65(c1595d9Poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(C1595d9 c1595d9) {
        this.A0J.offer(c1595d9);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return C1264Up.A30(this.A0B, C1741fX.A03());
    }

    public final VI A0K() {
        return this.A0D;
    }

    public final Y2 A0L() {
        return this.A01;
    }

    public final C1585cz A0M() {
        return this.A0E;
    }

    public final InterfaceC1587d1 A0N() {
        return this.A02;
    }

    public final C0962It A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new C1595d9(A0A(23, 26, 91), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new C1595d9(A0A(49, 25, 66), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new C1595d9(A0A(121, 23, 37), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new C1595d9(A0A(168, 27, 109), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new C1595d9(A0A(195, 22, 6), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new C1595d9(A0A(TTAdConstant.DEEPLINK_FALLBACK_CODE, 22, 4), new String[]{this.A0I}));
    }

    public final void A0X() throws JSONException {
        this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 68));
        this.A0D.A04(VH.A0O, null);
        String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 25);
            jSONObject.put(url, str);
            String url2 = A0A(103, 12, 107);
            jSONObject.put(url2, AbstractC1599dD.A00());
            String url3 = A0A(362, 10, 7);
            jSONObject.put(url3, A0N.getAndIncrement());
            String url4 = A0A(74, 13, 0);
            jSONObject.put(url4, A0M);
        } catch (JSONException unused) {
        }
        this.A0B.A0F().A6B(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new C1595d9(A0A(144, 24, 60), new String[]{this.A0I}));
    }

    public final void A0Z(Y2 y22) {
        this.A01 = y22;
    }

    public final void A0a(InterfaceC1587d1 interfaceC1587d1) {
        this.A02 = interfaceC1587d1;
    }

    public final void A0b(InterfaceC1596dA interfaceC1596dA) {
        this.A03 = interfaceC1596dA;
    }

    public final void A0c(InterfaceC1597dB interfaceC1597dB) {
        this.A04 = interfaceC1597dB;
    }

    public final void A0d(InterfaceC0961Is interfaceC0961Is) {
        this.A0G.A0N(interfaceC0961Is);
    }

    public final void A0e(C1759fp c1759fp) {
        this.A05 = c1759fp;
    }

    public final void A0f(String str) {
        A0F(new C1595d9(A0A(247, 27, 117), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new C1595d9(A0A(Sdk$SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 30, 7), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new C1595d9(A0A(375, 29, 48), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        String strReplace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        String assets = this.A0I;
        A0F(new C1595d9(A0A(336, 26, 54), new String[]{strReplace, assets}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
