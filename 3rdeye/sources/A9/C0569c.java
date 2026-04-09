package A9;

import b9.C1992A;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Await.kt */
/* renamed from: A9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0569c<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f233b = AtomicIntegerFieldUpdater.newUpdater(C0569c.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final L<T>[] f234a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* compiled from: Await.kt */
    /* renamed from: A9.c$a */
    public final class a extends AbstractC0603t0 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: f, reason: collision with root package name */
        public final C0583j f235f;

        /* renamed from: g, reason: collision with root package name */
        public W f236g;

        public a(C0583j c0583j) {
            this.f235f = c0583j;
        }

        @Override // A9.InterfaceC0588l0
        public final void a(Throwable th) {
            C0583j c0583j = this.f235f;
            if (th != null) {
                c0583j.getClass();
                F9.y yVarD = c0583j.D(new C0602t(false, th), null);
                if (yVarD != null) {
                    c0583j.p(yVarD);
                    b bVar = (b) i.get(this);
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0569c.f233b;
            C0569c<T> c0569c = C0569c.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(c0569c) == 0) {
                L<T>[] lArr = c0569c.f234a;
                ArrayList arrayList = new ArrayList(lArr.length);
                for (L<T> l5 : lArr) {
                    arrayList.add(l5.e());
                }
                c0583j.resumeWith(arrayList);
            }
        }
    }

    /* compiled from: Await.kt */
    /* renamed from: A9.c$b */
    public final class b implements InterfaceC0579h {

        /* renamed from: b, reason: collision with root package name */
        public final C0569c<T>.a[] f238b;

        public b(a[] aVarArr) {
            this.f238b = aVarArr;
        }

        @Override // A9.InterfaceC0579h
        public final void a(Throwable th) {
            b();
        }

        public final void b() {
            for (C0569c<T>.a aVar : this.f238b) {
                W w10 = aVar.f236g;
                if (w10 == null) {
                    kotlin.jvm.internal.l.l("handle");
                    throw null;
                }
                w10.dispose();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f238b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0569c(L<? extends T>[] lArr) {
        this.f234a = lArr;
        this.notCompletedCount$volatile = lArr.length;
    }

    public final Object a(h9.i iVar) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(iVar));
        c0583j.s();
        L<T>[] lArr = this.f234a;
        int length = lArr.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            L<T> l5 = lArr[i];
            l5.start();
            a aVar = new a(c0583j);
            aVar.f236g = C0572d0.d(l5, false, aVar, 3);
            C1992A c1992a = C1992A.f18074a;
            aVarArr[i] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            a aVar2 = aVarArr[i10];
            aVar2.getClass();
            a.i.set(aVar2, bVar);
        }
        if (C0583j.f251h.get(c0583j) instanceof F0) {
            c0583j.v(bVar);
        } else {
            bVar.b();
        }
        Object objR = c0583j.r();
        g9.a aVar3 = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }
}
