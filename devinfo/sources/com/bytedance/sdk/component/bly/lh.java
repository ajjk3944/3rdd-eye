package com.bytedance.sdk.component.bly;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.component.utils.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh implements View.OnTouchListener {
    private ViewConfiguration ouw;
    private int vt = -1;

    public abstract void ouw(View.OnTouchListener onTouchListener);

    public final boolean ouw(float f10, float f11, float f12, float f13, Context context) {
        char c9;
        if (this.ouw == null) {
            this.ouw = ViewConfiguration.get(context);
        }
        if (this.vt == -1) {
            this.vt = this.ouw.getScaledTouchSlop();
        }
        ko.ouw("arbitrage_click", "mTouchSlop is: ", Integer.valueOf(this.vt));
        if (Math.abs(f10 - f12) <= this.vt) {
            c9 = 1;
            if (Math.abs(f11 - f13) <= this.vt) {
                ko.ouw("arbitrage_click", "isClick", "upX: ", Float.valueOf(f10), " ,downX: ", Float.valueOf(f12), " ,upY: ", Float.valueOf(f11), "downY: ", Float.valueOf(f13));
                return true;
            }
        } else {
            c9 = 1;
        }
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f12);
        Float fValueOf3 = Float.valueOf(f11);
        Float fValueOf4 = Float.valueOf(f13);
        Object[] objArr = new Object[9];
        objArr[0] = "notClick";
        objArr[c9] = "upX: ";
        objArr[2] = fValueOf;
        objArr[3] = " ,downX: ";
        objArr[4] = fValueOf2;
        objArr[5] = " ,upY: ";
        objArr[6] = fValueOf3;
        objArr[7] = "downY: ";
        objArr[8] = fValueOf4;
        ko.ouw("arbitrage_click", objArr);
        return false;
    }
}
