package com.liuzh.deviceinfo.card;

import a4.a;
import aa.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.o0;
import bi.d;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import j$.util.Objects;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CpuCard extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21169b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21170a;

    public CpuCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        super(context, attributeSet);
        if (isInEditMode()) {
            iE = getContext().getResources().getColor(R.color.colorPrimary);
        } else {
            f fVar = f.f21256b;
            iE = f.e();
        }
        this.f21170a = iE;
        setOrientation(1);
        setPadding(0, 0, 0, a.c(getResources(), 6.0f));
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_cpu, this);
        if (isInEditMode()) {
            return;
        }
        TextView textView = (TextView) findViewById(R.id.proc_cpuinfo);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_view_detail);
        Objects.requireNonNull(drawable);
        textView.setCompoundDrawablesWithIntrinsicBounds(e.M(drawable, iE), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(iE);
        textView.setOnClickListener(new j(3, this));
        d.c(new o0(26, this));
    }

    public final View a(LayoutInflater layoutInflater, int i4, String str) {
        View viewInflate = layoutInflater.inflate(R.layout.kvcard_item, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.name)).setText(i4);
        TextView textView = (TextView) viewInflate.findViewById(R.id.value);
        textView.setText(str);
        textView.setTextColor(this.f21170a);
        return viewInflate;
    }
}
