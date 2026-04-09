package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class Mn extends AbstractC3063Zv {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC2975Wl.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC2975Wl.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC2975Wl.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC2975Wl.A02 * 4.0f);

    public Mn(C3272dL c3272dL, int i, C2735My c2735My, boolean z10, String str, US us, InterfaceC3003Xn interfaceC3003Xn, C3345eX c3345eX, XH xh, N3 n32) {
        super(c3272dL, null, i, c2735My, z10, str, us, interfaceC3003Xn, c3345eX, xh, n32, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC3063Zv.A0B);
        linearLayout.addView(this.A00, AbstractC3063Zv.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i, int i10, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        XP.A0W(textView, z10, i10);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3063Zv
    public final void A0g() {
        super.A0g();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3063Zv
    public final void A0h(int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3063Zv
    public void setInfo(C2733Mw c2733Mw, C2736Mz c2736Mz, String str, String str2, InterfaceC2985Wv interfaceC2985Wv, InterfaceC3072a4 interfaceC3072a4) {
        super.setInfo(c2733Mw, c2736Mz, str, str2, interfaceC2985Wv, interfaceC3072a4);
        this.A01.setText(c2733Mw.A0F());
        this.A00.setText(c2733Mw.A0E());
        if (TextUtils.isEmpty(c2736Mz.A04())) {
            XP.A0F(this.A08);
        }
    }
}
