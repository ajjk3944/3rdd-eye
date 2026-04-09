package A9;

import F9.C0658a;
import f9.AbstractC4343a;
import f9.AbstractC4344b;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes3.dex */
public abstract class A extends AbstractC4343a implements InterfaceC4348f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f174b = new a(InterfaceC4348f.a.f37870b, C0611z.f301g);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends AbstractC4344b<InterfaceC4348f, A> {
    }

    public A() {
        super(InterfaceC4348f.a.f37870b);
    }

    @Override // f9.InterfaceC4348f
    public final void D(InterfaceC4347e<?> interfaceC4347e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlin.jvm.internal.l.d(interfaceC4347e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        F9.i iVar = (F9.i) interfaceC4347e;
        do {
            atomicReferenceFieldUpdater = F9.i.i;
        } while (atomicReferenceFieldUpdater.get(iVar) == C0658a.f1746c);
        Object obj = atomicReferenceFieldUpdater.get(iVar);
        C0583j c0583j = obj instanceof C0583j ? (C0583j) obj : null;
        if (c0583j != null) {
            c0583j.n();
        }
    }

    @Override // f9.InterfaceC4348f
    public final F9.i D0(h9.c cVar) {
        return new F9.i(this, cVar);
    }

    public abstract void N0(InterfaceC4350h interfaceC4350h, Runnable runnable);

    public void O0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        N0(interfaceC4350h, runnable);
    }

    public boolean P0(InterfaceC4350h interfaceC4350h) {
        return !(this instanceof R0);
    }

    public A Q0(int i) {
        I.n(i);
        return new F9.j(this, i);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // f9.AbstractC4343a, f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> key) {
        E e4;
        kotlin.jvm.internal.l.f(key, "key");
        if (!(key instanceof AbstractC4344b)) {
            if (InterfaceC4348f.a.f37870b == key) {
                return this;
            }
            return null;
        }
        AbstractC4344b abstractC4344b = (AbstractC4344b) key;
        InterfaceC4350h.b<?> key2 = getKey();
        kotlin.jvm.internal.l.f(key2, "key");
        if ((key2 == abstractC4344b || abstractC4344b.f37867c == key2) && (e4 = (E) abstractC4344b.f37866b.invoke(this)) != null) {
            return e4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // f9.AbstractC4343a, f9.InterfaceC4350h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f9.InterfaceC4350h minusKey(f9.InterfaceC4350h.b<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.l.f(r4, r0)
            boolean r1 = r4 instanceof f9.AbstractC4344b
            f9.i r2 = f9.C4351i.f37871b
            if (r1 == 0) goto L27
            f9.b r4 = (f9.AbstractC4344b) r4
            f9.h$b r1 = r3.getKey()
            kotlin.jvm.internal.l.f(r1, r0)
            if (r1 == r4) goto L1c
            f9.h$b<?> r0 = r4.f37867c
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            return r3
        L1c:
            kotlin.jvm.internal.m r4 = r4.f37866b
            java.lang.Object r4 = r4.invoke(r3)
            f9.h$a r4 = (f9.InterfaceC4350h.a) r4
            if (r4 == 0) goto L2c
            goto L2b
        L27:
            f9.f$a r0 = f9.InterfaceC4348f.a.f37870b
            if (r0 != r4) goto L2c
        L2b:
            return r2
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.A.minusKey(f9.h$b):f9.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + I.x(this);
    }
}
