package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends Dialog {
    private com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.yu f8580le;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.vt f8581lh;
    public ouw ouw;
    private final tlj ra;
    private com.bytedance.sdk.openadsdk.core.le.fkw vt;
    private com.bytedance.sdk.openadsdk.core.le.pno yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void lh();

        void ouw();

        void ouw(String str);

        void vt();
    }

    public ryl(Context context, tlj tljVar) {
        super(context, vpp.le(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.ra = tljVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.le.vt vtVar = this.f8581lh;
        if (vtVar != null && (inputMethodManager = (InputMethodManager) vtVar.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.vt.getWindowToken(), 0);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z3;
        super.onCreate(bundle);
        Context contextOuw = zih.ouw();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        fkwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        fkwVar.setOrientation(1);
        fkwVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(contextOuw, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(contextOuw);
        raVar.setLayoutParams(new LinearLayout.LayoutParams(-1, osn.ouw(contextOuw, 48.0f)));
        this.f8580le = new com.bytedance.sdk.openadsdk.core.le.yu(contextOuw);
        int iOuw = osn.ouw(contextOuw, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw, iOuw);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iOuw2 = osn.ouw(contextOuw, 10.0f);
        layoutParams.topMargin = iOuw2;
        layoutParams.rightMargin = iOuw2;
        this.f8580le.setLayoutParams(layoutParams);
        this.f8580le.setClickable(true);
        this.f8580le.setFocusable(true);
        this.f8580le.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(contextOuw, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = osn.ouw(contextOuw, 12.0f);
        pnoVar.setLayoutParams(layoutParams2);
        pnoVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pnoVar.setGravity(17);
        pnoVar.setSingleLine(true);
        pnoVar.setText(vpp.ouw(contextOuw, "tt_other_reason"));
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setTextSize(15.0f);
        pnoVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(contextOuw);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, osn.ouw(contextOuw, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        fkwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fkwVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.le.vt vtVar = new com.bytedance.sdk.openadsdk.core.le.vt(contextOuw);
        this.f8581lh = vtVar;
        vtVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(TTAdConstant.MATE_VALID), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = osn.ouw(contextOuw, 16.0f);
        layoutParams3.rightMargin = osn.ouw(contextOuw, 16.0f);
        layoutParams3.topMargin = osn.ouw(contextOuw, 11.5f);
        this.f8581lh.setLayoutParams(layoutParams3);
        this.f8581lh.setLines(4);
        this.f8581lh.setGravity(48);
        this.f8581lh.setTextSize(15.0f);
        this.f8581lh.setTextColor(Color.rgb(22, 24, 35));
        this.f8581lh.setHintTextColor(Color.parseColor("#57161823"));
        this.f8581lh.setBackground(null);
        this.f8581lh.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(contextOuw);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iOuw3 = osn.ouw(contextOuw, 16.0f);
        int iOuw4 = osn.ouw(contextOuw, 17.0f);
        fkwVar3.setPadding(iOuw3, iOuw4, iOuw3, iOuw4);
        fkwVar3.setLayoutParams(layoutParams4);
        fkwVar3.setOrientation(0);
        this.yu = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.yu.setLayoutParams(layoutParams5);
        this.yu.setText("0/200");
        this.yu.setGravity(8388611);
        this.yu.setTextColor(Color.parseColor("#57161823"));
        this.yu.setTextSize(15.0f);
        this.fkw = new com.bytedance.sdk.openadsdk.core.le.pno(contextOuw);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.fkw.setLayoutParams(layoutParams6);
        this.fkw.setTextSize(14.0f);
        this.fkw.setTextColor(-1);
        this.fkw.setVisibility(0);
        this.fkw.setSingleLine(true);
        int iOuw5 = osn.ouw(contextOuw, 27.0f);
        int iOuw6 = osn.ouw(contextOuw, 5.0f);
        this.fkw.setPadding(iOuw5, iOuw6, iOuw5, iOuw6);
        int iOuw7 = osn.ouw(contextOuw, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iOuw7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.fkw.setBackground(stateListDrawable);
        this.fkw.setText(vpp.ouw(contextOuw, "tt_done"));
        this.fkw.setEnabled(false);
        fkwVar.addView(raVar);
        fkwVar.addView(view);
        fkwVar.addView(fkwVar2);
        raVar.addView(this.f8580le);
        raVar.addView(pnoVar);
        fkwVar2.addView(this.f8581lh);
        fkwVar2.addView(fkwVar3);
        fkwVar3.addView(this.yu);
        fkwVar3.addView(this.fkw);
        this.vt = fkwVar;
        setContentView(fkwVar);
        this.f8581lh.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i10, Spanned spanned, int i11, int i12) {
                while (i4 < i10) {
                    int type = Character.getType(charSequence.charAt(i4));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i4++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(TTAdConstant.MATE_VALID)});
        tlj tljVar = this.ra;
        if (tljVar != null) {
            String str = tljVar.mwh;
            if (TextUtils.isEmpty(str)) {
                z3 = true;
            } else {
                this.f8581lh.setText(str);
                z3 = true;
                this.yu.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(str.length()), "/200"));
            }
            this.fkw.setEnabled(TextUtils.isEmpty(str) ^ z3);
        }
        this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string = ryl.this.f8581lh.getText().toString();
                if (ryl.this.ouw != null) {
                    ouw ouwVar = ryl.this.ouw;
                    FilterWord filterWord = tlj.ouw;
                    ouwVar.ouw(string);
                }
                ryl.this.dismiss();
            }
        });
        this.f8580le.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (ryl.this.ouw != null) {
                    ryl.this.ouw.vt();
                }
                ryl.this.dismiss();
            }
        });
        this.f8581lh.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.3
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
                com.bytedance.sdk.openadsdk.core.le.pno pnoVar2;
                int iRound = Math.round(charSequence.length());
                ryl.this.yu.setText(iRound + "/200");
                boolean z10 = true;
                if (iRound <= 0) {
                    pnoVar2 = ryl.this.fkw;
                    if (ryl.this.ra == null || TextUtils.isEmpty(ryl.this.ra.mwh)) {
                        z10 = false;
                    }
                } else if (ryl.this.fkw.isEnabled()) {
                    return;
                } else {
                    pnoVar2 = ryl.this.fkw;
                }
                pnoVar2.setEnabled(z10);
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
            }
        });
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
        com.bytedance.sdk.openadsdk.core.le.vt vtVar2 = this.f8581lh;
        if (vtVar2 != null) {
            vtVar2.requestFocus();
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(5);
            }
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.lh.ryl.5
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (ryl.this.ouw != null) {
                    ryl.this.ouw.lh();
                }
            }
        });
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }

    public final void ouw(String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        tlj tljVar = this.ra;
        if (tljVar != null) {
            tljVar.ouw(str, vppVar);
        }
    }
}
