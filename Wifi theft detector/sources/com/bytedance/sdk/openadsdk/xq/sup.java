package com.bytedance.sdk.openadsdk.xq;

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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.Locale;

/* loaded from: classes.dex */
public class sup extends Dialog {
    private com.bytedance.sdk.openadsdk.core.ycc.msw bw;
    private com.bytedance.sdk.openadsdk.core.ycc.msw dg;
    private com.bytedance.sdk.openadsdk.core.ycc.bw emc;
    private final ru uym;
    private com.bytedance.sdk.openadsdk.core.ycc.ypw xq;
    private com.bytedance.sdk.openadsdk.core.ycc.dg ycc;
    private emc ypw;

    public interface emc {
        void emc();

        void emc(int i10, FilterWord filterWord, String str);

        void xq();

        void ypw();
    }

    public sup(@NonNull Context context, ru ruVar) {
        super(context, rie.ycc(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.uym = ruVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ypw();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVarEmc = emc(aa.emc());
        this.emc = bwVarEmc;
        setContentView(bwVarEmc);
        emc(this.emc);
        xq();
        emc();
        dg();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.emc();
        }
    }

    private void dg() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.xq.sup.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (sup.this.ypw != null) {
                    sup.this.ypw.xq();
                }
            }
        });
    }

    private void emc(View view) {
        emc((EditText) this.xq);
        ru ruVar = this.uym;
        if (ruVar != null) {
            String strUym = ruVar.uym();
            if (!TextUtils.isEmpty(strUym)) {
                this.xq.setText(strUym);
                this.dg.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strUym.length()), "/200"));
            }
            this.bw.setEnabled(!TextUtils.isEmpty(strUym));
        }
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.sup.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = sup.this.xq.getText().toString();
                if (sup.this.ypw != null) {
                    sup.this.ypw.emc(4, ru.emc, string);
                }
                sup.this.dismiss();
            }
        });
        this.ycc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.sup.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (sup.this.ypw != null) {
                    sup.this.ypw.ypw();
                }
                sup.this.dismiss();
            }
        });
        this.xq.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.xq.sup.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.ycc.msw mswVar;
                int iRound = Math.round(charSequence.length());
                sup.this.dg.setText(iRound + "/200");
                boolean z10 = true;
                if (iRound <= 0) {
                    mswVar = sup.this.bw;
                    if (sup.this.uym == null || TextUtils.isEmpty(sup.this.uym.uym())) {
                        z10 = false;
                    }
                } else if (sup.this.bw.isEnabled()) {
                    return;
                } else {
                    mswVar = sup.this.bw;
                }
                mswVar.setEnabled(z10);
            }
        });
    }

    private void xq() {
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
    }

    public void ypw() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.ycc.ypw ypwVar = this.xq;
        if (ypwVar == null || (inputMethodManager = (InputMethodManager) ypwVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.emc.getWindowToken(), 0);
    }

    public static void emc(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.xq.sup.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void emc(emc emcVar) {
        this.ypw = emcVar;
    }

    public void emc() {
        com.bytedance.sdk.openadsdk.core.ycc.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void emc(String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        ru ruVar = this.uym;
        if (ruVar != null) {
            ruVar.emc(str, rieVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.ycc.bw emc(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bwVar.setOrientation(1);
        bwVar.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(context);
        uymVar.setLayoutParams(new LinearLayout.LayoutParams(-1, vw.ypw(context, 48.0f)));
        this.ycc = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        int iYpw = vw.ypw(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iYpw, iYpw);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iYpw2 = vw.ypw(context, 10.0f);
        layoutParams.topMargin = iYpw2;
        layoutParams.rightMargin = iYpw2;
        this.ycc.setLayoutParams(layoutParams);
        this.ycc.setClickable(true);
        this.ycc.setFocusable(true);
        this.ycc.setImageDrawable(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = vw.ypw(context, 12.0f);
        mswVar.setLayoutParams(layoutParams2);
        mswVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        mswVar.setGravity(17);
        mswVar.setSingleLine(true);
        mswVar.setText(rie.emc(context, "tt_other_reason"));
        mswVar.setTextColor(Color.parseColor("#161823"));
        mswVar.setTextSize(15.0f);
        mswVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, vw.ypw(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        bwVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.ycc.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.ycc.ypw(context);
        this.xq = ypwVar;
        ypwVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = vw.ypw(context, 16.0f);
        layoutParams3.rightMargin = vw.ypw(context, 16.0f);
        layoutParams3.topMargin = vw.ypw(context, 11.5f);
        this.xq.setLayoutParams(layoutParams3);
        this.xq.setLines(4);
        this.xq.setGravity(48);
        this.xq.setTextSize(15.0f);
        this.xq.setTextColor(Color.rgb(22, 24, 35));
        this.xq.setHintTextColor(Color.parseColor("#57161823"));
        this.xq.setBackground(null);
        this.xq.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iYpw3 = vw.ypw(context, 16.0f);
        int iYpw4 = vw.ypw(context, 17.0f);
        bwVar3.setPadding(iYpw3, iYpw4, iYpw3, iYpw4);
        bwVar3.setLayoutParams(layoutParams4);
        bwVar3.setOrientation(0);
        this.dg = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.dg.setLayoutParams(layoutParams5);
        this.dg.setText(String.format("0%s", "/200"));
        this.dg.setGravity(8388611);
        this.dg.setTextColor(Color.parseColor("#57161823"));
        this.dg.setTextSize(15.0f);
        this.bw = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.bw.setLayoutParams(layoutParams6);
        this.bw.setTextSize(14.0f);
        this.bw.setTextColor(-1);
        this.bw.setVisibility(0);
        this.bw.setSingleLine(true);
        int iYpw5 = vw.ypw(context, 27.0f);
        int iYpw6 = vw.ypw(context, 5.0f);
        this.bw.setPadding(iYpw5, iYpw6, iYpw5, iYpw6);
        int iYpw7 = vw.ypw(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iYpw7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.bw.setBackground(stateListDrawable);
        this.bw.setText(rie.emc(context, "tt_done"));
        this.bw.setEnabled(false);
        bwVar.addView(uymVar);
        bwVar.addView(view);
        bwVar.addView(bwVar2);
        uymVar.addView(this.ycc);
        uymVar.addView(mswVar);
        bwVar2.addView(this.xq);
        bwVar2.addView(bwVar3);
        bwVar3.addView(this.dg);
        bwVar3.addView(this.bw);
        return bwVar;
    }
}
