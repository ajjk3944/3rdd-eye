package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cv0 extends zu0 {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10223c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f10224d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(l90 l90Var, HashSet hashSet, JSONObject jSONObject, long j, int i4) {
        super(l90Var);
        this.f10226f = i4;
        this.f10223c = new HashSet(hashSet);
        this.f10224d = jSONObject;
        this.f10225e = j;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        hu0 hu0Var;
        switch (this.f10226f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (hu0Var = hu0.f11974c) != null) {
                    for (vt0 vt0Var : DesugarCollections.unmodifiableCollection(hu0Var.f11975a)) {
                        if (this.f10223c.contains(vt0Var.g)) {
                            pu0 pu0Var = vt0Var.f17702d;
                            if (this.f10225e >= pu0Var.f15110c) {
                                pu0Var.f15111d = 2;
                                w5.g.C(pu0Var.c(), "setNativeViewHierarchy", str, pu0Var.f15108a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        hu0 hu0Var = hu0.f11974c;
        if (hu0Var != null) {
            for (vt0 vt0Var : DesugarCollections.unmodifiableCollection(hu0Var.f11975a)) {
                if (this.f10223c.contains(vt0Var.g)) {
                    pu0 pu0Var = vt0Var.f17702d;
                    if (this.f10225e >= pu0Var.f15110c && pu0Var.f15111d != 3) {
                        pu0Var.f15111d = 3;
                        w5.g.C(pu0Var.c(), "setNativeViewHierarchy", str, pu0Var.f15108a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f10226f) {
            case 0:
                return this.f10224d.toString();
            default:
                l90 l90Var = this.f19183b;
                JSONObject jSONObject = (JSONObject) l90Var.f13426b;
                JSONObject jSONObject2 = this.f10224d;
                if (uu0.e(jSONObject2, jSONObject)) {
                    return null;
                }
                l90Var.f13426b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zu0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f10226f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
