package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class L2 extends D2 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f20909d;

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20909d = j6 >= 0 ? new ArrayList((int) j6) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        List list = this.f20909d;
        Comparator comparator = this.f20843b;
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
        long size = this.f20909d.size();
        InterfaceC2472o2 interfaceC2472o2 = this.f21108a;
        interfaceC2472o2.c(size);
        if (this.f20844c) {
            ArrayList arrayList = this.f20909d;
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (interfaceC2472o2.e()) {
                    break;
                } else {
                    interfaceC2472o2.o((InterfaceC2472o2) obj);
                }
            }
        } else {
            ArrayList arrayList2 = this.f20909d;
            Objects.requireNonNull(interfaceC2472o2);
            Collection.EL.a(arrayList2, new j$.util.function.g(interfaceC2472o2, 6));
        }
        interfaceC2472o2.m();
        this.f20909d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f20909d.add(obj);
    }
}
