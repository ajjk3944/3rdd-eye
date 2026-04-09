package com.bytedance.adsdk.ugeno.le.ouw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.le.yu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw extends LinearLayout {
    private boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    private float f6901cf;
    protected int fkw;

    /* renamed from: le, reason: collision with root package name */
    protected int f6902le;

    /* renamed from: lh, reason: collision with root package name */
    public int f6903lh;
    public List<View> ouw;
    private int pno;
    public int ra;
    private String ryl;
    private float tlj;
    public int vt;
    protected Context yu;

    public ouw(Context context) {
        super(context);
        this.vt = -65536;
        this.f6903lh = -16776961;
        this.pno = 5;
        this.fkw = 40;
        this.f6902le = 20;
        this.ryl = "row";
        this.yu = context;
        this.ouw = new ArrayList();
        setOrientation(0);
    }

    public int getSize() {
        return this.ouw.size();
    }

    public final void ouw(int i4) {
        if (this instanceof vt) {
            this.f6902le = this.fkw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fkw, this.f6902le);
        if (getOrientation() == 1) {
            int i10 = this.pno;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.pno;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.fkw, this.f6902le);
        if (getOrientation() == 1) {
            int i12 = this.pno;
            layoutParams2.topMargin = i12;
            layoutParams2.bottomMargin = i12;
        } else {
            int i13 = this.pno;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i13;
        }
        int iOuw = yu.ouw(this.bly, this.ra, this.ouw.size());
        int iOuw2 = yu.ouw(this.bly, i4, this.ouw.size());
        if (this.ouw.size() == 0) {
            iOuw2 = 0;
        }
        if (!this.ouw.isEmpty() && yu.ouw(iOuw, this.ouw) && yu.ouw(iOuw2, this.ouw)) {
            this.ouw.get(iOuw).setBackground(vt(this.f6903lh));
            this.ouw.get(iOuw).setLayoutParams(layoutParams2);
            this.ouw.get(iOuw2).setBackground(vt(this.vt));
            this.ouw.get(iOuw2).setLayoutParams(layoutParams);
            this.ra = i4;
        }
    }

    public void setIndicatorDirection(String str) {
        this.ryl = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i4) {
        this.f6902le = i4;
    }

    public void setIndicatorWidth(int i4) {
        this.fkw = i4;
    }

    public void setIndicatorX(float f10) {
        this.tlj = f10;
    }

    public void setIndicatorY(float f10) {
        this.f6901cf = f10;
    }

    public void setLoop(boolean z3) {
        this.bly = z3;
    }

    public void setSelectedColor(int i4) {
        this.vt = i4;
    }

    public void setUnSelectedColor(int i4) {
        this.f6903lh = i4;
    }

    public abstract Drawable vt(int i4);

    public final void ouw() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof vt) {
            this.f6902le = this.fkw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fkw, this.f6902le);
        if (getOrientation() == 1) {
            int i4 = this.pno;
            layoutParams.topMargin = i4;
            layoutParams.bottomMargin = i4;
        } else {
            int i10 = this.pno;
            layoutParams.leftMargin = i10;
            layoutParams.rightMargin = i10;
        }
        addView(view, layoutParams);
        view.setBackground(vt(this.f6903lh));
        this.ouw.add(view);
    }

    public static /* synthetic */ void ouw(ouw ouwVar) {
        FrameLayout frameLayout = (FrameLayout) ouwVar.getParent();
        if (frameLayout != null) {
            float width = frameLayout.getWidth();
            float height = frameLayout.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ouwVar.getLayoutParams();
            float width2 = ouwVar.getWidth();
            layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((ouwVar.getHeight() * ouwVar.f6901cf) / 100.0f));
            layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * ouwVar.tlj) / 100.0f));
            ouwVar.setLayoutParams(layoutParams);
        }
    }
}
