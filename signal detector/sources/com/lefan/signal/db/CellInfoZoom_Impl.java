package com.lefan.signal.db;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import L4.a;
import L4.c;
import L4.d;
import L4.e;
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
public final class CellInfoZoom_Impl extends CellInfoZoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile d f18836m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "cellInfo");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new e(this, 0), "e1acf26c65bda7e96a54b6af7b99400c", "afa9db39b12bc675edb2cc0d59042a21");
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
        map.put(a.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.db.CellInfoZoom
    public final a o() {
        d dVar;
        if (this.f18836m != null) {
            return this.f18836m;
        }
        synchronized (this) {
            try {
                if (this.f18836m == null) {
                    d dVar2 = new d();
                    new L4.b(this, 0);
                    new L4.b(this, 1);
                    new c(this, 0);
                    this.f18836m = dVar2;
                }
                dVar = this.f18836m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
