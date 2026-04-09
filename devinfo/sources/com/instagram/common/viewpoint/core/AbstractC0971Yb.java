package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0971Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f10, int i4);

    public abstract void A0D(C0694Na c0694Na, boolean z3);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC0970Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z3);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr);

    public abstract void setFullscreen(boolean z3);

    public abstract void setPageDetails(C0706Nm c0706Nm, String str, int i4, C0712Ns c0712Ns);

    public abstract void setPageDetailsVisible(boolean z3);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z3);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i4);

    public abstract void setToolbarListener(InterfaceC0970Ya interfaceC0970Ya);

    public AbstractC0971Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
