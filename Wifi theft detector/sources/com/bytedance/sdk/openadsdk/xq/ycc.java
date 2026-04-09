package com.bytedance.sdk.openadsdk.xq;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ycc extends ScrollView {
    private final ru emc;
    private final com.bytedance.sdk.openadsdk.core.ycc.bw ypw;

    public ycc(Context context, ru ruVar) {
        super(context);
        this.emc = ruVar;
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        this.ypw = bwVar;
        bwVar.setOrientation(1);
        addView(bwVar, new FrameLayout.LayoutParams(-1, -2));
        if (ruVar.msw() == 0) {
            emc();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void emc() {
        if (this.emc.msw() != 0) {
            return;
        }
        this.emc.emc(vw.xq(getContext()), vw.bw(getContext()));
    }

    private static List<FilterWord> xq(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    private void ypw(List<FilterWord> list) {
        this.ypw.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.ypw.addView(new uym(getContext(), filterWord, this.emc));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iYpw = vw.ypw(getContext(), this.emc.zz() ? 16.0f : 8.0f);
                layoutParams.topMargin = iYpw;
                layoutParams.bottomMargin = iYpw;
                this.ypw.addView(new gbl(getContext()), layoutParams);
            }
        }
    }

    public void emc(List<FilterWord> list) {
        List<FilterWord> listXq = xq(list);
        if (listXq == null) {
            return;
        }
        ypw(listXq);
    }
}
