package io.appmetrica.analytics.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4738ka {

    /* renamed from: a, reason: collision with root package name */
    public final String f41136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41137b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41138c;

    public C4738ka(JSONObject jSONObject) {
        this.f41136a = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f41138c = jSONObject.getBoolean("required");
        this.f41137b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4738ka.class == obj.getClass()) {
            C4738ka c4738ka = (C4738ka) obj;
            if (this.f41137b != c4738ka.f41137b || this.f41138c != c4738ka.f41138c) {
                return false;
            }
            String str = this.f41136a;
            String str2 = c4738ka.f41136a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f41136a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f41137b) * 31) + (this.f41138c ? 1 : 0);
    }

    public C4738ka(String str, int i, boolean z10) {
        this.f41136a = str;
        this.f41137b = i;
        this.f41138c = z10;
    }
}
