package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Cr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class AsyncTaskC0806Cr extends AsyncTask<AbstractC1777g7, Void, InterfaceC1764fu> implements InterfaceC1774g4 {
    public static byte[] A04;
    public static String[] A05 = {"QrFR9YxtZmjHUVEKV6oKE4DdGtsrpc8H", "TwcoDq13NGDzrd27uf1NctQWIs88CxA5", "DEQUIzHs8EHMaJWbR5cSGVZv3Gss2W35", "Ai8rFQMQjE1asV4GIWZxLQq3VKhMcnMa", "Q3dsJQvnRhhndIZBGw2JIf13CD9aK", "FSoxIZL2zci1XZCD3aOfhtBMx8TI21HW", "XwCxwzkF49MOW0uOTgxgRHHne1dL58CR", "45IZuxFnerodSJSRUIhMDhHmCeiAV"};
    public InterfaceC1766fw A00;
    public C0801Cl A01;
    public Exception A02;
    public Executor A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final InterfaceC1764fu A00(AbstractC1777g7... abstractC1777g7Arr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        String[] strArr = A05;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        A05[6] = "rZqzIjYv4aJ5FL2pEqspRVXwv6AN0NL2";
        try {
            if (abstractC1777g7Arr != null) {
                try {
                    if (abstractC1777g7Arr.length > 0) {
                        InterfaceC1764fu interfaceC1764fuA0J = this.A01.A0J(abstractC1777g7Arr[0]);
                        if (this.A01.A0K().A04() && interfaceC1764fuA0J != null) {
                            String.format(Locale.US, A01(108, 21, 5), Integer.valueOf(interfaceC1764fuA0J.A9C()), interfaceC1764fuA0J.getUrl(), interfaceC1764fuA0J.A73());
                        }
                        if (interfaceC1764fuA0J != null) {
                            return interfaceC1764fuA0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 59));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 95), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 49));
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A05[0].charAt(24) != 'G') {
                throw new RuntimeException();
            }
            A05[0] = "mnFvayeDWU8YlLMMxELrFm0bGTjKFJH1";
            bArrCopyOfRange[i13] = (byte) (i14 - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-119, -76, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -103, -90, -72, -80, 101, -71, -90, -80, -86, -72, 101, -86, -67, -90, -88, -71, -79, -66, 101, -76, -77, -86, 101, -90, -73, -84, -70, -78, -86, -77, -71, 101, -76, -85, 101, -71, -66, -75, -86, 101, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -69, -57, -57, -61, -109, -27, -40, -28, -24, -40, -26, -25, -109, -39, -44, -36, -33, -40, -41, -83, -109, -104, -26, -105, -61, -61, -65, 111, -63, -76, -62, -65, -66, -67, -62, -76, 111, -72, -62, 111, -67, -60, -69, -69, 107, 126, -116, -119, -120, -121, -116, 126, 83, 57, 62, 125, 57, 65, 62, -116, 66, 83, 35, 62, -116};
    }

    static {
        A02();
    }

    public AsyncTaskC0806Cr(C0801Cl c0801Cl, InterfaceC1766fw interfaceC1766fw, Executor executor) {
        this.A01 = c0801Cl;
        this.A00 = interfaceC1766fw;
        this.A03 = executor;
    }

    private final void A03(InterfaceC1764fu result) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.ADR(result);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    public final void A04(AbstractC1777g7 abstractC1777g7) {
        super.executeOnExecutor(this.A03, abstractC1777g7);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC1764fu doInBackground(AbstractC1777g7[] abstractC1777g7Arr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC1777g7Arr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ADq(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC1764fu interfaceC1764fu) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A03(interfaceC1764fu);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
