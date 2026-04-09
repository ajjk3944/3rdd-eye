package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f51927a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51928b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f51929c;

    public p(h delegate, boolean z10, InterfaceC6835l fqNameFilter) {
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(fqNameFilter, "fqNameFilter");
        this.f51927a = delegate;
        this.f51928b = z10;
        this.f51929c = fqNameFilter;
    }

    private final boolean b(c cVar) {
        Zh.c cVarE = cVar.e();
        return cVarE != null && ((Boolean) this.f51929c.invoke(cVarE)).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        if (((Boolean) this.f51929c.invoke(fqName)).booleanValue()) {
            return this.f51927a.P(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f51927a;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (b((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f51928b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = this.f51927a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            if (b((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public c l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        if (((Boolean) this.f51929c.invoke(fqName)).booleanValue()) {
            return this.f51927a.l(fqName);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(h delegate, InterfaceC6835l fqNameFilter) {
        this(delegate, false, fqNameFilter);
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(fqNameFilter, "fqNameFilter");
    }
}
