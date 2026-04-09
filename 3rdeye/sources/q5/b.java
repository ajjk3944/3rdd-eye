package q5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f45438a;

    /* renamed from: b, reason: collision with root package name */
    public final c f45439b;

    public b(Set<d> set, c cVar) {
        this.f45438a = a(set);
        this.f45439b = cVar;
    }

    public static String a(Set<d> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // q5.f
    public final String getUserAgent() {
        Set setUnmodifiableSet;
        c cVar = this.f45439b;
        synchronized (cVar.f45441a) {
            setUnmodifiableSet = Collections.unmodifiableSet(cVar.f45441a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f45438a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + a(cVar.a());
    }
}
