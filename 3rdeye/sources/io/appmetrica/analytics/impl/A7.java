package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class A7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39081b;

    /* renamed from: c, reason: collision with root package name */
    public final C4711j9 f39082c;

    /* renamed from: d, reason: collision with root package name */
    public final P8 f39083d;

    /* renamed from: e, reason: collision with root package name */
    public final C4625g0 f39084e;

    /* renamed from: f, reason: collision with root package name */
    public final Z8 f39085f;

    /* renamed from: g, reason: collision with root package name */
    public final D7 f39086g;

    /* renamed from: h, reason: collision with root package name */
    public final C4683i6 f39087h;

    public A7(Context context, Rk rk, int i, C4711j9 c4711j9, P8 p82, C4625g0 c4625g0, Z8 z82, D7 d72) {
        this.f39080a = context;
        this.f39081b = i;
        this.f39082c = c4711j9;
        this.f39083d = p82;
        this.f39084e = c4625g0;
        this.f39085f = z82;
        this.f39086g = d72;
        this.f39087h = p82.f39965a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        C4699in c4699inA = Ga.f39501F.A();
        C5118z7 c5118z7 = new C5118z7(wVar);
        synchronized (c4699inA) {
            c4699inA.f41094b.a(c5118z7);
        }
        return (String) wVar.f43660b;
    }

    public final C5043w7 a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        Bo bo;
        Integer numValueOf = Integer.valueOf(this.f39087h.f41048e);
        String name = this.f39087h.getName();
        String value = this.f39087h.getValue();
        C4711j9 c4711j9 = this.f39082c;
        int i = this.f39081b;
        C4933ro c4933ro = c4711j9.f41111a.f41135a;
        synchronized (c4933ro) {
            jSONObjectOptJSONObject = c4933ro.f41594a.a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i)) : 0L;
        c4711j9.f41111a.a(i, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        D7 d72 = this.f39086g;
        d72.getClass();
        InterfaceC4560dc interfaceC4560dcL = Ga.f39501F.l();
        Location userLocation = interfaceC4560dcL.getUserLocation();
        if (userLocation != null) {
            int i10 = Bo.f39212b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            bo = new Bo(location, provider);
        } else {
            Location systemLocation = interfaceC4560dcL.getSystemLocation();
            bo = systemLocation != null ? new Bo(new Location(systemLocation), "") : null;
        }
        boolean z10 = d72.f39289a.f41861d;
        Double dValueOf = bo != null ? Double.valueOf(bo.getLatitude()) : null;
        Double dValueOf2 = bo != null ? Double.valueOf(bo.getLongitude()) : null;
        Long lValueOf2 = bo != null ? Long.valueOf(bo.getTime()) : null;
        Integer numValueOf2 = bo != null ? Integer.valueOf((int) bo.getAccuracy()) : null;
        Integer numValueOf3 = bo != null ? Integer.valueOf((int) bo.getBearing()) : null;
        Integer numValueOf4 = bo != null ? Integer.valueOf((int) bo.getSpeed()) : null;
        B7 b72 = new B7(Boolean.valueOf(z10), dValueOf2, dValueOf, bo != null ? Integer.valueOf((int) bo.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, bo != null ? bo.getProvider() : null, bo != null ? bo.f39213a : null);
        String str = this.f39087h.f41046c;
        C4625g0 c4625g0 = this.f39084e;
        String str2 = c4625g0.f40909a;
        Long lValueOf3 = Long.valueOf(c4625g0.f40910b);
        Integer numValueOf5 = Integer.valueOf(this.f39087h.f41050g);
        Context context = this.f39080a;
        SafePackageManager safePackageManager = Se.f40106a;
        Integer num = (Integer) Se.f40109d.a((Re) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Re.UNDEFINED, new Qe()));
        num.intValue();
        String strB = b();
        Y8 y82 = this.f39083d.f39966b;
        C4683i6 c4683i6 = this.f39087h;
        return new C5043w7(numValueOf, name, value, lValueOf, b72, str, str2, lValueOf3, numValueOf5, num, strB, y82, c4683i6.f41051h, c4683i6.f41053k, c4683i6.f41054l, c4683i6.f41056n, c4683i6.f41057o, this.f39085f.fromModel(c4683i6.f41058p));
    }

    public /* synthetic */ A7(Context context, Rk rk, int i, C4711j9 c4711j9, P8 p82, C5028vh c5028vh, C4625g0 c4625g0) {
        this(context, rk, i, c4711j9, p82, c4625g0, new Z8(), new D7(c5028vh));
    }
}
