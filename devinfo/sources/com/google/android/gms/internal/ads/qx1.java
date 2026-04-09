package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class qx1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15469a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f15470b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final l90 f15471c = new l90(new CopyOnWriteArrayList(), (jy1) null);

    /* renamed from: d, reason: collision with root package name */
    public final ce1 f15472d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f15473e;

    /* renamed from: f, reason: collision with root package name */
    public uh f15474f;
    public cv1 g;

    public qx1() {
        int i4 = 28;
        this.f15472d = new ce1(i4, new CopyOnWriteArrayList(), (Object) null);
    }

    public abstract void a(h5 h5Var);

    public abstract void b(iy1 iy1Var);

    public abstract iy1 c(jy1 jy1Var, i iVar, long j);

    public abstract h5 f();

    public abstract void h(hm1 hm1Var);

    public abstract void j();

    public final void k(uh uhVar) {
        this.f15474f = uhVar;
        ArrayList arrayList = this.f15469a;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ky1) arrayList.get(i4)).a(this, uhVar);
        }
    }

    public final void l(oy1 oy1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f15471c.f13427c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ly1 ly1Var = (ly1) it.next();
            if (ly1Var.f13682b == oy1Var) {
                copyOnWriteArrayList.remove(ly1Var);
            }
        }
    }

    public final void m(sw1 sw1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f15472d.f10095c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            rw1 rw1Var = (rw1) it.next();
            if (rw1Var.f15778a == sw1Var) {
                copyOnWriteArrayList.remove(rw1Var);
            }
        }
    }

    public final void n(ky1 ky1Var, hm1 hm1Var, cv1 cv1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f15473e;
        boolean z3 = true;
        if (looper != null && looper != looperMyLooper) {
            z3 = false;
        }
        mq0.m(z3);
        this.g = cv1Var;
        uh uhVar = this.f15474f;
        this.f15469a.add(ky1Var);
        if (this.f15473e == null) {
            this.f15473e = looperMyLooper;
            this.f15470b.add(ky1Var);
            h(hm1Var);
        } else if (uhVar != null) {
            o(ky1Var);
            ky1Var.a(this, uhVar);
        }
    }

    public final void o(ky1 ky1Var) {
        this.f15473e.getClass();
        HashSet hashSet = this.f15470b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ky1Var);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(ky1 ky1Var) {
        HashSet hashSet = this.f15470b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ky1Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(ky1 ky1Var) {
        ArrayList arrayList = this.f15469a;
        arrayList.remove(ky1Var);
        if (!arrayList.isEmpty()) {
            p(ky1Var);
            return;
        }
        this.f15473e = null;
        this.f15474f = null;
        this.g = null;
        this.f15470b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }

    public void g() {
    }

    public void i() {
    }
}
