package th;

import Zg.AbstractC3689v;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class v implements TypeVariable, Type {

    /* renamed from: a, reason: collision with root package name */
    private final q f62650a;

    public v(q typeParameter) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        this.f62650a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (AbstractC6492s.d(getName(), typeVariable.getName()) && AbstractC6492s.d(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f62650a.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(w.c((p) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new Yg.r("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f62650a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f62650a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
