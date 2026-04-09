package com.lefan.signal.db;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import L4.e;
import L4.g;
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
public final class MacDataBaseRoom_Impl extends MacDataBaseRoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile g f18841m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "macvendor");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new e(this), "74c39f16249e2a68289487feb1726a4e", "0c75cd1b87c1734fdb11e9b391d6b3c7");
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
        map.put(g.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.db.MacDataBaseRoom
    public final g o() {
        g gVar;
        if (this.f18841m != null) {
            return this.f18841m;
        }
        synchronized (this) {
            try {
                if (this.f18841m == null) {
                    this.f18841m = new g(this);
                }
                gVar = this.f18841m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
