package com.bytedance.sdk.openadsdk.xq;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.xq.ru;

/* loaded from: classes.dex */
public class bw extends com.bytedance.sdk.openadsdk.core.ycc.bw implements View.OnClickListener, ru.xq {
    private FilterWord bw;
    private final ru dg;
    private final int uym;
    private StateListDrawable ycc;
    public static FilterWord emc = new FilterWord("100:1", "GOOD");
    public static FilterWord ypw = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord xq = new FilterWord("100:3", "BAD");

    public bw(@NonNull Context context, int i10, ru ruVar) {
        super(context);
        this.uym = i10;
        this.dg = ruVar;
        if (ruVar != null) {
            ruVar.emc(this);
        }
        emc(i10);
        emc();
        ypw();
    }

    private void emc(int i10) {
        if (i10 == 1) {
            this.bw = emc;
        } else if (i10 == 2) {
            this.bw = ypw;
        } else {
            if (i10 != 3) {
                return;
            }
            this.bw = xq;
        }
    }

    private void ypw() {
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(getContext());
        mswVar.setTextSize(this.dg.zz() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, vw.ypw(getContext(), 12.0f), 0, vw.ypw(getContext(), this.dg.zz() ? 8.0f : 4.0f));
        addView(mswVar, layoutParams);
        emc emcVar = new emc(getContext());
        emcVar.setTextSize(this.dg.zz() ? 17 : 12);
        emcVar.setTextColor(-16777216);
        emcVar.setMaxLines(1);
        emcVar.setSingleLine();
        emcVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, vw.ypw(getContext(), 12.0f));
        addView(emcVar, layoutParams2);
        int i10 = this.uym;
        if (i10 == 1) {
            mswVar.setText("😍");
            emcVar.setText(rie.emc(getContext(), "tt_good"));
        } else if (i10 == 2) {
            emcVar.setText(rie.emc(getContext(), "tt_not_bad"));
            mswVar.setText("😐");
        } else {
            if (i10 != 3) {
                return;
            }
            emcVar.setText(rie.emc(getContext(), "tt_bad"));
            mswVar.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.dg.emc(ru.emc);
        } else {
            this.dg.emc(this.bw);
        }
    }

    private void emc() {
        if (this.ycc == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(vw.ypw(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(vw.ypw(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(vw.ypw(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.ycc = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.ycc.addState(new int[0], gradientDrawable);
        }
        setBackground(this.ycc);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.xq
    public void emc(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.bw) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
