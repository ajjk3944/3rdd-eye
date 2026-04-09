package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class el0 {

    /* renamed from: a, reason: collision with root package name */
    private final dl0 f26894a;

    public /* synthetic */ el0() {
        this(new dl0());
    }

    public final ArrayList a(JSONObject jsonObject) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("installedPackages");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                dl0 dl0Var = this.f26894a;
                kotlin.jvm.internal.l.c(jSONObject);
                dl0Var.getClass();
                if (!a91.a(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    throw new k61("Native Ad json has not required attributes");
                }
                String strA = y81.a(jSONObject, "jsonAsset", AppMeasurementSdk.ConditionalUserProperty.NAME, "jsonAttribute", AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strA == null || strA.length() == 0 || strA.equals("null")) {
                    throw new k61("Native Ad json has not required attributes");
                }
                int i10 = aa.f24578b;
                int iOptInt = jSONObject.optInt("minVersion", 0);
                if (iOptInt < 0) {
                    iOptInt = 0;
                }
                int i11 = Integer.MAX_VALUE;
                int iOptInt2 = jSONObject.optInt("maxVersion", Integer.MAX_VALUE);
                if (iOptInt2 >= 0) {
                    i11 = iOptInt2;
                }
                arrayList.add(new cl0(iOptInt, i11, strA));
            }
        }
        return arrayList;
    }

    public el0(dl0 installedPackageJsonParser) {
        kotlin.jvm.internal.l.f(installedPackageJsonParser, "installedPackageJsonParser");
        this.f26894a = installedPackageJsonParser;
    }
}
