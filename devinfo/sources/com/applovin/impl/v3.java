package com.applovin.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f5875a = DesugarCollections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f5875a.add(aVar);
    }

    public void b(a aVar) {
        this.f5875a.remove(aVar);
    }

    public void a(y2 y2Var) {
        ArrayList arrayList = new ArrayList(this.f5875a);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((a) obj).a(y2Var);
        }
    }
}
