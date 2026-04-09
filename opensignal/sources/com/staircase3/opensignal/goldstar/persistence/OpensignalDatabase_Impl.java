package com.staircase3.opensignal.goldstar.persistence;

import android.content.Context;
import bc.f0;
import bm.d;
import bm.e;
import f7.a;
import i7.h;
import io.sentry.android.sqlite.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o7.b;
import p7.i;

/* loaded from: classes.dex */
public final class OpensignalDatabase_Impl extends OpensignalDatabase {

    /* renamed from: p, reason: collision with root package name */
    public volatile e f6084p;

    /* renamed from: q, reason: collision with root package name */
    public volatile d f6085q;

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "video_test", "speed_test");
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final b e(a aVar) {
        return new f(new i((Context) aVar.f8638c, "wifi_speed_db", new f0(aVar, new b9.e(6, this))));
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final List f(Map map) {
        return new ArrayList();
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final Set h() {
        return new HashSet();
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final Map i() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(e.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final d l() {
        d dVar;
        if (this.f6085q != null) {
            return this.f6085q;
        }
        synchronized (this) {
            try {
                if (this.f6085q == null) {
                    this.f6085q = new d(this);
                }
                dVar = this.f6085q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase
    public final e n() {
        e eVar;
        if (this.f6084p != null) {
            return this.f6084p;
        }
        synchronized (this) {
            try {
                if (this.f6084p == null) {
                    this.f6084p = new e(this);
                }
                eVar = this.f6084p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }
}
