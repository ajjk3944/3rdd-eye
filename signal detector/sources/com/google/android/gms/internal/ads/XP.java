package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class XP {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12422a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f12423b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final C2233zP f12424c = new C2233zP(new CopyOnWriteArrayList(), null);

    /* renamed from: d, reason: collision with root package name */
    public final C2233zP f12425d = new C2233zP(new CopyOnWriteArrayList(), null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f12426e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1353j8 f12427f;

    /* renamed from: g, reason: collision with root package name */
    public MO f12428g;

    public abstract void a(C1241h2 c1241h2);

    public abstract void b(InterfaceC1695pQ interfaceC1695pQ);

    public abstract InterfaceC1695pQ c(C1749qQ c1749qQ, InterfaceC1292i interfaceC1292i, long j6);

    public void d() {
    }

    public void e() {
    }

    public abstract C1241h2 f();

    public void g() {
    }

    public abstract void h(InterfaceC1958uK interfaceC1958uK);

    public void i() {
    }

    public abstract void j();

    public final void k(AbstractC1353j8 abstractC1353j8) {
        this.f12427f = abstractC1353j8;
        ArrayList arrayList = this.f12422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1802rQ) arrayList.get(i)).a(this, abstractC1353j8);
        }
    }

    public final void l(InterfaceC1964uQ interfaceC1964uQ) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12424c.f17875b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1856sQ c1856sQ = (C1856sQ) it.next();
            if (c1856sQ.f16748b == interfaceC1964uQ) {
                copyOnWriteArrayList.remove(c1856sQ);
            }
        }
    }

    public final void m(AP ap) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12425d.f17875b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2179yP c2179yP = (C2179yP) it.next();
            if (c2179yP.f17720a == ap) {
                copyOnWriteArrayList.remove(c2179yP);
            }
        }
    }

    public final void n(InterfaceC1802rQ interfaceC1802rQ, InterfaceC1958uK interfaceC1958uK, MO mo) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f12426e;
        boolean z6 = true;
        if (looper != null && looper != looperMyLooper) {
            z6 = false;
        }
        AbstractC0582Jp.m(z6);
        this.f12428g = mo;
        AbstractC1353j8 abstractC1353j8 = this.f12427f;
        this.f12422a.add(interfaceC1802rQ);
        if (this.f12426e == null) {
            this.f12426e = looperMyLooper;
            this.f12423b.add(interfaceC1802rQ);
            h(interfaceC1958uK);
        } else if (abstractC1353j8 != null) {
            o(interfaceC1802rQ);
            interfaceC1802rQ.a(this, abstractC1353j8);
        }
    }

    public final void o(InterfaceC1802rQ interfaceC1802rQ) {
        this.f12426e.getClass();
        HashSet hashSet = this.f12423b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1802rQ);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(InterfaceC1802rQ interfaceC1802rQ) {
        HashSet hashSet = this.f12423b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1802rQ);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(InterfaceC1802rQ interfaceC1802rQ) {
        ArrayList arrayList = this.f12422a;
        arrayList.remove(interfaceC1802rQ);
        if (!arrayList.isEmpty()) {
            p(interfaceC1802rQ);
            return;
        }
        this.f12426e = null;
        this.f12427f = null;
        this.f12428g = null;
        this.f12423b.clear();
        j();
    }

    public abstract void r();
}
