package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12236a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12237d;

    /* renamed from: g, reason: collision with root package name */
    public AbstractMap f12238g;

    public /* synthetic */ e5(int i10, Object obj) {
        this.f12236a = i10;
        this.f12237d = obj;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        switch (this.f12236a) {
            case 0:
                i4.b bVar = (i4.b) y2Var;
                bVar.C();
                bVar.I("items");
                bVar.S(u0Var, (List) this.f12237d);
                HashMap map = (HashMap) this.f12238g;
                if (map != null) {
                    for (String str : map.keySet()) {
                        h0.b.C((HashMap) this.f12238g, str, bVar, str, u0Var);
                    }
                }
                bVar.F();
                break;
            default:
                i4.b bVar2 = (i4.b) y2Var;
                bVar2.C();
                String str2 = (String) this.f12237d;
                if (str2 != null) {
                    bVar2.I("source");
                    bVar2.S(u0Var, str2);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12238g;
                if (concurrentHashMap != null) {
                    for (String str3 : concurrentHashMap.keySet()) {
                        h0.b.D((ConcurrentHashMap) this.f12238g, str3, bVar2, str3, u0Var);
                    }
                }
                bVar2.F();
                break;
        }
    }
}
