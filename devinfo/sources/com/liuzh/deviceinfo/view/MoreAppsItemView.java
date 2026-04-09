package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.mediation.nativeAds.a;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.y;
import zf.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MoreAppsItemView extends ConstraintLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f21347r = 0;

    /* renamed from: q, reason: collision with root package name */
    public final String f21348q;

    public MoreAppsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int iP = d.p(12.0f, getResources().getDisplayMetrics());
        int iP2 = d.p(8.0f, getResources().getDisplayMetrics());
        setPadding(iP, iP2, iP, iP2);
        setFocusable(true);
        setClickable(true);
        setBackground(y.a(getContext()));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f38276d);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        this.f21348q = typedArrayObtainStyledAttributes.getString(3);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), R.layout.moreapps_item, this);
        ImageView imageView = (ImageView) findViewById(R.id.launcher_icon);
        TextView textView = (TextView) findViewById(R.id.launcher_title);
        TextView textView2 = (TextView) findViewById(R.id.launcher_slogan);
        imageView.setImageDrawable(drawable);
        textView.setText(string);
        textView2.setText(string2);
        setOnClickListener(new a(17, this));
        if (!isInEditMode() && d.k()) {
            y.j(1.02f, this);
        }
    }
}
