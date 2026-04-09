package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ry implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15785a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15787c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15789e;

    public /* synthetic */ ry(i00 i00Var, View view, uv uvVar, int i4) {
        this.f15787c = i00Var;
        this.f15788d = view;
        this.f15789e = uvVar;
        this.f15786b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, JSONException, InterruptedException, za.j {
        int i4 = this.f15785a;
        Object obj = this.f15789e;
        int i10 = this.f15786b;
        Object obj2 = this.f15788d;
        Object obj3 = this.f15787c;
        switch (i4) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) obj3);
                map.put("cachedSrc", (String) obj2);
                map.put("totalBytes", Integer.toString(i10));
                ((uy) obj).s(map);
                return;
            case 1:
                ((i00) obj3).k((View) obj2, (uv) obj, i10 - 1);
                return;
            default:
                s21 s21Var = (s21) obj3;
                p21 p21Var = (p21) obj2;
                km.y yVar = (km.y) obj;
                String str = s21Var.f15848b;
                try {
                    xi0 xi0Var = s21Var.f15847a;
                    if (xi0Var == null) {
                        throw null;
                    }
                    k21 k21Var = (k21) xi0Var.j;
                    if (k21Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i10);
                    String str2 = p21Var.f14867a;
                    if (!s21.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = p21Var.f14868b;
                    if (!s21.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    r21 r21Var = new r21(s21Var, yVar);
                    i21 i21Var = (i21) k21Var;
                    Parcel parcelT = i21Var.T();
                    ng.c(parcelT, bundle);
                    ng.e(parcelT, r21Var);
                    i21Var.u1(parcelT, 3);
                    return;
                } catch (RemoteException e2) {
                    s21.f15845c.e(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), str);
                    return;
                }
        }
    }

    public /* synthetic */ ry(s21 s21Var, p21 p21Var, int i4, km.y yVar) {
        this.f15787c = s21Var;
        this.f15788d = p21Var;
        this.f15786b = i4;
        this.f15789e = yVar;
    }

    public ry(uy uyVar, String str, String str2, int i4) {
        this.f15787c = str;
        this.f15788d = str2;
        this.f15786b = i4;
        this.f15789e = uyVar;
    }
}
