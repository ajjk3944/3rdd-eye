package io.appmetrica.analytics.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4770lg implements InterfaceC4667hg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4874pg f41204a;

    public C4770lg(C4874pg c4874pg) {
        this.f41204a = c4874pg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4667hg
    public final void a() {
        C4874pg c4874pg = this.f41204a;
        ArrayList arrayList = c4874pg.f41430g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C5102yg c5102yg = (C5102yg) next;
            c4874pg.f41426c.getClass();
            String str = c5102yg != null ? c5102yg.f42142a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        c4874pg.a(c4874pg.f41426c.a(C2097r.n0(arrayList2)));
    }
}
