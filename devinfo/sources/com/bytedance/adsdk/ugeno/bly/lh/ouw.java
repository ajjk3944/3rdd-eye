package com.bytedance.adsdk.ugeno.bly.lh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bly.yu.lh;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw extends lh {
    private int fn;

    public ouw(Context context) {
        super(context);
        this.fn = -16777216;
    }

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.fn = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh
    public final String pno() {
        return "drawable";
    }

    public abstract String ryl(String str);

    @Override // com.bytedance.adsdk.ugeno.bly.yu.lh, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException, NumberFormatException {
        String strRyl = ryl(((lh) this).ouw);
        ((lh) this).ouw = TextUtils.isEmpty(strRyl) ? "" : "local://".concat(String.valueOf(strRyl));
        super.vt();
        ((com.bytedance.adsdk.ugeno.bly.yu.ouw) this.fkw).setColorFilter(this.fn);
        ((com.bytedance.adsdk.ugeno.bly.yu.ouw) this.fkw).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
