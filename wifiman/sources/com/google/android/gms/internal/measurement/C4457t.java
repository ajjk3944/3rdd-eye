package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4457t extends AbstractC4410n implements InterfaceC4402m {

    /* renamed from: c, reason: collision with root package name */
    private final List f35474c;

    /* renamed from: d, reason: collision with root package name */
    private final List f35475d;

    /* renamed from: e, reason: collision with root package name */
    private Z2 f35476e;

    private C4457t(C4457t c4457t) {
        super(c4457t.f35402a);
        ArrayList arrayList = new ArrayList(c4457t.f35474c.size());
        this.f35474c = arrayList;
        arrayList.addAll(c4457t.f35474c);
        ArrayList arrayList2 = new ArrayList(c4457t.f35475d.size());
        this.f35475d = arrayList2;
        arrayList2.addAll(c4457t.f35475d);
        this.f35476e = c4457t.f35476e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        Z2 z2D = this.f35476e.d();
        for (int i10 = 0; i10 < this.f35474c.size(); i10++) {
            if (i10 < list.size()) {
                z2D.e((String) this.f35474c.get(i10), z22.b((InterfaceC4449s) list.get(i10)));
            } else {
                z2D.e((String) this.f35474c.get(i10), InterfaceC4449s.f35450e0);
            }
        }
        for (InterfaceC4449s interfaceC4449s : this.f35475d) {
            InterfaceC4449s interfaceC4449sB = z2D.b(interfaceC4449s);
            if (interfaceC4449sB instanceof C4473v) {
                interfaceC4449sB = z2D.b(interfaceC4449s);
            }
            if (interfaceC4449sB instanceof C4394l) {
                return ((C4394l) interfaceC4449sB).a();
            }
        }
        return InterfaceC4449s.f35450e0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n, com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return new C4457t(this);
    }

    public C4457t(String str, List list, List list2, Z2 z22) {
        super(str);
        this.f35474c = new ArrayList();
        this.f35476e = z22;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f35474c.add(((InterfaceC4449s) it.next()).zzf());
            }
        }
        this.f35475d = new ArrayList(list2);
    }
}
