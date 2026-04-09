package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.e4;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12576a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f12577d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12578g;

    /* renamed from: r, reason: collision with root package name */
    public AbstractMap f12579r;

    public j(Object obj, String str) {
        this.f12577d = str;
        if (obj == null || !str.equals("string")) {
            this.f12578g = obj;
        } else {
            this.f12578g = obj.toString();
        }
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        switch (this.f12576a) {
            case 0:
                i4.b bVar = (i4.b) y2Var;
                bVar.C();
                bVar.I("value");
                bVar.U((Number) this.f12578g);
                String str = this.f12577d;
                if (str != null) {
                    bVar.I("unit");
                    bVar.V(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12579r;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        h0.b.D((ConcurrentHashMap) this.f12579r, str2, bVar, str2, u0Var);
                    }
                }
                bVar.F();
                break;
            default:
                i4.b bVar2 = (i4.b) y2Var;
                bVar2.C();
                bVar2.I("type");
                bVar2.S(u0Var, this.f12577d);
                bVar2.I("value");
                bVar2.S(u0Var, this.f12578g);
                HashMap map = (HashMap) this.f12579r;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        h0.b.C((HashMap) this.f12579r, str3, bVar2, str3, u0Var);
                    }
                }
                bVar2.F();
                break;
        }
    }

    public j(e4 e4Var, Object obj) {
        this(obj, e4Var.apiName());
    }

    public j(String str, Number number) {
        this.f12578g = number;
        this.f12577d = str;
    }
}
