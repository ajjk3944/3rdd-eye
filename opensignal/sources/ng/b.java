package ng;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f17545a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17546b;

    public b(Set set, c cVar) {
        this.f17545a = b(set);
        this.f17546b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f17543a);
            sb2.append('/');
            sb2.append(aVar.f17544b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f17545a;
        c cVar = this.f17546b;
        synchronized (cVar.f17548a) {
            setUnmodifiableSet = Collections.unmodifiableSet(cVar.f17548a);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (cVar.f17548a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(cVar.f17548a);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
