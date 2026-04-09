package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class SK {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public C1090b6 A00;
    public final AudienceNetworkActivity A01;
    public final C1436gi A02;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, -128, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public SK(C1436gi c1436gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1436gi;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i4, int i10) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i4, i10);
        }
    }

    public final C1284eF A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            C1436gi c1436gi = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            C1284eF c1284eFA01 = AbstractC1283eE.A01(c1436gi, stringExtra);
            if (c1284eFA01 != null) {
                relativeLayout.addView(c1284eFA01, new RelativeLayout.LayoutParams(-1, -1));
            }
            return c1284eFA01;
        }
        return null;
    }

    public final void A04() {
        if (C0886Up.A2J(this.A01)) {
            A02(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
    }

    public final void A05() {
        if (this.A00 != null && C0886Up.A1C(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (C0886Up.A2R(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, WK wk2, RelativeLayout relativeLayout) {
        if (C0886Up.A1C(this.A01)) {
            WK wk3 = WK.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (wk2 != wk3) {
                this.A00 = new C1090b6();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                C1090b6 c1090b6 = this.A00;
                String placementId = this.A01.getPackageName();
                c1090b6.A0B(placementId);
                long longExtra = intent.getLongExtra(A00(29, 11, 45), 0L);
                if (longExtra != 0) {
                    C1090b6 c1090b62 = this.A00;
                    String[] strArr = A04;
                    if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "JayLC9GMOZb39CtRqvAFG5wuJA";
                    strArr2[5] = "0wpddTnUpSmY";
                    c1090b62.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId2 = A00(0, 5, 6);
                textView.setText(placementId2);
                textView.setTextColor(-1);
                YB.A0N(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                ViewOnLongClickListenerC0810Rq viewOnLongClickListenerC0810Rq = new ViewOnLongClickListenerC0810Rq(this.A00, relativeLayout);
                textView.setOnLongClickListener(viewOnLongClickListenerC0810Rq);
                relativeLayout.setOnLongClickListener(viewOnLongClickListenerC0810Rq);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(WK wk2, boolean z3) {
        if (C0886Up.A2w(this.A02)) {
            WK wk3 = WK.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (wk2 == wk3 && z3) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
    }
}
