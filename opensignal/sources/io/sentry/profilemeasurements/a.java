package io.sentry.profilemeasurements;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import ir.f0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f12510a;

    /* renamed from: d, reason: collision with root package name */
    public String f12511d;

    /* renamed from: g, reason: collision with root package name */
    public Collection f12512g;

    public a(String str, AbstractCollection abstractCollection) {
        this.f12511d = str;
        this.f12512g = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return f0.s(this.f12510a, aVar.f12510a) && this.f12511d.equals(aVar.f12511d) && new ArrayList(this.f12512g).equals(new ArrayList(aVar.f12512g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12510a, this.f12511d, this.f12512g});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("unit");
        bVar.S(u0Var, this.f12511d);
        bVar.I("values");
        bVar.S(u0Var, this.f12512g);
        ConcurrentHashMap concurrentHashMap = this.f12510a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12510a, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
