package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.yzg.emc.emc;
import java.util.Objects;

/* loaded from: classes.dex */
public class aa {

    public interface emc {
        void emc();

        void emc(com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar);
    }

    public static void emc(com.bytedance.sdk.openadsdk.yzg.emc emcVar, int i10, int i11, emc emcVar2, String str) {
        emc(emcVar, i10, i11, emcVar2, str, 0);
    }

    public static void emc(com.bytedance.sdk.openadsdk.yzg.emc emcVar, int i10, int i11, final emc emcVar2, String str, int i12) {
        Objects.toString(emcVar);
        com.bytedance.sdk.openadsdk.yzg.ypw.ypw().dg().emc(emcVar, new emc.InterfaceC0191emc() { // from class: com.bytedance.sdk.openadsdk.utils.aa.1
            @Override // com.bytedance.sdk.openadsdk.yzg.emc.emc.InterfaceC0191emc
            public void emc(String str2, com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) {
                emc emcVar3;
                if (ypwVar.bw() && (emcVar3 = emcVar2) != null) {
                    emcVar3.emc(ypwVar);
                    return;
                }
                emc emcVar4 = emcVar2;
                if (emcVar4 != null) {
                    emcVar4.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.yzg.emc.emc.InterfaceC0191emc
            public void emc(int i13, String str2, Throwable th) {
                emc emcVar3 = emcVar2;
                if (emcVar3 != null) {
                    emcVar3.emc();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable emc(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
