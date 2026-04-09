package zc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27273a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f27274d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d2 f27275g;

    public /* synthetic */ y1(d2 d2Var, Bundle bundle, int i10) {
        this.f27273a = i10;
        this.f27274d = bundle;
        this.f27275g = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Bundle bundle;
        switch (this.f27273a) {
            case 0:
                d2 d2Var = this.f27275g;
                d2Var.s1();
                d2Var.t1();
                Bundle bundle2 = this.f27274d;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                cc.s.e(string);
                cc.s.e(string2);
                cc.s.h(bundle2.get("value"));
                c1 c1Var = (c1) d2Var.f1504d;
                if (!c1Var.a()) {
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.K.b("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar = new zzpl(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        s3 s3Var = c1Var.E;
                        c1.e(s3Var);
                        bundle2.getString("app_id");
                        zzbg zzbgVarU1 = s3Var.U1(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        c1.e(s3Var);
                        bundle2.getString("app_id");
                        zzbg zzbgVarU12 = s3Var.U1(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        c1Var.j().L1(new zzah(bundle2.getString("app_id"), string2, zzplVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), zzbgVarU12, bundle2.getLong("trigger_timeout"), zzbgVarU1, bundle2.getLong("time_to_live"), s3Var.U1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                d2 d2Var2 = this.f27275g;
                d2Var2.s1();
                d2Var2.t1();
                Bundle bundle3 = this.f27274d;
                String string3 = bundle3.getString("name");
                cc.s.e(string3);
                c1 c1Var2 = (c1) d2Var2.f1504d;
                if (!c1Var2.a()) {
                    j0 j0Var2 = c1Var2.f26889y;
                    c1.g(j0Var2);
                    j0Var2.K.b("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar2 = new zzpl(0L, null, string3, "");
                    try {
                        s3 s3Var2 = c1Var2.E;
                        c1.e(s3Var2);
                        bundle3.getString("app_id");
                        c1Var2.j().L1(new zzah(bundle3.getString("app_id"), "", zzplVar2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), s3Var2.U1(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                d2 d2Var3 = this.f27275g;
                y9.u uVar = d2Var3.T;
                c1 c1Var3 = (c1) d2Var3.f1504d;
                Bundle bundle4 = this.f27274d;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    r0 r0Var = c1Var3.f26888x;
                    s3 s3Var3 = c1Var3.E;
                    f fVar = c1Var3.f26887r;
                    j0 j0Var3 = c1Var3.f26889y;
                    c1.e(r0Var);
                    bundle = new Bundle(r0Var.V.s0());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            c1.e(s3Var3);
                            if (s3.A2(obj)) {
                                s3.I1(uVar, null, 27, null, null, 0);
                            }
                            c1.g(j0Var3);
                            j0Var3.H.d(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (s3.Q1(str)) {
                            c1.g(j0Var3);
                            j0Var3.H.c(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            c1.e(s3Var3);
                            fVar.getClass();
                            if (s3Var3.B2("param", str, 500, obj)) {
                                s3Var3.H1(bundle, str, obj);
                            }
                        }
                    }
                    c1.e(s3Var3);
                    s3 s3Var4 = ((c1) fVar.f1504d).E;
                    c1.e(s3Var4);
                    int i10 = s3Var4.X1(201500000) ? 100 : 25;
                    if (bundle.size() > i10) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i11++;
                            if (i11 > i10) {
                                bundle.remove(str2);
                            }
                        }
                        c1.e(s3Var3);
                        s3.I1(uVar, null, 26, null, null, 0);
                        c1.g(j0Var3);
                        j0Var3.H.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                r0 r0Var2 = c1Var3.f26888x;
                c1.e(r0Var2);
                r0Var2.V.t0(bundle);
                if (!bundle4.isEmpty() || c1Var3.f26887r.C1(null, u.W0)) {
                    c1Var3.j().x1(bundle);
                    break;
                }
                break;
        }
    }
}
