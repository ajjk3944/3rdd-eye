package com.liuzho.lib.appinfo.provider;

import android.content.Context;
import com.google.gson.j;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21409a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21410b;

    public e(Context context) throws IOException {
        this.f21410b = context;
        try {
            this.f21409a = (Map) new j().b(new InputStreamReader(context.getAssets().open("appi_permission_data_assets.json")), new xf.a(new d().f37088b));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
