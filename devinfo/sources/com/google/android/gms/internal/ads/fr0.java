package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fr0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11256a = new HashMap();

    public final er0 a(yq0 yq0Var, Context context, tq0 tq0Var, rg0 rg0Var) {
        zq0 zq0Var;
        HashMap map = this.f11256a;
        er0 er0Var = (er0) map.get(yq0Var);
        if (er0Var != null) {
            return er0Var;
        }
        if (yq0Var == yq0.f18837a) {
            pk pkVar = sk.f16091d7;
            rk rkVar = va.s.f36163e.f36166c;
            int iIntValue = ((Integer) rkVar.a(pkVar)).intValue();
            int iIntValue2 = ((Integer) rkVar.a(sk.f16182j7)).intValue();
            int iIntValue3 = ((Integer) rkVar.a(sk.f16211l7)).intValue();
            String str = (String) rkVar.a(sk.f16242n7);
            String str2 = (String) rkVar.a(sk.f16123f7);
            zq0Var = new zq0(context, yq0Var, iIntValue, iIntValue2, iIntValue3, str, str2);
        } else if (yq0Var == yq0.f18838b) {
            pk pkVar2 = sk.f16106e7;
            rk rkVar2 = va.s.f36163e.f36166c;
            int iIntValue4 = ((Integer) rkVar2.a(pkVar2)).intValue();
            int iIntValue5 = ((Integer) rkVar2.a(sk.f16196k7)).intValue();
            int iIntValue6 = ((Integer) rkVar2.a(sk.f16225m7)).intValue();
            String str3 = (String) rkVar2.a(sk.f16257o7);
            String str4 = (String) rkVar2.a(sk.f16138g7);
            zq0Var = new zq0(context, yq0Var, iIntValue4, iIntValue5, iIntValue6, str3, str4);
        } else if (yq0Var == yq0.f18839c) {
            pk pkVar3 = sk.f16306r7;
            rk rkVar3 = va.s.f36163e.f36166c;
            int iIntValue7 = ((Integer) rkVar3.a(pkVar3)).intValue();
            int iIntValue8 = ((Integer) rkVar3.a(sk.f16338t7)).intValue();
            int iIntValue9 = ((Integer) rkVar3.a(sk.u7)).intValue();
            String str5 = (String) rkVar3.a(sk.f16273p7);
            String str6 = (String) rkVar3.a(sk.f16289q7);
            zq0Var = new zq0(context, yq0Var, iIntValue7, iIntValue8, iIntValue9, str5, str6);
        } else {
            zq0Var = null;
        }
        pq0 pq0Var = new pq0(zq0Var);
        er0 er0Var2 = new er0(pq0Var, new g(pq0Var, tq0Var, rg0Var));
        map.put(yq0Var, er0Var2);
        return er0Var2;
    }
}
