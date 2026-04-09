package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn implements osn<Integer> {
    public static final rn ouw = new rn();

    private rn() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ Integer ouw(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(zih.vt(jsonReader) * f10));
    }
}
