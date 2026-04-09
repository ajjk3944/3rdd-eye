package C;

import androidx.camera.core.impl.C1702m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: CameraSelector.java */
/* renamed from: C.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632t {

    /* renamed from: b, reason: collision with root package name */
    public static final C0632t f768b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0632t f769c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<InterfaceC0630q> f770a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C1702m0(0));
        f768b = new C0632t(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C1702m0(1));
        f769c = new C0632t(linkedHashSet2);
    }

    public C0632t(LinkedHashSet linkedHashSet) {
        this.f770a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<InterfaceC0630q> it = this.f770a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator<InterfaceC0630q> it = this.f770a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0630q next = it.next();
            if (next instanceof C1702m0) {
                Integer numValueOf = Integer.valueOf(((C1702m0) next).f15095b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final androidx.camera.core.impl.J c(LinkedHashSet<androidx.camera.core.impl.J> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.J> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<androidx.camera.core.impl.J> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.J next = it2.next();
            if (listA.contains(next.a())) {
                linkedHashSet2.add(next);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (androidx.camera.core.impl.J) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
