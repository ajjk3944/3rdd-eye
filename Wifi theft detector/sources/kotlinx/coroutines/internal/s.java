package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.c2;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f22564a;

    /* renamed from: b, reason: collision with root package name */
    public static final c2 f22565b;

    static {
        s sVar = new s();
        f22564a = sVar;
        d0.f("kotlinx.coroutines.fast.service.loader", true);
        f22565b = sVar.a();
    }

    public final c2 a() {
        Object next;
        c2 c2VarE;
        try {
            List listU = SequencesKt___SequencesKt.u(kotlin.sequences.m.d(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = listU.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (c2VarE = t.e(rVar, listU)) != null) {
                return c2VarE;
            }
            return t.b(null, null, 3, null);
        } catch (Throwable th) {
            return t.b(th, null, 2, null);
        }
    }
}
