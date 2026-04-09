package com.liuzh.deviceinfo.card;

import a4.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import bi.d;
import com.liuzh.deviceinfo.R;
import dj.b;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CpuOverviewCard extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f21171q = 0;

    public CpuOverviewCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iC = a.c(getResources(), 12.0f);
        setPadding(iC, iC, iC, iC);
        if (isInEditMode()) {
            return;
        }
        setBackgroundTintList(b.c(i.b(getContext())));
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_cpu_overview, this);
        if (isInEditMode()) {
            return;
        }
        d.c(new o0(27, this));
    }
}
