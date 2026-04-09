package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1136bq extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C1136bq(C1436gi c1436gi, C0694Na c0694Na, boolean z3, int i4, int i10, int i11) {
        super(c1436gi);
        setOrientation(1);
        this.A02 = new TextView(c1436gi);
        YB.A0a(this.A02, true, i4);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c1436gi);
        this.A00 = new TextView(c1436gi);
        YB.A0a(this.A00, false, i10);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C0886Up.A17(c1436gi);
        int i12 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i12, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i12, -2));
        this.A01.setVisibility(8);
        A03(c0694Na, z3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, -2);
        layoutParams.setMargins(0, i11, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1136bq(C1436gi c1436gi, C0694Na c0694Na, boolean z3, boolean z10, boolean z11) {
        int i4 = z10 ? 18 : 22;
        int i10 = z10 ? 14 : 16;
        int i11 = A07;
        this(c1436gi, c0694Na, z3, i4, i10, z11 ? i11 / 2 : i11);
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C0694Na c0694Na, boolean z3) {
        this.A02.setTextColor(c0694Na.A07(z3));
        this.A01.setTextColor(c0694Na.A05(z3));
        this.A00.setTextColor(c0694Na.A06(z3));
    }

    public final void A04(String str, String str2, String str3, boolean z3, boolean z10) {
        boolean z11 = !TextUtils.isEmpty(str);
        boolean z12 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z11) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z11) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i4 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z11 || !z12) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z3) {
                        i4 = 2;
                    } else if (z10) {
                        i4 = 4;
                    }
                    textView3.setMaxLines(i4);
                    return;
                }
            } else {
                this.A02.setMaxLines(z3 ? 1 : 2);
                this.A00.setMaxLines(z3 ? 1 : z10 ? 3 : 2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i4) {
        if (this.A03) {
            setGravity(i4);
        }
        this.A02.setGravity(i4);
        this.A00.setGravity(i4);
    }

    public void setCTAClickListener(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        ViewOnClickListenerC1139bt viewOnClickListenerC1139btA03 = AbstractC1140bu.A03(viewOnClickListenerC0634Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC1139btA03);
        this.A00.setOnClickListener(viewOnClickListenerC1139btA03);
        this.A01.setOnClickListener(viewOnClickListenerC1139btA03);
    }

    public void setDescriptionTextSize(int i4) {
        this.A00.setTextSize(i4);
    }

    public void setDescriptionVisibility(int i4) {
        this.A00.setVisibility(i4);
    }

    public void setTitleTextSize(int i4) {
        this.A02.setTextSize(i4);
    }
}
