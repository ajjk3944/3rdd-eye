package ec;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f22838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f22839c;

    public /* synthetic */ k2(q2 q2Var, Bundle bundle, int i4) {
        this.f22837a = i4;
        this.f22838b = bundle;
        this.f22839c = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f22837a) {
            case 0:
                q2 q2Var = this.f22839c;
                q2Var.B();
                q2Var.C();
                Bundle bundle2 = this.f22838b;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                pb.y.e(string);
                pb.y.e(string2);
                pb.y.h(bundle2.get("value"));
                o1 o1Var = (o1) q2Var.f218b;
                if (!o1Var.e()) {
                    s0 s0Var = o1Var.f22954f;
                    o1.m(s0Var);
                    s0Var.f23060o.d("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    i4 i4Var = new i4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        l4 l4Var = o1Var.f22956i;
                        o1.k(l4Var);
                        bundle2.getString("app_id");
                        u uVarE0 = l4Var.e0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        o1.k(l4Var);
                        bundle2.getString("app_id");
                        u uVarE02 = l4Var.e0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        o1Var.p().U(new e(bundle2.getString("app_id"), string2, i4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), uVarE02, bundle2.getLong("trigger_timeout"), uVarE0, bundle2.getLong("time_to_live"), l4Var.e0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                q2 q2Var2 = this.f22839c;
                q2Var2.B();
                q2Var2.C();
                Bundle bundle3 = this.f22838b;
                String string3 = bundle3.getString("name");
                pb.y.e(string3);
                o1 o1Var2 = (o1) q2Var2.f218b;
                if (!o1Var2.e()) {
                    s0 s0Var2 = o1Var2.f22954f;
                    o1.m(s0Var2);
                    s0Var2.f23060o.d("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    i4 i4Var2 = new i4(0L, null, string3, "");
                    try {
                        l4 l4Var2 = o1Var2.f22956i;
                        o1.k(l4Var2);
                        bundle3.getString("app_id");
                        o1Var2.p().U(new e(bundle3.getString("app_id"), "", i4Var2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), l4Var2.e0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                q2 q2Var3 = this.f22839c;
                p6.i iVar = q2Var3.f23027x;
                o1 o1Var3 = (o1) q2Var3.f218b;
                Bundle bundle4 = this.f22838b;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    b1 b1Var = o1Var3.f22953e;
                    l4 l4Var3 = o1Var3.f22956i;
                    g gVar = o1Var3.f22952d;
                    s0 s0Var3 = o1Var3.f22954f;
                    o1.k(b1Var);
                    bundle = new Bundle(b1Var.f22577z.N());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            o1.k(l4Var3);
                            if (l4.K0(obj)) {
                                l4.R(iVar, null, 27, null, null, 0);
                            }
                            o1.m(s0Var3);
                            s0Var3.f23057l.f(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (l4.a0(str)) {
                            o1.m(s0Var3);
                            s0Var3.f23057l.e(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            o1.k(l4Var3);
                            gVar.getClass();
                            if (l4Var3.L0("param", 500, str, obj)) {
                                l4Var3.Q(str, obj, bundle);
                            }
                        }
                    }
                    o1.k(l4Var3);
                    l4 l4Var4 = ((o1) gVar.f218b).f22956i;
                    o1.k(l4Var4);
                    int i4 = l4Var4.h0(201500000) ? 100 : 25;
                    if (bundle.size() > i4) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i10++;
                            if (i10 > i4) {
                                bundle.remove(str2);
                            }
                        }
                        o1.k(l4Var3);
                        l4.R(iVar, null, 26, null, null, 0);
                        o1.m(s0Var3);
                        s0Var3.f23057l.d("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                b1 b1Var2 = o1Var3.f22953e;
                o1.k(b1Var2);
                b1Var2.f22577z.S(bundle);
                if (!bundle4.isEmpty() || o1Var3.f22952d.L(null, d0.X0)) {
                    o1Var3.p().G(bundle);
                    break;
                }
                break;
        }
    }
}
