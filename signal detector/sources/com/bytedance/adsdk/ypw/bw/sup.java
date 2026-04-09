package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;

/* loaded from: classes.dex */
public class sup implements wo<Float> {
    public static final sup emc = new sup();

    private sup() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public Float ypw(JsonReader jsonReader, float f2) {
        return Float.valueOf(yzg.ypw(jsonReader) * f2);
    }
}
