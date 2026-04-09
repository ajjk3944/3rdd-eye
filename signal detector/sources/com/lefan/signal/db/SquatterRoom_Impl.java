package com.lefan.signal.db;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import L4.e;
import L4.h;
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
public final class SquatterRoom_Impl extends SquatterRoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile h f18844m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "squatter");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new e(this), "4fd916d54fa9fd5f4691e298a7914018", "57d421e67f2702a477aa2986a2fc6a0d");
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
        map.put(h.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.db.SquatterRoom
    public final h o() {
        h hVar;
        if (this.f18844m != null) {
            return this.f18844m;
        }
        synchronized (this) {
            try {
                if (this.f18844m == null) {
                    this.f18844m = new h(this);
                }
                hVar = this.f18844m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
