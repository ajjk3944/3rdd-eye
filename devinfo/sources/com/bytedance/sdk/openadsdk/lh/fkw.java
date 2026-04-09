package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends com.bytedance.sdk.openadsdk.core.le.fkw implements View.OnClickListener, tlj.lh {
    private FilterWord fkw;

    /* renamed from: le, reason: collision with root package name */
    private StateListDrawable f8576le;
    private final int ra;
    private final tlj yu;
    public static FilterWord ouw = new FilterWord("100:1", "GOOD");
    public static FilterWord vt = new FilterWord("100:2", "NOT_BAD");

    /* renamed from: lh, reason: collision with root package name */
    public static FilterWord f8575lh = new FilterWord("100:3", "BAD");

    public fkw(Context context, int i4, tlj tljVar) {
        super(context);
        this.ra = i4;
        this.yu = tljVar;
        if (tljVar != null) {
            tljVar.ouw(this);
        }
        if (i4 == 1) {
            this.fkw = ouw;
        } else if (i4 == 2) {
            this.fkw = vt;
        } else if (i4 == 3) {
            this.fkw = f8575lh;
        }
        if (this.f8576le == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(osn.ouw(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(osn.ouw(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(osn.ouw(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f8576le = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.f8576le.addState(new int[0], gradientDrawable);
        }
        setBackground(this.f8576le);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(getContext());
        pnoVar.setTextSize(tljVar.fkw() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, osn.ouw(getContext(), 12.0f), 0, osn.ouw(getContext(), tljVar.fkw() ? 8.0f : 4.0f));
        addView(pnoVar, layoutParams2);
        ouw ouwVar = new ouw(getContext());
        ouwVar.setTextSize(tljVar.fkw() ? 17 : 12);
        ouwVar.setTextColor(-16777216);
        ouwVar.setMaxLines(1);
        ouwVar.setSingleLine();
        ouwVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, osn.ouw(getContext(), 12.0f));
        addView(ouwVar, layoutParams3);
        if (i4 == 1) {
            pnoVar.setText("😍");
            ouwVar.setText(vpp.ouw(getContext(), "tt_good"));
        } else if (i4 == 2) {
            ouwVar.setText(vpp.ouw(getContext(), "tt_not_bad"));
            pnoVar.setText("😐");
        } else {
            if (i4 != 3) {
                return;
            }
            ouwVar.setText(vpp.ouw(getContext(), "tt_bad"));
            pnoVar.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (isSelected()) {
            this.yu.ouw(tlj.ouw);
        } else {
            this.yu.ouw(this.fkw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.fkw) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
