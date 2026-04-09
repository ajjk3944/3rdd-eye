package io.appmetrica.analytics.impl;

import c9.C2097r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4821nf implements Vn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41310a;

    public C4821nf(C4873pf c4873pf) {
        boolean z10;
        List<C4847of> list = c4873pf.f41423b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4847of) it.next()).f41376c == EnumC4685i8.f41060c) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        this.f41310a = z10;
    }

    @Override // io.appmetrica.analytics.impl.Vn, p9.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4847of> invoke(List<? extends C4847of> list, Cf cf) {
        C4847of c4847of = new C4847of(cf.f39260a, cf.f39261b, cf.f39264e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4847of) it.next()).f41376c == cf.f39264e) {
                    if (c4847of.f41376c == EnumC4685i8.f41060c && this.f41310a) {
                        return C2097r.z0(list, c4847of);
                    }
                    return null;
                }
            }
        }
        return C2097r.z0(list, c4847of);
    }
}
