package km;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f28411d;

    public /* synthetic */ e0(c1 c1Var, int i4) {
        this.f28410c = i4;
        this.f28411d = c1Var;
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        switch (this.f28410c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f28411d.a(s0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i4 = 0; i4 < length; i4++) {
                        this.f28411d.a(s0Var, Array.get(obj, i4));
                    }
                    break;
                }
                break;
        }
    }
}
