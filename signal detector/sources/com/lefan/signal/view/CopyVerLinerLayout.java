package com.lefan.signal.view;

import B4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apm.insight.R;
import q5.i;

/* loaded from: classes.dex */
public final class CopyVerLinerLayout extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19506c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19507a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f19508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyVerLinerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.copy_ver_liner_layout, this);
        TextView textView = (TextView) findViewById(R.id.copy_ver_liner_info);
        this.f19507a = textView;
        TextView textView2 = (TextView) findViewById(R.id.copy_ver_liner_name);
        this.f19508b = textView2;
        setOnClickListener(new g(25, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H4.g.f1811a, 0, 0);
        if (textView2 != null) {
            textView2.setText(typedArrayObtainStyledAttributes.getString(1));
        }
        if (textView != null) {
            textView.setText(typedArrayObtainStyledAttributes.getString(0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setInfo(String str) {
        TextView textView = this.f19507a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
