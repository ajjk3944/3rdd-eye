package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5116z5 implements vo {

    /* renamed from: a, reason: collision with root package name */
    public final List f42163a;

    public C5116z5(List<? extends b9.l<String, ? extends vo>> list) {
        this.f42163a = list;
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final String a() {
        Iterator it = this.f42163a.iterator();
        while (it.hasNext()) {
            String strA = ((vo) ((b9.l) it.next()).f18084c).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final void a(String str) {
        Iterator it = this.f42163a.iterator();
        while (it.hasNext()) {
            ((vo) ((b9.l) it.next()).f18084c).a(str);
        }
    }
}
