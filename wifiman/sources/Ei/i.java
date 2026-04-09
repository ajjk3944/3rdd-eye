package Ei;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class i implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final g f4791a;

    public i(f builder) {
        AbstractC6492s.i(builder, "builder");
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f4791a = new g(builder, uVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f4791a.next();
    }

    public final void e(Object obj, Object obj2) {
        this.f4791a.p(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4791a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f4791a.remove();
    }
}
