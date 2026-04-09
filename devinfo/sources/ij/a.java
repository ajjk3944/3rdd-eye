package ij;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends x1 {

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f26004c;

    public a(View view) {
        super(view);
        this.f26004c = (FrameLayout) view;
    }

    public final void a(int i4) {
        FrameLayout frameLayout = this.f26004c;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i4;
            marginLayoutParams.bottomMargin = i4;
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }
}
