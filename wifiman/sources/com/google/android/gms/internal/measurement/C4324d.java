package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4324d {

    /* renamed from: a, reason: collision with root package name */
    private C4333e f35190a;

    /* renamed from: b, reason: collision with root package name */
    private C4333e f35191b;

    /* renamed from: c, reason: collision with root package name */
    private List f35192c;

    public C4324d() {
        this.f35190a = new C4333e("", 0L, null);
        this.f35191b = new C4333e("", 0L, null);
        this.f35192c = new ArrayList();
    }

    public final C4333e a() {
        return this.f35190a;
    }

    public final void b(C4333e c4333e) {
        this.f35190a = c4333e;
        this.f35191b = (C4333e) c4333e.clone();
        this.f35192c.clear();
    }

    public final void c(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C4333e.c(str2, this.f35190a.b(str2), map.get(str2)));
        }
        this.f35192c.add(new C4333e(str, j10, map2));
    }

    public final /* synthetic */ Object clone() {
        C4324d c4324d = new C4324d((C4333e) this.f35190a.clone());
        Iterator it = this.f35192c.iterator();
        while (it.hasNext()) {
            c4324d.f35192c.add((C4333e) ((C4333e) it.next()).clone());
        }
        return c4324d;
    }

    public final C4333e d() {
        return this.f35191b;
    }

    public final void e(C4333e c4333e) {
        this.f35191b = c4333e;
    }

    public final List f() {
        return this.f35192c;
    }

    private C4324d(C4333e c4333e) {
        this.f35190a = c4333e;
        this.f35191b = (C4333e) c4333e.clone();
        this.f35192c = new ArrayList();
    }
}
