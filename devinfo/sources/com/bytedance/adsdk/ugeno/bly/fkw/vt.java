package com.bytedance.adsdk.ugeno.bly.fkw;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.adsdk.ugeno.vt.lh;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh<ouw> {
    private static final int byv = Color.parseColor("#FFC642");
    private static final int ehk = Color.parseColor("#e3e3e4");
    private float fn;
    private int ln;
    private int ouw;
    private float qni;
    private float smu;

    public vt(Context context) {
        super(context);
        this.ouw = byv;
        this.ln = ehk;
        this.qni = 4.0f;
        this.smu = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.ouw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ehk);
                break;
            case "gap":
                this.fn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "size":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 20.0f);
                break;
            case "score":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 4.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        super.vt();
        if (ex()) {
            ((ouw) this.fkw).ouw(this.qni, this.ouw, this.ln, this.smu, (int) this.fn);
        } else {
            ((ouw) this.fkw).ouw(this.qni, this.ouw, this.ln, this.smu, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.ouw = this;
        return ouwVar;
    }
}
