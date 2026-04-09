package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17621a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17622b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17623c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17624d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17625e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17626f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17627g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17628h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f17629i;
    public final Long j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f17630l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f17631m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f17632n;

    public a(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Boolean bool, Long l10, Long l11, Long l12, Long l13, Integer num8) {
        this.f17621a = num;
        this.f17622b = num2;
        this.f17623c = num3;
        this.f17624d = num4;
        this.f17625e = str;
        this.f17626f = num5;
        this.f17627g = num6;
        this.f17628h = num7;
        this.f17629i = bool;
        this.j = l10;
        this.k = l11;
        this.f17630l = l12;
        this.f17631m = l13;
        this.f17632n = num8;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("current_battery_level", this.f17621a);
        jSONObject.put("current_battery_scale", this.f17622b);
        jSONObject.put("current_battery_plugged", this.f17623c);
        jSONObject.put("current_battery_status", this.f17624d);
        jSONObject.put("current_battery_technology", this.f17625e);
        jSONObject.put("current_battery_temperature", this.f17626f);
        jSONObject.put("current_battery_health", this.f17627g);
        jSONObject.put("current_battery_voltage", this.f17628h);
        jSONObject.put("current_battery_present", this.f17629i);
        jSONObject.put("battery_current_average", this.j);
        jSONObject.put("battery_current_now", this.k);
        jSONObject.put("battery_charge_counter", this.f17630l);
        jSONObject.put("battery_energy_counter", this.f17631m);
        jSONObject.put("battery_charging_cycle_count", this.f17632n);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f17621a, aVar.f17621a) && br.l.a(this.f17622b, aVar.f17622b) && br.l.a(this.f17623c, aVar.f17623c) && br.l.a(this.f17624d, aVar.f17624d) && br.l.a(this.f17625e, aVar.f17625e) && br.l.a(this.f17626f, aVar.f17626f) && br.l.a(this.f17627g, aVar.f17627g) && br.l.a(this.f17628h, aVar.f17628h) && br.l.a(this.f17629i, aVar.f17629i) && br.l.a(this.j, aVar.j) && br.l.a(this.k, aVar.k) && br.l.a(this.f17630l, aVar.f17630l) && br.l.a(this.f17631m, aVar.f17631m) && br.l.a(this.f17632n, aVar.f17632n);
    }

    public final int hashCode() {
        Integer num = this.f17621a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17622b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17623c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17624d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f17625e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f17626f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17627g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17628h;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.f17629i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this.j;
        int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.k;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f17630l;
        int iHashCode12 = (iHashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f17631m;
        int iHashCode13 = (iHashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num8 = this.f17632n;
        return iHashCode13 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BatteryStatusCoreResult(currentBatteryLevel=");
        sb2.append(this.f17621a);
        sb2.append(", maximumBatteryLevelScale=");
        sb2.append(this.f17622b);
        sb2.append(", devicePlugged=");
        sb2.append(this.f17623c);
        sb2.append(", currentBatteryStatus=");
        sb2.append(this.f17624d);
        sb2.append(", currentBatteryTechnology=");
        sb2.append(this.f17625e);
        sb2.append(", currentBatteryTemperature=");
        sb2.append(this.f17626f);
        sb2.append(", currentBatteryHealth=");
        sb2.append(this.f17627g);
        sb2.append(", currentBatteryVoltage=");
        sb2.append(this.f17628h);
        sb2.append(", currentBatteryPresent=");
        sb2.append(this.f17629i);
        sb2.append(", batteryCurrentAverage=");
        sb2.append(this.j);
        sb2.append(", batteryCurrentNow=");
        sb2.append(this.k);
        sb2.append(", batteryChargeCounter=");
        sb2.append(this.f17630l);
        sb2.append(", batteryEnergyCounter=");
        sb2.append(this.f17631m);
        sb2.append(", batteryChargingCycleCount=");
        return w.g.i(sb2, this.f17632n, ')');
    }
}
