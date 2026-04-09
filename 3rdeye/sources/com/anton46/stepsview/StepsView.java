package com.anton46.stepsview;

import N7.H7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anton46.stepsview.StepsViewIndicator;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;

/* loaded from: classes.dex */
public class StepsView extends LinearLayout implements StepsViewIndicator.a {

    /* renamed from: b, reason: collision with root package name */
    public final StepsViewIndicator f18725b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f18726c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f18727d;

    /* renamed from: e, reason: collision with root package name */
    public int f18728e;

    /* renamed from: f, reason: collision with root package name */
    public int f18729f;

    /* renamed from: g, reason: collision with root package name */
    public int f18730g;

    /* renamed from: h, reason: collision with root package name */
    public int f18731h;

    public StepsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18728e = -256;
        this.f18729f = -16777216;
        this.f18730g = -16777216;
        this.f18731h = 0;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.widget_steps_view, this);
        StepsViewIndicator stepsViewIndicator = (StepsViewIndicator) viewInflate.findViewById(R.id.steps_indicator_view);
        this.f18725b = stepsViewIndicator;
        stepsViewIndicator.setDrawListener(this);
        this.f18726c = (FrameLayout) viewInflate.findViewById(R.id.labels_container);
    }

    public final void a() {
        if (this.f18727d == null) {
            throw new IllegalArgumentException("labels must not be null.");
        }
        int i = this.f18731h;
        if (i < 0 || i > r0.length - 1) {
            throw new IndexOutOfBoundsException(H7.n(this.f18731h, this.f18727d.length, "Index : ", ", Size : "));
        }
        this.f18725b.invalidate();
    }

    public final void b() {
        List<Float> thumbContainerXPosition = this.f18725b.getThumbContainerXPosition();
        if (this.f18727d != null) {
            for (int i = 0; i < this.f18727d.length; i++) {
                TextView textView = new TextView(getContext());
                textView.setText(this.f18727d[i]);
                textView.setTextColor(this.f18729f);
                textView.setX(thumbContainerXPosition.get(i).floatValue());
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                if (i <= this.f18731h) {
                    textView.setTypeface(null, 1);
                }
                this.f18726c.addView(textView);
            }
        }
    }

    public int getBarColorIndicator() {
        return this.f18730g;
    }

    public int getCompletedPosition() {
        return this.f18731h;
    }

    public int getLabelColorIndicator() {
        return this.f18729f;
    }

    public String[] getLabels() {
        return this.f18727d;
    }

    public int getProgressColorIndicator() {
        return this.f18728e;
    }
}
