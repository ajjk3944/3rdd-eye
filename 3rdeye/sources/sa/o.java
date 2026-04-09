package sa;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
public final class o extends q<Iterable<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f46240a;

    public o(q qVar) {
        this.f46240a = qVar;
    }

    @Override // sa.q
    public final void a(s sVar, Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f46240a.a(sVar, it.next());
        }
    }
}
