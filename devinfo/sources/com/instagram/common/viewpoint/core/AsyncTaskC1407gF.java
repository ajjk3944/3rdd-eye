package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.gF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class AsyncTaskC1407gF extends AsyncTask<String, Void, C1408gG> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public T8 A00;
    public InterfaceC1386fu A01;
    public InterfaceC1406gE A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1408gG A00(String... strArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i4 = 1;
                while (true) {
                    int i10 = i4 + 1;
                    if (i4 > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C1408gG(this.A01);
                    }
                    i4 = i10;
                }
            }
            return null;
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC1407gF.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC1407gF(T8 t82) {
        this(t82, null, null);
    }

    public AsyncTaskC1407gF(T8 t82, Map<String, String> extraData) {
        this(t82, extraData, null);
    }

    public AsyncTaskC1407gF(T8 t82, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = t82;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC0947Xd.A01(this.A00.A04().A6w()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 49);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 127);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(C1408gG response) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AHC(response);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC1386fu interfaceC1386fuAGw;
        InterfaceC1387fv interfaceC1387fvA00 = C1405gD.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC1386fuAGw = interfaceC1387fvA00.AGw(str, new C1401g9());
            } else {
                C1401g9 params = new C1401g9();
                params.A05(this.A04);
                interfaceC1386fuAGw = interfaceC1387fvA00.AGx(str, params.A08());
            }
            this.A01 = interfaceC1386fuAGw;
        } catch (Exception e2) {
            Log.e(A07, A01(4, 19, 26) + str, e2);
        }
        return this.A01 != null && this.A01.A9C() == 200;
    }

    public final void A07(InterfaceC1406gE interfaceC1406gE) {
        this.A02 = interfaceC1406gE;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C1408gG doInBackground(String[] strArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AHA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C1408gG c1408gG) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A05(c1408gG);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
