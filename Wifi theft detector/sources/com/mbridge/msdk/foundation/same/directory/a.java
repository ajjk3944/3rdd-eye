package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f15072a;

    /* renamed from: b, reason: collision with root package name */
    private String f15073b;

    /* renamed from: c, reason: collision with root package name */
    private a f15074c;

    /* renamed from: d, reason: collision with root package name */
    private c f15075d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f15073b;
    }

    public a c() {
        return this.f15074c;
    }

    public c d() {
        return this.f15075d;
    }

    public void b(a aVar) {
        this.f15074c = aVar;
    }

    public void a(a aVar) {
        if (this.f15072a == null) {
            this.f15072a = new ArrayList();
        }
        aVar.b(this);
        this.f15072a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f15072a;
    }

    public void a(String str) {
        this.f15073b = str;
    }

    public void a(c cVar) {
        this.f15075d = cVar;
    }
}
