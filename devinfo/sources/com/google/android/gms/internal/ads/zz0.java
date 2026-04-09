package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zz0 extends h01 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f19237f;
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final zx0 f19238h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19239i;
    public final long j;

    public zz0(zc zcVar, sz0 sz0Var, Map map, Context context, zx0 zx0Var, sx0 sx0Var, g21 g21Var) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zcVar, sz0Var, g21Var.a(AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID));
        this.g = context;
        this.f19237f = map;
        this.f19238h = zx0Var;
        this.f19239i = sx0Var.N();
        this.j = sx0Var.O();
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) {
        md mdVar;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.f19238h.ordinal()));
        objArr.getClass();
        String strV0 = "E";
        try {
            vd.b bVar = (vd.b) this.f19237f.get("gs");
            if (bVar != null && ((Build.VERSION.SDK_INT < 31 || bVar.isDone()) && (mdVar = (md) bVar.get(this.f19239i, TimeUnit.MILLISECONDS)) != null && mdVar.v0().length() > 1)) {
                strV0 = mdVar.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strV0.equals("E")) {
            try {
                vd.b bVar2 = (vd.b) this.f19237f.get("ai");
                if (bVar2 != null) {
                    String str = (String) bVar2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!yr1.k(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zcVar) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                zcVar.b();
                ((md) zcVar.f14755b).F(jLongValue);
                String str2 = (String) objArr[1];
                zcVar.b();
                ((md) zcVar.f14755b).E(str2);
                String str3 = (String) objArr[2];
                zcVar.b();
                ((md) zcVar.f14755b).O(str3);
                String str4 = (String) objArr[3];
                zcVar.b();
                ((md) zcVar.f14755b).P(str4);
                m61 m61VarF = m61.f13779f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = m61VarF.g(bArr.length, bArr);
                zcVar.b();
                ((md) zcVar.f14755b).A(strG);
                zcVar.b();
                ((md) zcVar.f14755b).S0(strV0);
                if (bool != null) {
                    int i4 = true != bool.booleanValue() ? 1 : 2;
                    zcVar.b();
                    ((md) zcVar.f14755b).t0(i4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
