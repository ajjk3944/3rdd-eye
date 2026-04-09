package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Ja extends O2 {

    /* renamed from: b, reason: collision with root package name */
    public final Ma f39688b;

    public Ja(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public Ja(int i, Ma ma2) {
        super(i);
        this.f39688b = ma2;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Ma
    public final Gn a(List<Object> list) {
        int iB;
        int i = 0;
        if (list == null || (list.size() <= this.f39918a && this.f39688b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i10 = 0;
            for (Object obj : list) {
                if (i10 < this.f39918a) {
                    Ma ma2 = this.f39688b;
                    if (ma2 != null) {
                        Gn gnA = ma2.a(obj);
                        Object obj2 = gnA.f39550a;
                        iB += gnA.f39551b.getBytesTruncated();
                        AbstractC4623fo.a(obj, gnA.f39550a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iB += b(obj);
                }
                i10++;
            }
            list = arrayList;
        }
        return new Gn(list, new I4(i, iB));
    }

    public final Ma b() {
        return this.f39688b;
    }
}
