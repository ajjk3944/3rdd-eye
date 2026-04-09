package com.liuzho.lib.appinfo.provider;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.j;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21403a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21404b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21405c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21406d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f21407e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f21408f = new HashMap();

    public c(Context context) throws IOException {
        this.f21403a = context;
        try {
            List<NativeLibInfoProvider$LocalNativeLibInfo> list = (List) new j().b(new InputStreamReader(context.getAssets().open("appi_native_lib_data_assets.json")), new xf.a(new b().f37088b));
            if (list != null) {
                for (NativeLibInfoProvider$LocalNativeLibInfo nativeLibInfoProvider$LocalNativeLibInfo : list) {
                    if (nativeLibInfoProvider$LocalNativeLibInfo.isRegex) {
                        this.f21405c.add(nativeLibInfoProvider$LocalNativeLibInfo);
                    } else {
                        this.f21404b.put(nativeLibInfoProvider$LocalNativeLibInfo.name, nativeLibInfoProvider$LocalNativeLibInfo);
                    }
                    if (!TextUtils.isEmpty(nativeLibInfoProvider$LocalNativeLibInfo.icon)) {
                        this.f21406d.put(nativeLibInfoProvider$LocalNativeLibInfo.label, nativeLibInfoProvider$LocalNativeLibInfo.icon);
                    }
                    if (!TextUtils.isEmpty(nativeLibInfoProvider$LocalNativeLibInfo.website)) {
                        this.f21408f.put(nativeLibInfoProvider$LocalNativeLibInfo.label, nativeLibInfoProvider$LocalNativeLibInfo.website);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
