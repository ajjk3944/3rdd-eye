package com.staircase3.opensignal.ui.views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatSeekBar;
import ln.a;
import ln.b;

/* loaded from: classes.dex */
public class CustomSeekBar extends AppCompatSeekBar {
    public final DecelerateInterpolator B;

    /* renamed from: d, reason: collision with root package name */
    public int f6161d;

    /* renamed from: g, reason: collision with root package name */
    public float f6162g;

    /* renamed from: r, reason: collision with root package name */
    public int f6163r;

    /* renamed from: x, reason: collision with root package name */
    public int f6164x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6165y;

    public CustomSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6161d = 5;
        this.f6162g = 0.0f;
        this.f6163r = 0;
        this.f6164x = 0;
        this.f6165y = 200;
        this.f6165y = getResources().getInteger(R.integer.config_mediumAnimTime);
        this.B = new DecelerateInterpolator();
        setOnSeekBarChangeListener(new a(this, 0));
    }

    public void setCurrentPosition(int i10) {
        setProgress(i10 * 100);
    }

    public void setTickMarkCount(int i10) {
        if (i10 < 2) {
            i10 = 2;
        }
        this.f6161d = i10;
        setMax((i10 - 1) * 100);
        this.f6162g = getMax() / (this.f6161d - 1);
    }

    public void setOnDiscreteSeekBarChangeListener(b bVar) {
    }
}
