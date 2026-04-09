package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class v3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f8279a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f8279a.add(aVar);
    }

    public void b(a aVar) {
        this.f8279a.remove(aVar);
    }

    public void a(y2 y2Var) {
        ArrayList arrayList = new ArrayList(this.f8279a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).a(y2Var);
        }
    }
}
