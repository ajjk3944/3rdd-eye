package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u50 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17095d;

    public /* synthetic */ u50(pr0 pr0Var, iu iuVar, pr0 pr0Var2) {
        this.f17092a = 1;
        this.f17093b = pr0Var;
        this.f17094c = iuVar;
        this.f17095d = pr0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i4 = this.f17092a;
        int i10 = 0;
        Object obj = this.f17095d;
        Object obj2 = this.f17093b;
        Object obj3 = this.f17094c;
        switch (i4) {
            case 0:
                v50 v50Var = (v50) obj3;
                Bundle bundle2 = (Bundle) obj;
                t50 t50Var = (t50) ((pr0) obj2).f15081c.get();
                Bundle bundle3 = t50Var.f16705a;
                String str = (String) ((vd.b) v50Var.g.a()).get();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.M7)).booleanValue() && v50Var.j.E()) {
                    i10 = 1;
                }
                String str2 = v50Var.f17526h;
                PackageInfo packageInfo = v50Var.f17525f;
                ArrayList arrayList = v50Var.f17524e;
                String str3 = v50Var.f17523d;
                return new iu(bundle3, v50Var.f17521b, v50Var.f17522c, str3, arrayList, packageInfo, str, str2, null, null, i10, v50Var.f17528k.a(), bundle2, t50Var.f16706b, v50Var.f17529l);
            case 1:
                ju juVar = (ju) ((pr0) obj2).f15081c.get();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && (bundle = ((iu) obj3).f12483m) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", juVar.j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", juVar.f12831k);
                }
                return new ah0((JSONObject) ((pr0) obj).f15081c.get(), juVar);
            case 2:
                tm0 tm0Var = kn0.f13207k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = (ArrayList) obj3;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj4 = arrayList2.get(i10);
                    i10++;
                    vd.b bVar = (vd.b) obj4;
                    if (((JSONObject) bVar.get()) != null) {
                        jSONArray.put(bVar.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() != 0) {
                    return new tm0(jSONArray.toString(), str4, bundle4);
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.T4)).booleanValue()) {
                    return new tm0(new JSONArray().toString(), str4, bundle4);
                }
                return null;
            default:
                ((p11) obj3).f14858a.a((zy0) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ u50(Object obj, Object obj2, Cloneable cloneable, int i4) {
        this.f17092a = i4;
        this.f17094c = obj;
        this.f17093b = obj2;
        this.f17095d = cloneable;
    }

    public /* synthetic */ u50(String str, ArrayList arrayList, Bundle bundle) {
        this.f17092a = 2;
        this.f17094c = arrayList;
        this.f17095d = bundle;
        this.f17093b = str;
    }
}
