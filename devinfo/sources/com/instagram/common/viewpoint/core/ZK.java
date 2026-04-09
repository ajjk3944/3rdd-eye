package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZK extends LinearLayout {
    public static final int A08 = (int) (XX.A02 * 15.0f);
    public static final int A09 = (int) (XX.A02 * 10.0f);
    public static final int A0A = (int) (XX.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C1436gi A06;
    public final C1117bX A07;

    public ZK(C1436gi c1436gi, int i4, boolean z3) {
        super(c1436gi);
        this.A01 = false;
        this.A06 = c1436gi;
        this.A02 = z3;
        this.A03 = new ImageView(c1436gi);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new C1117bX(c1436gi, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c1436gi);
        setOrientation(0);
        this.A04 = new LinearLayout(c1436gi);
        this.A00 = i4;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        YB.A0a(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i4;
        C1117bX c1117bX = this.A07;
        int i10 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i4 = this.A01 ? 4 : 0;
        } else {
            i4 = 8;
        }
        c1117bX.setVisibility(i4);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i10 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i10 = 0;
        }
        imageView.setVisibility(i10);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f10, int i4) {
        this.A07.A02(f10, i4);
    }

    public final void A04(C0694Na c0694Na, boolean z3, boolean z10) {
        int iA05 = c0694Na.A05(z3);
        this.A07.A03(P3.A02(iA05, 77), iA05, 110, true);
        this.A03.setColorFilter(iA05);
        if (z10) {
            TextView textView = this.A05;
            int accentColor = P3.A02(-1, 110);
            textView.setTextColor(accentColor);
            return;
        }
        this.A05.setTextColor(iA05);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i4) {
        if (i4 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A07.setProgressWithAnimation(f10);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(YM ym) {
        this.A07.setImage(ym);
    }

    public void setProgressImmediate(float f10) {
        this.A07.clearAnimation();
        this.A07.setProgress(f10);
    }

    public void setProgressSpinnerInvisible(boolean z3) {
        this.A01 = z3;
        A01();
    }

    public void setToolbarActionMode(int i4) {
        YM ym;
        this.A06.A0F().AGB(i4);
        this.A00 = i4;
        A01();
        setVisibility(0);
        this.A03.setImageAlpha(255);
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i4) {
            case 0:
                ym = YM.CROSS;
                break;
            case 1:
                if (!this.A02) {
                    ym = YM.SKIP_ARROW;
                    break;
                } else {
                    ym = YM.REDESIGN_SKIP_ICON;
                    break;
                }
            case 2:
            default:
                ym = YM.CROSS;
                break;
            case 3:
                ym = YM.MINIMIZE_ARROW;
                break;
            case 4:
                ym = YM.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                ym = YM.CROSS;
                break;
            case 6:
                ym = YM.CROSS;
                break;
            case 7:
                ym = YM.CROSS;
                this.A03.setImageAlpha(110);
                this.A03.setPadding(A08, A08, A08, A08);
                break;
            case 8:
                ym = YM.OTHER_SKIP;
                break;
        }
        this.A03.setImageBitmap(YN.A01(ym));
        if (i4 == 1) {
            YB.A0G(WebSocketProtocol.CLOSE_NO_STATUS_CODE, this.A03);
            setVisibility(0);
        } else if (i4 == 8) {
            YB.A0G(1009, this.A03);
            setVisibility(0);
        } else {
            YB.A0G(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, this.A03);
        }
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z3) {
        this.A05.setVisibility(z3 ? 0 : 4);
    }
}
