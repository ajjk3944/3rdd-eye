package com.lefan.signal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apm.insight.R;
import q5.i;

/* loaded from: classes.dex */
public final class DiagnosisLevelView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final View f19528a;

    /* renamed from: b, reason: collision with root package name */
    public final View f19529b;

    /* renamed from: c, reason: collision with root package name */
    public final View f19530c;

    /* renamed from: d, reason: collision with root package name */
    public final View f19531d;

    /* renamed from: e, reason: collision with root package name */
    public final View f19532e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f19533f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f19534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosisLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_diagnosis_level, (ViewGroup) null);
        this.f19529b = viewInflate.findViewById(R.id.v_diagnosis_one);
        this.f19531d = viewInflate.findViewById(R.id.v_diagnosis_two);
        this.f19530c = viewInflate.findViewById(R.id.v_diagnosis_three);
        this.f19528a = viewInflate.findViewById(R.id.v_diagnosis_four);
        this.f19532e = viewInflate.findViewById(R.id.v_diagnosis_five);
        this.f19533f = (TextView) viewInflate.findViewById(R.id.diagnosis_text);
        this.f19534g = (ImageView) viewInflate.findViewById(R.id.help_img);
        addView(viewInflate, new LinearLayout.LayoutParams(-2, -2));
    }

    public final void a() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.tools_traceroute_good);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
    }

    public final void b() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.tools_traceroute_perfect);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_green);
        }
    }

    public final void c() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.tools_traceroute_general);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_yellow);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_yellow);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_yellow);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
    }

    public final void d() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.tools_traceroute_none);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
    }

    public final void e() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.tools_traceroute_bad);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
    }

    public final void f() {
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.level_weak);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
    }

    public final void setLevel(int i) {
        if (i != 0) {
            if (i == 1) {
                f();
                return;
            }
            if (i == 2) {
                c();
                return;
            }
            if (i == 3) {
                a();
                return;
            } else if (i != 4) {
                d();
                return;
            } else {
                b();
                return;
            }
        }
        TextView textView = this.f19533f;
        if (textView != null) {
            textView.setText(R.string.level_very_weak);
        }
        View view = this.f19529b;
        if (view != null) {
            view.setBackgroundResource(R.drawable.bg_shape_diagnosis_level_red);
        }
        View view2 = this.f19531d;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view3 = this.f19530c;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view4 = this.f19528a;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
        View view5 = this.f19532e;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_shape_diagnose_check_level);
        }
    }

    public final void setPhoneLevel(Integer num) {
        if (num != null && num.intValue() == 1) {
            f();
            return;
        }
        if (num != null && num.intValue() == 2) {
            c();
            return;
        }
        if (num != null && num.intValue() == 3) {
            a();
        } else if (num != null && num.intValue() == 4) {
            b();
        } else {
            d();
        }
    }
}
