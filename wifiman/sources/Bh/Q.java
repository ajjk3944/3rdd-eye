package Bh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class Q implements T {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f1768a;

    public Q(Collection packageFragments) {
        AbstractC6492s.i(packageFragments, "packageFragments");
        this.f1768a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Zh.c f(M it) {
        AbstractC6492s.i(it, "it");
        return it.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Zh.c cVar, Zh.c it) {
        AbstractC6492s.i(it, "it");
        return !it.d() && AbstractC6492s.d(it.e(), cVar);
    }

    @Override // Bh.T
    public void a(Zh.c fqName, Collection packageFragments) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(packageFragments, "packageFragments");
        for (Object obj : this.f1768a) {
            if (AbstractC6492s.d(((M) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // Bh.T
    public boolean b(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        Collection collection = this.f1768a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC6492s.d(((M) it.next()).e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Bh.N
    public List c(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        Collection collection = this.f1768a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC6492s.d(((M) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Bh.N
    public Collection s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC8783m.Z(AbstractC8783m.C(AbstractC8783m.N(AbstractC3689v.d0(this.f1768a), O.f1766a), new P(fqName)));
    }
}
