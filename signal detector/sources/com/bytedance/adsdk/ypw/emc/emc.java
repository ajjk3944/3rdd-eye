package com.bytedance.adsdk.ypw.emc;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.ypw.ycc.bw;

/* loaded from: classes.dex */
public class emc extends Paint {
    public emc() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(bw.emc(i, 0, 255));
        } else {
            setColor((bw.emc(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public emc(int i) {
        super(i);
    }

    public emc(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public emc(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
