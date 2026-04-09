package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5052wg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f41971a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C5102yg f41972b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41973c;

    /* renamed from: d, reason: collision with root package name */
    public final C4908qo f41974d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f41975e;

    public C5052wg(Context context, C4908qo c4908qo) {
        this.f41975e = context;
        this.f41974d = c4908qo;
        this.f41972b = c4908qo.b();
        this.f41973c = c4908qo.c();
    }

    public final void a() {
        if (this.f41973c) {
            return;
        }
        Context context = this.f41975e;
        InterfaceC4662hb interfaceC4662hbA = Gg.a(context, Ga.f39501F.f39510d.a());
        Dg dg = (Dg) new C4874pg(this, new Gg(interfaceC4662hbA), new Sa(context), new Hg(context)).f41429f.getValue();
        try {
            interfaceC4662hbA.a(dg);
        } catch (Throwable th) {
            dg.a(th);
        }
    }

    public final synchronized void a(Ag ag) {
        this.f41971a.add(ag);
        if (this.f41973c) {
            ag.a(this.f41972b);
        }
    }

    public final synchronized void a(C5102yg c5102yg) {
        Iterator it = this.f41971a.iterator();
        while (it.hasNext()) {
            ((Ag) it.next()).a(c5102yg);
        }
    }
}
