package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class yi1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yi1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        m83 m83Var;
        Bundle bundle;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                cr1 cr1Var = (cr1) obj3;
                List<Uri> list = (List) obj2;
                u10 u10Var = (u10) obj;
                rs1 rs1Var = cr1Var.i.b;
                String strI = rs1Var != null ? rs1Var.i(cr1Var.h, (View) oi0.l1(u10Var), null) : "";
                if (TextUtils.isEmpty(strI)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (cr1.F3(uri, cr1Var.E, cr1Var.F)) {
                        arrayList.add(cr1.I3(uri, "ms", strI));
                    } else {
                        gi2.i0("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                cr1 cr1Var2 = (cr1) obj3;
                Uri uriB = (Uri) obj2;
                u10 u10Var2 = (u10) obj;
                try {
                    uriB = (!((Boolean) tw1.e.c.a(mz1.Mc)).booleanValue() || (m83Var = cr1Var2.j) == null) ? cr1Var2.i.b(uriB, cr1Var2.h, (View) oi0.l1(u10Var2), null) : m83Var.a(uriB, cr1Var2.h, (View) oi0.l1(u10Var2), null);
                } catch (ws1 unused) {
                    gi2.q0(5);
                }
                if (uriB.getQueryParameter("ms") != null) {
                    return uriB;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                return Boolean.valueOf(((ln2) obj3).b((String) obj2, (JSONObject) obj));
            case 3:
                km2 km2Var = (km2) obj3;
                Bundle bundle2 = (Bundle) obj;
                jm2 jm2Var = (jm2) ((q93) obj2).h.get();
                Bundle bundle3 = jm2Var.a;
                String str = (String) ((n70) km2Var.g.d()).get();
                if (((Boolean) tw1.e.c.a(mz1.r7)).booleanValue() && km2Var.j.s()) {
                    i2 = 1;
                }
                String str2 = km2Var.h;
                PackageInfo packageInfo = km2Var.f;
                ArrayList arrayList2 = km2Var.e;
                return new fa2(bundle3, km2Var.b, km2Var.c, km2Var.d, arrayList2, packageInfo, str, str2, null, null, i2, km2Var.k.a(), bundle2, jm2Var.b, km2Var.l);
            case 4:
                ga2 ga2Var = (ga2) ((q93) obj3).h.get();
                if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && (bundle = ((fa2) obj2).r) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", ga2Var.j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", ga2Var.k);
                }
                return new az2((JSONObject) ((q93) obj).h.get(), ga2Var);
            case 5:
                n43 n43Var = i53.k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList3 = (ArrayList) obj3;
                int size = arrayList3.size();
                while (i2 < size) {
                    Object obj4 = arrayList3.get(i2);
                    i2++;
                    n70 n70Var = (n70) obj4;
                    if (((JSONObject) n70Var.get()) != null) {
                        jSONArray.put(n70Var.get());
                    }
                }
                String str3 = (String) obj;
                Bundle bundle4 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new n43(jSONArray.toString(), bundle4, str3);
                }
                if (((Boolean) tw1.e.c.a(mz1.C4)).booleanValue()) {
                    return new n43(new JSONArray().toString(), bundle4, str3);
                }
                return null;
            default:
                ug0.r(((jd4) obj3).c, (b3) obj2, (td4) obj);
                return Boolean.TRUE;
        }
    }
}
