package com.bytedance.adsdk.ugeno.bly.ra;

import android.content.Context;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.bly.vt.ouw> {
    public ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                vt(str, str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public void vt() throws JSONException {
        super.vt();
    }
}
