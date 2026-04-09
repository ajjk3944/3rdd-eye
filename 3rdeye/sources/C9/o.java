package C9;

import A9.U0;
import C9.k;
import b9.C1992A;
import f9.InterfaceC4347e;
import g0.C4356c;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes3.dex */
public final class o<E> extends b<E> {

    /* renamed from: l, reason: collision with root package name */
    public final a f1009l;

    public o(int i, a aVar) {
        super(i);
        this.f1009l = aVar;
        if (aVar != a.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(C4356c.i(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.x.a(b.class).d() + " instead").toString());
        }
    }

    public final Object L(E e4, boolean z10) {
        l lVar;
        o<E> oVar;
        E e10;
        if (this.f1009l == a.DROP_LATEST) {
            Object objI = super.i(e4);
            return (!(objI instanceof k.b) || (objI instanceof k.a)) ? objI : C1992A.f18074a;
        }
        Object obj = f.f985d;
        l lVar2 = (l) b.f967g.get(this);
        while (true) {
            long andIncrement = b.f963c.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zW = w(andIncrement, false);
            int i = f.f983b;
            long j10 = i;
            long j11 = j4 / j10;
            int i10 = (int) (j4 % j10);
            if (lVar2.f1786d != j11) {
                l lVarA = b.a(this, j11, lVar2);
                if (lVarA != null) {
                    lVar = lVarA;
                    e10 = e4;
                    oVar = this;
                } else if (zW) {
                    return new k.a(t());
                }
            } else {
                lVar = lVar2;
                oVar = this;
                e10 = e4;
            }
            int iG = b.g(oVar, lVar, i10, e10, j4, obj, zW);
            lVar2 = lVar;
            if (iG == 0) {
                lVar2.b();
                return C1992A.f18074a;
            }
            if (iG == 1) {
                return C1992A.f18074a;
            }
            if (iG == 2) {
                if (zW) {
                    lVar2.i();
                    return new k.a(t());
                }
                U0 u02 = obj instanceof U0 ? (U0) obj : null;
                if (u02 != null) {
                    u02.c(lVar2, i10 + i);
                }
                n((lVar2.f1786d * j10) + i10);
                return C1992A.f18074a;
            }
            if (iG == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iG == 4) {
                if (j4 < b.f964d.get(this)) {
                    lVar2.b();
                }
                return new k.a(t());
            }
            if (iG == 5) {
                lVar2.b();
            }
            e4 = e10;
        }
    }

    @Override // C9.b, C9.x
    public final Object i(E e4) {
        return L(e4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C9.b, C9.x
    public final Object m(InterfaceC4347e interfaceC4347e, Object obj) throws Throwable {
        Object objL = L(obj, true);
        if (!(objL instanceof k.a)) {
            return C1992A.f18074a;
        }
        boolean z10 = ((k.b) objL) instanceof k.a;
        throw t();
    }

    @Override // C9.b
    public final boolean y() {
        return this.f1009l == a.DROP_OLDEST;
    }
}
