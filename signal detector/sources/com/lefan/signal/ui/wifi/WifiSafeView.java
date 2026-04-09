package com.lefan.signal.ui.wifi;

import H4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import q5.i;

/* loaded from: classes.dex */
public final class WifiSafeView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f19468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19470c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19472e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f19473f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayoutCompat f19474g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayoutCompat f19475h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f19476j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f19477k;

    /* renamed from: l, reason: collision with root package name */
    public String f19478l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiSafeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19468a = 1;
        this.f19469b = 2;
        this.f19470c = 3;
        this.f19471d = -12303292;
        this.f19472e = -12303292;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_detection, this);
        TextView textView = (TextView) viewInflate.findViewById(R.id.taskName);
        this.f19476j = textView;
        this.f19473f = (LinearLayoutCompat) viewInflate.findViewById(R.id.llDetecting);
        this.f19475h = (LinearLayoutCompat) viewInflate.findViewById(R.id.llResultOk);
        this.f19474g = (LinearLayoutCompat) viewInflate.findViewById(R.id.llResultNotOk);
        this.i = (TextView) viewInflate.findViewById(R.id.llWaiting);
        this.f19477k = (LinearLayout) viewInflate.findViewById(R.id.safe_container);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1813c, 0, 0);
        if (textView != null) {
            textView.setText(typedArrayObtainStyledAttributes.getString(2));
        }
        this.f19472e = typedArrayObtainStyledAttributes.getColor(1, -12303292);
        this.f19471d = typedArrayObtainStyledAttributes.getColor(0, getContext().getColor(R.color.text_color));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setSignalVal(String str) {
        this.f19478l = str;
    }

    public final void setStatus(int i) {
        int i3 = this.f19472e;
        TextView textView = this.f19476j;
        LinearLayout linearLayout = this.f19477k;
        LinearLayoutCompat linearLayoutCompat = this.f19474g;
        LinearLayoutCompat linearLayoutCompat2 = this.f19475h;
        LinearLayoutCompat linearLayoutCompat3 = this.f19473f;
        TextView textView2 = this.i;
        if (i == 0) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (linearLayoutCompat3 != null) {
                linearLayoutCompat3.setVisibility(8);
            }
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.setVisibility(8);
            }
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.shape_harmony_bg_dark_grey);
            }
            if (textView != null) {
                textView.setTextColor(i3);
            }
            if (this.f19478l != null) {
                if (textView2 != null) {
                    textView2.setText(getContext().getString(R.string.to_be_test));
                }
                if (textView2 != null) {
                    textView2.setTextColor(-12303292);
                    return;
                }
                return;
            }
            return;
        }
        if (i == this.f19468a) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (linearLayoutCompat3 != null) {
                linearLayoutCompat3.setVisibility(0);
            }
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.setVisibility(8);
            }
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.shape_harmony_bg_light_grey);
            }
            if (textView != null) {
                textView.setTextColor(this.f19471d);
                return;
            }
            return;
        }
        if (i != this.f19470c) {
            if (i == this.f19469b) {
                if (linearLayout != null) {
                    linearLayout.setBackgroundResource(R.drawable.shape_harmony_bg_light_grey);
                }
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (linearLayoutCompat3 != null) {
                    linearLayoutCompat3.setVisibility(8);
                }
                if (linearLayoutCompat2 != null) {
                    linearLayoutCompat2.setVisibility(8);
                }
                if (linearLayoutCompat != null) {
                    linearLayoutCompat.setVisibility(0);
                }
                if (textView != null) {
                    textView.setTextColor(i3);
                    return;
                }
                return;
            }
            return;
        }
        String str = this.f19478l;
        if (str != null) {
            if (textView2 != null) {
                textView2.setText(str);
            }
            if (textView2 != null) {
                textView2.setTextColor(getContext().getColor(R.color.text_color));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.setVisibility(0);
            }
        }
        if (linearLayoutCompat3 != null) {
            linearLayoutCompat3.setVisibility(8);
        }
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(8);
        }
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(R.drawable.shape_harmony_bg_light_grey);
        }
        if (textView != null) {
            textView.setTextColor(i3);
        }
    }
}
