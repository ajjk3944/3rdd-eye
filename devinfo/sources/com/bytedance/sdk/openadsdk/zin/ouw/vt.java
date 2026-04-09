package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.mwh.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.zin.pno;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw {
    public FrameLayout qbp;

    /* renamed from: th, reason: collision with root package name */
    public final FrameLayout f8876th;
    public le vm;
    public volatile boolean zih;
    public String zin;

    public vt(Context context, vpp vppVar, int i4, FrameLayout frameLayout, String str) {
        super(context, vppVar, i4, true, frameLayout);
        this.f8876th = frameLayout;
        this.zin = str;
        pno pnoVar = this.ra;
        if (pnoVar != null) {
            pnoVar.coz = false;
        }
        int iYu = osn.yu(context);
        int iLe = osn.le(context);
        if (i4 == 1) {
            if (iYu <= iLe) {
                this.f8872lh.layout(0, 0, iYu, iLe);
                return;
            }
        } else {
            if (i4 != 2) {
                return;
            }
            if (iYu > iLe) {
                this.f8872lh.layout(0, 0, iYu, iLe);
                return;
            }
        }
        this.f8872lh.layout(0, 0, iLe, iYu);
    }

    public final void le() {
        ouw(true, new le() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.vt.1
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                vt vtVar = vt.this;
                le leVar = vtVar.vm;
                if (leVar != null) {
                    leVar.ouw();
                } else {
                    vtVar.zih = true;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw
    public final void ouw() throws JSONException {
        ko.vt("PlayablePreManager", "showPlayable");
        this.qbp.setVisibility(0);
        super.ouw();
    }
}
