package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database;

import A2.a;
import A2.b;
import A2.o;
import androidx.room.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w1.m;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: l, reason: collision with root package name */
    public volatile o f22125l;

    @Override // w1.k
    public final c d() {
        return new c(this, new HashMap(0), new HashMap(0), "Model");
    }

    @Override // w1.k
    public final m e() {
        return new a(this);
    }

    @Override // w1.k
    public final List g(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // w1.k
    public final Set<Class<Object>> j() {
        return new HashSet();
    }

    @Override // w1.k
    public final Map<Class<?>, List<Class<?>>> k() {
        HashMap map = new HashMap();
        map.put(b.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.AppDatabase
    public final b s() {
        o oVar;
        if (this.f22125l != null) {
            return this.f22125l;
        }
        synchronized (this) {
            try {
                if (this.f22125l == null) {
                    this.f22125l = new o(this);
                }
                oVar = this.f22125l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}
