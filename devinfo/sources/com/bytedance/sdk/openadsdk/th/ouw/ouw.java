package com.bytedance.sdk.openadsdk.th.ouw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.th.ouw.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0113ouw {
        void ouw();

        void ouw(vt vtVar);

        void vt();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.th.ouw ouwVar, final InterfaceC0113ouw interfaceC0113ouw, int i4, int i10, ImageView.ScaleType scaleType, String str, final int i11, vpp vppVar) {
        tlj tljVarOuw = yu.ouw.ouw(yu.ouw.vt.ouw(ouwVar.ouw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).ouw(ouwVar.vt).ouw(i4).vt(i10).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).vt(str).ouw(scaleType).ouw(!TextUtils.isEmpty(str));
        if (i11 <= 0 || Build.VERSION.SDK_INT < 26) {
            tljVarOuw.lh(1);
        } else {
            tljVarOuw.lh(2).ouw(new pno() { // from class: com.bytedance.sdk.openadsdk.th.ouw.ouw.1
                @Override // com.bytedance.sdk.component.fkw.pno
                public final Bitmap ouw(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(zih.ouw(), bitmap, i11);
                }
            });
        }
        tljVarOuw.vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, ouwVar.ouw, new rn() { // from class: com.bytedance.sdk.openadsdk.th.ouw.ouw.2
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(cf cfVar) {
                ouw.this.ouw(cfVar, interfaceC0113ouw);
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i12, String str2, Throwable th2) {
                InterfaceC0113ouw interfaceC0113ouw2 = interfaceC0113ouw;
                if (interfaceC0113ouw2 != null) {
                    interfaceC0113ouw2.ouw();
                }
            }
        }));
    }

    public void ouw(cf cfVar, InterfaceC0113ouw interfaceC0113ouw) {
        Object obj;
        if (interfaceC0113ouw != null) {
            Object objVt = cfVar.vt();
            Map<String, String> mapYu = cfVar.yu();
            int iIntValue = (mapYu == null || (obj = mapYu.get("image_size")) == null || !(obj instanceof Integer)) ? 0 : ((Integer) obj).intValue();
            if (objVt instanceof Drawable) {
                cfVar.ouw();
                interfaceC0113ouw.ouw(new vt((Drawable) objVt, iIntValue));
            } else if (objVt instanceof byte[]) {
                cfVar.ouw();
                interfaceC0113ouw.ouw(new vt((byte[]) objVt, iIntValue));
            } else if (objVt instanceof Bitmap) {
                Bitmap bitmap = cfVar.lh() instanceof Bitmap ? (Bitmap) cfVar.lh() : null;
                cfVar.ouw();
                interfaceC0113ouw.ouw(new vt((Bitmap) objVt, bitmap, iIntValue));
            } else {
                interfaceC0113ouw.ouw();
            }
        }
        if (interfaceC0113ouw != null) {
            interfaceC0113ouw.vt();
        }
    }
}
