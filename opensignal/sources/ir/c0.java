package ir;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lr.o1;
import lr.r1;

/* loaded from: classes.dex */
public final class c0 implements TypeVariable, Type {

    /* renamed from: a, reason: collision with root package name */
    public final w f12932a;

    public c0(w wVar) {
        this.f12932a = wVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        r1 r1Var = ((o1) this.f12932a).f15660d;
        v vVar = o1.f15658r[0];
        Object objC = r1Var.c();
        br.l.d(objC, "<get-upperBounds>(...)");
        List list = (List) objC;
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f0.i((br.m) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new lq.k(c7.a.p("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f12932a), 0);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((o1) this.f12932a).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
