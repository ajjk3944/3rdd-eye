package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ScrollView {
    private final tlj ouw;
    private final com.bytedance.sdk.openadsdk.core.le.fkw vt;

    public le(Context context, tlj tljVar) {
        super(context);
        this.ouw = tljVar;
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        this.vt = fkwVar;
        fkwVar.setOrientation(1);
        addView(fkwVar, new FrameLayout.LayoutParams(-1, -2));
        int i4 = tljVar.zih;
        if (i4 == 0 && i4 == 0) {
            tljVar.ouw(osn.yu(getContext()), osn.le(getContext()));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    public final void ouw(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        } else {
            int i4 = -1;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).hasSecondOptions()) {
                    i4 = i10;
                }
            }
            if (i4 == -1 || i4 > list.size()) {
                i4 = 0;
            }
            FilterWord filterWord = list.get(i4);
            Iterator<FilterWord> it = list.iterator();
            while (it.hasNext()) {
                FilterWord next = it.next();
                if (!next.hasSecondOptions()) {
                    filterWord.addOption(next);
                    it.remove();
                }
            }
        }
        if (list == null) {
            return;
        }
        this.vt.removeAllViews();
        for (int i11 = 0; i11 < list.size(); i11++) {
            FilterWord filterWord2 = list.get(i11);
            if (filterWord2 != null) {
                this.vt.addView(new ra(getContext(), filterWord2, this.ouw));
            }
            if (i11 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iOuw = osn.ouw(getContext(), this.ouw.fkw() ? 16.0f : 8.0f);
                layoutParams.topMargin = iOuw;
                layoutParams.bottomMargin = iOuw;
                this.vt.addView(new cf(getContext()), layoutParams);
            }
        }
    }
}
