package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v01 implements ew0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17411a;

    /* renamed from: b, reason: collision with root package name */
    public final v11 f17412b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17413c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17414d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17415e;

    public v01(Context context, sx0 sx0Var, v11 v11Var) {
        this.f17411a = context;
        this.f17413c = sx0Var.G();
        this.f17414d = sx0Var.N();
        this.f17415e = sx0Var.O();
        this.f17412b = v11Var;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap a() {
        HashMap mapA = this.f17412b.a();
        b(mapA);
        return mapA;
    }

    public final void b(HashMap map) {
        vd.b bVar;
        md mdVar;
        map.put("v", this.f17413c);
        map.put("t", new Throwable());
        try {
            bVar = (vd.b) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strV0 = (bVar == null || (Build.VERSION.SDK_INT >= 31 && !bVar.isDone()) || (mdVar = (md) bVar.get(this.f17414d, TimeUnit.MILLISECONDS)) == null || mdVar.v0().length() <= 1) ? "E" : mdVar.v0();
        if (strV0.equals("E")) {
            try {
                vd.b bVar2 = (vd.b) map.get("ai");
                if (bVar2 != null) {
                    String str = (String) bVar2.get(this.f17415e, TimeUnit.MILLISECONDS);
                    if (!yr1.k(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strV0);
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap f() {
        HashMap mapC = this.f17412b.c();
        b(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final HashMap zzc() {
        HashMap mapB = this.f17412b.b(this.f17411a, null);
        b(mapB);
        return mapB;
    }
}
