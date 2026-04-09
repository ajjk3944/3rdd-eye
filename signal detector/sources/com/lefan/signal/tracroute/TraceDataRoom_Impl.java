package com.lefan.signal.tracroute;

import C0.C0146b;
import C0.l;
import C0.s;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q5.i;

/* loaded from: classes.dex */
public final class TraceDataRoom_Impl extends TraceDataRoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile e f18857m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "trace_history");
    }

    @Override // C0.p
    public final G0.b e(C0146b c0146b) {
        s sVar = new s(c0146b, new L4.e(this, 6), "8bf5d7ad52292ddb1bd344cc68dc3de4", "93908537aefdbf448fb04db2cbbe4e2a");
        Context context = c0146b.f1030a;
        i.e(context, "context");
        return c0146b.f1032c.j(new A1.s(context, c0146b.f1031b, sVar, false));
    }

    @Override // C0.p
    public final List f(Map map) {
        return new ArrayList();
    }

    @Override // C0.p
    public final Set h() {
        return new HashSet();
    }

    @Override // C0.p
    public final Map i() {
        HashMap map = new HashMap();
        map.put(e.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.tracroute.TraceDataRoom
    public final e o() {
        e eVar;
        if (this.f18857m != null) {
            return this.f18857m;
        }
        synchronized (this) {
            try {
                if (this.f18857m == null) {
                    this.f18857m = new e(this);
                }
                eVar = this.f18857m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
