package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl implements osn<Float> {
    public static final ryl ouw = new ryl();

    private ryl() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ Float ouw(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(zih.vt(jsonReader) * f10);
    }
}
