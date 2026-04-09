package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f18057a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f18058b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f18059c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f18060d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f18061e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f18062f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f18063g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f18064h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18065i;
    public final Boolean j;

    public n0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Boolean bool9) {
        this.f18057a = bool;
        this.f18058b = bool2;
        this.f18059c = bool3;
        this.f18060d = bool4;
        this.f18061e = bool5;
        this.f18062f = bool6;
        this.f18063g = bool7;
        this.f18064h = bool8;
        this.f18065i = num;
        this.j = bool9;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "foreground_app_process", this.f18057a);
        xu.d.Y(jSONObject, "is_device_idle", this.f18058b);
        xu.d.Y(jSONObject, "is_device_light_idle", this.f18059c);
        xu.d.Y(jSONObject, "is_exempt_from_low_power_standby", this.f18060d);
        xu.d.Y(jSONObject, "is_allowed_in_low_power_standby_reason_tpsa", this.f18061e);
        xu.d.Y(jSONObject, "is_low_power_standby_enabled", this.f18062f);
        xu.d.Y(jSONObject, "is_power_save_mode", this.f18063g);
        xu.d.Y(jSONObject, "is_app_inactive", this.f18064h);
        xu.d.Y(jSONObject, "app_standby_bucket", this.f18065i);
        xu.d.Y(jSONObject, "is_ignoring_battery_optimizations", this.j);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return br.l.a(this.f18057a, n0Var.f18057a) && br.l.a(this.f18058b, n0Var.f18058b) && br.l.a(this.f18059c, n0Var.f18059c) && br.l.a(this.f18060d, n0Var.f18060d) && br.l.a(this.f18061e, n0Var.f18061e) && br.l.a(this.f18062f, n0Var.f18062f) && br.l.a(this.f18063g, n0Var.f18063g) && br.l.a(this.f18064h, n0Var.f18064h) && br.l.a(this.f18065i, n0Var.f18065i) && br.l.a(this.j, n0Var.j);
    }

    public final int hashCode() {
        Boolean bool = this.f18057a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f18058b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f18059c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f18060d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f18061e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f18062f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f18063g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f18064h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num = this.f18065i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool9 = this.j;
        return iHashCode9 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public final String toString() {
        return "SystemStatusCoreResult(appProcessStatus=" + this.f18057a + ", isDeviceIdleMode=" + this.f18058b + ", isDeviceLightIdleMode=" + this.f18059c + ", isExemptFromLowPowerStandby=" + this.f18060d + ", isAllowedInLowPowerStandbyReasonTpsa=" + this.f18061e + ", isLowPowerStandbyEnabled=" + this.f18062f + ", isPowerSaveMode=" + this.f18063g + ", isAppInactive=" + this.f18064h + ", getAppStandbyBucket=" + this.f18065i + ", isIgnoringBatteryOptimizations=" + this.j + ')';
    }
}
