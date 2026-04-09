package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.f23;
import defpackage.of3;
import defpackage.xc0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    public xc0 f;
    public boolean g;
    public f23 h;
    public ImageView.ScaleType i;
    public boolean j;
    public of3 k;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public xc0 getMediaContent() {
        return this.f;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.j = true;
        this.i = scaleType;
        of3 of3Var = this.k;
        if (of3Var != null) {
            of3Var.g(scaleType);
        }
    }

    public void setMediaContent(xc0 xc0Var) {
        this.g = true;
        this.f = xc0Var;
        f23 f23Var = this.h;
        if (f23Var != null) {
            f23Var.k(xc0Var);
        }
    }
}
