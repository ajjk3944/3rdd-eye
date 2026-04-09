package iu;

import br.b0;
import java.util.Iterator;
import ku.u;
import mq.a0;

/* loaded from: classes.dex */
public final class g implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13007a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13008d;

    public /* synthetic */ g(int i10, Object obj) {
        this.f13007a = i10;
        this.f13008d = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f13007a) {
            case 0:
                return new br.b((u) this.f13008d);
            case 1:
                return b0.e((Object[]) this.f13008d);
            case 2:
                return new a0((Iterator) ((ar.a) this.f13008d).c());
            default:
                return ((st.j) this.f13008d).iterator();
        }
    }
}
