package r;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes.dex */
public abstract class w0 {

    public static final class a implements InterfaceC7543s {

        /* renamed from: a, reason: collision with root package name */
        private final List f59920a;

        a(AbstractC7542q abstractC7542q, float f10, float f11) {
            C7974i c7974iS = AbstractC7978m.s(0, abstractC7542q.b());
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
            Iterator it = c7974iS.iterator();
            while (it.hasNext()) {
                arrayList.add(new K(f10, f11, abstractC7542q.a(((Zg.Q) it).d())));
            }
            this.f59920a = arrayList;
        }

        @Override // r.InterfaceC7543s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K get(int i10) {
            return (K) this.f59920a.get(i10);
        }
    }

    public static final class b implements InterfaceC7543s {

        /* renamed from: a, reason: collision with root package name */
        private final K f59921a;

        b(float f10, float f11) {
            this.f59921a = new K(f10, f11, 0.0f, 4, null);
        }

        @Override // r.InterfaceC7543s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K get(int i10) {
            return this.f59921a;
        }
    }

    public static final long b(y0 y0Var, long j10) {
        return AbstractC7978m.m(j10 - y0Var.e(), 0L, y0Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7543s c(AbstractC7542q abstractC7542q, float f10, float f11) {
        return abstractC7542q != null ? new a(abstractC7542q, f10, f11) : new b(f10, f11);
    }

    public static final AbstractC7542q d(v0 v0Var, long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return v0Var.c(j10 * 1000000, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }
}
