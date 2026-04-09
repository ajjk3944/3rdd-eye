package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.d;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import ig.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DrmInfoCard extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21181b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21182a;

    public DrmInfoCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        super(context, attributeSet);
        if (isInEditMode()) {
            iE = getContext().getResources().getColor(R.color.colorPrimary);
        } else {
            f fVar = f.f21256b;
            iE = f.e();
        }
        this.f21182a = iE;
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        if (isInEditMode()) {
            return;
        }
        d.c(new h(this, 0));
    }

    public static View a(int i4, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            return layoutInflater.inflate(i4, viewGroup, false);
        } catch (RuntimeException e2) {
            if (!e2.getMessage().contains("not called Looper.prepare()")) {
                return null;
            }
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            return layoutInflater.inflate(i4, viewGroup, false);
        }
    }
}
