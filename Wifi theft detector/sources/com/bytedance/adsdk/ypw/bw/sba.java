package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class sba implements wo<Integer> {
    public static final sba emc = new sba();

    private sba() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public Integer ypw(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(yzg.ypw(jsonReader) * f10));
    }
}
