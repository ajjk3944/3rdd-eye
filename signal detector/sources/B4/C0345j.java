package b4;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: b4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345j extends V2.e {
    public final void F(List list) {
        Object[] objArr = (Object[]) B();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f3869c).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        C(objArr2);
    }

    public final void G(Collection collection) throws IllegalAccessException, IllegalArgumentException {
        Object[] objArr = (Object[]) B();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f3869c).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        C(objArr2);
    }
}
