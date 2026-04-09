package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import uc.i;

/* loaded from: classes.dex */
public class MapView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final i f5336a;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5336a = new i(this, context, GoogleMapOptions.d(context, attributeSet));
        setClickable(true);
    }
}
