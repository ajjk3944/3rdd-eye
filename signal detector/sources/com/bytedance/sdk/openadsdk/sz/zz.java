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

    public void emc(boolean z6) {
        emc(z6, false);
    }

    public void emc(boolean z6, boolean z7) {
        if (this.emc == null) {
            return;
        }
        int i = 0;
        if (z6) {
            int iUym = DeviceUtils.uym();
            if (iUym != 0) {
                this.ypw = iUym;
            } else if (!z7) {
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
                if (!z7) {
                    return;
                } else {
                    iZz = DeviceUtils.zz() / 15;
                }
            }
            this.ypw = -1;
            emc(3, iZz, i);
            this.xq = true;
        }
        i = 1;
        this.ypw = -1;
        emc(3, iZz, i);
        this.xq = true;
    }

    private void emc(int i, int i3, int i6) {
        try {
            this.emc.setStreamVolume(i, i3, i6);
        } catch (Throwable unused) {
        }
    }
}
