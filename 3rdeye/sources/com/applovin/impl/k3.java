package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19649a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(q2 q2Var);
    }

    public void a(a aVar) {
        this.f19649a.add(aVar);
    }

    public void b(a aVar) {
        this.f19649a.remove(aVar);
    }

    public void a(q2 q2Var) {
        Iterator it = new ArrayList(this.f19649a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(q2Var);
        }
    }
}
