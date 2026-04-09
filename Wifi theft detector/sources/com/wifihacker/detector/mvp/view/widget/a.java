package com.wifihacker.detector.mvp.view.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.databinding.g;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import l8.s1;

/* loaded from: classes3.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public s1 f20549a;

    public a(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        this.f20549a = (s1) g.d(LayoutInflater.from(context), R.layout.view_ping_item, this, true);
    }

    public void b(String str, String str2, String str3) {
        this.f20549a.f23331y.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f20549a.f23329w.setVisibility(0);
            this.f20549a.f23329w.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f20549a.f23330x.setVisibility(0);
        this.f20549a.f23330x.setText(str3);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
