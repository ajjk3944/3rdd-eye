package com.liuzh.deviceinfo.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import dj.b;
import j$.util.Objects;
import zf.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class PercentCard extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final TextView f21194q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f21195r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f21196s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f21197t;

    /* renamed from: u, reason: collision with root package name */
    public final ProgressBar f21198u;

    public PercentCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iA;
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.card_percent, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f21194q = (TextView) findViewById(R.id.percent);
        this.f21195r = (TextView) findViewById(R.id.summary);
        this.f21196s = (TextView) findViewById(R.id.title);
        this.f21198u = (ProgressBar) findViewById(R.id.progress);
        this.f21197t = (TextView) findViewById(R.id.short_info);
        this.f21198u.setMax(100);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f38277e);
        this.f21196s.setText(typedArrayObtainStyledAttributes.getText(1));
        LayerDrawable layerDrawable = (LayerDrawable) getContext().getDrawable(typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.ic_storage));
        Objects.requireNonNull(layerDrawable);
        ((ImageView) findViewById(R.id.icon)).setImageDrawable(layerDrawable);
        if (!isInEditMode()) {
            f fVar = f.f21256b;
            d.r(layerDrawable, f.e());
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            iA = getContext().getResources().getColor(R.color.colorAccent);
        } else {
            f fVar2 = f.f21256b;
            iA = f.a();
        }
        b.i(this.f21198u, iA);
    }

    @SuppressLint({"SetTextI18n"})
    public void setPercent(float f10) {
        int i4 = (int) (f10 * 100.0f);
        this.f21194q.setText(i4 + "%");
        this.f21198u.setProgress(i4);
    }

    public void setProgressIndeterminate(boolean z3) {
        this.f21198u.setIndeterminate(z3);
    }

    public void setShortInfo(String str) {
        this.f21197t.setText(str);
        this.f21197t.setVisibility(0);
    }

    public void setSummary(CharSequence charSequence) {
        this.f21195r.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f21196s.setText(charSequence);
    }

    public void setTitle(int i4) {
        this.f21196s.setText(i4);
    }
}
