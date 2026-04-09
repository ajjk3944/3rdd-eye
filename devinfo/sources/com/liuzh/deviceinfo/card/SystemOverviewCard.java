package com.liuzh.deviceinfo.card;

import a4.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.d;
import com.applovin.impl.c9;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.l;
import dj.b;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SystemOverviewCard extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21221a = 0;

    public SystemOverviewCard(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        int color = isInEditMode() ? getContext().getResources().getColor(R.color.colorPrimary) : i.b(getContext());
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        setBackgroundResource(R.drawable.bg_common_card);
        setBackgroundTintList(b.c(color));
        View.inflate(getContext(), R.layout.card_system_overview, this);
        if (isInEditMode()) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        TextView textView = (TextView) findViewById(R.id.version_number);
        TextView textView2 = (TextView) findViewById(R.id.version_name);
        TextView textView3 = (TextView) findViewById(R.id.release_date);
        c9 c9Var = new c9(this, imageView, textView, textView2, textView3, 4);
        if (!l.Z()) {
            c9Var.run();
            return;
        }
        imageView.setImageResource(R.drawable.ic_hmos);
        int iC = a.c(getResources(), 6.0f);
        imageView.setPadding(iC, iC, iC, iC);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = a.c(getResources(), 60.0f);
        imageView.setLayoutParams(layoutParams);
        d.c(new ci.a(c9Var, textView, textView2, textView3, 17));
    }
}
