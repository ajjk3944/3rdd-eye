package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0814Xj implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12453d;

    public /* synthetic */ CallableC0814Xj(Ju ju, C1807re c1807re, Ju ju2) {
        this.f12450a = 1;
        this.f12451b = ju;
        this.f12452c = c1807re;
        this.f12453d = ju2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i = this.f12450a;
        int i3 = 0;
        Object obj = this.f12453d;
        Object obj2 = this.f12451b;
        Object obj3 = this.f12452c;
        switch (i) {
            case 0:
                C0831Yj c0831Yj = (C0831Yj) obj3;
                Bundle bundle2 = (Bundle) obj;
                C0797Wj c0797Wj = (C0797Wj) ((Ju) obj2).f9394c.get();
                Bundle bundle3 = c0797Wj.f12308a;
                String str = (String) ((InterfaceFutureC2326a) c0831Yj.f12669g.c()).get();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.M7)).booleanValue() && c0831Yj.f12671j.E()) {
                    i3 = 1;
                }
                String str2 = c0831Yj.f12670h;
                PackageInfo packageInfo = c0831Yj.f12668f;
                ArrayList arrayList = c0831Yj.f12667e;
                String str3 = c0831Yj.f12666d;
                return new C1807re(bundle3, c0831Yj.f12664b, c0831Yj.f12665c, str3, arrayList, packageInfo, str, str2, null, null, i3, c0831Yj.f12672k.a(), bundle2, c0797Wj.f12309b, c0831Yj.f12673l);
            case 1:
                C1861se c1861se = (C1861se) ((Ju) obj2).f9394c.get();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && (bundle = ((C1807re) obj3).f16587m) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c1861se.f16768j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", c1861se.f16769k);
                }
                return new C0446Bp((JSONObject) ((Ju) obj).f9394c.get(), c1861se);
            case 2:
                C1875ss c1875ss = Gs.f8456k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = (ArrayList) obj3;
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj4 = arrayList2.get(i3);
                    i3++;
                    InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) obj4;
                    if (((JSONObject) interfaceFutureC2326a.get()) != null) {
                        jSONArray.put(interfaceFutureC2326a.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() != 0) {
                    return new C1875ss(jSONArray.toString(), bundle4, str4);
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8675T4)).booleanValue()) {
                    return new C1875ss(new JSONArray().toString(), bundle4, str4);
                }
                return null;
            default:
                ((C1031dA) obj3).f13734a.a((Ly) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ CallableC0814Xj(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f12450a = i;
        this.f12452c = obj;
        this.f12451b = obj2;
        this.f12453d = cloneable;
    }

    public /* synthetic */ CallableC0814Xj(ArrayList arrayList, Bundle bundle, String str) {
        this.f12450a = 2;
        this.f12452c = arrayList;
        this.f12453d = bundle;
        this.f12451b = str;
    }
}
