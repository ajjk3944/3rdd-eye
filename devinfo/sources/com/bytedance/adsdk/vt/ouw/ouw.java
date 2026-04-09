package com.bytedance.adsdk.vt.ouw;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.vt.le.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends Paint {
    public ouw() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(ra.ouw(i4));
        } else {
            setColor((ra.ouw(i4) << 24) | (getColor() & 16777215));
        }
    }

    public ouw(int i4) {
        super(i4);
    }

    public ouw(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ouw(PorterDuff.Mode mode, byte b10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
