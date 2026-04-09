package com.bytedance.sdk.openadsdk.sz;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class zz {
    private final AudioManager emc;
    private int ypw = -1;
    private boolean xq = false;

    public zz(Context context) {
        this.emc = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int emc() {
        return this.ypw;
    }

    public void emc(boolean z10) {
        emc(z10, false);
    }

    public void emc(boolean z10, boolean z11) {
        if (this.emc == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iUym = DeviceUtils.uym();
            if (iUym != 0) {
                this.ypw = iUym;
            } else if (!z11) {
                return;
            }
            emc(3, 0, 0);
            this.xq = true;
            return;
        }
        int iZz = this.ypw;
        if (iZz == 0) {
            iZz = DeviceUtils.zz() / 15;
        } else {
            if (iZz == -1) {
                if (!z11) {
                    return;
                } else {
                    iZz = DeviceUtils.zz() / 15;
                }
            }
            this.ypw = -1;
            emc(3, iZz, i10);
            this.xq = true;
        }
        i10 = 1;
        this.ypw = -1;
        emc(3, iZz, i10);
        this.xq = true;
    }

    private void emc(int i10, int i11, int i12) {
        try {
            this.emc.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
