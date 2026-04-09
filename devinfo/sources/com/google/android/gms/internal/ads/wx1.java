package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class wx1 extends qx1 {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18234h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f18235i;
    public hm1 j;

    @Override // com.google.android.gms.internal.ads.qx1
    public final void g() {
        for (vx1 vx1Var : this.f18234h.values()) {
            vx1Var.f17754a.o(vx1Var.f17755b);
        }
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void i() {
        for (vx1 vx1Var : this.f18234h.values()) {
            vx1Var.f17754a.p(vx1Var.f17755b);
        }
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public void j() {
        HashMap map = this.f18234h;
        for (vx1 vx1Var : map.values()) {
            qx1 qx1Var = vx1Var.f17754a;
            qx1Var.q(vx1Var.f17755b);
            ux1 ux1Var = vx1Var.f17756c;
            qx1Var.l(ux1Var);
            qx1Var.m(ux1Var);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public void r() {
        Iterator it = this.f18234h.values().iterator();
        while (it.hasNext()) {
            ((vx1) it.next()).f17754a.r();
        }
    }

    public abstract void s(Object obj, qx1 qx1Var, uh uhVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.ky1, com.google.android.gms.internal.ads.tx1] */
    public final void t(final Integer num, qx1 qx1Var) {
        HashMap map = this.f18234h;
        mq0.m(!map.containsKey(num));
        ?? r12 = new ky1() { // from class: com.google.android.gms.internal.ads.tx1
            @Override // com.google.android.gms.internal.ads.ky1
            public final /* synthetic */ void a(qx1 qx1Var2, uh uhVar) {
                this.f16983a.s(num, qx1Var2, uhVar);
            }
        };
        ux1 ux1Var = new ux1(this, num);
        map.put(num, new vx1(qx1Var, r12, ux1Var));
        Handler handler = this.f18235i;
        handler.getClass();
        l90 l90Var = qx1Var.f15471c;
        l90Var.getClass();
        ((CopyOnWriteArrayList) l90Var.f13427c).add(new ly1(handler, ux1Var));
        this.f18235i.getClass();
        ce1 ce1Var = qx1Var.f15472d;
        ce1Var.getClass();
        ((CopyOnWriteArrayList) ce1Var.f10095c).add(new rw1(ux1Var));
        hm1 hm1Var = this.j;
        cv1 cv1Var = this.g;
        cv1Var.getClass();
        qx1Var.n(r12, hm1Var, cv1Var);
        if (this.f15470b.isEmpty()) {
            qx1Var.p(r12);
        }
    }

    public abstract jy1 v(Object obj, jy1 jy1Var);

    public void u(Object obj) {
    }

    public void w(Object obj, long j) {
    }
}
