package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.dQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047dQ extends XP {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f13764h = new HashMap();
    public Handler i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1958uK f13765j;

    @Override // com.google.android.gms.internal.ads.XP
    public final void g() {
        for (C0992cQ c0992cQ : this.f13764h.values()) {
            c0992cQ.f13555a.o(c0992cQ.f13556b);
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void i() {
        for (C0992cQ c0992cQ : this.f13764h.values()) {
            c0992cQ.f13555a.p(c0992cQ.f13556b);
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public void j() {
        HashMap map = this.f13764h;
        for (C0992cQ c0992cQ : map.values()) {
            XP xp = c0992cQ.f13555a;
            xp.q(c0992cQ.f13556b);
            C0938bQ c0938bQ = c0992cQ.f13557c;
            xp.l(c0938bQ);
            xp.m(c0938bQ);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public void r() {
        Iterator it = this.f13764h.values().iterator();
        while (it.hasNext()) {
            ((C0992cQ) it.next()).f13555a.r();
        }
    }

    public abstract void s(Object obj, XP xp, AbstractC1353j8 abstractC1353j8);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.aQ, com.google.android.gms.internal.ads.rQ] */
    public final void t(final Integer num, XP xp) {
        HashMap map = this.f13764h;
        AbstractC0582Jp.m(!map.containsKey(num));
        ?? r12 = new InterfaceC1802rQ() { // from class: com.google.android.gms.internal.ads.aQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1802rQ
            public final /* synthetic */ void a(XP xp2, AbstractC1353j8 abstractC1353j8) {
                this.f13123a.s(num, xp2, abstractC1353j8);
            }
        };
        C0938bQ c0938bQ = new C0938bQ(this, num);
        map.put(num, new C0992cQ(xp, r12, c0938bQ));
        Handler handler = this.i;
        handler.getClass();
        C2233zP c2233zP = xp.f12424c;
        c2233zP.getClass();
        c2233zP.f17875b.add(new C1856sQ(handler, c0938bQ));
        this.i.getClass();
        C2233zP c2233zP2 = xp.f12425d;
        c2233zP2.getClass();
        c2233zP2.f17875b.add(new C2179yP(c0938bQ));
        InterfaceC1958uK interfaceC1958uK = this.f13765j;
        MO mo = this.f12428g;
        mo.getClass();
        xp.n(r12, interfaceC1958uK, mo);
        if (this.f12423b.isEmpty()) {
            xp.p(r12);
        }
    }

    public abstract C1749qQ v(Object obj, C1749qQ c1749qQ);

    public void u(Object obj) {
    }

    public void w(long j6, Object obj) {
    }
}
