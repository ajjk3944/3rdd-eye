package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.m0;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f4685a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f4686b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f4687c;

    /* renamed from: d, reason: collision with root package name */
    private b f4688d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdFormat f4689e;

    /* renamed from: f, reason: collision with root package name */
    private a f4690f;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : m0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f4687c.a();
        } else {
            setEnabled(true);
            this.f4687c.b();
        }
        this.f4686b.setText(b(bVar));
        this.f4685a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f4688d;
    }

    public MaxAdFormat getFormat() {
        return this.f4689e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f4690f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f4688d != bVar) {
            c(bVar);
        }
        this.f4688d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f4689e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f4690f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f4685a = gradientDrawable;
        Button button = new Button(getContext());
        this.f4686b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f4687c = aVar;
        b bVar = b.LOAD;
        this.f4688d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f4686b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{m0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
