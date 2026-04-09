package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC2124i0;
import com.applovin.impl.C2105a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f20351a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f20352b;

    /* renamed from: c, reason: collision with root package name */
    private final C2105a f20353c;

    /* renamed from: d, reason: collision with root package name */
    private b f20354d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdFormat f20355e;

    /* renamed from: f, reason: collision with root package name */
    private a f20356f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? AbstractC2124i0.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? AbstractC2124i0.a(R.color.applovin_sdk_brand_color, getContext()) : AbstractC2124i0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f20353c.a();
        } else {
            setEnabled(true);
            this.f20353c.b();
        }
        this.f20352b.setText(b(bVar));
        this.f20351a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f20354d;
    }

    public MaxAdFormat getFormat() {
        return this.f20355e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f20356f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f20354d != bVar) {
            c(bVar);
        }
        this.f20354d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f20355e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f20356f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f20351a = gradientDrawable;
        Button button = new Button(getContext());
        this.f20352b = button;
        C2105a c2105a = new C2105a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f20353c = c2105a;
        b bVar = b.LOAD;
        this.f20354d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        c2105a.setColor(-1);
        addView(c2105a, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f20352b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{AbstractC2124i0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
