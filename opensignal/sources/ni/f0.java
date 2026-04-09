package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17812a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17813b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17814c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17815d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17816e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17817f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17818g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17819h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17820i;

    public f0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f17812a = z10;
        this.f17813b = z11;
        this.f17814c = z12;
        this.f17815d = z13;
        this.f17816e = z14;
        this.f17817f = z15;
        this.f17818g = z16;
        this.f17819h = z17;
        this.f17820i = z18;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("has_read_phone_state", this.f17812a);
        jSONObject.put("has_read_basic_phone_state", this.f17813b);
        jSONObject.put("has_fine_location", this.f17814c);
        jSONObject.put("has_coarse_location", this.f17815d);
        jSONObject.put("has_access_background_location", this.f17816e);
        jSONObject.put("has_access_wifi_state", this.f17817f);
        jSONObject.put("has_access_network_state", this.f17818g);
        jSONObject.put("has_receive_boot_completed", this.f17819h);
        jSONObject.put("has_request_ignore_battery_optimizations", this.f17820i);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f17812a == f0Var.f17812a && this.f17813b == f0Var.f17813b && this.f17814c == f0Var.f17814c && this.f17815d == f0Var.f17815d && this.f17816e == f0Var.f17816e && this.f17817f == f0Var.f17817f && this.f17818g == f0Var.f17818g && this.f17819h == f0Var.f17819h && this.f17820i == f0Var.f17820i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17820i) + w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(Boolean.hashCode(this.f17812a) * 31, this.f17813b, 31), this.f17814c, 31), this.f17815d, 31), this.f17816e, 31), this.f17817f, 31), this.f17818g, 31), this.f17819h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionCoreResult(hasReadPhoneState=");
        sb2.append(this.f17812a);
        sb2.append(", hasReadBasicPhoneState=");
        sb2.append(this.f17813b);
        sb2.append(", hasFineLocation=");
        sb2.append(this.f17814c);
        sb2.append(", hasCoarseLocation=");
        sb2.append(this.f17815d);
        sb2.append(", hasAccessBackgroundLocation=");
        sb2.append(this.f17816e);
        sb2.append(", hasAccessWifiState=");
        sb2.append(this.f17817f);
        sb2.append(", hasAccessNetworkState=");
        sb2.append(this.f17818g);
        sb2.append(", hasReceiveBootCompleted=");
        sb2.append(this.f17819h);
        sb2.append(", hasIgnoreBatteryOptimizations=");
        return c7.a.r(sb2, this.f17820i, ')');
    }
}
