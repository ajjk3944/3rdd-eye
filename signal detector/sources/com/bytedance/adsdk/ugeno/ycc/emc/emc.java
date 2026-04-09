package com.bytedance.adsdk.ugeno.ycc.emc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ycc.dg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class emc extends LinearLayout {
    private int bw;
    private List<View> dg;
    protected Context emc;
    private float gbl;
    private boolean msw;
    private float ru;
    private String sup;
    private int uym;
    protected int xq;
    private int ycc;
    protected int ypw;
    private int zz;

    public emc(Context context) {
        super(context);
        this.bw = -65536;
        this.ycc = -16776961;
        this.uym = 5;
        this.ypw = 40;
        this.xq = 20;
        this.sup = "row";
        this.emc = context;
        this.dg = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.gbl) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.ru) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.dg.size();
    }

    public void setIndicatorDirection(String str) {
        this.sup = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i) {
        this.xq = i;
    }

    public void setIndicatorWidth(int i) {
        this.ypw = i;
    }

    public void setIndicatorX(float f2) {
        this.ru = f2;
    }

    public void setIndicatorY(float f2) {
        this.gbl = f2;
    }

    public void setLoop(boolean z6) {
        this.msw = z6;
    }

    public void setSelectedColor(int i) {
        this.bw = i;
    }

    public void setUnSelectedColor(int i) {
        this.ycc = i;
    }

    public void xq() {
        this.dg.clear();
        removeAllViews();
    }

    public abstract Drawable ypw(int i);

    public void ypw() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof ypw) {
            this.xq = this.ypw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ypw, this.xq);
        if (getOrientation() == 1) {
            int i = this.uym;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        } else {
            int i3 = this.uym;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        addView(view, layoutParams);
        view.setBackground(ypw(this.ycc));
        this.dg.add(view);
    }

    public void emc(int i, int i3) {
        Iterator<View> it = this.dg.iterator();
        while (it.hasNext()) {
            it.next().setBackground(ypw(this.ycc));
        }
        if (i < 0 || i >= this.dg.size()) {
            i = 0;
        }
        if (this.dg.size() > 0) {
            this.dg.get(i).setBackground(ypw(this.bw));
            this.zz = i3;
        }
    }

    public void emc() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ycc.emc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                emc.this.dg();
            }
        });
    }

    public void emc(int i) {
        if (this instanceof ypw) {
            this.xq = this.ypw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ypw, this.xq);
        if (getOrientation() == 1) {
            int i3 = this.uym;
            layoutParams.topMargin = i3;
            layoutParams.bottomMargin = i3;
        } else {
            int i6 = this.uym;
            layoutParams.leftMargin = i6;
            layoutParams.rightMargin = i6;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.ypw, this.xq);
        if (getOrientation() == 1) {
            int i7 = this.uym;
            layoutParams2.topMargin = i7;
            layoutParams2.bottomMargin = i7;
        } else {
            int i8 = this.uym;
            layoutParams2.leftMargin = i8;
            layoutParams2.rightMargin = i8;
        }
        int iEmc = dg.emc(this.msw, this.zz, this.dg.size());
        int iEmc2 = dg.emc(this.msw, i, this.dg.size());
        if (this.dg.size() == 0) {
            iEmc2 = 0;
        }
        if (!this.dg.isEmpty() && dg.emc(iEmc, this.dg) && dg.emc(iEmc2, this.dg)) {
            this.dg.get(iEmc).setBackground(ypw(this.ycc));
            this.dg.get(iEmc).setLayoutParams(layoutParams2);
            this.dg.get(iEmc2).setBackground(ypw(this.bw));
            this.dg.get(iEmc2).setLayoutParams(layoutParams);
            this.zz = i;
        }
    }
}
