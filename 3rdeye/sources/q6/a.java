package Q6;

import K6.C0713c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ErrorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final F7.l f11311b;

    /* renamed from: c, reason: collision with root package name */
    public final F7.m f11312c;

    /* renamed from: d, reason: collision with root package name */
    public final p f11313d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f11314e;

    public a(Context context, A8.q qVar, F7.l lVar, F7.m mVar) {
        super(context);
        this.f11311b = lVar;
        this.f11312c = mVar;
        p pVar = new p(qVar);
        this.f11313d = pVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        this.f11314e = appCompatTextView;
        View qVar2 = new q(context, pVar);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        int iC = C0713c.C(8, displayMetrics);
        setPadding(iC, iC, iC, iC);
        setOrientation(1);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R.dimen.div_shadow_elevation));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
        linearLayout2.setPadding(0, 0, C0713c.C(8, displayMetrics2), 0);
        linearLayout2.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout2.getContext());
        imageView.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new D8.e(this, 2));
        ImageView imageView2 = new ImageView(linearLayout2.getContext());
        imageView2.setImageResource(android.R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new B2.r(this, 2));
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        DisplayMetrics displayMetrics3 = linearLayout.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics3, "resources.displayMetrics");
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(C0713c.C(32, displayMetrics3), -2));
        linearLayout.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        addView(qVar2, new LinearLayout.LayoutParams(-1, -2));
    }
}
