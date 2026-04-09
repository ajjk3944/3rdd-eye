package jk;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {
    public static b a(Integer num) {
        Object next;
        Iterator<E> it = b.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int code = ((b) next).getCode();
            if (num != null && code == num.intValue()) {
                break;
            }
        }
        b bVar = (b) next;
        return bVar == null ? b.SHA256 : bVar;
    }
}
