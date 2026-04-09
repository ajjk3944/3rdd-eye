package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends LinearLayout {

    /* renamed from: lh, reason: collision with root package name */
    private final tlj f8579lh;
    private final FilterWord ouw;
    private pno vt;

    public ra(Context context, FilterWord filterWord, tlj tljVar) {
        super(context);
        setOrientation(1);
        this.ouw = filterWord;
        this.f8579lh = tljVar;
        String name = filterWord.getName();
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = osn.ouw(getContext(), 12.0f);
        layoutParams.gravity = 17;
        pnoVar.setGravity(17);
        pnoVar.setText(name);
        pnoVar.setTextColor(Color.argb(85, 22, 24, 35));
        pnoVar.setTextSize(tljVar.fkw() ? 14 : 10);
        addView(pnoVar, layoutParams);
        this.vt = new pno(getContext(), tljVar);
        new LinearLayout.LayoutParams(-1, -2);
        this.vt.ouw(filterWord.getOptions());
        addView(this.vt);
    }
}
