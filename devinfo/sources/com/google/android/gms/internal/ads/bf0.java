package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bf0 {

    /* renamed from: a, reason: collision with root package name */
    public final re0 f9670a;

    /* renamed from: b, reason: collision with root package name */
    public final dd0 f9671b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9672c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9673d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f9674e;

    public bf0(re0 re0Var, dd0 dd0Var) {
        this.f9670a = re0Var;
        this.f9671b = dd0Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f9672c) {
            try {
                if (!this.f9674e) {
                    re0 re0Var = this.f9670a;
                    if (!re0Var.f15618b) {
                        ye0 ye0Var = new ye0(0, this);
                        re0 re0Var2 = this.f9670a;
                        re0Var2.getClass();
                        re0Var2.f15621e.f11625a.a(new q81(27, re0Var2, ye0Var), re0Var2.j);
                        return jSONArray;
                    }
                    b(re0Var.b());
                }
                ArrayList arrayList = this.f9673d;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    jSONArray.put(((ze0) obj).a());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List list) {
        os osVar;
        cd0 cd0VarB;
        cd0 cd0VarB2;
        os osVar2;
        synchronized (this.f9672c) {
            try {
                if (this.f9674e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ip ipVar = (ip) it.next();
                    pk pkVar = sk.Da;
                    va.s sVar = va.s.f36163e;
                    String string = (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || (cd0VarB2 = this.f9671b.b(ipVar.f12405a)) == null || (osVar2 = cd0VarB2.f10085c) == null) ? "" : osVar2.toString();
                    String str = string;
                    boolean z3 = ((Boolean) sVar.f36166c.a(sk.Ea)).booleanValue() && (cd0VarB = this.f9671b.b(ipVar.f12405a)) != null && cd0VarB.f10086d;
                    ArrayList arrayList = this.f9673d;
                    String str2 = ipVar.f12405a;
                    cd0 cd0VarB3 = this.f9671b.b(str2);
                    String string2 = (cd0VarB3 == null || (osVar = cd0VarB3.f10084b) == null) ? "" : osVar.toString();
                    arrayList.add(new ze0(str2, str, z3, ipVar.f12406b ? 1 : 0, string2, ipVar.f12407c, ipVar.f12408d));
                }
                this.f9674e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
