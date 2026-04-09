package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2025vg implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17315a = new ArrayList();

    public final boolean a(InterfaceC0828Yg interfaceC0828Yg) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f17315a;
        int size = arrayList2.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            C1971ug c1971ug = (C1971ug) obj;
            if (c1971ug.f17143b == interfaceC0828Yg) {
                arrayList.add(c1971ug);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((C1971ug) obj2).f17144c.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f17315a.iterator();
    }
}
